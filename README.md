# SWBStarter
Seed project for SemanticWebBuilder Portal (SWBPortal) resources development using Ontology Driven approach

## Project structure
```
.
+-- README.md
+-- pom.xml
+-- install.sh
+-- start.sh
+-- Model #Source code for starter project data model
+-- Components
|   +-- src/main/java/org/semanticwb/starter
|       +-- codegen
|       |   +-- CodeGeneratorComponents.java #Code generator for starter project
|       +-- resources
|           +-- DirectoryResource.java #Sample SemanticWebBuilder resource implementation
+-- WebApp
    +-- src/main/webapp/WEB-INF/owl/ext
        +-- starter.owl #Ontology definition for starter project model
```

## Building project
Execute the following command to build and deploy project for development on a local SWBPortal instance
```bash
sh start.sh -f
```

Navigate to http://localhost:8080 on a browser to see user website.

## Managing SWBPortal instance

To manage the local SWBPortal instance navigate to http://localhost:8080/swbadmin on a browser. Use __admin__ as user and __webbuilder__ as password.