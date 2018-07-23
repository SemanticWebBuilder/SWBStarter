package org.semanticwb.starter.codegen;

import org.semanticwb.Logger;
import org.semanticwb.SWBPlatform;
import org.semanticwb.SWBUtils;
import org.semanticwb.codegen.CodeGenerator;
import org.semanticwb.codegen.CodeGeneratorException;

import java.io.File;

public class CodeGeneratorComponents {
    private static final  String swbOnt = "https://raw.githubusercontent.com/SemanticWebBuilder/SWB/master/src/main/webapp/WEB-INF/owl/swb.owl";
    private static final  String starterOnt = "WebApp/src/main/webapp/WEB-INF/owl/ext/starter.owl";
    private static final  String prefix = "starter";
    private static final  String sourceCodebase = "Components/src/main/java";

    private static final Logger LOG = SWBUtils.getLogger(CodeGeneratorComponents.class);

    public static void main(String[] args) {
        new CodeGeneratorComponents().codeGen(args);
    }

    public void codeGen(String[] args) {
        LOG.info("org.semanticwb.starter Starting code generation for ontology " + starterOnt);
        SWBPlatform.createInstance();
        File f = new File(starterOnt);
        SWBPlatform.getSemanticMgr().addBaseOntology(swbOnt);
        SWBPlatform.getSemanticMgr().addBaseOntology(f.toURI().toString());
        SWBPlatform.getSemanticMgr().loadBaseVocabulary();
        SWBPlatform.getSemanticMgr().getOntology().rebind();

        try {
            String path = getClass().getResource("/").getPath().replaceAll("%20", " ");
            File dir = new File(sourceCodebase);
            CodeGenerator codeGeneration = new CodeGenerator();
            codeGeneration.generateCode(prefix, false, dir);
            LOG.info("org.semanticwb.starter Class generation complete");
            LOG.info("org.semanticwb.starter Class generation complete");
        } catch (CodeGeneratorException cge) {
            cge.printStackTrace();
        }
    }
}
