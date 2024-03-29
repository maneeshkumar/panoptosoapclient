package com.cengage.nextbook.panopto.soapservice.auth;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2 2012-04-04T15:37:32.860+05:30 Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IAuth")
@XmlSeeAlso({ObjectFactory.class})
public interface IAuth {
    
    @WebResult(name = "GetServerVersionResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAuth/GetServerVersion",
            output = "http://tempuri.org/IAuth/GetServerVersionResponse")
    @RequestWrapper(localName = "GetServerVersion",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.auth.GetServerVersion")
    @WebMethod(operationName = "GetServerVersion", action = "http://tempuri.org/IAuth/GetServerVersion")
    @ResponseWrapper(localName = "GetServerVersionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.auth.GetServerVersionResponse")
    public java.lang.String getServerVersion();
    
    @WebResult(name = "LogOnWithExternalProviderResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAuth/LogOnWithExternalProvider",
            output = "http://tempuri.org/IAuth/LogOnWithExternalProviderResponse")
    @RequestWrapper(localName = "LogOnWithExternalProvider",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.auth.LogOnWithExternalProvider")
    @WebMethod(operationName = "LogOnWithExternalProvider",
               action = "http://tempuri.org/IAuth/LogOnWithExternalProvider")
    @ResponseWrapper(localName = "LogOnWithExternalProviderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.auth.LogOnWithExternalProviderResponse")
    public java.lang.Boolean logOnWithExternalProvider(@WebParam(name = "userKey",
                                                                 targetNamespace = "http://tempuri.org/") java.lang.String userKey,
                                                       @WebParam(name = "authCode",
                                                                 targetNamespace = "http://tempuri.org/") java.lang.String authCode);
    
    @WebResult(name = "LogOnWithPasswordResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAuth/LogOnWithPassword",
            output = "http://tempuri.org/IAuth/LogOnWithPasswordResponse")
    @RequestWrapper(localName = "LogOnWithPassword",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.auth.LogOnWithPassword")
    @WebMethod(operationName = "LogOnWithPassword", action = "http://tempuri.org/IAuth/LogOnWithPassword")
    @ResponseWrapper(localName = "LogOnWithPasswordResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.auth.LogOnWithPasswordResponse")
    public java.lang.Boolean logOnWithPassword(@WebParam(name = "userKey", targetNamespace = "http://tempuri.org/") java.lang.String userKey,
                                               @WebParam(name = "password", targetNamespace = "http://tempuri.org/") java.lang.String password);
}
