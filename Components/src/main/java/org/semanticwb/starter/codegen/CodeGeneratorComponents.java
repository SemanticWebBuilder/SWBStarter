package org.semanticwb.starter.codegen;

import org.semanticwb.Logger;
import org.semanticwb.SWBPlatform;
import org.semanticwb.SWBUtils;
import org.semanticwb.codegen.CodeGenerator;
import org.semanticwb.codegen.CodeGeneratorException;

import java.io.File;

/**
 * Code generation class for Starter project.
 */
public class CodeGeneratorComponents {
    private static final  String SWB_ONT = "https://raw.githubusercontent.com/SemanticWebBuilder/SWB/master/src/main/webapp/WEB-INF/owl/swb.owl";
    private static final  String STARTER_ONT = "WebApp/src/main/webapp/WEB-INF/owl/ext/starter.owl";
    private static final  String ONT_PREFIX = "starter";
    private static final  String SOURCECODE_BASE = "Model/src/main/java";
    private static final Logger LOG = SWBUtils.getLogger(CodeGeneratorComponents.class);

    public static void main(String[] args) {
        new CodeGeneratorComponents().codeGen(args);
    }

    public void codeGen(String[] args) {
        LOG.info("org.semanticwb.starter Starting code generation for ontology " + STARTER_ONT);
        SWBPlatform.createInstance();
        File f = new File(STARTER_ONT);
        SWBPlatform.getSemanticMgr().addBaseOntology(SWB_ONT);
        SWBPlatform.getSemanticMgr().addBaseOntology(f.toURI().toString());
        SWBPlatform.getSemanticMgr().loadBaseVocabulary();
        SWBPlatform.getSemanticMgr().getOntology().rebind();

        try {
            File dir = new File(SOURCECODE_BASE);
            CodeGenerator codeGeneration = new CodeGenerator();
            codeGeneration.generateCode(ONT_PREFIX, false, dir);
            LOG.info("org.semanticwb.starter Class generation complete");
        } catch (CodeGeneratorException cge) {
            cge.printStackTrace();
        }
    }
}