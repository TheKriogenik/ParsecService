
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IntegrationService", targetNamespace = "http://parsec.ru/Parsec3IntergationService", wsdlLocation = "http://10.0.205.1:10101/IntegrationService/IntegrationService.asmx?wsdl")
public class IntegrationService
    extends Service
{

    private final static URL INTEGRATIONSERVICE_WSDL_LOCATION;
    private final static WebServiceException INTEGRATIONSERVICE_EXCEPTION;
    private final static QName INTEGRATIONSERVICE_QNAME = new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://10.0.205.1:10101/IntegrationService/IntegrationService.asmx?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        INTEGRATIONSERVICE_WSDL_LOCATION = url;
        INTEGRATIONSERVICE_EXCEPTION = e;
    }

    public IntegrationService() {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(WebServiceFeature... features) {
        super(__getWsdlLocation(), INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME);
    }

    public IntegrationService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, INTEGRATIONSERVICE_QNAME, features);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IntegrationService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    private static URL __getWsdlLocation() {
        if (INTEGRATIONSERVICE_EXCEPTION != null) {
            throw INTEGRATIONSERVICE_EXCEPTION;
        }
        return INTEGRATIONSERVICE_WSDL_LOCATION;
    }

    /**
     *
     * @return
     *     returns IntegrationServiceSoap
     */
    @WebEndpoint(name = "IntegrationServiceSoap")
    public IntegrationServiceSoap getIntegrationServiceSoap() {
        return super.getPort(new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationServiceSoap"), IntegrationServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IntegrationServiceSoap
     */
    @WebEndpoint(name = "IntegrationServiceSoap")
    public IntegrationServiceSoap getIntegrationServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://parsec.ru/Parsec3IntergationService", "IntegrationServiceSoap"), IntegrationServiceSoap.class, features);
    }

}