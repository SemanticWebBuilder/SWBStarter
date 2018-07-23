package org.semanticwb.starter.resources;

import org.semanticwb.portal.api.GenericAdmResource;
import org.semanticwb.portal.api.SWBActionResponse;
import org.semanticwb.portal.api.SWBParamRequest;
import org.semanticwb.portal.api.SWBResourceException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Hello world! resource using SemanticWebBuilder.
 * @author Hasdai Pacheco
 */
public class DirectoryResource extends GenericAdmResource  {
    public static final String ATT_PARAMREQUEST = "paramRequest";
    public static final String MODE_ADDEDITCONTACT = "m_addcontact";
    public static final String MODE_CONTACTDETAIL = "m_contactdetail";

    public static final String ACT_ADDCONTACT = "a_addcontact";
    public static final String ACT_EDITCONTACT = "a_editcontact";
    public static final String ACT_DELETECONTACT = "a_deletecontact";

    public static final String PARAM_CONTACTID = "contactid";


    @Override
    public void processRequest(HttpServletRequest request, HttpServletResponse response, SWBParamRequest paramRequest) throws SWBResourceException, IOException {
        super.processRequest(request, response, paramRequest);
    }

    @Override
    public void processAction(HttpServletRequest request, SWBActionResponse response) throws SWBResourceException, IOException {
        super.processAction(request, response);
    }

    @Override
    public void doView(HttpServletRequest request, HttpServletResponse response, SWBParamRequest paramsRequest) throws SWBResourceException, IOException {
        super.doView(request, response, paramsRequest);
    }
}
