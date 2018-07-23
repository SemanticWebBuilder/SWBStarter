package org.semanticwb.starter.model.base;


public abstract class DirectorioBase extends org.semanticwb.model.SWBClass implements org.semanticwb.model.Descriptiveable,org.semanticwb.model.Traceable
{
    public static final org.semanticwb.platform.SemanticClass starter_Contacto=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Contacto");
    public static final org.semanticwb.platform.SemanticProperty starter_hasContact=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticProperty("http://www.semanticwebbuilder.org.mx/starter#hasContact");
    public static final org.semanticwb.platform.SemanticClass starter_Directorio=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Directorio");
   /**
   * The semantic class that represents the currentObject
   */
    public static final org.semanticwb.platform.SemanticClass sclass=org.semanticwb.SWBPlatform.getSemanticMgr().getVocabulary().getSemanticClass("http://www.semanticwebbuilder.org.mx/starter#Directorio");

    public static class ClassMgr
    {
       /**
       * Returns a list of Directorio for a model
       * @param model Model to find
       * @return Iterator of org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorios(org.semanticwb.model.SWBModel model)
        {
            java.util.Iterator it=model.getSemanticObject().getModel().listInstancesOfClass(sclass);
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio>(it, true);
        }
       /**
       * Returns a list of org.semanticwb.starter.model.Directorio for all models
       * @return Iterator of org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorios()
        {
            java.util.Iterator it=sclass.listInstances();
            return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio>(it, true);
        }

        public static org.semanticwb.starter.model.Directorio createDirectorio(org.semanticwb.model.SWBModel model)
        {
            long id=model.getSemanticObject().getModel().getCounter(sclass);
            return org.semanticwb.starter.model.Directorio.ClassMgr.createDirectorio(String.valueOf(id), model);
        }
       /**
       * Gets a org.semanticwb.starter.model.Directorio
       * @param id Identifier for org.semanticwb.starter.model.Directorio
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return A org.semanticwb.starter.model.Directorio
       */
        public static org.semanticwb.starter.model.Directorio getDirectorio(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Directorio)model.getSemanticObject().getModel().getGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Create a org.semanticwb.starter.model.Directorio
       * @param id Identifier for org.semanticwb.starter.model.Directorio
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return A org.semanticwb.starter.model.Directorio
       */
        public static org.semanticwb.starter.model.Directorio createDirectorio(String id, org.semanticwb.model.SWBModel model)
        {
            return (org.semanticwb.starter.model.Directorio)model.getSemanticObject().getModel().createGenericObject(model.getSemanticObject().getModel().getObjectUri(id,sclass),sclass);
        }
       /**
       * Remove a org.semanticwb.starter.model.Directorio
       * @param id Identifier for org.semanticwb.starter.model.Directorio
       * @param model Model of the org.semanticwb.starter.model.Directorio
       */
        public static void removeDirectorio(String id, org.semanticwb.model.SWBModel model)
        {
            model.getSemanticObject().getModel().removeSemanticObject(model.getSemanticObject().getModel().getObjectUri(id,sclass));
        }
       /**
       * Returns true if exists a org.semanticwb.starter.model.Directorio
       * @param id Identifier for org.semanticwb.starter.model.Directorio
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return true if the org.semanticwb.starter.model.Directorio exists, false otherwise
       */

        public static boolean hasDirectorio(String id, org.semanticwb.model.SWBModel model)
        {
            return (getDirectorio(id, model)!=null);
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByModifiedBy(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined ModifiedBy
       * @param value ModifiedBy of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByModifiedBy(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_modifiedBy,value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByCreator(org.semanticwb.model.User value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(swb_creator, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined Creator
       * @param value Creator of the type org.semanticwb.model.User
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByCreator(org.semanticwb.model.User value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(swb_creator,value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined Contact
       * @param value Contact of the type org.semanticwb.starter.model.Contacto
       * @param model Model of the org.semanticwb.starter.model.Directorio
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByContact(org.semanticwb.starter.model.Contacto value,org.semanticwb.model.SWBModel model)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(model.getSemanticObject().getModel().listSubjectsByClass(starter_hasContact, value.getSemanticObject(),sclass));
            return it;
        }
       /**
       * Gets all org.semanticwb.starter.model.Directorio with a determined Contact
       * @param value Contact of the type org.semanticwb.starter.model.Contacto
       * @return Iterator with all the org.semanticwb.starter.model.Directorio
       */

        public static java.util.Iterator<org.semanticwb.starter.model.Directorio> listDirectorioByContact(org.semanticwb.starter.model.Contacto value)
        {
            org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Directorio> it=new org.semanticwb.model.GenericIterator(value.getSemanticObject().getModel().listSubjectsByClass(starter_hasContact,value.getSemanticObject(),sclass));
            return it;
        }
    }

    public static DirectorioBase.ClassMgr getDirectorioClassMgr()
    {
        return new DirectorioBase.ClassMgr();
    }

   /**
   * Constructs a DirectorioBase with a SemanticObject
   * @param base The SemanticObject with the properties for the Directorio
   */
    public DirectorioBase(org.semanticwb.platform.SemanticObject base)
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
   * Gets all the org.semanticwb.starter.model.Contacto
   * @return A GenericIterator with all the org.semanticwb.starter.model.Contacto
   */

    public org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contacto> listContacts()
    {
        return new org.semanticwb.model.GenericIterator<org.semanticwb.starter.model.Contacto>(getSemanticObject().listObjectProperties(starter_hasContact));
    }

   /**
   * Gets true if has a Contact
   * @param value org.semanticwb.starter.model.Contacto to verify
   * @return true if the org.semanticwb.starter.model.Contacto exists, false otherwise
   */
    public boolean hasContact(org.semanticwb.starter.model.Contacto value)
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
   * @param value org.semanticwb.starter.model.Contacto to add
   */

    public void addContact(org.semanticwb.starter.model.Contacto value)
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
   * @param value org.semanticwb.starter.model.Contacto to remove
   */

    public void removeContact(org.semanticwb.starter.model.Contacto value)
    {
        getSemanticObject().removeObjectProperty(starter_hasContact,value.getSemanticObject());
    }

   /**
   * Gets the Contact
   * @return a org.semanticwb.starter.model.Contacto
   */
    public org.semanticwb.starter.model.Contacto getContact()
    {
         org.semanticwb.starter.model.Contacto ret=null;
         org.semanticwb.platform.SemanticObject obj=getSemanticObject().getObjectProperty(starter_hasContact);
         if(obj!=null)
         {
             ret=(org.semanticwb.starter.model.Contacto)obj.createGenericInstance();
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
