#!/usr/bin/env bash
MAN="Usage: $(basename "$0") [-h] [-f] [-p proxyurl] -- starts container and deploys application
    where:
        -h show this help
        -f force rebuild
        -p use proxy with url <proxyurl>"

REBUILD="false"
PROXYBASE=""
WARFILE=./WebApp/target/WebApp-1.0-SNAPSHOT.war

while getopts ":hfp:" opt; do
    case $opt in
        f)
            REBUILD="true"
            ;;
        p)
            PROXYBASE="--proxy-base-url $OPTARG"
            ;;
        h)
            echo "$MAN"
            exit 0;
            ;;
        \?)
            echo "Invalid option: -$OPTARG" >&2
            exit 1
            ;;
        :)
            echo "Argument missing for option -$OPTARG." >&2
            exit 1
            ;;
    esac
done

if [ "$REBUILD" = "true" ]; then
    echo "Recompiling project..."
    sh ./install.sh
fi

if [ ! -e "$WARFILE" ]; then
    echo "WAR file not found. Run start.sh -f."
else
    java -Dfile.encoding=iso8859-1 -jar target/dependency/webapp-runner.jar $PROXYBASE $WARFILE
fi