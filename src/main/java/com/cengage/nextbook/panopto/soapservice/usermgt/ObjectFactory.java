package com.cengage.nextbook.panopto.soapservice.usermgt;

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
 * com.cengage.nextbook.panopto.soapservice.usermgt package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation for XML content.
 * The Java representation of XML content can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory methods for each of these are provided in
 * this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {
    
    private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "anyURI");
    private static final QName _AuthenticationInfo_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "AuthenticationInfo");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "dateTime");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                                "unsignedShort");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "base64Binary");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _Group_QNAME = new QName(
                                                        "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                        "Group");
    private static final QName _GroupType_QNAME = new QName(
                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                            "GroupType");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "boolean");
    private static final QName _User_QNAME = new QName(
                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                       "User");
    private static final QName _SystemRole_QNAME = new QName(
                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                             "SystemRole");
    private static final QName _ArrayOfguid_QNAME = new QName(
                                                              "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                                                              "ArrayOfguid");
    private static final QName _ArrayOfUser_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "ArrayOfUser");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedByte");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "anyType");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                              "unsignedInt");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _ArrayOfGroup_QNAME = new QName(
                                                               "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                               "ArrayOfGroup");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "decimal");
    private static final QName _ArrayOfstring_QNAME = new QName(
                                                                "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                                                                "ArrayOfstring");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "double");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _ListUsersResponse_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "ListUsersResponse");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "duration");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "string");
    private static final QName _ListGroupsResponse_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "ListGroupsResponse");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedLong");
    private static final QName _ListUsersRequest_QNAME = new QName(
                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                   "ListUsersRequest");
    private static final QName _UserSortField_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "UserSortField");
    private static final QName _Pagination_QNAME = new QName(
                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                             "Pagination");
    private static final QName _CreateInternalGroupResponseCreateInternalGroupResult_QNAME = new QName(
                                                                                                       "http://tempuri.org/",
                                                                                                       "CreateInternalGroupResult");
    private static final QName _ListGroupsAuth_QNAME = new QName("http://tempuri.org/", "auth");
    private static final QName _ListGroupsPagination_QNAME = new QName("http://tempuri.org/", "pagination");
    private static final QName _UserUserSettingsUrl_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "UserSettingsUrl");
    private static final QName _UserFirstName_QNAME = new QName(
                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                "FirstName");
    private static final QName _UserUserKey_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "UserKey");
    private static final QName _UserLastName_QNAME = new QName(
                                                               "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                               "LastName");
    private static final QName _UserGroupMemberships_QNAME = new QName(
                                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                       "GroupMemberships");
    private static final QName _UserUserBio_QNAME = new QName(
                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                              "UserBio");
    private static final QName _UserEmail_QNAME = new QName(
                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                            "Email");
    private static final QName _ListUsersResponsePagedResults_QNAME = new QName(
                                                                                "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                "PagedResults");
    private static final QName _GetGroupResponseGetGroupResult_QNAME = new QName("http://tempuri.org/",
                                                                                 "GetGroupResult");
    private static final QName _UpdateUserBioBio_QNAME = new QName("http://tempuri.org/", "bio");
    private static final QName _GetUserByKeyUserKey_QNAME = new QName("http://tempuri.org/", "userKey");
    private static final QName _ListUsersParameters_QNAME = new QName("http://tempuri.org/", "parameters");
    private static final QName _ListUsersSearchQuery_QNAME = new QName("http://tempuri.org/", "searchQuery");
    private static final QName _SyncExternalUserEmail_QNAME = new QName("http://tempuri.org/", "email");
    private static final QName _SyncExternalUserLastName_QNAME = new QName("http://tempuri.org/", "lastName");
    private static final QName _SyncExternalUserExternalGroupIds_QNAME = new QName("http://tempuri.org/",
                                                                                   "externalGroupIds");
    private static final QName _SyncExternalUserFirstName_QNAME = new QName("http://tempuri.org/", "firstName");
    private static final QName _CreateExternalGroupGroupName_QNAME = new QName("http://tempuri.org/", "groupName");
    private static final QName _CreateExternalGroupMemberIds_QNAME = new QName("http://tempuri.org/", "memberIds");
    private static final QName _CreateExternalGroupExternalId_QNAME = new QName("http://tempuri.org/", "externalId");
    private static final QName _CreateExternalGroupExternalProvider_QNAME = new QName("http://tempuri.org/",
                                                                                      "externalProvider");
    private static final QName _CreateUsersUsers_QNAME = new QName("http://tempuri.org/", "users");
    private static final QName _DeleteUsersUserIds_QNAME = new QName("http://tempuri.org/", "userIds");
    private static final QName _ListGroupsResponse2ListGroupsResult_QNAME = new QName("http://tempuri.org/",
                                                                                      "ListGroupsResult");
    private static final QName _GroupName_QNAME = new QName(
                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                            "Name");
    private static final QName _GroupMembershipProviderName_QNAME = new QName(
                                                                              "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                              "MembershipProviderName");
    private static final QName _GroupExternalId_QNAME = new QName(
                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                  "ExternalId");
    private static final QName _CreateUserUser_QNAME = new QName("http://tempuri.org/", "user");
    private static final QName _CreateUserInitialPassword_QNAME = new QName("http://tempuri.org/", "initialPassword");
    private static final QName _GetUserByKeyResponseGetUserByKeyResult_QNAME = new QName("http://tempuri.org/",
                                                                                         "GetUserByKeyResult");
    private static final QName _UpdatePasswordNewPassword_QNAME = new QName("http://tempuri.org/", "newPassword");
    private static final QName _AuthenticationInfoPassword_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "Password");
    private static final QName _AuthenticationInfoAuthCode_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "AuthCode");
    private static final QName _CreateExternalGroupResponseCreateExternalGroupResult_QNAME = new QName(
                                                                                                       "http://tempuri.org/",
                                                                                                       "CreateExternalGroupResult");
    private static final QName _CreateUsersResponseCreateUsersResult_QNAME = new QName("http://tempuri.org/",
                                                                                       "CreateUsersResult");
    private static final QName _ListUsersResponse2ListUsersResult_QNAME = new QName("http://tempuri.org/",
                                                                                    "ListUsersResult");
    private static final QName _GetUsersResponseGetUsersResult_QNAME = new QName("http://tempuri.org/",
                                                                                 "GetUsersResult");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.cengage.nextbook.panopto.soapservice.usermgt
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }
    
    /**
     * Create an instance of {@link ArrayOfGroup }
     * 
     */
    public ArrayOfGroup createArrayOfGroup() {
        return new ArrayOfGroup();
    }
    
    /**
     * Create an instance of {@link ListUsersRequest }
     * 
     */
    public ListUsersRequest createListUsersRequest() {
        return new ListUsersRequest();
    }
    
    /**
     * Create an instance of {@link Pagination }
     * 
     */
    public Pagination createPagination() {
        return new Pagination();
    }
    
    /**
     * Create an instance of {@link ListUsersResponse }
     * 
     */
    public ListUsersResponse createListUsersResponse() {
        return new ListUsersResponse();
    }
    
    /**
     * Create an instance of {@link ArrayOfUser }
     * 
     */
    public ArrayOfUser createArrayOfUser() {
        return new ArrayOfUser();
    }
    
    /**
     * Create an instance of {@link AuthenticationInfo }
     * 
     */
    public AuthenticationInfo createAuthenticationInfo() {
        return new AuthenticationInfo();
    }
    
    /**
     * Create an instance of {@link ListGroupsResponse }
     * 
     */
    public ListGroupsResponse createListGroupsResponse() {
        return new ListGroupsResponse();
    }
    
    /**
     * Create an instance of {@link Group }
     * 
     */
    public Group createGroup() {
        return new Group();
    }
    
    /**
     * Create an instance of {@link ListGroups }
     * 
     */
    public ListGroups createListGroups() {
        return new ListGroups();
    }
    
    /**
     * Create an instance of {@link UpdateUserBioResponse }
     * 
     */
    public UpdateUserBioResponse createUpdateUserBioResponse() {
        return new UpdateUserBioResponse();
    }
    
    /**
     * Create an instance of {@link UpdatePassword }
     * 
     */
    public UpdatePassword createUpdatePassword() {
        return new UpdatePassword();
    }
    
    /**
     * Create an instance of {@link GetUsersResponse }
     * 
     */
    public GetUsersResponse createGetUsersResponse() {
        return new GetUsersResponse();
    }
    
    /**
     * Create an instance of {@link GetUserByKeyResponse }
     * 
     */
    public GetUserByKeyResponse createGetUserByKeyResponse() {
        return new GetUserByKeyResponse();
    }
    
    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }
    
    /**
     * Create an instance of {@link DeleteGroup }
     * 
     */
    public DeleteGroup createDeleteGroup() {
        return new DeleteGroup();
    }
    
    /**
     * Create an instance of {@link SyncExternalUserResponse }
     * 
     */
    public SyncExternalUserResponse createSyncExternalUserResponse() {
        return new SyncExternalUserResponse();
    }
    
    /**
     * Create an instance of {@link UnlockAccountResponse }
     * 
     */
    public UnlockAccountResponse createUnlockAccountResponse() {
        return new UnlockAccountResponse();
    }
    
    /**
     * Create an instance of {@link GetUserByKey }
     * 
     */
    public GetUserByKey createGetUserByKey() {
        return new GetUserByKey();
    }
    
    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }
    
    /**
     * Create an instance of {@link DeleteUsersResponse }
     * 
     */
    public DeleteUsersResponse createDeleteUsersResponse() {
        return new DeleteUsersResponse();
    }
    
    /**
     * Create an instance of {@link RemoveMembersFromInternalGroup }
     * 
     */
    public RemoveMembersFromInternalGroup createRemoveMembersFromInternalGroup() {
        return new RemoveMembersFromInternalGroup();
    }
    
    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }
    
    /**
     * Create an instance of {@link ResetPasswordResponse }
     * 
     */
    public ResetPasswordResponse createResetPasswordResponse() {
        return new ResetPasswordResponse();
    }
    
    /**
     * Create an instance of {@link CreateInternalGroup }
     * 
     */
    public CreateInternalGroup createCreateInternalGroup() {
        return new CreateInternalGroup();
    }
    
    /**
     * Create an instance of {@link GetGroup }
     * 
     */
    public GetGroup createGetGroup() {
        return new GetGroup();
    }
    
    /**
     * Create an instance of {@link DeleteGroupResponse }
     * 
     */
    public DeleteGroupResponse createDeleteGroupResponse() {
        return new DeleteGroupResponse();
    }
    
    /**
     * Create an instance of {@link GetGroupResponse }
     * 
     */
    public GetGroupResponse createGetGroupResponse() {
        return new GetGroupResponse();
    }
    
    /**
     * Create an instance of {@link AddMembersToInternalGroup }
     * 
     */
    public AddMembersToInternalGroup createAddMembersToInternalGroup() {
        return new AddMembersToInternalGroup();
    }
    
    /**
     * Create an instance of {@link SyncExternalUser }
     * 
     */
    public SyncExternalUser createSyncExternalUser() {
        return new SyncExternalUser();
    }
    
    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }
    
    /**
     * Create an instance of {@link ListUsers }
     * 
     */
    public ListUsers createListUsers() {
        return new ListUsers();
    }
    
    /**
     * Create an instance of {@link GetGroupIsPublicResponse }
     * 
     */
    public GetGroupIsPublicResponse createGetGroupIsPublicResponse() {
        return new GetGroupIsPublicResponse();
    }
    
    /**
     * Create an instance of {@link CreateUsers }
     * 
     */
    public CreateUsers createCreateUsers() {
        return new CreateUsers();
    }
    
    /**
     * Create an instance of {@link SetSystemRole }
     * 
     */
    public SetSystemRole createSetSystemRole() {
        return new SetSystemRole();
    }
    
    /**
     * Create an instance of {@link UpdatePasswordResponse }
     * 
     */
    public UpdatePasswordResponse createUpdatePasswordResponse() {
        return new UpdatePasswordResponse();
    }
    
    /**
     * Create an instance of {@link RemoveMembersFromInternalGroupResponse }
     * 
     */
    public RemoveMembersFromInternalGroupResponse createRemoveMembersFromInternalGroupResponse() {
        return new RemoveMembersFromInternalGroupResponse();
    }
    
    /**
     * Create an instance of {@link ListUsersResponse2 }
     * 
     */
    public ListUsersResponse2 createListUsersResponse2() {
        return new ListUsersResponse2();
    }
    
    /**
     * Create an instance of {@link CreateExternalGroupResponse }
     * 
     */
    public CreateExternalGroupResponse createCreateExternalGroupResponse() {
        return new CreateExternalGroupResponse();
    }
    
    /**
     * Create an instance of {@link CreateInternalGroupResponse }
     * 
     */
    public CreateInternalGroupResponse createCreateInternalGroupResponse() {
        return new CreateInternalGroupResponse();
    }
    
    /**
     * Create an instance of {@link ListGroupsResponse2 }
     * 
     */
    public ListGroupsResponse2 createListGroupsResponse2() {
        return new ListGroupsResponse2();
    }
    
    /**
     * Create an instance of {@link UpdateUserBio }
     * 
     */
    public UpdateUserBio createUpdateUserBio() {
        return new UpdateUserBio();
    }
    
    /**
     * Create an instance of {@link SetGroupIsPublic }
     * 
     */
    public SetGroupIsPublic createSetGroupIsPublic() {
        return new SetGroupIsPublic();
    }
    
    /**
     * Create an instance of {@link UpdateContactInfo }
     * 
     */
    public UpdateContactInfo createUpdateContactInfo() {
        return new UpdateContactInfo();
    }
    
    /**
     * Create an instance of {@link AddMembersToInternalGroupResponse }
     * 
     */
    public AddMembersToInternalGroupResponse createAddMembersToInternalGroupResponse() {
        return new AddMembersToInternalGroupResponse();
    }
    
    /**
     * Create an instance of {@link ResetPassword }
     * 
     */
    public ResetPassword createResetPassword() {
        return new ResetPassword();
    }
    
    /**
     * Create an instance of {@link UpdateContactInfoResponse }
     * 
     */
    public UpdateContactInfoResponse createUpdateContactInfoResponse() {
        return new UpdateContactInfoResponse();
    }
    
    /**
     * Create an instance of {@link SetSystemRoleResponse }
     * 
     */
    public SetSystemRoleResponse createSetSystemRoleResponse() {
        return new SetSystemRoleResponse();
    }
    
    /**
     * Create an instance of {@link CreateUsersResponse }
     * 
     */
    public CreateUsersResponse createCreateUsersResponse() {
        return new CreateUsersResponse();
    }
    
    /**
     * Create an instance of {@link GetUsers }
     * 
     */
    public GetUsers createGetUsers() {
        return new GetUsers();
    }
    
    /**
     * Create an instance of {@link UnlockAccount }
     * 
     */
    public UnlockAccount createUnlockAccount() {
        return new UnlockAccount();
    }
    
    /**
     * Create an instance of {@link SetGroupIsPublicResponse }
     * 
     */
    public SetGroupIsPublicResponse createSetGroupIsPublicResponse() {
        return new SetGroupIsPublicResponse();
    }
    
    /**
     * Create an instance of {@link CreateExternalGroup }
     * 
     */
    public CreateExternalGroup createCreateExternalGroup() {
        return new CreateExternalGroup();
    }
    
    /**
     * Create an instance of {@link DeleteUsers }
     * 
     */
    public DeleteUsers createDeleteUsers() {
        return new DeleteUsers();
    }
    
    /**
     * Create an instance of {@link GetGroupIsPublic }
     * 
     */
    public GetGroupIsPublic createGetGroupIsPublic() {
        return new GetGroupIsPublic();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AuthenticationInfo")
    public JAXBElement<AuthenticationInfo> createAuthenticationInfo(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_AuthenticationInfo_QNAME, AuthenticationInfo.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<Long>(_Long_QNAME, Long.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<byte[]>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Group")
    public JAXBElement<Group> createGroup(Group value) {
        return new JAXBElement<Group>(_Group_QNAME, Group.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupType }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupType")
    public JAXBElement<GroupType> createGroupType(GroupType value) {
        return new JAXBElement<GroupType>(_GroupType_QNAME, GroupType.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "User")
    public JAXBElement<User> createUser(User value) {
        return new JAXBElement<User>(_User_QNAME, User.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRole }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SystemRole")
    public JAXBElement<SystemRole> createSystemRole(SystemRole value) {
        return new JAXBElement<SystemRole>(_SystemRole_QNAME, SystemRole.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfUser")
    public JAXBElement<ArrayOfUser> createArrayOfUser(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ArrayOfUser_QNAME, ArrayOfUser.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroup }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfGroup")
    public JAXBElement<ArrayOfGroup> createArrayOfGroup(ArrayOfGroup value) {
        return new JAXBElement<ArrayOfGroup>(_ArrayOfGroup_QNAME, ArrayOfGroup.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListUsersResponse")
    public JAXBElement<ListUsersResponse> createListUsersResponse(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse_QNAME, ListUsersResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGroupsResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListGroupsResponse")
    public JAXBElement<ListGroupsResponse> createListGroupsResponse(ListGroupsResponse value) {
        return new JAXBElement<ListGroupsResponse>(_ListGroupsResponse_QNAME, ListGroupsResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ListUsersRequest")
    public JAXBElement<ListUsersRequest> createListUsersRequest(ListUsersRequest value) {
        return new JAXBElement<ListUsersRequest>(_ListUsersRequest_QNAME, ListUsersRequest.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserSortField }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserSortField")
    public JAXBElement<UserSortField> createUserSortField(UserSortField value) {
        return new JAXBElement<UserSortField>(_UserSortField_QNAME, UserSortField.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "CreateInternalGroupResult",
                    scope = CreateInternalGroupResponse.class)
    public JAXBElement<Group> createCreateInternalGroupResponseCreateInternalGroupResult(Group value) {
        return new JAXBElement<Group>(_CreateInternalGroupResponseCreateInternalGroupResult_QNAME, Group.class,
                                      CreateInternalGroupResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = ListGroups.class)
    public JAXBElement<AuthenticationInfo> createListGroupsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, ListGroups.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pagination", scope = ListGroups.class)
    public JAXBElement<Pagination> createListGroupsPagination(Pagination value) {
        return new JAXBElement<Pagination>(_ListGroupsPagination_QNAME, Pagination.class, ListGroups.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserSettingsUrl",
                    scope = User.class)
    public JAXBElement<String> createUserUserSettingsUrl(String value) {
        return new JAXBElement<String>(_UserUserSettingsUrl_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FirstName",
                    scope = User.class)
    public JAXBElement<String> createUserFirstName(String value) {
        return new JAXBElement<String>(_UserFirstName_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserKey",
                    scope = User.class)
    public JAXBElement<String> createUserUserKey(String value) {
        return new JAXBElement<String>(_UserUserKey_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "LastName",
                    scope = User.class)
    public JAXBElement<String> createUserLastName(String value) {
        return new JAXBElement<String>(_UserLastName_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupMemberships",
                    scope = User.class)
    public JAXBElement<ArrayOfguid> createUserGroupMemberships(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_UserGroupMemberships_QNAME, ArrayOfguid.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserBio",
                    scope = User.class)
    public JAXBElement<String> createUserUserBio(String value) {
        return new JAXBElement<String>(_UserUserBio_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Email",
                    scope = User.class)
    public JAXBElement<String> createUserEmail(String value) {
        return new JAXBElement<String>(_UserEmail_QNAME, String.class, User.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "PagedResults",
                    scope = ListUsersResponse.class)
    public JAXBElement<ArrayOfUser> createListUsersResponsePagedResults(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_ListUsersResponsePagedResults_QNAME, ArrayOfUser.class,
                                            ListUsersResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetGroupResult", scope = GetGroupResponse.class)
    public JAXBElement<Group> createGetGroupResponseGetGroupResult(Group value) {
        return new JAXBElement<Group>(_GetGroupResponseGetGroupResult_QNAME, Group.class, GetGroupResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = SetGroupIsPublic.class)
    public JAXBElement<AuthenticationInfo> createSetGroupIsPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   SetGroupIsPublic.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "bio", scope = UpdateUserBio.class)
    public JAXBElement<String> createUpdateUserBioBio(String value) {
        return new JAXBElement<String>(_UpdateUserBioBio_QNAME, String.class, UpdateUserBio.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateUserBio.class)
    public JAXBElement<AuthenticationInfo> createUpdateUserBioAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateUserBio.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userKey", scope = GetUserByKey.class)
    public JAXBElement<String> createGetUserByKeyUserKey(String value) {
        return new JAXBElement<String>(_GetUserByKeyUserKey_QNAME, String.class, GetUserByKey.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetUserByKey.class)
    public JAXBElement<AuthenticationInfo> createGetUserByKeyAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, GetUserByKey.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = ListUsers.class)
    public JAXBElement<AuthenticationInfo> createListUsersAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, ListUsers.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersRequest }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "parameters", scope = ListUsers.class)
    public JAXBElement<ListUsersRequest> createListUsersParameters(ListUsersRequest value) {
        return new JAXBElement<ListUsersRequest>(_ListUsersParameters_QNAME, ListUsersRequest.class, ListUsers.class,
                                                 value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "searchQuery", scope = ListUsers.class)
    public JAXBElement<String> createListUsersSearchQuery(String value) {
        return new JAXBElement<String>(_ListUsersSearchQuery_QNAME, String.class, ListUsers.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = SyncExternalUser.class)
    public JAXBElement<String> createSyncExternalUserEmail(String value) {
        return new JAXBElement<String>(_SyncExternalUserEmail_QNAME, String.class, SyncExternalUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lastName", scope = SyncExternalUser.class)
    public JAXBElement<String> createSyncExternalUserLastName(String value) {
        return new JAXBElement<String>(_SyncExternalUserLastName_QNAME, String.class, SyncExternalUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = SyncExternalUser.class)
    public JAXBElement<AuthenticationInfo> createSyncExternalUserAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   SyncExternalUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalGroupIds", scope = SyncExternalUser.class)
    public JAXBElement<ArrayOfstring> createSyncExternalUserExternalGroupIds(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_SyncExternalUserExternalGroupIds_QNAME, ArrayOfstring.class,
                                              SyncExternalUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "firstName", scope = SyncExternalUser.class)
    public JAXBElement<String> createSyncExternalUserFirstName(String value) {
        return new JAXBElement<String>(_SyncExternalUserFirstName_QNAME, String.class, SyncExternalUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "groupName", scope = CreateExternalGroup.class)
    public JAXBElement<String> createCreateExternalGroupGroupName(String value) {
        return new JAXBElement<String>(_CreateExternalGroupGroupName_QNAME, String.class, CreateExternalGroup.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "memberIds", scope = CreateExternalGroup.class)
    public JAXBElement<ArrayOfguid> createCreateExternalGroupMemberIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_CreateExternalGroupMemberIds_QNAME, ArrayOfguid.class,
                                            CreateExternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateExternalGroup.class)
    public JAXBElement<AuthenticationInfo> createCreateExternalGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   CreateExternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalId", scope = CreateExternalGroup.class)
    public JAXBElement<String> createCreateExternalGroupExternalId(String value) {
        return new JAXBElement<String>(_CreateExternalGroupExternalId_QNAME, String.class, CreateExternalGroup.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "externalProvider", scope = CreateExternalGroup.class)
    public JAXBElement<String> createCreateExternalGroupExternalProvider(String value) {
        return new JAXBElement<String>(_CreateExternalGroupExternalProvider_QNAME, String.class,
                                       CreateExternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "users", scope = CreateUsers.class)
    public JAXBElement<ArrayOfUser> createCreateUsersUsers(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_CreateUsersUsers_QNAME, ArrayOfUser.class, CreateUsers.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateUsers.class)
    public JAXBElement<AuthenticationInfo> createCreateUsersAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, CreateUsers.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroup }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "PagedResults",
                    scope = ListGroupsResponse.class)
    public JAXBElement<ArrayOfGroup> createListGroupsResponsePagedResults(ArrayOfGroup value) {
        return new JAXBElement<ArrayOfGroup>(_ListUsersResponsePagedResults_QNAME, ArrayOfGroup.class,
                                             ListGroupsResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = DeleteUsers.class)
    public JAXBElement<AuthenticationInfo> createDeleteUsersAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, DeleteUsers.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userIds", scope = DeleteUsers.class)
    public JAXBElement<ArrayOfguid> createDeleteUsersUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_DeleteUsersUserIds_QNAME, ArrayOfguid.class, DeleteUsers.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListGroupsResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListGroupsResult", scope = ListGroupsResponse2.class)
    public JAXBElement<ListGroupsResponse> createListGroupsResponse2ListGroupsResult(ListGroupsResponse value) {
        return new JAXBElement<ListGroupsResponse>(_ListGroupsResponse2ListGroupsResult_QNAME,
                                                   ListGroupsResponse.class, ListGroupsResponse2.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "memberIds", scope = AddMembersToInternalGroup.class)
    public JAXBElement<ArrayOfguid> createAddMembersToInternalGroupMemberIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_CreateExternalGroupMemberIds_QNAME, ArrayOfguid.class,
                                            AddMembersToInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = AddMembersToInternalGroup.class)
    public JAXBElement<AuthenticationInfo> createAddMembersToInternalGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   AddMembersToInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Name",
                    scope = Group.class)
    public JAXBElement<String> createGroupName(String value) {
        return new JAXBElement<String>(_GroupName_QNAME, String.class, Group.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "MembershipProviderName",
                    scope = Group.class)
    public JAXBElement<String> createGroupMembershipProviderName(String value) {
        return new JAXBElement<String>(_GroupMembershipProviderName_QNAME, String.class, Group.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ExternalId",
                    scope = Group.class)
    public JAXBElement<String> createGroupExternalId(String value) {
        return new JAXBElement<String>(_GroupExternalId_QNAME, String.class, Group.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetGroup.class)
    public JAXBElement<AuthenticationInfo> createGetGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, GetGroup.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateUser.class)
    public JAXBElement<AuthenticationInfo> createCreateUserAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, CreateUser.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "user", scope = CreateUser.class)
    public JAXBElement<User> createCreateUserUser(User value) {
        return new JAXBElement<User>(_CreateUserUser_QNAME, User.class, CreateUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "initialPassword", scope = CreateUser.class)
    public JAXBElement<String> createCreateUserInitialPassword(String value) {
        return new JAXBElement<String>(_CreateUserInitialPassword_QNAME, String.class, CreateUser.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link User }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUserByKeyResult", scope = GetUserByKeyResponse.class)
    public JAXBElement<User> createGetUserByKeyResponseGetUserByKeyResult(User value) {
        return new JAXBElement<User>(_GetUserByKeyResponseGetUserByKeyResult_QNAME, User.class,
                                     GetUserByKeyResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "email", scope = UpdateContactInfo.class)
    public JAXBElement<String> createUpdateContactInfoEmail(String value) {
        return new JAXBElement<String>(_SyncExternalUserEmail_QNAME, String.class, UpdateContactInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "lastName", scope = UpdateContactInfo.class)
    public JAXBElement<String> createUpdateContactInfoLastName(String value) {
        return new JAXBElement<String>(_SyncExternalUserLastName_QNAME, String.class, UpdateContactInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateContactInfo.class)
    public JAXBElement<AuthenticationInfo> createUpdateContactInfoAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateContactInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "firstName", scope = UpdateContactInfo.class)
    public JAXBElement<String> createUpdateContactInfoFirstName(String value) {
        return new JAXBElement<String>(_SyncExternalUserFirstName_QNAME, String.class, UpdateContactInfo.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "newPassword", scope = UpdatePassword.class)
    public JAXBElement<String> createUpdatePasswordNewPassword(String value) {
        return new JAXBElement<String>(_UpdatePasswordNewPassword_QNAME, String.class, UpdatePassword.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdatePassword.class)
    public JAXBElement<AuthenticationInfo> createUpdatePasswordAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdatePassword.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "memberIds", scope = RemoveMembersFromInternalGroup.class)
    public JAXBElement<ArrayOfguid> createRemoveMembersFromInternalGroupMemberIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_CreateExternalGroupMemberIds_QNAME, ArrayOfguid.class,
                                            RemoveMembersFromInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = RemoveMembersFromInternalGroup.class)
    public JAXBElement<AuthenticationInfo> createRemoveMembersFromInternalGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   RemoveMembersFromInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = DeleteGroup.class)
    public JAXBElement<AuthenticationInfo> createDeleteGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, DeleteGroup.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = ResetPassword.class)
    public JAXBElement<AuthenticationInfo> createResetPasswordAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   ResetPassword.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserKey",
                    scope = AuthenticationInfo.class)
    public JAXBElement<String> createAuthenticationInfoUserKey(String value) {
        return new JAXBElement<String>(_UserUserKey_QNAME, String.class, AuthenticationInfo.class, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Pagination }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "Pagination",
                    scope = ListUsersRequest.class)
    public JAXBElement<Pagination> createListUsersRequestPagination(Pagination value) {
        return new JAXBElement<Pagination>(_Pagination_QNAME, Pagination.class, ListUsersRequest.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UnlockAccount.class)
    public JAXBElement<AuthenticationInfo> createUnlockAccountAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   UnlockAccount.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Group }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "CreateExternalGroupResult",
                    scope = CreateExternalGroupResponse.class)
    public JAXBElement<Group> createCreateExternalGroupResponseCreateExternalGroupResult(Group value) {
        return new JAXBElement<Group>(_CreateExternalGroupResponseCreateExternalGroupResult_QNAME, Group.class,
                                      CreateExternalGroupResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreateUsersResult", scope = CreateUsersResponse.class)
    public JAXBElement<ArrayOfUser> createCreateUsersResponseCreateUsersResult(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_CreateUsersResponseCreateUsersResult_QNAME, ArrayOfUser.class,
                                            CreateUsersResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetGroupIsPublic.class)
    public JAXBElement<AuthenticationInfo> createGetGroupIsPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   GetGroupIsPublic.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListUsersResponse }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListUsersResult", scope = ListUsersResponse2.class)
    public JAXBElement<ListUsersResponse> createListUsersResponse2ListUsersResult(ListUsersResponse value) {
        return new JAXBElement<ListUsersResponse>(_ListUsersResponse2ListUsersResult_QNAME, ListUsersResponse.class,
                                                  ListUsersResponse2.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = SetSystemRole.class)
    public JAXBElement<AuthenticationInfo> createSetSystemRoleAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   SetSystemRole.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfUser }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetUsersResult", scope = GetUsersResponse.class)
    public JAXBElement<ArrayOfUser> createGetUsersResponseGetUsersResult(ArrayOfUser value) {
        return new JAXBElement<ArrayOfUser>(_GetUsersResponseGetUsersResult_QNAME, ArrayOfUser.class,
                                            GetUsersResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "groupName", scope = CreateInternalGroup.class)
    public JAXBElement<String> createCreateInternalGroupGroupName(String value) {
        return new JAXBElement<String>(_CreateExternalGroupGroupName_QNAME, String.class, CreateInternalGroup.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "memberIds", scope = CreateInternalGroup.class)
    public JAXBElement<ArrayOfguid> createCreateInternalGroupMemberIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_CreateExternalGroupMemberIds_QNAME, ArrayOfguid.class,
                                            CreateInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = CreateInternalGroup.class)
    public JAXBElement<AuthenticationInfo> createCreateInternalGroupAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class,
                                                   CreateInternalGroup.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetUsers.class)
    public JAXBElement<AuthenticationInfo> createGetUsersAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_ListGroupsAuth_QNAME, AuthenticationInfo.class, GetUsers.class,
                                                   value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userIds", scope = GetUsers.class)
    public JAXBElement<ArrayOfguid> createGetUsersUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_DeleteUsersUserIds_QNAME, ArrayOfguid.class, GetUsers.class, value);
    }
    
}
