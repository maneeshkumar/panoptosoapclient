package com.cengage.nextbook.panopto.soapservice.sessionmgt;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java element interface generated in the
 * com.session package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    
    private static final QName _AuthenticationInfo_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "AuthenticationInfo");
    private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "anyURI");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "dateTime");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                                "unsignedShort");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _FolderSortField_QNAME = new QName(
                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                  "FolderSortField");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _Session_QNAME = new QName(
                                                          "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                          "Session");
    private static final QName _ArrayOfSessionState_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "ArrayOfSessionState");
    private static final QName _ListNotesResponse_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "ListNotesResponse");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _RecorderDownloadUrlResponse_QNAME = new QName(
                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                              "RecorderDownloadUrlResponse");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "base64Binary");
    private static final QName _SessionState_QNAME = new QName(
                                                               "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                               "SessionState");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "boolean");
    private static final QName _ListFoldersResponse_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "ListFoldersResponse");
    private static final QName _ListSessionsResponse_QNAME = new QName(
                                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                       "ListSessionsResponse");
    private static final QName _ArrayOfSession_QNAME = new QName(
                                                                 "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                 "ArrayOfSession");
    private static final QName _ArrayOfguid_QNAME = new QName(
                                                              "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                                                              "ArrayOfguid");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedByte");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "anyType");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                              "unsignedInt");
    private static final QName _SessionSortField_QNAME = new QName(
                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                   "SessionSortField");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _ArrayOfFolder_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "ArrayOfFolder");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "decimal");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "double");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _Note_QNAME = new QName(
                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                       "Note");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "duration");
    private static final QName _ListFoldersRequest_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "ListFoldersRequest");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "string");
    private static final QName _Folder_QNAME = new QName(
                                                         "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                         "Folder");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedLong");
    private static final QName _Pagination_QNAME = new QName(
                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                             "Pagination");
    private static final QName _ListSessionsRequest_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "ListSessionsRequest");
    private static final QName _ArrayOfNote_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "ArrayOfNote");
    private static final QName _UpdateSessionNameName_QNAME = new QName("http://tempuri.org/", "name");
    private static final QName _UpdateSessionNameAuth_QNAME = new QName("http://tempuri.org/", "auth");
    private static final QName _CreateNoteByAbsoluteTimeText_QNAME = new QName("http://tempuri.org/", "text");
    private static final QName _CreateNoteByAbsoluteTimeChannel_QNAME = new QName("http://tempuri.org/", "channel");
    private static final QName _GetNoteResponseGetNoteResult_QNAME = new QName("http://tempuri.org/", "GetNoteResult");
    private static final QName _ListFoldersRequestParentFolderId_QNAME = new QName(
                                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                   "ParentFolderId");
    private static final QName _GetSessionsByIdSessionIds_QNAME = new QName("http://tempuri.org/", "sessionIds");
    private static final QName _RecorderDownloadUrlResponseWindowsRemoteRecorderDownloadUrl_QNAME = new QName(
                                                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                                              "WindowsRemoteRecorderDownloadUrl");
    private static final QName _RecorderDownloadUrlResponseMacRecorderDownloadUrl_QNAME = new QName(
                                                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                                    "MacRecorderDownloadUrl");
    private static final QName _RecorderDownloadUrlResponseWindowsRecorderDownloadUrl_QNAME = new QName(
                                                                                                        "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                                        "WindowsRecorderDownloadUrl");
    private static final QName _GetFoldersByIdFolderIds_QNAME = new QName("http://tempuri.org/", "folderIds");
    private static final QName _GetSessionsListResponseGetSessionsListResult_QNAME = new QName("http://tempuri.org/",
                                                                                               "GetSessionsListResult");
    private static final QName _UpdateFolderParentParentId_QNAME = new QName("http://tempuri.org/", "parentId");
    private static final QName _UpdateFolderDescriptionDescription_QNAME = new QName("http://tempuri.org/",
                                                                                     "description");
    private static final QName _GetRecorderDownloadUrlsResponseGetRecorderDownloadUrlsResult_QNAME = new QName(
                                                                                                               "http://tempuri.org/",
                                                                                                               "GetRecorderDownloadUrlsResult");
    private static final QName _GetSessionsByIdResponseGetSessionsByIdResult_QNAME = new QName("http://tempuri.org/",
                                                                                               "GetSessionsByIdResult");
    private static final QName _GetFoldersListResponseGetFoldersListResult_QNAME = new QName("http://tempuri.org/",
                                                                                             "GetFoldersListResult");
    private static final QName _GetFoldersByIdResponseGetFoldersByIdResult_QNAME = new QName("http://tempuri.org/",
                                                                                             "GetFoldersByIdResult");
    private static final QName _AddFolderResponseAddFolderResult_QNAME = new QName("http://tempuri.org/",
                                                                                   "AddFolderResult");
    private static final QName _ListNotesResponseListNotesResult_QNAME = new QName("http://tempuri.org/",
                                                                                   "ListNotesResult");
    private static final QName _SessionViewerUrl_QNAME = new QName(
                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                   "ViewerUrl");
    private static final QName _SessionStartTime_QNAME = new QName(
                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                   "StartTime");
    private static final QName _SessionStatusMessage_QNAME = new QName(
                                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                       "StatusMessage");
    private static final QName _SessionRemoteRecorderIds_QNAME = new QName(
                                                                           "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                           "RemoteRecorderIds");
    private static final QName _SessionMP3Url_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "MP3Url");
    private static final QName _SessionMP4Url_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "MP4Url");
    private static final QName _SessionSharePageUrl_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "SharePageUrl");
    private static final QName _SessionOutputsPageUrl_QNAME = new QName(
                                                                        "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                        "OutputsPageUrl");
    private static final QName _SessionName_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "Name");
    private static final QName _SessionDuration_QNAME = new QName(
                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                  "Duration");
    private static final QName _SessionThumbUrl_QNAME = new QName(
                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                  "ThumbUrl");
    private static final QName _SessionEditorUrl_QNAME = new QName(
                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                   "EditorUrl");
    private static final QName _SessionNotesURL_QNAME = new QName(
                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                  "NotesURL");
    private static final QName _SessionDescription_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "Description");
    private static final QName _ListFoldersResponseResults_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "Results");
    private static final QName _GetSessionsListRequest_QNAME = new QName("http://tempuri.org/", "request");
    private static final QName _GetSessionsListSearchQuery_QNAME = new QName("http://tempuri.org/", "searchQuery");
    private static final QName _ProvisionExternalCourseExternalId_QNAME = new QName("http://tempuri.org/", "externalId");
    private static final QName _SetExternalCourseAccessResponseSetExternalCourseAccessResult_QNAME = new QName(
                                                                                                               "http://tempuri.org/",
                                                                                                               "SetExternalCourseAccessResult");
    private static final QName _AuthenticationInfoUserKey_QNAME = new QName(
                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                            "UserKey");
    private static final QName _AuthenticationInfoPassword_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "Password");
    private static final QName _AuthenticationInfoAuthCode_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "AuthCode");
    private static final QName _AddFolderParentFolder_QNAME = new QName("http://tempuri.org/", "parentFolder");
    private static final QName _AddSessionResponseAddSessionResult_QNAME = new QName("http://tempuri.org/",
                                                                                     "AddSessionResult");
    private static final QName _NoteChannel_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "Channel");
    private static final QName _NoteText_QNAME = new QName(
                                                           "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                           "Text");
    private static final QName _FolderParentFolder_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "ParentFolder");
    private static final QName _FolderSettingsUrl_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "SettingsUrl");
    private static final QName _FolderAudioPodcastITunesUrl_QNAME = new QName(
                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                              "AudioPodcastITunesUrl");
    private static final QName _FolderListUrl_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "ListUrl");
    private static final QName _FolderSessions_QNAME = new QName(
                                                                 "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                 "Sessions");
    private static final QName _FolderChildFolders_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "ChildFolders");
    private static final QName _FolderVideoPodcastITunesUrl_QNAME = new QName(
                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                              "VideoPodcastITunesUrl");
    private static final QName _FolderAudioRssUrl_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "AudioRssUrl");
    private static final QName _FolderVideoRssUrl_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "VideoRssUrl");
    private static final QName _ListSessionsRequestStates_QNAME = new QName(
                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                            "States");
    private static final QName _ListSessionsRequestFolderId_QNAME = new QName(
                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                              "FolderId");
    private static final QName _ListSessionsRequestEndDate_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "EndDate");
    private static final QName _ListSessionsRequestRemoteRecorderId_QNAME = new QName(
                                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                      "RemoteRecorderId");
    private static final QName _ListSessionsRequestStartDate_QNAME = new QName(
                                                                               "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                               "StartDate");
    private static final QName _ListNotesPagination_QNAME = new QName("http://tempuri.org/", "pagination");
    private static final QName _ListNotesCreatorId_QNAME = new QName("http://tempuri.org/", "creatorId");
    private static final QName _EditNoteNewText_QNAME = new QName("http://tempuri.org/", "newText");
    private static final QName _ProvisionExternalCourseResponseProvisionExternalCourseResult_QNAME = new QName(
                                                                                                               "http://tempuri.org/",
                                                                                                               "ProvisionExternalCourseResult");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.session
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }
    
    /**
     * Create an instance of {@link UpdateFolderEnablePodcastResponse }
     * 
     */
    public UpdateFolderEnablePodcastResponse createUpdateFolderEnablePodcastResponse() {
        return new UpdateFolderEnablePodcastResponse();
    }
    
    /**
     * Create an instance of {@link ProvisionExternalCourse }
     * 
     */
    public ProvisionExternalCourse createProvisionExternalCourse() {
        return new ProvisionExternalCourse();
    }
    
    /**
     * Create an instance of {@link AuthenticationInfo }
     * 
     */
    public AuthenticationInfo createAuthenticationInfo() {
        return new AuthenticationInfo();
    }
    
    /**
     * Create an instance of {@link GetSessionsList }
     * 
     */
    public GetSessionsList createGetSessionsList() {
        return new GetSessionsList();
    }
    
    /**
     * Create an instance of {@link ListSessionsRequest }
     * 
     */
    public ListSessionsRequest createListSessionsRequest() {
        return new ListSessionsRequest();
    }
    
    /**
     * Create an instance of {@link AreUsersNotesPublicResponse }
     * 
     */
    public AreUsersNotesPublicResponse createAreUsersNotesPublicResponse() {
        return new AreUsersNotesPublicResponse();
    }
    
    /**
     * Create an instance of {@link GetSessionsListResponse }
     * 
     */
    public GetSessionsListResponse createGetSessionsListResponse() {
        return new GetSessionsListResponse();
    }
    
    /**
     * Create an instance of {@link ListSessionsResponse }
     * 
     */
    public ListSessionsResponse createListSessionsResponse() {
        return new ListSessionsResponse();
    }
    
    /**
     * Create an instance of {@link AreUsersNotesPublic }
     * 
     */
    public AreUsersNotesPublic createAreUsersNotesPublic() {
        return new AreUsersNotesPublic();
    }
    
    /**
     * Create an instance of {@link SetExternalCourseAccessResponse }
     * 
     */
    public SetExternalCourseAccessResponse createSetExternalCourseAccessResponse() {
        return new SetExternalCourseAccessResponse();
    }
    
    /**
     * Create an instance of {@link ArrayOfFolder }
     * 
     */
    public ArrayOfFolder createArrayOfFolder() {
        return new ArrayOfFolder();
    }
    
    /**
     * Create an instance of {@link ListNotesResponse }
     * 
     */
    public ListNotesResponse createListNotesResponse() {
        return new ListNotesResponse();
    }
    
    /**
     * Create an instance of {@link ListNotesResponse2 }
     * 
     */
    public ListNotesResponse2 createListNotesResponse2() {
        return new ListNotesResponse2();
    }
    
    /**
     * Create an instance of {@link SetExternalCourseAccess }
     * 
     */
    public SetExternalCourseAccess createSetExternalCourseAccess() {
        return new SetExternalCourseAccess();
    }
    
    /**
     * Create an instance of {@link CreateNoteByRelativeTimeResponse }
     * 
     */
    public CreateNoteByRelativeTimeResponse createCreateNoteByRelativeTimeResponse() {
        return new CreateNoteByRelativeTimeResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderDescription }
     * 
     */
    public UpdateFolderDescription createUpdateFolderDescription() {
        return new UpdateFolderDescription();
    }
    
    /**
     * Create an instance of {@link EditNoteResponse }
     * 
     */
    public EditNoteResponse createEditNoteResponse() {
        return new EditNoteResponse();
    }
    
    /**
     * Create an instance of {@link DeleteFolders }
     * 
     */
    public DeleteFolders createDeleteFolders() {
        return new DeleteFolders();
    }
    
    /**
     * Create an instance of {@link MoveSessionsResponse }
     * 
     */
    public MoveSessionsResponse createMoveSessionsResponse() {
        return new MoveSessionsResponse();
    }
    
    /**
     * Create an instance of {@link DeleteFoldersResponse }
     * 
     */
    public DeleteFoldersResponse createDeleteFoldersResponse() {
        return new DeleteFoldersResponse();
    }
    
    /**
     * Create an instance of {@link AddSession }
     * 
     */
    public AddSession createAddSession() {
        return new AddSession();
    }
    
    /**
     * Create an instance of {@link IsDropbox }
     * 
     */
    public IsDropbox createIsDropbox() {
        return new IsDropbox();
    }
    
    /**
     * Create an instance of {@link UpdateFolderName }
     * 
     */
    public UpdateFolderName createUpdateFolderName() {
        return new UpdateFolderName();
    }
    
    /**
     * Create an instance of {@link UpdateSessionDescription }
     * 
     */
    public UpdateSessionDescription createUpdateSessionDescription() {
        return new UpdateSessionDescription();
    }
    
    /**
     * Create an instance of {@link GetFoldersById }
     * 
     */
    public GetFoldersById createGetFoldersById() {
        return new GetFoldersById();
    }
    
    /**
     * Create an instance of {@link DeleteSessions }
     * 
     */
    public DeleteSessions createDeleteSessions() {
        return new DeleteSessions();
    }
    
    /**
     * Create an instance of {@link GetFoldersListResponse }
     * 
     */
    public GetFoldersListResponse createGetFoldersListResponse() {
        return new GetFoldersListResponse();
    }
    
    /**
     * Create an instance of {@link ListFoldersResponse }
     * 
     */
    public ListFoldersResponse createListFoldersResponse() {
        return new ListFoldersResponse();
    }
    
    /**
     * Create an instance of {@link GetRecorderDownloadUrls }
     * 
     */
    public GetRecorderDownloadUrls createGetRecorderDownloadUrls() {
        return new GetRecorderDownloadUrls();
    }
    
    /**
     * Create an instance of {@link GetNoteResponse }
     * 
     */
    public GetNoteResponse createGetNoteResponse() {
        return new GetNoteResponse();
    }
    
    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }
    
    /**
     * Create an instance of {@link UpdateSessionIsBroadcast }
     * 
     */
    public UpdateSessionIsBroadcast createUpdateSessionIsBroadcast() {
        return new UpdateSessionIsBroadcast();
    }
    
    /**
     * Create an instance of {@link AddSessionResponse }
     * 
     */
    public AddSessionResponse createAddSessionResponse() {
        return new AddSessionResponse();
    }
    
    /**
     * Create an instance of {@link Session }
     * 
     */
    public Session createSession() {
        return new Session();
    }
    
    /**
     * Create an instance of {@link IsDropboxResponse }
     * 
     */
    public IsDropboxResponse createIsDropboxResponse() {
        return new IsDropboxResponse();
    }
    
    /**
     * Create an instance of {@link UpdateSessionName }
     * 
     */
    public UpdateSessionName createUpdateSessionName() {
        return new UpdateSessionName();
    }
    
    /**
     * Create an instance of {@link GetSessionsById }
     * 
     */
    public GetSessionsById createGetSessionsById() {
        return new GetSessionsById();
    }
    
    /**
     * Create an instance of {@link DeleteSessionsResponse }
     * 
     */
    public DeleteSessionsResponse createDeleteSessionsResponse() {
        return new DeleteSessionsResponse();
    }
    
    /**
     * Create an instance of {@link GetFoldersByIdResponse }
     * 
     */
    public GetFoldersByIdResponse createGetFoldersByIdResponse() {
        return new GetFoldersByIdResponse();
    }
    
    /**
     * Create an instance of {@link UpdateSessionIsBroadcastResponse }
     * 
     */
    public UpdateSessionIsBroadcastResponse createUpdateSessionIsBroadcastResponse() {
        return new UpdateSessionIsBroadcastResponse();
    }
    
    /**
     * Create an instance of {@link DeleteNoteResponse }
     * 
     */
    public DeleteNoteResponse createDeleteNoteResponse() {
        return new DeleteNoteResponse();
    }
    
    /**
     * Create an instance of {@link CreateNoteByRelativeTime }
     * 
     */
    public CreateNoteByRelativeTime createCreateNoteByRelativeTime() {
        return new CreateNoteByRelativeTime();
    }
    
    /**
     * Create an instance of {@link MoveSessions }
     * 
     */
    public MoveSessions createMoveSessions() {
        return new MoveSessions();
    }
    
    /**
     * Create an instance of {@link UpdateFolderDescriptionResponse }
     * 
     */
    public UpdateFolderDescriptionResponse createUpdateFolderDescriptionResponse() {
        return new UpdateFolderDescriptionResponse();
    }
    
    /**
     * Create an instance of {@link GetNote }
     * 
     */
    public GetNote createGetNote() {
        return new GetNote();
    }
    
    /**
     * Create an instance of {@link UpdateFolderNameResponse }
     * 
     */
    public UpdateFolderNameResponse createUpdateFolderNameResponse() {
        return new UpdateFolderNameResponse();
    }
    
    /**
     * Create an instance of {@link EditNote }
     * 
     */
    public EditNote createEditNote() {
        return new EditNote();
    }
    
    /**
     * Create an instance of {@link UpdateFolderAllowSessionDownloadResponse }
     * 
     */
    public UpdateFolderAllowSessionDownloadResponse createUpdateFolderAllowSessionDownloadResponse() {
        return new UpdateFolderAllowSessionDownloadResponse();
    }
    
    /**
     * Create an instance of {@link UpdateSessionDescriptionResponse }
     * 
     */
    public UpdateSessionDescriptionResponse createUpdateSessionDescriptionResponse() {
        return new UpdateSessionDescriptionResponse();
    }
    
    /**
     * Create an instance of {@link ListNotes }
     * 
     */
    public ListNotes createListNotes() {
        return new ListNotes();
    }
    
    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }
    
    /**
     * Create an instance of {@link SetNotesPublic }
     * 
     */
    public SetNotesPublic createSetNotesPublic() {
        return new SetNotesPublic();
    }
    
    /**
     * Create an instance of {@link ProvisionExternalCourseResponse }
     * 
     */
    public ProvisionExternalCourseResponse createProvisionExternalCourseResponse() {
        return new ProvisionExternalCourseResponse();
    }
    
    /**
     * Create an instance of {@link Folder }
     * 
     */
    public Folder createFolder() {
        return new Folder();
    }
    
    /**
     * Create an instance of {@link GetSessionsByIdResponse }
     * 
     */
    public GetSessionsByIdResponse createGetSessionsByIdResponse() {
        return new GetSessionsByIdResponse();
    }
    
    /**
     * Create an instance of {@link ArrayOfSession }
     * 
     */
    public ArrayOfSession createArrayOfSession() {
        return new ArrayOfSession();
    }
    
    /**
     * Create an instance of {@link CreateNoteByAbsoluteTimeResponse }
     * 
     */
    public CreateNoteByAbsoluteTimeResponse createCreateNoteByAbsoluteTimeResponse() {
        return new CreateNoteByAbsoluteTimeResponse();
    }
    
    /**
     * Create an instance of {@link GetRecorderDownloadUrlsResponse }
     * 
     */
    public GetRecorderDownloadUrlsResponse createGetRecorderDownloadUrlsResponse() {
        return new GetRecorderDownloadUrlsResponse();
    }
    
    /**
     * Create an instance of {@link RecorderDownloadUrlResponse }
     * 
     */
    public RecorderDownloadUrlResponse createRecorderDownloadUrlResponse() {
        return new RecorderDownloadUrlResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderParent }
     * 
     */
    public UpdateFolderParent createUpdateFolderParent() {
        return new UpdateFolderParent();
    }
    
    /**
     * Create an instance of {@link DeleteNote }
     * 
     */
    public DeleteNote createDeleteNote() {
        return new DeleteNote();
    }
    
    /**
     * Create an instance of {@link AddFolderResponse }
     * 
     */
    public AddFolderResponse createAddFolderResponse() {
        return new AddFolderResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderParentResponse }
     * 
     */
    public UpdateFolderParentResponse createUpdateFolderParentResponse() {
        return new UpdateFolderParentResponse();
    }
    
    /**
     * Create an instance of {@link CreateNoteByAbsoluteTime }
     * 
     */
    public CreateNoteByAbsoluteTime createCreateNoteByAbsoluteTime() {
        return new CreateNoteByAbsoluteTime();
    }
    
    /**
     * Create an instance of {@link UpdateFolderAllowPublicNotes }
     * 
     */
    public UpdateFolderAllowPublicNotes createUpdateFolderAllowPublicNotes() {
        return new UpdateFolderAllowPublicNotes();
    }
    
    /**
     * Create an instance of {@link UpdateFolderAllowSessionDownload }
     * 
     */
    public UpdateFolderAllowSessionDownload createUpdateFolderAllowSessionDownload() {
        return new UpdateFolderAllowSessionDownload();
    }
    
    /**
     * Create an instance of {@link GetFoldersList }
     * 
     */
    public GetFoldersList createGetFoldersList() {
        return new GetFoldersList();
    }
    
    /**
     * Create an instance of {@link ListFoldersRequest }
     * 
     */
    public ListFoldersRequest createListFoldersRequest() {
        return new ListFoldersRequest();
    }
    
    /**
     * Create an instance of {@link AddFolder }
     * 
     */
    public AddFolder createAddFolder() {
        return new AddFolder();
    }
    
    /**
     * Create an instance of {@link UpdateSessionNameResponse }
     * 
     */
    public UpdateSessionNameResponse createUpdateSessionNameResponse() {
        return new UpdateSessionNameResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderAllowPublicNotesResponse }
     * 
     */
    public UpdateFolderAllowPublicNotesResponse createUpdateFolderAllowPublicNotesResponse() {
        return new UpdateFolderAllowPublicNotesResponse();
    }
    
    /**
     * Create an instance of {@link SetNotesPublicResponse }
     * 
     */
    public SetNotesPublicResponse createSetNotesPublicResponse() {
        return new SetNotesPublicResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderEnablePodcast }
     * 
     */
    public UpdateFolderEnablePodcast createUpdateFolderEnablePodcast() {
        return new UpdateFolderEnablePodcast();
    }
    
    /**
     * Create an instance of {@link ArrayOfNote }
     * 
     */
    public ArrayOfNote createArrayOfNote() {
        return new ArrayOfNote();
    }
    
    /**
     * Create an instance of {@link ArrayOfSessionState }
     * 
     */
    public ArrayOfSessionState createArrayOfSessionState() {
        return new ArrayOfSessionState();
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AuthenticationInfo")
    public JAXBElement<AuthenticationInfo> createAuthenticationInfo(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_AuthenticationInfo_QNAME, AuthenticationInfo.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<String>(_AnyURI_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<Integer>(_Char_QNAME, Integer.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<QName>(_QName_QNAME, QName.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<Integer>(_UnsignedShort_QNAME, Integer.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<Float>(_Float_QNAME, Float.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderSortField }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FolderSortField")
    public JAXBElement<FolderSortField> createFolderSortField(FolderSortField value) {
        return new JAXBElement<FolderSortField>(_FolderSortField_QNAME, FolderSortField.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Session")
    public JAXBElement<Session> createSession(Session value) {
        return new JAXBElement<Session>(_Session_QNAME, Session.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSessionState }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfSessionState")
    public JAXBElement<ArrayOfSessionState> createArrayOfSessionState(ArrayOfSessionState value) {
        return new JAXBElement<ArrayOfSessionState>(_ArrayOfSessionState_QNAME, ArrayOfSessionState.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNotesResponse2 }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListNotesResponse")
    public JAXBElement<ListNotesResponse2> createListNotesResponse(ListNotesResponse2 value) {
        return new JAXBElement<ListNotesResponse2>(_ListNotesResponse_QNAME, ListNotesResponse2.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<Short>(_Short_QNAME, Short.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecorderDownloadUrlResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "RecorderDownloadUrlResponse")
    public JAXBElement<RecorderDownloadUrlResponse> createRecorderDownloadUrlResponse(RecorderDownloadUrlResponse value) {
        return new JAXBElement<RecorderDownloadUrlResponse>(_RecorderDownloadUrlResponse_QNAME,
                                                            RecorderDownloadUrlResponse.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionState }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SessionState")
    public JAXBElement<SessionState> createSessionState(SessionState value) {
        return new JAXBElement<SessionState>(_SessionState_QNAME, SessionState.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<Byte>(_Byte_QNAME, Byte.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFoldersResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListFoldersResponse")
    public JAXBElement<ListFoldersResponse> createListFoldersResponse(ListFoldersResponse value) {
        return new JAXBElement<ListFoldersResponse>(_ListFoldersResponse_QNAME, ListFoldersResponse.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSessionsResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListSessionsResponse")
    public JAXBElement<ListSessionsResponse> createListSessionsResponse(ListSessionsResponse value) {
        return new JAXBElement<ListSessionsResponse>(_ListSessionsResponse_QNAME, ListSessionsResponse.class, null,
                                                     value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfSession")
    public JAXBElement<ArrayOfSession> createArrayOfSession(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_ArrayOfSession_QNAME, ArrayOfSession.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfguid")
    public JAXBElement<ArrayOfguid> createArrayOfguid(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_ArrayOfguid_QNAME, ArrayOfguid.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<Object>(_AnyType_QNAME, Object.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<Long>(_UnsignedInt_QNAME, Long.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionSortField }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SessionSortField")
    public JAXBElement<SessionSortField> createSessionSortField(SessionSortField value) {
        return new JAXBElement<SessionSortField>(_SessionSortField_QNAME, SessionSortField.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfFolder")
    public JAXBElement<ArrayOfFolder> createArrayOfFolder(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_ArrayOfFolder_QNAME, ArrayOfFolder.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFoldersRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListFoldersRequest")
    public JAXBElement<ListFoldersRequest> createListFoldersRequest(ListFoldersRequest value) {
        return new JAXBElement<ListFoldersRequest>(_ListFoldersRequest_QNAME, ListFoldersRequest.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Folder")
    public JAXBElement<Folder> createFolder(Folder value) {
        return new JAXBElement<Folder>(_Folder_QNAME, Folder.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Pagination")
    public JAXBElement<Pagination> createPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSessionsRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListSessionsRequest")
    public JAXBElement<ListSessionsRequest> createListSessionsRequest(ListSessionsRequest value) {
        return new JAXBElement<ListSessionsRequest>(_ListSessionsRequest_QNAME, ListSessionsRequest.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNote }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfNote")
    public JAXBElement<ArrayOfNote> createArrayOfNote(ArrayOfNote value) {
        return new JAXBElement<ArrayOfNote>(_ArrayOfNote_QNAME, ArrayOfNote.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = UpdateSessionName.class)
    public JAXBElement<String> createUpdateSessionNameName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, UpdateSessionName.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateSessionName.class)
    public JAXBElement<AuthenticationInfo> createUpdateSessionNameAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateSessionName.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "text", scope = CreateNoteByAbsoluteTime.class)
    public JAXBElement<String> createCreateNoteByAbsoluteTimeText(String value) {
        return new JAXBElement<String>(_CreateNoteByAbsoluteTimeText_QNAME, String.class,
                                       CreateNoteByAbsoluteTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateNoteByAbsoluteTime.class)
    public JAXBElement<AuthenticationInfo> createCreateNoteByAbsoluteTimeAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   CreateNoteByAbsoluteTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channel", scope = CreateNoteByAbsoluteTime.class)
    public JAXBElement<String> createCreateNoteByAbsoluteTimeChannel(String value) {
        return new JAXBElement<String>(_CreateNoteByAbsoluteTimeChannel_QNAME, String.class,
                                       CreateNoteByAbsoluteTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = AreUsersNotesPublic.class)
    public JAXBElement<AuthenticationInfo> createAreUsersNotesPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   AreUsersNotesPublic.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetNoteResult", scope = GetNoteResponse.class)
    public JAXBElement<Note> createGetNoteResponseGetNoteResult(Note value) {
        return new JAXBElement<Note>(_GetNoteResponseGetNoteResult_QNAME, Note.class, GetNoteResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = UpdateFolderName.class)
    public JAXBElement<String> createUpdateFolderNameName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, UpdateFolderName.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderName.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderNameAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderName.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Pagination",
                    scope = ListFoldersRequest.class)
    public JAXBElement<Pagination> createListFoldersRequestPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, ListFoldersRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ParentFolderId",
                    scope = ListFoldersRequest.class)
    public JAXBElement<String> createListFoldersRequestParentFolderId(String value) {
        return new JAXBElement<String>(_ListFoldersRequestParentFolderId_QNAME, String.class, ListFoldersRequest.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = DeleteNote.class)
    public JAXBElement<AuthenticationInfo> createDeleteNoteAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   DeleteNote.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sessionIds", scope = GetSessionsById.class)
    public JAXBElement<ArrayOfguid> createGetSessionsByIdSessionIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetSessionsByIdSessionIds_QNAME, ArrayOfguid.class, GetSessionsById.class,
                                            value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetSessionsById.class)
    public JAXBElement<AuthenticationInfo> createGetSessionsByIdAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   GetSessionsById.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "WindowsRemoteRecorderDownloadUrl",
                    scope = RecorderDownloadUrlResponse.class)
    public JAXBElement<String> createRecorderDownloadUrlResponseWindowsRemoteRecorderDownloadUrl(String value) {
        return new JAXBElement<String>(_RecorderDownloadUrlResponseWindowsRemoteRecorderDownloadUrl_QNAME,
                                       String.class, RecorderDownloadUrlResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "MacRecorderDownloadUrl",
                    scope = RecorderDownloadUrlResponse.class)
    public JAXBElement<String> createRecorderDownloadUrlResponseMacRecorderDownloadUrl(String value) {
        return new JAXBElement<String>(_RecorderDownloadUrlResponseMacRecorderDownloadUrl_QNAME, String.class,
                                       RecorderDownloadUrlResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "WindowsRecorderDownloadUrl",
                    scope = RecorderDownloadUrlResponse.class)
    public JAXBElement<String> createRecorderDownloadUrlResponseWindowsRecorderDownloadUrl(String value) {
        return new JAXBElement<String>(_RecorderDownloadUrlResponseWindowsRecorderDownloadUrl_QNAME, String.class,
                                       RecorderDownloadUrlResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "folderIds", scope = GetFoldersById.class)
    public JAXBElement<ArrayOfguid> createGetFoldersByIdFolderIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetFoldersByIdFolderIds_QNAME, ArrayOfguid.class, GetFoldersById.class,
                                            value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetFoldersById.class)
    public JAXBElement<AuthenticationInfo> createGetFoldersByIdAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   GetFoldersById.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSessionsResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetSessionsListResult",
                    scope = GetSessionsListResponse.class)
    public JAXBElement<ListSessionsResponse> createGetSessionsListResponseGetSessionsListResult(ListSessionsResponse value) {
        return new JAXBElement<ListSessionsResponse>(_GetSessionsListResponseGetSessionsListResult_QNAME,
                                                     ListSessionsResponse.class, GetSessionsListResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parentId", scope = UpdateFolderParent.class)
    public JAXBElement<String> createUpdateFolderParentParentId(String value) {
        return new JAXBElement<String>(_UpdateFolderParentParentId_QNAME, String.class, UpdateFolderParent.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderParent.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderParentAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderParent.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderAllowSessionDownload.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderAllowSessionDownloadAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderAllowSessionDownload.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "description", scope = UpdateFolderDescription.class)
    public JAXBElement<String> createUpdateFolderDescriptionDescription(String value) {
        return new JAXBElement<String>(_UpdateFolderDescriptionDescription_QNAME, String.class,
                                       UpdateFolderDescription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderDescription.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderDescriptionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderDescription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecorderDownloadUrlResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetRecorderDownloadUrlsResult",
                    scope = GetRecorderDownloadUrlsResponse.class)
    public JAXBElement<RecorderDownloadUrlResponse> createGetRecorderDownloadUrlsResponseGetRecorderDownloadUrlsResult(RecorderDownloadUrlResponse value) {
        return new JAXBElement<RecorderDownloadUrlResponse>(
                                                            _GetRecorderDownloadUrlsResponseGetRecorderDownloadUrlsResult_QNAME,
                                                            RecorderDownloadUrlResponse.class,
                                                            GetRecorderDownloadUrlsResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sessionIds", scope = MoveSessions.class)
    public JAXBElement<ArrayOfguid> createMoveSessionsSessionIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetSessionsByIdSessionIds_QNAME, ArrayOfguid.class, MoveSessions.class,
                                            value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = MoveSessions.class)
    public JAXBElement<AuthenticationInfo> createMoveSessionsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   MoveSessions.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetSessionsByIdResult",
                    scope = GetSessionsByIdResponse.class)
    public JAXBElement<ArrayOfSession> createGetSessionsByIdResponseGetSessionsByIdResult(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_GetSessionsByIdResponseGetSessionsByIdResult_QNAME,
                                               ArrayOfSession.class, GetSessionsByIdResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFoldersResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetFoldersListResult",
                    scope = GetFoldersListResponse.class)
    public JAXBElement<ListFoldersResponse> createGetFoldersListResponseGetFoldersListResult(ListFoldersResponse value) {
        return new JAXBElement<ListFoldersResponse>(_GetFoldersListResponseGetFoldersListResult_QNAME,
                                                    ListFoldersResponse.class, GetFoldersListResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetFoldersByIdResult",
                    scope = GetFoldersByIdResponse.class)
    public JAXBElement<ArrayOfFolder> createGetFoldersByIdResponseGetFoldersByIdResult(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_GetFoldersByIdResponseGetFoldersByIdResult_QNAME, ArrayOfFolder.class,
                                              GetFoldersByIdResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddFolderResult", scope = AddFolderResponse.class)
    public JAXBElement<Folder> createAddFolderResponseAddFolderResult(Folder value) {
        return new JAXBElement<Folder>(_AddFolderResponseAddFolderResult_QNAME, Folder.class, AddFolderResponse.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListNotesResponse2 }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListNotesResult", scope = ListNotesResponse.class)
    public JAXBElement<ListNotesResponse2> createListNotesResponseListNotesResult(ListNotesResponse2 value) {
        return new JAXBElement<ListNotesResponse2>(_ListNotesResponseListNotesResult_QNAME, ListNotesResponse2.class,
                                                   ListNotesResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ViewerUrl",
                    scope = Session.class)
    public JAXBElement<String> createSessionViewerUrl(String value) {
        return new JAXBElement<String>(_SessionViewerUrl_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "StartTime",
                    scope = Session.class)
    public JAXBElement<XMLGregorianCalendar> createSessionStartTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SessionStartTime_QNAME, XMLGregorianCalendar.class,
                                                     Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "StatusMessage",
                    scope = Session.class)
    public JAXBElement<String> createSessionStatusMessage(String value) {
        return new JAXBElement<String>(_SessionStatusMessage_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "RemoteRecorderIds",
                    scope = Session.class)
    public JAXBElement<ArrayOfguid> createSessionRemoteRecorderIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_SessionRemoteRecorderIds_QNAME, ArrayOfguid.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "MP3Url",
                    scope = Session.class)
    public JAXBElement<String> createSessionMP3Url(String value) {
        return new JAXBElement<String>(_SessionMP3Url_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "MP4Url",
                    scope = Session.class)
    public JAXBElement<String> createSessionMP4Url(String value) {
        return new JAXBElement<String>(_SessionMP4Url_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SharePageUrl",
                    scope = Session.class)
    public JAXBElement<String> createSessionSharePageUrl(String value) {
        return new JAXBElement<String>(_SessionSharePageUrl_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "OutputsPageUrl",
                    scope = Session.class)
    public JAXBElement<String> createSessionOutputsPageUrl(String value) {
        return new JAXBElement<String>(_SessionOutputsPageUrl_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Name",
                    scope = Session.class)
    public JAXBElement<String> createSessionName(String value) {
        return new JAXBElement<String>(_SessionName_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Duration",
                    scope = Session.class)
    public JAXBElement<Double> createSessionDuration(Double value) {
        return new JAXBElement<Double>(_SessionDuration_QNAME, Double.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ThumbUrl",
                    scope = Session.class)
    public JAXBElement<String> createSessionThumbUrl(String value) {
        return new JAXBElement<String>(_SessionThumbUrl_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "EditorUrl",
                    scope = Session.class)
    public JAXBElement<String> createSessionEditorUrl(String value) {
        return new JAXBElement<String>(_SessionEditorUrl_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "NotesURL",
                    scope = Session.class)
    public JAXBElement<String> createSessionNotesURL(String value) {
        return new JAXBElement<String>(_SessionNotesURL_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Description",
                    scope = Session.class)
    public JAXBElement<String> createSessionDescription(String value) {
        return new JAXBElement<String>(_SessionDescription_QNAME, String.class, Session.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Results",
                    scope = ListFoldersResponse.class)
    public JAXBElement<ArrayOfFolder> createListFoldersResponseResults(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_ListFoldersResponseResults_QNAME, ArrayOfFolder.class,
                                              ListFoldersResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "text", scope = CreateNoteByRelativeTime.class)
    public JAXBElement<String> createCreateNoteByRelativeTimeText(String value) {
        return new JAXBElement<String>(_CreateNoteByAbsoluteTimeText_QNAME, String.class,
                                       CreateNoteByRelativeTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateNoteByRelativeTime.class)
    public JAXBElement<AuthenticationInfo> createCreateNoteByRelativeTimeAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   CreateNoteByRelativeTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channel", scope = CreateNoteByRelativeTime.class)
    public JAXBElement<String> createCreateNoteByRelativeTimeChannel(String value) {
        return new JAXBElement<String>(_CreateNoteByAbsoluteTimeChannel_QNAME, String.class,
                                       CreateNoteByRelativeTime.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "description", scope = UpdateSessionDescription.class)
    public JAXBElement<String> createUpdateSessionDescriptionDescription(String value) {
        return new JAXBElement<String>(_UpdateFolderDescriptionDescription_QNAME, String.class,
                                       UpdateSessionDescription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateSessionDescription.class)
    public JAXBElement<AuthenticationInfo> createUpdateSessionDescriptionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateSessionDescription.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = IsDropbox.class)
    public JAXBElement<AuthenticationInfo> createIsDropboxAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   IsDropbox.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateSessionIsBroadcast.class)
    public JAXBElement<AuthenticationInfo> createUpdateSessionIsBroadcastAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateSessionIsBroadcast.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListSessionsRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetSessionsList.class)
    public JAXBElement<ListSessionsRequest> createGetSessionsListRequest(ListSessionsRequest value) {
        return new JAXBElement<ListSessionsRequest>(_GetSessionsListRequest_QNAME, ListSessionsRequest.class,
                                                    GetSessionsList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetSessionsList.class)
    public JAXBElement<AuthenticationInfo> createGetSessionsListAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   GetSessionsList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchQuery", scope = GetSessionsList.class)
    public JAXBElement<String> createGetSessionsListSearchQuery(String value) {
        return new JAXBElement<String>(_GetSessionsListSearchQuery_QNAME, String.class, GetSessionsList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderEnablePodcast.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderEnablePodcastAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderEnablePodcast.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = ProvisionExternalCourse.class)
    public JAXBElement<String> createProvisionExternalCourseName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, ProvisionExternalCourse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = ProvisionExternalCourse.class)
    public JAXBElement<AuthenticationInfo> createProvisionExternalCourseAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   ProvisionExternalCourse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalId", scope = ProvisionExternalCourse.class)
    public JAXBElement<String> createProvisionExternalCourseExternalId(String value) {
        return new JAXBElement<String>(_ProvisionExternalCourseExternalId_QNAME, String.class,
                                       ProvisionExternalCourse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfFolder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "SetExternalCourseAccessResult",
                    scope = SetExternalCourseAccessResponse.class)
    public JAXBElement<ArrayOfFolder> createSetExternalCourseAccessResponseSetExternalCourseAccessResult(ArrayOfFolder value) {
        return new JAXBElement<ArrayOfFolder>(_SetExternalCourseAccessResponseSetExternalCourseAccessResult_QNAME,
                                              ArrayOfFolder.class, SetExternalCourseAccessResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserKey",
                    scope = AuthenticationInfo.class)
    public JAXBElement<String> createAuthenticationInfoUserKey(String value) {
        return new JAXBElement<String>(_AuthenticationInfoUserKey_QNAME, String.class, AuthenticationInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Password",
                    scope = AuthenticationInfo.class)
    public JAXBElement<String> createAuthenticationInfoPassword(String value) {
        return new JAXBElement<String>(_AuthenticationInfoPassword_QNAME, String.class, AuthenticationInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AuthCode",
                    scope = AuthenticationInfo.class)
    public JAXBElement<String> createAuthenticationInfoAuthCode(String value) {
        return new JAXBElement<String>(_AuthenticationInfoAuthCode_QNAME, String.class, AuthenticationInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sessionIds", scope = DeleteSessions.class)
    public JAXBElement<ArrayOfguid> createDeleteSessionsSessionIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetSessionsByIdSessionIds_QNAME, ArrayOfguid.class, DeleteSessions.class,
                                            value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = DeleteSessions.class)
    public JAXBElement<AuthenticationInfo> createDeleteSessionsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   DeleteSessions.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = AddSession.class)
    public JAXBElement<String> createAddSessionName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, AddSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = AddSession.class)
    public JAXBElement<AuthenticationInfo> createAddSessionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   AddSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = AddFolder.class)
    public JAXBElement<String> createAddFolderName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, AddFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parentFolder", scope = AddFolder.class)
    public JAXBElement<String> createAddFolderParentFolder(String value) {
        return new JAXBElement<String>(_AddFolderParentFolder_QNAME, String.class, AddFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = AddFolder.class)
    public JAXBElement<AuthenticationInfo> createAddFolderAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   AddFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "folderIds", scope = DeleteFolders.class)
    public JAXBElement<ArrayOfguid> createDeleteFoldersFolderIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetFoldersByIdFolderIds_QNAME, ArrayOfguid.class, DeleteFolders.class,
                                            value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = DeleteFolders.class)
    public JAXBElement<AuthenticationInfo> createDeleteFoldersAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   DeleteFolders.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "folderIds", scope = SetExternalCourseAccess.class)
    public JAXBElement<ArrayOfguid> createSetExternalCourseAccessFolderIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GetFoldersByIdFolderIds_QNAME, ArrayOfguid.class,
                                            SetExternalCourseAccess.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "name", scope = SetExternalCourseAccess.class)
    public JAXBElement<String> createSetExternalCourseAccessName(String value) {
        return new JAXBElement<String>(_UpdateSessionNameName_QNAME, String.class, SetExternalCourseAccess.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = SetExternalCourseAccess.class)
    public JAXBElement<AuthenticationInfo> createSetExternalCourseAccessAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   SetExternalCourseAccess.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalId", scope = SetExternalCourseAccess.class)
    public JAXBElement<String> createSetExternalCourseAccessExternalId(String value) {
        return new JAXBElement<String>(_ProvisionExternalCourseExternalId_QNAME, String.class,
                                       SetExternalCourseAccess.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNote }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Results",
                    scope = ListNotesResponse2.class)
    public JAXBElement<ArrayOfNote> createListNotesResponse2Results(ArrayOfNote value) {
        return new JAXBElement<ArrayOfNote>(_ListFoldersResponseResults_QNAME, ArrayOfNote.class,
                                            ListNotesResponse2.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Session }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "AddSessionResult", scope = AddSessionResponse.class)
    public JAXBElement<Session> createAddSessionResponseAddSessionResult(Session value) {
        return new JAXBElement<Session>(_AddSessionResponseAddSessionResult_QNAME, Session.class,
                                        AddSessionResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetNote.class)
    public JAXBElement<AuthenticationInfo> createGetNoteAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   GetNote.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Channel",
                    scope = Note.class)
    public JAXBElement<String> createNoteChannel(String value) {
        return new JAXBElement<String>(_NoteChannel_QNAME, String.class, Note.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Text",
                    scope = Note.class)
    public JAXBElement<String> createNoteText(String value) {
        return new JAXBElement<String>(_NoteText_QNAME, String.class, Note.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderAllowPublicNotes.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderAllowPublicNotesAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderAllowPublicNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSession }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Results",
                    scope = ListSessionsResponse.class)
    public JAXBElement<ArrayOfSession> createListSessionsResponseResults(ArrayOfSession value) {
        return new JAXBElement<ArrayOfSession>(_ListFoldersResponseResults_QNAME, ArrayOfSession.class,
                                               ListSessionsResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListFoldersRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "request", scope = GetFoldersList.class)
    public JAXBElement<ListFoldersRequest> createGetFoldersListRequest(ListFoldersRequest value) {
        return new JAXBElement<ListFoldersRequest>(_GetSessionsListRequest_QNAME, ListFoldersRequest.class,
                                                   GetFoldersList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetFoldersList.class)
    public JAXBElement<AuthenticationInfo> createGetFoldersListAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   GetFoldersList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchQuery", scope = GetFoldersList.class)
    public JAXBElement<String> createGetFoldersListSearchQuery(String value) {
        return new JAXBElement<String>(_GetSessionsListSearchQuery_QNAME, String.class, GetFoldersList.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ParentFolder",
                    scope = Folder.class)
    public JAXBElement<String> createFolderParentFolder(String value) {
        return new JAXBElement<String>(_FolderParentFolder_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SettingsUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderSettingsUrl(String value) {
        return new JAXBElement<String>(_FolderSettingsUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AudioPodcastITunesUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderAudioPodcastITunesUrl(String value) {
        return new JAXBElement<String>(_FolderAudioPodcastITunesUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderListUrl(String value) {
        return new JAXBElement<String>(_FolderListUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Description",
                    scope = Folder.class)
    public JAXBElement<String> createFolderDescription(String value) {
        return new JAXBElement<String>(_SessionDescription_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Sessions",
                    scope = Folder.class)
    public JAXBElement<ArrayOfguid> createFolderSessions(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderSessions_QNAME, ArrayOfguid.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ChildFolders",
                    scope = Folder.class)
    public JAXBElement<ArrayOfguid> createFolderChildFolders(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderChildFolders_QNAME, ArrayOfguid.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Name",
                    scope = Folder.class)
    public JAXBElement<String> createFolderName(String value) {
        return new JAXBElement<String>(_SessionName_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "VideoPodcastITunesUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderVideoPodcastITunesUrl(String value) {
        return new JAXBElement<String>(_FolderVideoPodcastITunesUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AudioRssUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderAudioRssUrl(String value) {
        return new JAXBElement<String>(_FolderAudioRssUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "VideoRssUrl",
                    scope = Folder.class)
    public JAXBElement<String> createFolderVideoRssUrl(String value) {
        return new JAXBElement<String>(_FolderVideoRssUrl_QNAME, String.class, Folder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSessionState }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "States",
                    scope = ListSessionsRequest.class)
    public JAXBElement<ArrayOfSessionState> createListSessionsRequestStates(ArrayOfSessionState value) {
        return new JAXBElement<ArrayOfSessionState>(_ListSessionsRequestStates_QNAME, ArrayOfSessionState.class,
                                                    ListSessionsRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FolderId",
                    scope = ListSessionsRequest.class)
    public JAXBElement<String> createListSessionsRequestFolderId(String value) {
        return new JAXBElement<String>(_ListSessionsRequestFolderId_QNAME, String.class, ListSessionsRequest.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "EndDate",
                    scope = ListSessionsRequest.class)
    public JAXBElement<XMLGregorianCalendar> createListSessionsRequestEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListSessionsRequestEndDate_QNAME, XMLGregorianCalendar.class,
                                                     ListSessionsRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "RemoteRecorderId",
                    scope = ListSessionsRequest.class)
    public JAXBElement<String> createListSessionsRequestRemoteRecorderId(String value) {
        return new JAXBElement<String>(_ListSessionsRequestRemoteRecorderId_QNAME, String.class,
                                       ListSessionsRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Pagination",
                    scope = ListSessionsRequest.class)
    public JAXBElement<Pagination> createListSessionsRequestPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, ListSessionsRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "StartDate",
                    scope = ListSessionsRequest.class)
    public JAXBElement<XMLGregorianCalendar> createListSessionsRequestStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ListSessionsRequestStartDate_QNAME, XMLGregorianCalendar.class,
                                                     ListSessionsRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = ListNotes.class)
    public JAXBElement<AuthenticationInfo> createListNotesAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   ListNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "channel", scope = ListNotes.class)
    public JAXBElement<String> createListNotesChannel(String value) {
        return new JAXBElement<String>(_CreateNoteByAbsoluteTimeChannel_QNAME, String.class, ListNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pagination", scope = ListNotes.class)
    public JAXBElement<Pagination> createListNotesPagination(Pagination value) {
        return new JAXBElement<Pagination>(_ListNotesPagination_QNAME, Pagination.class, ListNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchQuery", scope = ListNotes.class)
    public JAXBElement<String> createListNotesSearchQuery(String value) {
        return new JAXBElement<String>(_GetSessionsListSearchQuery_QNAME, String.class, ListNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "creatorId", scope = ListNotes.class)
    public JAXBElement<String> createListNotesCreatorId(String value) {
        return new JAXBElement<String>(_ListNotesCreatorId_QNAME, String.class, ListNotes.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newText", scope = EditNote.class)
    public JAXBElement<String> createEditNoteNewText(String value) {
        return new JAXBElement<String>(_EditNoteNewText_QNAME, String.class, EditNote.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = EditNote.class)
    public JAXBElement<AuthenticationInfo> createEditNoteAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   EditNote.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Folder }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "ProvisionExternalCourseResult",
                    scope = ProvisionExternalCourseResponse.class)
    public JAXBElement<Folder> createProvisionExternalCourseResponseProvisionExternalCourseResult(Folder value) {
        return new JAXBElement<Folder>(_ProvisionExternalCourseResponseProvisionExternalCourseResult_QNAME,
                                       Folder.class, ProvisionExternalCourseResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = SetNotesPublic.class)
    public JAXBElement<AuthenticationInfo> createSetNotesPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_UpdateSessionNameAuth_QNAME, AuthenticationInfo.class,
                                                   SetNotesPublic.class, value);
    }
    
}
