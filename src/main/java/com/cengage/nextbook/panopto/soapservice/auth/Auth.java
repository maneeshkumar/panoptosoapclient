package com.cengage.nextbook.panopto.soapservice.auth;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.5.2 2012-04-04T15:37:32.907+05:30 Generated source version: 2.5.2
 * 
 */
@WebServiceClient(name = "Auth",
                  wsdlLocation = "http://mindtap.hosted.panopto.com/Panopto/PublicAPI/4.0/Auth.svc?wsdl",
                  targetNamespace = "http://tempuri.org/")
public class Auth extends Service {
    
    public static final URL WSDL_LOCATION;
    
    public static final QName SERVICE = new QName("http://tempuri.org/", "Auth");
    public static final QName BasicHttpBindingIAuth = new QName("http://tempuri.org/", "BasicHttpBinding_IAuth");
    static {
        URL url = Auth.class.getResource("http://mindtap.hosted.panopto.com/Panopto/PublicAPI/4.0/Auth.svc?wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(Auth.class.getName())
                                    .log(java.util.logging.Level.INFO, "Can not initialize the default wsdl from {0}",
                                         "http://mindtap.hosted.panopto.com/Panopto/PublicAPI/4.0/Auth.svc?wsdl");
        }
        WSDL_LOCATION = url;
    }
    
    public Auth(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }
    
    public Auth(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }
    
    public Auth() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Auth(WebServiceFeature... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Auth(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICE, features);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Auth(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }
    
    /**
     * 
     * @return returns IAuth
     */
    @WebEndpoint(name = "BasicHttpBinding_IAuth")
    public IAuth getBasicHttpBindingIAuth() {
        return super.getPort(BasicHttpBindingIAuth, IAuth.class);
    }
    
    /**
     * 
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features
     * not in the <code>features</code> parameter will have their default values.
     * @return returns IAuth
     */
    @WebEndpoint(name = "BasicHttpBinding_IAuth")
    public IAuth getBasicHttpBindingIAuth(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIAuth, IAuth.class, features);
    }
    
}
