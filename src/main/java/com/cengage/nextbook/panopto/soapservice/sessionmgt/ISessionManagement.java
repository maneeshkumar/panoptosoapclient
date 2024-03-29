package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.2 2012-03-28T14:09:51.179+05:30 Generated source version: 2.5.2
 * 
 */
@WebService(targetNamespace = "http://tempuri.org/", name = "ISessionManagement")
@XmlSeeAlso({ObjectFactory.class})
public interface ISessionManagement {
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderName",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderNameResponse")
    @RequestWrapper(localName = "UpdateFolderName",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderName")
    @WebMethod(operationName = "UpdateFolderName", action = "http://tempuri.org/ISessionManagement/UpdateFolderName")
    @ResponseWrapper(localName = "UpdateFolderNameResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderNameResponse")
    public void updateFolderName(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                 @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                 @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateSessionDescription",
            output = "http://tempuri.org/ISessionManagement/UpdateSessionDescriptionResponse")
    @RequestWrapper(localName = "UpdateSessionDescription",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateSessionDescription")
    @WebMethod(operationName = "UpdateSessionDescription",
               action = "http://tempuri.org/ISessionManagement/UpdateSessionDescription")
    @ResponseWrapper(localName = "UpdateSessionDescriptionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateSessionDescriptionResponse")
    public void updateSessionDescription(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                         @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                         @WebParam(name = "description", targetNamespace = "http://tempuri.org/") java.lang.String description);
    
    @Action(input = "http://tempuri.org/ISessionManagement/SetNotesPublic",
            output = "http://tempuri.org/ISessionManagement/SetNotesPublicResponse")
    @RequestWrapper(localName = "SetNotesPublic", targetNamespace = "http://tempuri.org/", className = "SetNotesPublic")
    @WebMethod(operationName = "SetNotesPublic", action = "http://tempuri.org/ISessionManagement/SetNotesPublic")
    @ResponseWrapper(localName = "SetNotesPublicResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "SetNotesPublicResponse")
    public void setNotesPublic(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                               @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                               @WebParam(name = "areNotesPublic", targetNamespace = "http://tempuri.org/") java.lang.Boolean areNotesPublic);
    
    @WebResult(name = "AreUsersNotesPublicResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/AreUsersNotesPublic",
            output = "http://tempuri.org/ISessionManagement/AreUsersNotesPublicResponse")
    @RequestWrapper(localName = "AreUsersNotesPublic",
                    targetNamespace = "http://tempuri.org/",
                    className = "AreUsersNotesPublic")
    @WebMethod(operationName = "AreUsersNotesPublic",
               action = "http://tempuri.org/ISessionManagement/AreUsersNotesPublic")
    @ResponseWrapper(localName = "AreUsersNotesPublicResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "AreUsersNotesPublicResponse")
    public java.lang.Boolean areUsersNotesPublic(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                 @WebParam(name = "userId", targetNamespace = "http://tempuri.org/") java.lang.String userId,
                                                 @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId);
    
    @Action(input = "http://tempuri.org/ISessionManagement/DeleteSessions",
            output = "http://tempuri.org/ISessionManagement/DeleteSessionsResponse")
    @RequestWrapper(localName = "DeleteSessions", targetNamespace = "http://tempuri.org/", className = "DeleteSessions")
    @WebMethod(operationName = "DeleteSessions", action = "http://tempuri.org/ISessionManagement/DeleteSessions")
    @ResponseWrapper(localName = "DeleteSessionsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "DeleteSessionsResponse")
    public void deleteSessions(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                               @WebParam(name = "sessionIds", targetNamespace = "http://tempuri.org/") ArrayOfguid sessionIds);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderAllowSessionDownload",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderAllowSessionDownloadResponse")
    @RequestWrapper(localName = "UpdateFolderAllowSessionDownload",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderAllowSessionDownload")
    @WebMethod(operationName = "UpdateFolderAllowSessionDownload",
               action = "http://tempuri.org/ISessionManagement/UpdateFolderAllowSessionDownload")
    @ResponseWrapper(localName = "UpdateFolderAllowSessionDownloadResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderAllowSessionDownloadResponse")
    public void updateFolderAllowSessionDownload(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                 @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                                 @WebParam(name = "allowSessionDownload",
                                                           targetNamespace = "http://tempuri.org/") java.lang.Boolean allowSessionDownload);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderAllowPublicNotes",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderAllowPublicNotesResponse")
    @RequestWrapper(localName = "UpdateFolderAllowPublicNotes",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderAllowPublicNotes")
    @WebMethod(operationName = "UpdateFolderAllowPublicNotes",
               action = "http://tempuri.org/ISessionManagement/UpdateFolderAllowPublicNotes")
    @ResponseWrapper(localName = "UpdateFolderAllowPublicNotesResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderAllowPublicNotesResponse")
    public void updateFolderAllowPublicNotes(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                             @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                             @WebParam(name = "allowPublicNotes",
                                                       targetNamespace = "http://tempuri.org/") java.lang.Boolean allowPublicNotes);
    
    @WebResult(name = "ProvisionExternalCourseResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/ProvisionExternalCourse",
            output = "http://tempuri.org/ISessionManagement/ProvisionExternalCourseResponse")
    @RequestWrapper(localName = "ProvisionExternalCourse",
                    targetNamespace = "http://tempuri.org/",
                    className = "ProvisionExternalCourse")
    @WebMethod(operationName = "ProvisionExternalCourse",
               action = "http://tempuri.org/ISessionManagement/ProvisionExternalCourse")
    @ResponseWrapper(localName = "ProvisionExternalCourseResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "ProvisionExternalCourseResponse")
    public Folder provisionExternalCourse(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                          @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name,
                                          @WebParam(name = "externalId", targetNamespace = "http://tempuri.org/") java.lang.String externalId);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderParent",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderParentResponse")
    @RequestWrapper(localName = "UpdateFolderParent",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderParent")
    @WebMethod(operationName = "UpdateFolderParent",
               action = "http://tempuri.org/ISessionManagement/UpdateFolderParent")
    @ResponseWrapper(localName = "UpdateFolderParentResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderParentResponse")
    public void updateFolderParent(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                   @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                   @WebParam(name = "parentId", targetNamespace = "http://tempuri.org/") java.lang.String parentId);
    
    @WebResult(name = "AddFolderResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/AddFolder",
            output = "http://tempuri.org/ISessionManagement/AddFolderResponse")
    @RequestWrapper(localName = "AddFolder", targetNamespace = "http://tempuri.org/", className = "AddFolder")
    @WebMethod(operationName = "AddFolder", action = "http://tempuri.org/ISessionManagement/AddFolder")
    @ResponseWrapper(localName = "AddFolderResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "AddFolderResponse")
    public Folder addFolder(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                            @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name,
                            @WebParam(name = "parentFolder", targetNamespace = "http://tempuri.org/") java.lang.String parentFolder,
                            @WebParam(name = "isPublic", targetNamespace = "http://tempuri.org/") java.lang.Boolean isPublic);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderEnablePodcast",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderEnablePodcastResponse")
    @RequestWrapper(localName = "UpdateFolderEnablePodcast",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderEnablePodcast")
    @WebMethod(operationName = "UpdateFolderEnablePodcast",
               action = "http://tempuri.org/ISessionManagement/UpdateFolderEnablePodcast")
    @ResponseWrapper(localName = "UpdateFolderEnablePodcastResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderEnablePodcastResponse")
    public void updateFolderEnablePodcast(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                          @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                          @WebParam(name = "enablePodcast", targetNamespace = "http://tempuri.org/") java.lang.Boolean enablePodcast);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateSessionIsBroadcast",
            output = "http://tempuri.org/ISessionManagement/UpdateSessionIsBroadcastResponse")
    @RequestWrapper(localName = "UpdateSessionIsBroadcast",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateSessionIsBroadcast")
    @WebMethod(operationName = "UpdateSessionIsBroadcast",
               action = "http://tempuri.org/ISessionManagement/UpdateSessionIsBroadcast")
    @ResponseWrapper(localName = "UpdateSessionIsBroadcastResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateSessionIsBroadcastResponse")
    public void updateSessionIsBroadcast(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                         @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                         @WebParam(name = "isBroadcast", targetNamespace = "http://tempuri.org/") java.lang.Boolean isBroadcast);
    
    @Action(input = "http://tempuri.org/ISessionManagement/DeleteNote",
            output = "http://tempuri.org/ISessionManagement/DeleteNoteResponse")
    @RequestWrapper(localName = "DeleteNote", targetNamespace = "http://tempuri.org/", className = "DeleteNote")
    @WebMethod(operationName = "DeleteNote", action = "http://tempuri.org/ISessionManagement/DeleteNote")
    @ResponseWrapper(localName = "DeleteNoteResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "DeleteNoteResponse")
    public void deleteNote(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                           @WebParam(name = "noteId", targetNamespace = "http://tempuri.org/") java.lang.String noteId,
                           @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId);
    
    @WebResult(name = "GetRecorderDownloadUrlsResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetRecorderDownloadUrls",
            output = "http://tempuri.org/ISessionManagement/GetRecorderDownloadUrlsResponse")
    @RequestWrapper(localName = "GetRecorderDownloadUrls",
                    targetNamespace = "http://tempuri.org/",
                    className = "GetRecorderDownloadUrls")
    @WebMethod(operationName = "GetRecorderDownloadUrls",
               action = "http://tempuri.org/ISessionManagement/GetRecorderDownloadUrls")
    @ResponseWrapper(localName = "GetRecorderDownloadUrlsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetRecorderDownloadUrlsResponse")
    public RecorderDownloadUrlResponse getRecorderDownloadUrls();
    
    @WebResult(name = "CreateNoteByAbsoluteTimeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/CreateNoteByAbsoluteTime",
            output = "http://tempuri.org/ISessionManagement/CreateNoteByAbsoluteTimeResponse")
    @RequestWrapper(localName = "CreateNoteByAbsoluteTime",
                    targetNamespace = "http://tempuri.org/",
                    className = "CreateNoteByAbsoluteTime")
    @WebMethod(operationName = "CreateNoteByAbsoluteTime",
               action = "http://tempuri.org/ISessionManagement/CreateNoteByAbsoluteTime")
    @ResponseWrapper(localName = "CreateNoteByAbsoluteTimeResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "CreateNoteByAbsoluteTimeResponse")
    public java.lang.String createNoteByAbsoluteTime(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                     @WebParam(name = "sessionId",
                                                               targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                     @WebParam(name = "text", targetNamespace = "http://tempuri.org/") java.lang.String text,
                                                     @WebParam(name = "channel",
                                                               targetNamespace = "http://tempuri.org/") java.lang.String channel,
                                                     @WebParam(name = "timestamp",
                                                               targetNamespace = "http://tempuri.org/") javax.xml.datatype.XMLGregorianCalendar timestamp);
    
    @WebResult(name = "SetExternalCourseAccessResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/SetExternalCourseAccess",
            output = "http://tempuri.org/ISessionManagement/SetExternalCourseAccessResponse")
    @RequestWrapper(localName = "SetExternalCourseAccess",
                    targetNamespace = "http://tempuri.org/",
                    className = "SetExternalCourseAccess")
    @WebMethod(operationName = "SetExternalCourseAccess",
               action = "http://tempuri.org/ISessionManagement/SetExternalCourseAccess")
    @ResponseWrapper(localName = "SetExternalCourseAccessResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "SetExternalCourseAccessResponse")
    public ArrayOfFolder setExternalCourseAccess(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                 @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name,
                                                 @WebParam(name = "externalId", targetNamespace = "http://tempuri.org/") java.lang.String externalId,
                                                 @WebParam(name = "folderIds", targetNamespace = "http://tempuri.org/") ArrayOfguid folderIds);
    
    @WebResult(name = "GetNoteResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetNote",
            output = "http://tempuri.org/ISessionManagement/GetNoteResponse")
    @RequestWrapper(localName = "GetNote", targetNamespace = "http://tempuri.org/", className = "GetNote")
    @WebMethod(operationName = "GetNote", action = "http://tempuri.org/ISessionManagement/GetNote")
    @ResponseWrapper(localName = "GetNoteResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetNoteResponse")
    public Note getNote(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                        @WebParam(name = "noteId", targetNamespace = "http://tempuri.org/") java.lang.String noteId,
                        @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId);
    
    @Action(input = "http://tempuri.org/ISessionManagement/EditNote",
            output = "http://tempuri.org/ISessionManagement/EditNoteResponse")
    @RequestWrapper(localName = "EditNote", targetNamespace = "http://tempuri.org/", className = "EditNote")
    @WebMethod(operationName = "EditNote", action = "http://tempuri.org/ISessionManagement/EditNote")
    @ResponseWrapper(localName = "EditNoteResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "EditNoteResponse")
    public void editNote(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                         @WebParam(name = "noteId", targetNamespace = "http://tempuri.org/") java.lang.String noteId,
                         @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                         @WebParam(name = "newText", targetNamespace = "http://tempuri.org/") java.lang.String newText);
    
    @WebResult(name = "AddSessionResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/AddSession",
            output = "http://tempuri.org/ISessionManagement/AddSessionResponse")
    @RequestWrapper(localName = "AddSession", targetNamespace = "http://tempuri.org/", className = "AddSession")
    @WebMethod(operationName = "AddSession", action = "http://tempuri.org/ISessionManagement/AddSession")
    @ResponseWrapper(localName = "AddSessionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "AddSessionResponse")
    public Session addSession(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                              @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name,
                              @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                              @WebParam(name = "isBroadcast", targetNamespace = "http://tempuri.org/") java.lang.Boolean isBroadcast);
    
    @WebResult(name = "GetFoldersByIdResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetFoldersById",
            output = "http://tempuri.org/ISessionManagement/GetFoldersByIdResponse")
    @RequestWrapper(localName = "GetFoldersById", targetNamespace = "http://tempuri.org/", className = "GetFoldersById")
    @WebMethod(operationName = "GetFoldersById", action = "http://tempuri.org/ISessionManagement/GetFoldersById")
    @ResponseWrapper(localName = "GetFoldersByIdResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetFoldersByIdResponse")
    public ArrayOfFolder getFoldersById(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                        @WebParam(name = "folderIds", targetNamespace = "http://tempuri.org/") ArrayOfguid folderIds);
    
    @WebResult(name = "GetFoldersListResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetFoldersList",
            output = "http://tempuri.org/ISessionManagement/GetFoldersListResponse")
    @RequestWrapper(localName = "GetFoldersList", targetNamespace = "http://tempuri.org/", className = "GetFoldersList")
    @WebMethod(operationName = "GetFoldersList", action = "http://tempuri.org/ISessionManagement/GetFoldersList")
    @ResponseWrapper(localName = "GetFoldersListResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetFoldersListResponse")
    public ListFoldersResponse getFoldersList(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                              @WebParam(name = "request", targetNamespace = "http://tempuri.org/") ListFoldersRequest request,
                                              @WebParam(name = "searchQuery", targetNamespace = "http://tempuri.org/") java.lang.String searchQuery);
    
    @WebResult(name = "GetSessionsByIdResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetSessionsById",
            output = "http://tempuri.org/ISessionManagement/GetSessionsByIdResponse")
    @RequestWrapper(localName = "GetSessionsById",
                    targetNamespace = "http://tempuri.org/",
                    className = "GetSessionsById")
    @WebMethod(operationName = "GetSessionsById", action = "http://tempuri.org/ISessionManagement/GetSessionsById")
    @ResponseWrapper(localName = "GetSessionsByIdResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetSessionsByIdResponse")
    public ArrayOfSession getSessionsById(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                          @WebParam(name = "sessionIds", targetNamespace = "http://tempuri.org/") ArrayOfguid sessionIds);
    
    @WebResult(name = "CreateNoteByRelativeTimeResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/CreateNoteByRelativeTime",
            output = "http://tempuri.org/ISessionManagement/CreateNoteByRelativeTimeResponse")
    @RequestWrapper(localName = "CreateNoteByRelativeTime",
                    targetNamespace = "http://tempuri.org/",
                    className = "CreateNoteByRelativeTime")
    @WebMethod(operationName = "CreateNoteByRelativeTime",
               action = "http://tempuri.org/ISessionManagement/CreateNoteByRelativeTime")
    @ResponseWrapper(localName = "CreateNoteByRelativeTimeResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "CreateNoteByRelativeTimeResponse")
    public java.lang.String createNoteByRelativeTime(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                     @WebParam(name = "sessionId",
                                                               targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                                     @WebParam(name = "text", targetNamespace = "http://tempuri.org/") java.lang.String text,
                                                     @WebParam(name = "channel",
                                                               targetNamespace = "http://tempuri.org/") java.lang.String channel,
                                                     @WebParam(name = "timestamp",
                                                               targetNamespace = "http://tempuri.org/") java.lang.Double timestamp);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateSessionName",
            output = "http://tempuri.org/ISessionManagement/UpdateSessionNameResponse")
    @RequestWrapper(localName = "UpdateSessionName",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateSessionName")
    @WebMethod(operationName = "UpdateSessionName", action = "http://tempuri.org/ISessionManagement/UpdateSessionName")
    @ResponseWrapper(localName = "UpdateSessionNameResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateSessionNameResponse")
    public void updateSessionName(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                  @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                  @WebParam(name = "name", targetNamespace = "http://tempuri.org/") java.lang.String name);
    
    @WebResult(name = "ListNotesResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/ListNotes",
            output = "http://tempuri.org/ISessionManagement/ListNotesResponse")
    @RequestWrapper(localName = "ListNotes", targetNamespace = "http://tempuri.org/", className = "ListNotes")
    @WebMethod(operationName = "ListNotes", action = "http://tempuri.org/ISessionManagement/ListNotes")
    @ResponseWrapper(localName = "ListNotesResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "ListNotesResponse")
    public ListNotesResponse2 listNotes(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                        @WebParam(name = "sessionId", targetNamespace = "http://tempuri.org/") java.lang.String sessionId,
                                        @WebParam(name = "pagination", targetNamespace = "http://tempuri.org/") Pagination pagination,
                                        @WebParam(name = "creatorId", targetNamespace = "http://tempuri.org/") java.lang.String creatorId,
                                        @WebParam(name = "channel", targetNamespace = "http://tempuri.org/") java.lang.String channel,
                                        @WebParam(name = "searchQuery", targetNamespace = "http://tempuri.org/") java.lang.String searchQuery);
    
    @Action(input = "http://tempuri.org/ISessionManagement/MoveSessions",
            output = "http://tempuri.org/ISessionManagement/MoveSessionsResponse")
    @RequestWrapper(localName = "MoveSessions", targetNamespace = "http://tempuri.org/", className = "MoveSessions")
    @WebMethod(operationName = "MoveSessions", action = "http://tempuri.org/ISessionManagement/MoveSessions")
    @ResponseWrapper(localName = "MoveSessionsResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "MoveSessionsResponse")
    public void moveSessions(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                             @WebParam(name = "sessionIds", targetNamespace = "http://tempuri.org/") ArrayOfguid sessionIds,
                             @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId);
    
    @WebResult(name = "IsDropboxResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/IsDropbox",
            output = "http://tempuri.org/ISessionManagement/IsDropboxResponse")
    @RequestWrapper(localName = "IsDropbox", targetNamespace = "http://tempuri.org/", className = "IsDropbox")
    @WebMethod(operationName = "IsDropbox", action = "http://tempuri.org/ISessionManagement/IsDropbox")
    @ResponseWrapper(localName = "IsDropboxResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "IsDropboxResponse")
    public java.lang.Boolean isDropbox(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                       @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId);
    
    @WebResult(name = "GetSessionsListResult", targetNamespace = "http://tempuri.org/")
    @Action(input = "http://tempuri.org/ISessionManagement/GetSessionsList",
            output = "http://tempuri.org/ISessionManagement/GetSessionsListResponse")
    @RequestWrapper(localName = "GetSessionsList",
                    targetNamespace = "http://tempuri.org/",
                    className = "GetSessionsList")
    @WebMethod(operationName = "GetSessionsList", action = "http://tempuri.org/ISessionManagement/GetSessionsList")
    @ResponseWrapper(localName = "GetSessionsListResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "GetSessionsListResponse")
    public ListSessionsResponse getSessionsList(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                                @WebParam(name = "request", targetNamespace = "http://tempuri.org/") ListSessionsRequest request,
                                                @WebParam(name = "searchQuery", targetNamespace = "http://tempuri.org/") java.lang.String searchQuery);
    
    @Action(input = "http://tempuri.org/ISessionManagement/DeleteFolders",
            output = "http://tempuri.org/ISessionManagement/DeleteFoldersResponse")
    @RequestWrapper(localName = "DeleteFolders", targetNamespace = "http://tempuri.org/", className = "DeleteFolders")
    @WebMethod(operationName = "DeleteFolders", action = "http://tempuri.org/ISessionManagement/DeleteFolders")
    @ResponseWrapper(localName = "DeleteFoldersResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "DeleteFoldersResponse")
    public void deleteFolders(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                              @WebParam(name = "folderIds", targetNamespace = "http://tempuri.org/") ArrayOfguid folderIds);
    
    @Action(input = "http://tempuri.org/ISessionManagement/UpdateFolderDescription",
            output = "http://tempuri.org/ISessionManagement/UpdateFolderDescriptionResponse")
    @RequestWrapper(localName = "UpdateFolderDescription",
                    targetNamespace = "http://tempuri.org/",
                    className = "UpdateFolderDescription")
    @WebMethod(operationName = "UpdateFolderDescription",
               action = "http://tempuri.org/ISessionManagement/UpdateFolderDescription")
    @ResponseWrapper(localName = "UpdateFolderDescriptionResponse",
                     targetNamespace = "http://tempuri.org/",
                     className = "UpdateFolderDescriptionResponse")
    public void updateFolderDescription(@WebParam(name = "auth", targetNamespace = "http://tempuri.org/") AuthenticationInfo auth,
                                        @WebParam(name = "folderId", targetNamespace = "http://tempuri.org/") java.lang.String folderId,
                                        @WebParam(name = "description", targetNamespace = "http://tempuri.org/") java.lang.String description);
}
