package com.cengage.nextbook.panopto.soapservice.accessmgt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2 2012-04-04T15:38:45.665+05:30 Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "IAccessManagement")
@XmlSeeAlso({ObjectFactory.class})
public interface IAccessManagement {
    
    @Action(input = "http://tempuri.org/IAccessManagement/UpdateSessionInheritViewerAccess",
            output = "http://tempuri.org/IAccessManagement/UpdateSessionInheritViewerAccessResponse")
    @RequestWrapper(localName = "UpdateSessionInheritViewerAccess",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateSessionInheritViewerAccess")
    @WebMethod(operationName = "UpdateSessionInheritViewerAccess",
               action = "http://tempuri.org/IAccessManagement/UpdateSessionInheritViewerAccess")
    @ResponseWrapper(localName = "UpdateSessionInheritViewerAccessResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateSessionInheritViewerAccessResponse")
    public void updateSessionInheritViewerAccess(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                 @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                 @WebParam(name = "inheritViewerAccess",
                                                           targetNamespace = "http://tempuri.org/") java.lang.Boolean inheritViewerAccess);
    
    @Action(input = "http://tempuri.org/IAccessManagement/GrantGroupViewerAccessToSession",
            output = "http://tempuri.org/IAccessManagement/GrantGroupViewerAccessToSessionResponse")
    @RequestWrapper(localName = "GrantGroupViewerAccessToSession",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantGroupViewerAccessToSession")
    @WebMethod(operationName = "GrantGroupViewerAccessToSession",
               action = "http://tempuri.org/IAccessManagement/GrantGroupViewerAccessToSession")
    @ResponseWrapper(localName = "GrantGroupViewerAccessToSessionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantGroupViewerAccessToSessionResponse")
    public void grantGroupViewerAccessToSession(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                @WebParam(name = "groupId", targetNamespace = "http://tempuri.org/") java.lang.String groupId);
    
    @Action(input = "http://tempuri.org/IAccessManagement/UpdateFolderIsPublic",
            output = "http://tempuri.org/IAccessManagement/UpdateFolderIsPublicResponse")
    @RequestWrapper(localName = "UpdateFolderIsPublic",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateFolderIsPublic")
    @WebMethod(operationName = "UpdateFolderIsPublic",
               action = "http://tempuri.org/IAccessManagement/UpdateFolderIsPublic")
    @ResponseWrapper(localName = "UpdateFolderIsPublicResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateFolderIsPublicResponse")
    public void updateFolderIsPublic(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                     @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                     @WebParam(name = "isPublic", targetNamespace = "http://tempuri.org/") java.lang.Boolean isPublic);
    
    @WebResult(name = "GetSessionAccessDetailsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAccessManagement/GetSessionAccessDetails",
            output = "http://tempuri.org/IAccessManagement/GetSessionAccessDetailsResponse")
    @RequestWrapper(localName = "GetSessionAccessDetails",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetSessionAccessDetails")
    @WebMethod(operationName = "GetSessionAccessDetails",
               action = "http://tempuri.org/IAccessManagement/GetSessionAccessDetails")
    @ResponseWrapper(localName = "GetSessionAccessDetailsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetSessionAccessDetailsResponse")
    public com.cengage.nextbook.panopto.soapservice.accessmgt.SessionAccessDetails getSessionAccessDetails(@WebParam(name = "auth",
                                                                                                                     targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                                                                           @WebParam(name = "sessionId",
                                                                                                                     targetNamespace = "http://tempuri.org/") java.lang.String sessionId);
    
    @Action(input = "http://tempuri.org/IAccessManagement/RevokeGroupViewerAccessFromSession",
            output = "http://tempuri.org/IAccessManagement/RevokeGroupViewerAccessFromSessionResponse")
    @RequestWrapper(localName = "RevokeGroupViewerAccessFromSession",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeGroupViewerAccessFromSession")
    @WebMethod(operationName = "RevokeGroupViewerAccessFromSession",
               action = "http://tempuri.org/IAccessManagement/RevokeGroupViewerAccessFromSession")
    @ResponseWrapper(localName = "RevokeGroupViewerAccessFromSessionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeGroupViewerAccessFromSessionResponse")
    public void revokeGroupViewerAccessFromSession(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                   @WebParam(name = "sessionId",
                                                             targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                   @WebParam(name = "groupId", targetNamespace = "http://tempuri.org/") java.lang.String groupId);
    
    @WebResult(name = "GetSelfUserAccessDetailsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAccessManagement/GetSelfUserAccessDetails",
            output = "http://tempuri.org/IAccessManagement/GetSelfUserAccessDetailsResponse")
    @RequestWrapper(localName = "GetSelfUserAccessDetails",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetSelfUserAccessDetails")
    @WebMethod(operationName = "GetSelfUserAccessDetails",
               action = "http://tempuri.org/IAccessManagement/GetSelfUserAccessDetails")
    @ResponseWrapper(localName = "GetSelfUserAccessDetailsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetSelfUserAccessDetailsResponse")
    public com.cengage.nextbook.panopto.soapservice.accessmgt.UserAccessDetails getSelfUserAccessDetails(@WebParam(name = "auth",
                                                                                                                   targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth);
    
    @Action(input = "http://tempuri.org/IAccessManagement/RevokeUsersAccessFromFolder",
            output = "http://tempuri.org/IAccessManagement/RevokeUsersAccessFromFolderResponse")
    @RequestWrapper(localName = "RevokeUsersAccessFromFolder",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeUsersAccessFromFolder")
    @WebMethod(operationName = "RevokeUsersAccessFromFolder",
               action = "http://tempuri.org/IAccessManagement/RevokeUsersAccessFromFolder")
    @ResponseWrapper(localName = "RevokeUsersAccessFromFolderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeUsersAccessFromFolderResponse")
    public void revokeUsersAccessFromFolder(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                            @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                            @WebParam(name = "userIds", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.ArrayOfguid userIds,
                                            @WebParam(name = "role", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AccessRole role);
    
    @Action(input = "http://tempuri.org/IAccessManagement/GrantUsersAccessToFolder",
            output = "http://tempuri.org/IAccessManagement/GrantUsersAccessToFolderResponse")
    @RequestWrapper(localName = "GrantUsersAccessToFolder",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantUsersAccessToFolder")
    @WebMethod(operationName = "GrantUsersAccessToFolder",
               action = "http://tempuri.org/IAccessManagement/GrantUsersAccessToFolder")
    @ResponseWrapper(localName = "GrantUsersAccessToFolderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantUsersAccessToFolderResponse")
    public void grantUsersAccessToFolder(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                         @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                         @WebParam(name = "userIds", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.ArrayOfguid userIds,
                                         @WebParam(name = "role", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AccessRole role);
    
    @Action(input = "http://tempuri.org/IAccessManagement/RevokeUsersViewerAccessFromSession",
            output = "http://tempuri.org/IAccessManagement/RevokeUsersViewerAccessFromSessionResponse")
    @RequestWrapper(localName = "RevokeUsersViewerAccessFromSession",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeUsersViewerAccessFromSession")
    @WebMethod(operationName = "RevokeUsersViewerAccessFromSession",
               action = "http://tempuri.org/IAccessManagement/RevokeUsersViewerAccessFromSession")
    @ResponseWrapper(localName = "RevokeUsersViewerAccessFromSessionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeUsersViewerAccessFromSessionResponse")
    public void revokeUsersViewerAccessFromSession(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                   @WebParam(name = "sessionId",
                                                             targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                   @WebParam(name = "userIds", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.ArrayOfguid userIds);
    
    @WebResult(name = "GetUserAccessDetailsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAccessManagement/GetUserAccessDetails",
            output = "http://tempuri.org/IAccessManagement/GetUserAccessDetailsResponse")
    @RequestWrapper(localName = "GetUserAccessDetails",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetUserAccessDetails")
    @WebMethod(operationName = "GetUserAccessDetails",
               action = "http://tempuri.org/IAccessManagement/GetUserAccessDetails")
    @ResponseWrapper(localName = "GetUserAccessDetailsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetUserAccessDetailsResponse")
    public com.cengage.nextbook.panopto.soapservice.accessmgt.UserAccessDetails getUserAccessDetails(@WebParam(name = "auth",
                                                                                                               targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                                                                     @WebParam(name = "userId",
                                                                                                               targetNamespace = "http://tempuri.org/") java.lang.String userId);
    
    @Action(input = "http://tempuri.org/IAccessManagement/UpdateSessionIsPublic",
            output = "http://tempuri.org/IAccessManagement/UpdateSessionIsPublicResponse")
    @RequestWrapper(localName = "UpdateSessionIsPublic",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateSessionIsPublic")
    @WebMethod(operationName = "UpdateSessionIsPublic",
               action = "http://tempuri.org/IAccessManagement/UpdateSessionIsPublic")
    @ResponseWrapper(localName = "UpdateSessionIsPublicResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.UpdateSessionIsPublicResponse")
    public void updateSessionIsPublic(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                      @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                      @WebParam(name = "isPublic", targetNamespace = "http://tempuri.org/") java.lang.Boolean isPublic);
    
    @Action(input = "http://tempuri.org/IAccessManagement/GrantGroupAccessToFolder",
            output = "http://tempuri.org/IAccessManagement/GrantGroupAccessToFolderResponse")
    @RequestWrapper(localName = "GrantGroupAccessToFolder",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantGroupAccessToFolder")
    @WebMethod(operationName = "GrantGroupAccessToFolder",
               action = "http://tempuri.org/IAccessManagement/GrantGroupAccessToFolder")
    @ResponseWrapper(localName = "GrantGroupAccessToFolderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantGroupAccessToFolderResponse")
    public void grantGroupAccessToFolder(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                         @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                         @WebParam(name = "groupId", targetNamespace = "http://tempuri.org/") java.lang.String groupId,
                                         @WebParam(name = "role", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AccessRole role);
    
    @Action(input = "http://tempuri.org/IAccessManagement/GrantUsersViewerAccessToSession",
            output = "http://tempuri.org/IAccessManagement/GrantUsersViewerAccessToSessionResponse")
    @RequestWrapper(localName = "GrantUsersViewerAccessToSession",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantUsersViewerAccessToSession")
    @WebMethod(operationName = "GrantUsersViewerAccessToSession",
               action = "http://tempuri.org/IAccessManagement/GrantUsersViewerAccessToSession")
    @ResponseWrapper(localName = "GrantUsersViewerAccessToSessionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GrantUsersViewerAccessToSessionResponse")
    public void grantUsersViewerAccessToSession(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                @WebParam(name = "userIds", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.ArrayOfguid userIds);
    
    @Action(input = "http://tempuri.org/IAccessManagement/RevokeGroupAccessFromFolder",
            output = "http://tempuri.org/IAccessManagement/RevokeGroupAccessFromFolderResponse")
    @RequestWrapper(localName = "RevokeGroupAccessFromFolder",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeGroupAccessFromFolder")
    @WebMethod(operationName = "RevokeGroupAccessFromFolder",
               action = "http://tempuri.org/IAccessManagement/RevokeGroupAccessFromFolder")
    @ResponseWrapper(localName = "RevokeGroupAccessFromFolderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.RevokeGroupAccessFromFolderResponse")
    public void revokeGroupAccessFromFolder(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                            @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                            @WebParam(name = "groupId", targetNamespace = "http://tempuri.org/") java.lang.String groupId,
                                            @WebParam(name = "role", targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AccessRole role);
    
    @WebResult(name = "GetGroupAccessDetailsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAccessManagement/GetGroupAccessDetails",
            output = "http://tempuri.org/IAccessManagement/GetGroupAccessDetailsResponse")
    @RequestWrapper(localName = "GetGroupAccessDetails",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetGroupAccessDetails")
    @WebMethod(operationName = "GetGroupAccessDetails",
               action = "http://tempuri.org/IAccessManagement/GetGroupAccessDetails")
    @ResponseWrapper(localName = "GetGroupAccessDetailsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetGroupAccessDetailsResponse")
    public com.cengage.nextbook.panopto.soapservice.accessmgt.GroupAccessDetails getGroupAccessDetails(@WebParam(name = "auth",
                                                                                                                 targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                                                                       @WebParam(name = "groupId",
                                                                                                                 targetNamespace = "http://tempuri.org/") java.lang.String groupId);
    
    @WebResult(name = "GetFolderAccessDetailsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/IAccessManagement/GetFolderAccessDetails",
            output = "http://tempuri.org/IAccessManagement/GetFolderAccessDetailsResponse")
    @RequestWrapper(localName = "GetFolderAccessDetails",
                    targetNamespace = "http://tempuri.org/",
                    className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetFolderAccessDetails")
    @WebMethod(operationName = "GetFolderAccessDetails",
               action = "http://tempuri.org/IAccessManagement/GetFolderAccessDetails")
    @ResponseWrapper(localName = "GetFolderAccessDetailsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "com.cengage.nextbook.panopto.soapservice.accessmgt.GetFolderAccessDetailsResponse")
    public com.cengage.nextbook.panopto.soapservice.accessmgt.FolderAccessDetails getFolderAccessDetails(@WebParam(name = "auth",
                                                                                                                   targetNamespace = "http://tempuri.org/") com.cengage.nextbook.panopto.soapservice.accessmgt.AuthenticationInfo auth,
                                                                                                         @WebParam(name = "folderId",
                                                                                                                   targetNamespace = "http://tempuri.org/") java.lang.String folderId);
}
