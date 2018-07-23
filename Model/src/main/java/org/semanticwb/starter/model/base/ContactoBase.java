package org.semanticwb.starter.model.base;


public abstract class ContactoBase extends org.semanticwb.model.SWBClass 
{
    public static final org.semanticwb.platform.SemanticProperty starter_email=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#email");
    public static final org.semanticwb.platform.SemanticProperty starter_phone=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#phone");
    public static final org.semanticwb.platform.SemanticProperty starter_name=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#name");
    public static final org.semanticwb.platform.SemanticClass starter_Contacto=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contacto");
   /**
   * The semantic class that represents the currentObject
   */
    public static final org.semanticwb.platform.SemanticClass sclass=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contacto");

    public static class ClassMgr
    {
       /**
       * Returns a list of Contacto for a model
       * @param model Model to find
       * @return Iterator of org.semanticwb.starter.model.Contacto
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contacto> listContactos(org.semanticwb.model.SWBModel model)
        {
            java.util.Iterator it=model.getSemanticObject().getModel().listInstancesOfClass(sclass);
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contacto>(it, true);
        }
       /**
       * Returns a list of org.semanticwb.starter.model.Contacto for all models
       * @return Iterator of org.semanticwb.starter.model.Contacto
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contacto> listContactos()
        {
            java.util.Iterator it=sclass.listInstances();
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contacto>(it, true);
        }
       /**
       * Gets a org.semanticwb.starter.model.Contacto
       * @param id Identifier for org.semanticwb.starter.model.Contacto
       * @param model Model of the org.semanticwb.starter.model.Contacto
       * @return A org.semanticwb.starter.model.Contacto
       */
        public static org.semanticwb.starter.model.Contacto getContacto(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Contacto)model.getSemanticObject().getModel().getGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Create a org.semanticwb.starter.model.Contacto
       * @param id Identifier for org.semanticwb.starter.model.Contacto
       * @param model Model of the org.semanticwb.starter.model.Contacto
       * @return A org.semanticwb.starter.model.Contacto
       */
        public static org.semanticwb.starter.model.Contacto createContacto(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Contacto)model.getSemanticObject().getModel().createGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Remove a org.semanticwb.starter.model.Contacto
       * @param id Identifier for org.semanticwb.starter.model.Contacto
       * @param model Model of the org.semanticwb.starter.model.Contacto
       */
        public static void removeContacto(String id, org.semanticwb.model.SWBModel model)
        {
            model.getSemanticObject().getModel().removeSemanticObject(model.getSemanticObject().getModel().getObjectUri(id,sclass));
        }
       /**
       * Returns true if exists a org.semanticwb.starter.model.Contacto
       * @param id Identifier for org.semanticwb.starter.model.Contacto
       * @param model Model of the org.semanticwb.starter.model.Contacto
       * @return true if the org.semanticwb.starter.model.Contacto exists, false otherwise
       */

        public static boolean hasContacto(String id, org.semanticwb.model.SWBModel model)
        {
            return (getContacto(id, model)!=null);
        }
    }

    public static ContactoBase.ClassMgr getContactoClassMgr()
    {
        return new ContactoBase.ClassMgr();
    }

   /**
   * Constructs a ContactoBase with a SemanticObject
   * @param base The SemanticObject with the properties for the Contacto
   */
    public ContactoBase(org.semanticwb.platform.SemanticObject base)
    {
        super(base);
    }

/**
* Gets the Email property
* @return String with the Email
*/
    public String getEmail()
    {
        return getSemanticObject().getProperty(starter_email);
    }

/**
* Sets the Email property
* @param value long with the Email
*/
    public void setEmail(String value)
    {
        getSemanticObject().setProperty(starter_email, value);
    }

/**
* Gets the Phone property
* @return String with the Phone
*/
    public String getPhone()
    {
        return getSemanticObject().getProperty(starter_phone);
    }

/**
* Sets the Phone property
* @param value long with the Phone
*/
    public void setPhone(String value)
    {
        getSemanticObject().setProperty(starter_phone, value);
    }

/**
* Gets the Name property
* @return String with the Name
*/
    public String getName()
    {
        return getSemanticObject().getProperty(starter_name);
    }

/**
* Sets the Name property
* @param value long with the Name
*/
    public void setName(String value)
    {
        getSemanticObject().setProperty(starter_name, value);
    }
}
