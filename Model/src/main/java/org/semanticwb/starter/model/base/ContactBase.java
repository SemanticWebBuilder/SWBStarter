package org.semanticwb.starter.model.base;


public abstract class ContactBase extends org.semanticwb.model.SWBClass implements org.semanticwb.model.Traceable
{
    public static final org.semanticwb.platform.SemanticProperty starter_email=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#email");
    public static final org.semanticwb.platform.SemanticProperty starter_phone=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#phone");
    public static final org.semanticwb.platform.SemanticProperty starter_name=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#name");
    public static final org.semanticwb.platform.SemanticClass starter_Contact=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contact");
   /**
   * The semantic class that represents the currentObject
   */
    public static final org.semanticwb.platform.SemanticClass sclass=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contact");

    public static class ClassMgr
    {
       /**
       * Returns a list of Contact for a model
       * @param model Model to find
       * @return Iterator of org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContacts(org.semanticwb.model.SWBModel model)
        {
            java.util.Iterator it=model.getSemanticObject().getModel().listInstancesOfClass(sclass);
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact>(it, true);
        }
       /**
       * Returns a list of org.semanticwb.starter.model.Contact for all models
       * @return Iterator of org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContacts()
        {
            java.util.Iterator it=sclass.listInstances();
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact>(it, true);
        }

        public static org.semanticwb.starter.model.Contact createContact(org.semanticwb.model.SWBModel model)
        {
            long id=model.getSemanticObject().getModel().getCounter(sclass);
            return org.semanticwb.starter.model.Contact.ClassMgr.createContact(String.valueOf(id), model);
        }
       /**
       * Gets a org.semanticwb.starter.model.Contact
       * @param id Identifier for org.semanticwb.starter.model.Contact
       * @param model Model of the org.semanticwb.starter.model.Contact
       * @return A org.semanticwb.starter.model.Contact
       */
        public static org.semanticwb.starter.model.Contact getContact(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Contact)model.getSemanticObject().getModel().getGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Create a org.semanticwb.starter.model.Contact
       * @param id Identifier for org.semanticwb.starter.model.Contact
       * @param model Model of the org.semanticwb.starter.model.Contact
       * @return A org.semanticwb.starter.model.Contact
       */
        public static org.semanticwb.starter.model.Contact createContact(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Contact)model.getSemanticObject().getModel().createGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Remove a org.semanticwb.starter.model.Contact
       * @param id Identifier for org.semanticwb.starter.model.Contact
       * @param model Model of the org.semanticwb.starter.model.Contact
       */
        public static void removeContact(String id, org.semanticwb.model.SWBModel model)
        {
            model.getSemanticObject().getModel().removeSemanticObject(model.getSemanticObject().getModel().getObjectUri(id,sclass));
        }
       /**
       * Returns true if exists a org.semanticwb.starter.model.Contact
       * @param id Identifier for org.semanticwb.starter.model.Contact
       * @param model Model of the org.semanticwb.starter.model.Contact
       * @return true if the org.semanticwb.starter.model.Contact exists, false otherwise
       */

        public static boolean hasContact(String id, org.semanticwb.model.SWBModel model)
        {
            return (getContact(id, model)!=null);
        }
       /**
       * Gets all org.semanticwb.starter.model.Contact with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Contact
       * @return Iterator with all the org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContactByModifiedBy(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Contact with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContactByModifiedBy(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy,value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Contact with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Contact
       * @return Iterator with all the org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContactByCreator(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_creator, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Contact with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Contact
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Contact> listContactByCreator(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_creator,value.getSemanticObject(),sclass));
            return it;
        }
    }

    public static ContactBase.ClassMgr getContactClassMgr()
    {
        return new ContactBase.ClassMgr();
    }

   /**
   * Constructs a ContactBase with a SemanticObject
   * @param base The SemanticObject with the properties for the Contact
   */
    public ContactBase(org.semanticwb.platform.SemanticObject base)
    {
        super(base);
    }
   /**
   * Sets the value for the property ModifiedBy
   * @param value ModifiedBy to set
   */

    public void setModifiedBy(org.semanticwb.model.User value)
    {
        if(value!=null)
        {
            getSemanticObject().setObjectProperty(swb_modifiedBy, value.getSemanticObject());
        }else
        {
            removeModifiedBy();
        }
    }
   /**
   * Remove the value for ModifiedBy property
   */

    public void removeModifiedBy()
    {
        getSemanticObject().removeProperty(swb_modifiedBy);
    }

   /**
   * Gets the ModifiedBy
   * @return a org.semanticwb.model.User
   */
    public org.semanticwb.model.User getModifiedBy()
    {
         org.semanticwb.model.User ret=null;
         org.semanticwb.platform.SemanticObject obj=getSemanticObject().getObjectProperty(swb_modifiedBy);
         if(obj!=null)
         {
             ret=(org.semanticwb.model.User)obj.createGenericInstance();
         }
         return ret;
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
   * Sets the value for the property Creator
   * @param value Creator to set
   */

    public void setCreator(org.semanticwb.model.User value)
    {
        if(value!=null)
        {
            getSemanticObject().setObjectProperty(swb_creator, value.getSemanticObject());
        }else
        {
            removeCreator();
        }
    }
   /**
   * Remove the value for Creator property
   */

    public void removeCreator()
    {
        getSemanticObject().removeProperty(swb_creator);
    }

   /**
   * Gets the Creator
   * @return a org.semanticwb.model.User
   */
    public org.semanticwb.model.User getCreator()
    {
         org.semanticwb.model.User ret=null;
         org.semanticwb.platform.SemanticObject obj=getSemanticObject().getObjectProperty(swb_creator);
         if(obj!=null)
         {
             ret=(org.semanticwb.model.User)obj.createGenericInstance();
         }
         return ret;
    }

/**
* Gets the Created property
* @return java.util.Date with the Created
*/
    public java.util.Date getCreated()
    {
        return getSemanticObject().getDateProperty(swb_created);
    }

/**
* Sets the Created property
* @param value long with the Created
*/
    public void setCreated(java.util.Date value)
    {
        getSemanticObject().setDateProperty(swb_created, value);
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

/**
* Gets the Updated property
* @return java.util.Date with the Updated
*/
    public java.util.Date getUpdated()
    {
        return getSemanticObject().getDateProperty(swb_updated);
    }

/**
* Sets the Updated property
* @param value long with the Updated
*/
    public void setUpdated(java.util.Date value)
    {
        getSemanticObject().setDateProperty(swb_updated, value);
    }
}
