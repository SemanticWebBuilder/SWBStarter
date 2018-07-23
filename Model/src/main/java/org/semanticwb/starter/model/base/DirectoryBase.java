package org.semanticwb.starter.model.base;


public abstract class DirectoryBase extends org.semanticwb.model.SWBClass implements org.semanticwb.model.Descriptiveable,org.semanticwb.model.Traceable
{
    public static final org.semanticwb.platform.SemanticClass starter_Contact=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contact");
    public static final org.semanticwb.platform.SemanticProperty starter_hasContact=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#hasContact");
    public static final org.semanticwb.platform.SemanticClass starter_Directory=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Directory");
   /**
   * The semantic class that represents the currentObject
   */
    public static final org.semanticwb.platform.SemanticClass sclass=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Directory");

    public static class ClassMgr
    {
       /**
       * Returns a list of Directory for a model
       * @param model Model to find
       * @return Iterator of org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectories(org.semanticwb.model.SWBModel model)
        {
            java.util.Iterator it=model.getSemanticObject().getModel().listInstancesOfClass(sclass);
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory>(it, true);
        }
       /**
       * Returns a list of org.semanticwb.starter.model.Directory for all models
       * @return Iterator of org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectories()
        {
            java.util.Iterator it=sclass.listInstances();
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory>(it, true);
        }

        public static org.semanticwb.starter.model.Directory createDirectory(org.semanticwb.model.SWBModel model)
        {
            long id=model.getSemanticObject().getModel().getCounter(sclass);
            return org.semanticwb.starter.model.Directory.ClassMgr.createDirectory(String.valueOf(id), model);
        }
       /**
       * Gets a org.semanticwb.starter.model.Directory
       * @param id Identifier for org.semanticwb.starter.model.Directory
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return A org.semanticwb.starter.model.Directory
       */
        public static org.semanticwb.starter.model.Directory getDirectory(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Directory)model.getSemanticObject().getModel().getGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Create a org.semanticwb.starter.model.Directory
       * @param id Identifier for org.semanticwb.starter.model.Directory
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return A org.semanticwb.starter.model.Directory
       */
        public static org.semanticwb.starter.model.Directory createDirectory(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Directory)model.getSemanticObject().getModel().createGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Remove a org.semanticwb.starter.model.Directory
       * @param id Identifier for org.semanticwb.starter.model.Directory
       * @param model Model of the org.semanticwb.starter.model.Directory
       */
        public static void removeDirectory(String id, org.semanticwb.model.SWBModel model)
        {
            model.getSemanticObject().getModel().removeSemanticObject(model.getSemanticObject().getModel().getObjectUri(id,sclass));
        }
       /**
       * Returns true if exists a org.semanticwb.starter.model.Directory
       * @param id Identifier for org.semanticwb.starter.model.Directory
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return true if the org.semanticwb.starter.model.Directory exists, false otherwise
       */

        public static boolean hasDirectory(String id, org.semanticwb.model.SWBModel model)
        {
            return (getDirectory(id, model)!=null);
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByModifiedBy(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByModifiedBy(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy,value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByCreator(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_creator, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByCreator(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_creator,value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined Contact
       * @param value Contact of the type org.semanticwb.starter.model.Contact
       * @param model Model of the org.semanticwb.starter.model.Directory
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByContact(org.semanticwb.starter.model.Contact value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(starter_hasContact, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directory with a determined Contact
       * @param value Contact of the type org.semanticwb.starter.model.Contact
       * @return Iterator with all the org.semanticwb.starter.model.Directory
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directory> listDirectoryByContact(org.semanticwb.starter.model.Contact value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directory> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(starter_hasContact,value.getSemanticObject(),sclass));
            return it;
        }
    }

    public static DirectoryBase.ClassMgr getDirectoryClassMgr()
    {
        return new DirectoryBase.ClassMgr();
    }

   /**
   * Constructs a DirectoryBase with a SemanticObject
   * @param base The SemanticObject with the properties for the Directory
   */
    public DirectoryBase(org.semanticwb.platform.SemanticObject base)
    {
        super(base);
    }

/**
* Gets the Description property
* @return String with the Description
*/
    public String getDescription()
    {
        return getSemanticObject().getProperty(swb_description);
    }

/**
* Sets the Description property
* @param value long with the Description
*/
    public void setDescription(String value)
    {
        getSemanticObject().setProperty(swb_description, value);
    }

    public String getDescription(String lang)
    {
        return getSemanticObject().getProperty(swb_description, null, lang);
    }

    public String getDisplayDescription(String lang)
    {
        return getSemanticObject().getLocaleProperty(swb_description, lang);
    }

    public void setDescription(String description, String lang)
    {
        getSemanticObject().setProperty(swb_description, description, lang);
    }

/**
* Gets the Title property
* @return String with the Title
*/
    public String getTitle()
    {
        return getSemanticObject().getProperty(swb_title);
    }

/**
* Sets the Title property
* @param value long with the Title
*/
    public void setTitle(String value)
    {
        getSemanticObject().setProperty(swb_title, value);
    }

    public String getTitle(String lang)
    {
        return getSemanticObject().getProperty(swb_title, null, lang);
    }

    public String getDisplayTitle(String lang)
    {
        return getSemanticObject().getLocaleProperty(swb_title, lang);
    }

    public void setTitle(String title, String lang)
    {
        getSemanticObject().setProperty(swb_title, title, lang);
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
   * Gets all the org.semanticwb.starter.model.Contact
   * @return A GenericIterator with all the org.semanticwb.starter.model.Contact
   */

    public org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact> listContacts()
    {
        return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contact>(getSemanticObject().listObjectProperties(starter_hasContact));
    }

   /**
   * Gets true if has a Contact
   * @param value org.semanticwb.starter.model.Contact to verify
   * @return true if the org.semanticwb.starter.model.Contact exists, false otherwise
   */
    public boolean hasContact(org.semanticwb.starter.model.Contact value)
    {
        boolean ret=false;
        if(value!=null)
        {
           ret=getSemanticObject().hasObjectProperty(starter_hasContact,value.getSemanticObject());
        }
        return ret;
    }
   /**
   * Adds a Contact
   * @param value org.semanticwb.starter.model.Contact to add
   */

    public void addContact(org.semanticwb.starter.model.Contact value)
    {
        getSemanticObject().addObjectProperty(starter_hasContact, value.getSemanticObject());
    }
   /**
   * Removes all the Contact
   */

    public void removeAllContact()
    {
        getSemanticObject().removeProperty(starter_hasContact);
    }
   /**
   * Removes a Contact
   * @param value org.semanticwb.starter.model.Contact to remove
   */

    public void removeContact(org.semanticwb.starter.model.Contact value)
    {
        getSemanticObject().removeObjectProperty(starter_hasContact,value.getSemanticObject());
    }

   /**
   * Gets the Contact
   * @return a org.semanticwb.starter.model.Contact
   */
    public org.semanticwb.starter.model.Contact getContact()
    {
         org.semanticwb.starter.model.Contact ret=null;
         org.semanticwb.platform.SemanticObject obj=getSemanticObject().getObjectProperty(starter_hasContact);
         if(obj!=null)
         {
             ret=(org.semanticwb.starter.model.Contact)obj.createGenericInstance();
         }
         return ret;
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
