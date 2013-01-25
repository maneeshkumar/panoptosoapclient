package com.cengage.nextbook.panopto.soapservice.accessmgt;

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
 * com.cengage.nextbook.panopto.soapservice.accessmgt package.
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
    private static final QName _FolderAccessDetails_QNAME = new QName(
                                                                      "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                      "FolderAccessDetails");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "dateTime");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                                "unsignedShort");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _SessionAccessDetails_QNAME = new QName(
                                                                       "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                       "SessionAccessDetails");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "base64Binary");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _ArrayOfGroupAccessDetails_QNAME = new QName(
                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                            "ArrayOfGroupAccessDetails");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "boolean");
    private static final QName _SystemRole_QNAME = new QName(
                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                             "SystemRole");
    private static final QName _GroupAccessDetails_QNAME = new QName(
                                                                     "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                     "GroupAccessDetails");
    private static final QName _UserAccessDetails_QNAME = new QName(
                                                                    "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                    "UserAccessDetails");
    private static final QName _ArrayOfguid_QNAME = new QName(
                                                              "http://schemas.microsoft.com/2003/10/Serialization/Arrays",
                                                              "ArrayOfguid");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedByte");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "anyType");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                              "unsignedInt");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _AccessRole_QNAME = new QName(
                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                             "AccessRole");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "decimal");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "double");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "duration");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "string");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedLong");
    private static final QName _GetSelfUserAccessDetailsAuth_QNAME = new QName("http://tempuri.org/", "auth");
    private static final QName _GroupAccessDetailsFoldersWithCreatorAccess_QNAME = new QName(
                                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                             "FoldersWithCreatorAccess");
    private static final QName _GroupAccessDetailsFoldersWithViewerAccess_QNAME = new QName(
                                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                            "FoldersWithViewerAccess");
    private static final QName _GroupAccessDetailsSessionsWithViewerAccess_QNAME = new QName(
                                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                             "SessionsWithViewerAccess");
    private static final QName _RevokeUsersAccessFromFolderUserIds_QNAME = new QName("http://tempuri.org/", "userIds");
    private static final QName _GetGroupAccessDetailsResponseGetGroupAccessDetailsResult_QNAME = new QName(
                                                                                                           "http://tempuri.org/",
                                                                                                           "GetGroupAccessDetailsResult");
    private static final QName _GetSelfUserAccessDetailsResponseGetSelfUserAccessDetailsResult_QNAME = new QName(
                                                                                                                 "http://tempuri.org/",
                                                                                                                 "GetSelfUserAccessDetailsResult");
    private static final QName _GetUserAccessDetailsResponseGetUserAccessDetailsResult_QNAME = new QName(
                                                                                                         "http://tempuri.org/",
                                                                                                         "GetUserAccessDetailsResult");
    private static final QName _GetFolderAccessDetailsResponseGetFolderAccessDetailsResult_QNAME = new QName(
                                                                                                             "http://tempuri.org/",
                                                                                                             "GetFolderAccessDetailsResult");
    private static final QName _SessionAccessDetailsFolderAccess_QNAME = new QName(
                                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                   "FolderAccess");
    private static final QName _SessionAccessDetailsUsersWithDirectViewerAccess_QNAME = new QName(
                                                                                                  "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                                  "UsersWithDirectViewerAccess");
    private static final QName _SessionAccessDetailsGroupsWithDirectViewerAccess_QNAME = new QName(
                                                                                                   "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                                   "GroupsWithDirectViewerAccess");
    private static final QName _FolderAccessDetailsUsersWithCreatorAccess_QNAME = new QName(
                                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                            "UsersWithCreatorAccess");
    private static final QName _FolderAccessDetailsUsersWithViewerAccess_QNAME = new QName(
                                                                                           "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                           "UsersWithViewerAccess");
    private static final QName _FolderAccessDetailsGroupsWithCreatorAccess_QNAME = new QName(
                                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                             "GroupsWithCreatorAccess");
    private static final QName _FolderAccessDetailsGroupsWithViewerAccess_QNAME = new QName(
                                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                            "GroupsWithViewerAccess");
    private static final QName _UserAccessDetailsGroupMembershipAccess_QNAME = new QName(
                                                                                         "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                                         "GroupMembershipAccess");
    private static final QName _GetSessionAccessDetailsResponseGetSessionAccessDetailsResult_QNAME = new QName(
                                                                                                               "http://tempuri.org/",
                                                                                                               "GetSessionAccessDetailsResult");
    private static final QName _AuthenticationInfoUserKey_QNAME = new QName(
                                                                            "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                            "UserKey");
    private static final QName _AuthenticationInfoPassword_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "Password");
    private static final QName _AuthenticationInfoAuthCode_QNAME = new QName(
                                                                             "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                                                                             "AuthCode");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.cengage.nextbook.panopto.soapservice.accessmgt
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link RevokeUsersViewerAccessFromSession }
     * 
     */
    public RevokeUsersViewerAccessFromSession createRevokeUsersViewerAccessFromSession() {
        return new RevokeUsersViewerAccessFromSession();
    }
    
    /**
     * Create an instance of {@link AuthenticationInfo }
     * 
     */
    public AuthenticationInfo createAuthenticationInfo() {
        return new AuthenticationInfo();
    }
    
    /**
     * Create an instance of {@link ArrayOfguid }
     * 
     */
    public ArrayOfguid createArrayOfguid() {
        return new ArrayOfguid();
    }
    
    /**
     * Create an instance of {@link RevokeGroupAccessFromFolderResponse }
     * 
     */
    public RevokeGroupAccessFromFolderResponse createRevokeGroupAccessFromFolderResponse() {
        return new RevokeGroupAccessFromFolderResponse();
    }
    
    /**
     * Create an instance of {@link UpdateFolderIsPublicResponse }
     * 
     */
    public UpdateFolderIsPublicResponse createUpdateFolderIsPublicResponse() {
        return new UpdateFolderIsPublicResponse();
    }
    
    /**
     * Create an instance of {@link RevokeGroupViewerAccessFromSession }
     * 
     */
    public RevokeGroupViewerAccessFromSession createRevokeGroupViewerAccessFromSession() {
        return new RevokeGroupViewerAccessFromSession();
    }
    
    /**
     * Create an instance of {@link GrantUsersAccessToFolderResponse }
     * 
     */
    public GrantUsersAccessToFolderResponse createGrantUsersAccessToFolderResponse() {
        return new GrantUsersAccessToFolderResponse();
    }
    
    /**
     * Create an instance of {@link RevokeUsersAccessFromFolderResponse }
     * 
     */
    public RevokeUsersAccessFromFolderResponse createRevokeUsersAccessFromFolderResponse() {
        return new RevokeUsersAccessFromFolderResponse();
    }
    
    /**
     * Create an instance of {@link GrantGroupAccessToFolder }
     * 
     */
    public GrantGroupAccessToFolder createGrantGroupAccessToFolder() {
        return new GrantGroupAccessToFolder();
    }
    
    /**
     * Create an instance of {@link UpdateSessionIsPublic }
     * 
     */
    public UpdateSessionIsPublic createUpdateSessionIsPublic() {
        return new UpdateSessionIsPublic();
    }
    
    /**
     * Create an instance of {@link UpdateSessionInheritViewerAccess }
     * 
     */
    public UpdateSessionInheritViewerAccess createUpdateSessionInheritViewerAccess() {
        return new UpdateSessionInheritViewerAccess();
    }
    
    /**
     * Create an instance of {@link RevokeGroupViewerAccessFromSessionResponse }
     * 
     */
    public RevokeGroupViewerAccessFromSessionResponse createRevokeGroupViewerAccessFromSessionResponse() {
        return new RevokeGroupViewerAccessFromSessionResponse();
    }
    
    /**
     * Create an instance of {@link GetSelfUserAccessDetailsResponse }
     * 
     */
    public GetSelfUserAccessDetailsResponse createGetSelfUserAccessDetailsResponse() {
        return new GetSelfUserAccessDetailsResponse();
    }
    
    /**
     * Create an instance of {@link UserAccessDetails }
     * 
     */
    public UserAccessDetails createUserAccessDetails() {
        return new UserAccessDetails();
    }
    
    /**
     * Create an instance of {@link UpdateFolderIsPublic }
     * 
     */
    public UpdateFolderIsPublic createUpdateFolderIsPublic() {
        return new UpdateFolderIsPublic();
    }
    
    /**
     * Create an instance of {@link GrantGroupAccessToFolderResponse }
     * 
     */
    public GrantGroupAccessToFolderResponse createGrantGroupAccessToFolderResponse() {
        return new GrantGroupAccessToFolderResponse();
    }
    
    /**
     * Create an instance of {@link GetSessionAccessDetailsResponse }
     * 
     */
    public GetSessionAccessDetailsResponse createGetSessionAccessDetailsResponse() {
        return new GetSessionAccessDetailsResponse();
    }
    
    /**
     * Create an instance of {@link SessionAccessDetails }
     * 
     */
    public SessionAccessDetails createSessionAccessDetails() {
        return new SessionAccessDetails();
    }
    
    /**
     * Create an instance of {@link GrantGroupViewerAccessToSession }
     * 
     */
    public GrantGroupViewerAccessToSession createGrantGroupViewerAccessToSession() {
        return new GrantGroupViewerAccessToSession();
    }
    
    /**
     * Create an instance of {@link UpdateSessionIsPublicResponse }
     * 
     */
    public UpdateSessionIsPublicResponse createUpdateSessionIsPublicResponse() {
        return new UpdateSessionIsPublicResponse();
    }
    
    /**
     * Create an instance of {@link GetFolderAccessDetailsResponse }
     * 
     */
    public GetFolderAccessDetailsResponse createGetFolderAccessDetailsResponse() {
        return new GetFolderAccessDetailsResponse();
    }
    
    /**
     * Create an instance of {@link FolderAccessDetails }
     * 
     */
    public FolderAccessDetails createFolderAccessDetails() {
        return new FolderAccessDetails();
    }
    
    /**
     * Create an instance of {@link GrantUsersAccessToFolder }
     * 
     */
    public GrantUsersAccessToFolder createGrantUsersAccessToFolder() {
        return new GrantUsersAccessToFolder();
    }
    
    /**
     * Create an instance of {@link GetUserAccessDetails }
     * 
     */
    public GetUserAccessDetails createGetUserAccessDetails() {
        return new GetUserAccessDetails();
    }
    
    /**
     * Create an instance of {@link GetGroupAccessDetails }
     * 
     */
    public GetGroupAccessDetails createGetGroupAccessDetails() {
        return new GetGroupAccessDetails();
    }
    
    /**
     * Create an instance of {@link GetSessionAccessDetails }
     * 
     */
    public GetSessionAccessDetails createGetSessionAccessDetails() {
        return new GetSessionAccessDetails();
    }
    
    /**
     * Create an instance of {@link GetUserAccessDetailsResponse }
     * 
     */
    public GetUserAccessDetailsResponse createGetUserAccessDetailsResponse() {
        return new GetUserAccessDetailsResponse();
    }
    
    /**
     * Create an instance of {@link RevokeGroupAccessFromFolder }
     * 
     */
    public RevokeGroupAccessFromFolder createRevokeGroupAccessFromFolder() {
        return new RevokeGroupAccessFromFolder();
    }
    
    /**
     * Create an instance of {@link GetGroupAccessDetailsResponse }
     * 
     */
    public GetGroupAccessDetailsResponse createGetGroupAccessDetailsResponse() {
        return new GetGroupAccessDetailsResponse();
    }
    
    /**
     * Create an instance of {@link GroupAccessDetails }
     * 
     */
    public GroupAccessDetails createGroupAccessDetails() {
        return new GroupAccessDetails();
    }
    
    /**
     * Create an instance of {@link GetFolderAccessDetails }
     * 
     */
    public GetFolderAccessDetails createGetFolderAccessDetails() {
        return new GetFolderAccessDetails();
    }
    
    /**
     * Create an instance of {@link GrantUsersViewerAccessToSessionResponse }
     * 
     */
    public GrantUsersViewerAccessToSessionResponse createGrantUsersViewerAccessToSessionResponse() {
        return new GrantUsersViewerAccessToSessionResponse();
    }
    
    /**
     * Create an instance of {@link UpdateSessionInheritViewerAccessResponse }
     * 
     */
    public UpdateSessionInheritViewerAccessResponse createUpdateSessionInheritViewerAccessResponse() {
        return new UpdateSessionInheritViewerAccessResponse();
    }
    
    /**
     * Create an instance of {@link RevokeUsersAccessFromFolder }
     * 
     */
    public RevokeUsersAccessFromFolder createRevokeUsersAccessFromFolder() {
        return new RevokeUsersAccessFromFolder();
    }
    
    /**
     * Create an instance of {@link GetSelfUserAccessDetails }
     * 
     */
    public GetSelfUserAccessDetails createGetSelfUserAccessDetails() {
        return new GetSelfUserAccessDetails();
    }
    
    /**
     * Create an instance of {@link GrantGroupViewerAccessToSessionResponse }
     * 
     */
    public GrantGroupViewerAccessToSessionResponse createGrantGroupViewerAccessToSessionResponse() {
        return new GrantGroupViewerAccessToSessionResponse();
    }
    
    /**
     * Create an instance of {@link RevokeUsersViewerAccessFromSessionResponse }
     * 
     */
    public RevokeUsersViewerAccessFromSessionResponse createRevokeUsersViewerAccessFromSessionResponse() {
        return new RevokeUsersViewerAccessFromSessionResponse();
    }
    
    /**
     * Create an instance of {@link GrantUsersViewerAccessToSession }
     * 
     */
    public GrantUsersViewerAccessToSession createGrantUsersViewerAccessToSession() {
        return new GrantUsersViewerAccessToSession();
    }
    
    /**
     * Create an instance of {@link ArrayOfGroupAccessDetails }
     * 
     */
    public ArrayOfGroupAccessDetails createArrayOfGroupAccessDetails() {
        return new ArrayOfGroupAccessDetails();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FolderAccessDetails")
    public JAXBElement<FolderAccessDetails> createFolderAccessDetails(FolderAccessDetails value) {
        return new JAXBElement<FolderAccessDetails>(_FolderAccessDetails_QNAME, FolderAccessDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SessionAccessDetails")
    public JAXBElement<SessionAccessDetails> createSessionAccessDetails(SessionAccessDetails value) {
        return new JAXBElement<SessionAccessDetails>(_SessionAccessDetails_QNAME, SessionAccessDetails.class, null,
                                                     value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroupAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "ArrayOfGroupAccessDetails")
    public JAXBElement<ArrayOfGroupAccessDetails> createArrayOfGroupAccessDetails(ArrayOfGroupAccessDetails value) {
        return new JAXBElement<ArrayOfGroupAccessDetails>(_ArrayOfGroupAccessDetails_QNAME,
                                                          ArrayOfGroupAccessDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SystemRole }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SystemRole")
    public JAXBElement<SystemRole> createSystemRole(SystemRole value) {
        return new JAXBElement<SystemRole>(_SystemRole_QNAME, SystemRole.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupAccessDetails")
    public JAXBElement<GroupAccessDetails> createGroupAccessDetails(GroupAccessDetails value) {
        return new JAXBElement<GroupAccessDetails>(_GroupAccessDetails_QNAME, GroupAccessDetails.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UserAccessDetails")
    public JAXBElement<UserAccessDetails> createUserAccessDetails(UserAccessDetails value) {
        return new JAXBElement<UserAccessDetails>(_UserAccessDetails_QNAME, UserAccessDetails.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessRole }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "AccessRole")
    public JAXBElement<AccessRole> createAccessRole(AccessRole value) {
        return new JAXBElement<AccessRole>(_AccessRole_QNAME, AccessRole.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<BigInteger>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetSelfUserAccessDetails.class)
    public JAXBElement<AuthenticationInfo> createGetSelfUserAccessDetailsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GetSelfUserAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateSessionInheritViewerAccess.class)
    public JAXBElement<AuthenticationInfo> createUpdateSessionInheritViewerAccessAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateSessionInheritViewerAccess.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FoldersWithCreatorAccess",
                    scope = GroupAccessDetails.class)
    public JAXBElement<ArrayOfguid> createGroupAccessDetailsFoldersWithCreatorAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsFoldersWithCreatorAccess_QNAME, ArrayOfguid.class,
                                            GroupAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FoldersWithViewerAccess",
                    scope = GroupAccessDetails.class)
    public JAXBElement<ArrayOfguid> createGroupAccessDetailsFoldersWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsFoldersWithViewerAccess_QNAME, ArrayOfguid.class,
                                            GroupAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SessionsWithViewerAccess",
                    scope = GroupAccessDetails.class)
    public JAXBElement<ArrayOfguid> createGroupAccessDetailsSessionsWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsSessionsWithViewerAccess_QNAME, ArrayOfguid.class,
                                            GroupAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = RevokeUsersAccessFromFolder.class)
    public JAXBElement<AuthenticationInfo> createRevokeUsersAccessFromFolderAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   RevokeUsersAccessFromFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userIds", scope = RevokeUsersAccessFromFolder.class)
    public JAXBElement<ArrayOfguid> createRevokeUsersAccessFromFolderUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_RevokeUsersAccessFromFolderUserIds_QNAME, ArrayOfguid.class,
                                            RevokeUsersAccessFromFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetGroupAccessDetails.class)
    public JAXBElement<AuthenticationInfo> createGetGroupAccessDetailsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GetGroupAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GroupAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetGroupAccessDetailsResult",
                    scope = GetGroupAccessDetailsResponse.class)
    public JAXBElement<GroupAccessDetails> createGetGroupAccessDetailsResponseGetGroupAccessDetailsResult(GroupAccessDetails value) {
        return new JAXBElement<GroupAccessDetails>(_GetGroupAccessDetailsResponseGetGroupAccessDetailsResult_QNAME,
                                                   GroupAccessDetails.class, GetGroupAccessDetailsResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetSelfUserAccessDetailsResult",
                    scope = GetSelfUserAccessDetailsResponse.class)
    public JAXBElement<UserAccessDetails> createGetSelfUserAccessDetailsResponseGetSelfUserAccessDetailsResult(UserAccessDetails value) {
        return new JAXBElement<UserAccessDetails>(
                                                  _GetSelfUserAccessDetailsResponseGetSelfUserAccessDetailsResult_QNAME,
                                                  UserAccessDetails.class, GetSelfUserAccessDetailsResponse.class,
                                                  value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetUserAccessDetailsResult",
                    scope = GetUserAccessDetailsResponse.class)
    public JAXBElement<UserAccessDetails> createGetUserAccessDetailsResponseGetUserAccessDetailsResult(UserAccessDetails value) {
        return new JAXBElement<UserAccessDetails>(_GetUserAccessDetailsResponseGetUserAccessDetailsResult_QNAME,
                                                  UserAccessDetails.class, GetUserAccessDetailsResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetUserAccessDetails.class)
    public JAXBElement<AuthenticationInfo> createGetUserAccessDetailsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GetUserAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetFolderAccessDetailsResult",
                    scope = GetFolderAccessDetailsResponse.class)
    public JAXBElement<FolderAccessDetails> createGetFolderAccessDetailsResponseGetFolderAccessDetailsResult(FolderAccessDetails value) {
        return new JAXBElement<FolderAccessDetails>(_GetFolderAccessDetailsResponseGetFolderAccessDetailsResult_QNAME,
                                                    FolderAccessDetails.class, GetFolderAccessDetailsResponse.class,
                                                    value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateSessionIsPublic.class)
    public JAXBElement<AuthenticationInfo> createUpdateSessionIsPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateSessionIsPublic.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetSessionAccessDetails.class)
    public JAXBElement<AuthenticationInfo> createGetSessionAccessDetailsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GetSessionAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FolderAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FolderAccess",
                    scope = SessionAccessDetails.class)
    public JAXBElement<FolderAccessDetails> createSessionAccessDetailsFolderAccess(FolderAccessDetails value) {
        return new JAXBElement<FolderAccessDetails>(_SessionAccessDetailsFolderAccess_QNAME, FolderAccessDetails.class,
                                                    SessionAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UsersWithDirectViewerAccess",
                    scope = SessionAccessDetails.class)
    public JAXBElement<ArrayOfguid> createSessionAccessDetailsUsersWithDirectViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_SessionAccessDetailsUsersWithDirectViewerAccess_QNAME, ArrayOfguid.class,
                                            SessionAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupsWithDirectViewerAccess",
                    scope = SessionAccessDetails.class)
    public JAXBElement<ArrayOfguid> createSessionAccessDetailsGroupsWithDirectViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_SessionAccessDetailsGroupsWithDirectViewerAccess_QNAME, ArrayOfguid.class,
                                            SessionAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GrantUsersAccessToFolder.class)
    public JAXBElement<AuthenticationInfo> createGrantUsersAccessToFolderAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GrantUsersAccessToFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userIds", scope = GrantUsersAccessToFolder.class)
    public JAXBElement<ArrayOfguid> createGrantUsersAccessToFolderUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_RevokeUsersAccessFromFolderUserIds_QNAME, ArrayOfguid.class,
                                            GrantUsersAccessToFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = UpdateFolderIsPublic.class)
    public JAXBElement<AuthenticationInfo> createUpdateFolderIsPublicAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   UpdateFolderIsPublic.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GetFolderAccessDetails.class)
    public JAXBElement<AuthenticationInfo> createGetFolderAccessDetailsAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GetFolderAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = RevokeGroupViewerAccessFromSession.class)
    public JAXBElement<AuthenticationInfo> createRevokeGroupViewerAccessFromSessionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   RevokeGroupViewerAccessFromSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = RevokeUsersViewerAccessFromSession.class)
    public JAXBElement<AuthenticationInfo> createRevokeUsersViewerAccessFromSessionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   RevokeUsersViewerAccessFromSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "userIds",
                    scope = RevokeUsersViewerAccessFromSession.class)
    public JAXBElement<ArrayOfguid> createRevokeUsersViewerAccessFromSessionUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_RevokeUsersAccessFromFolderUserIds_QNAME, ArrayOfguid.class,
                                            RevokeUsersViewerAccessFromSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UsersWithCreatorAccess",
                    scope = FolderAccessDetails.class)
    public JAXBElement<ArrayOfguid> createFolderAccessDetailsUsersWithCreatorAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderAccessDetailsUsersWithCreatorAccess_QNAME, ArrayOfguid.class,
                                            FolderAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "UsersWithViewerAccess",
                    scope = FolderAccessDetails.class)
    public JAXBElement<ArrayOfguid> createFolderAccessDetailsUsersWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderAccessDetailsUsersWithViewerAccess_QNAME, ArrayOfguid.class,
                                            FolderAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupsWithCreatorAccess",
                    scope = FolderAccessDetails.class)
    public JAXBElement<ArrayOfguid> createFolderAccessDetailsGroupsWithCreatorAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderAccessDetailsGroupsWithCreatorAccess_QNAME, ArrayOfguid.class,
                                            FolderAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupsWithViewerAccess",
                    scope = FolderAccessDetails.class)
    public JAXBElement<ArrayOfguid> createFolderAccessDetailsGroupsWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_FolderAccessDetailsGroupsWithViewerAccess_QNAME, ArrayOfguid.class,
                                            FolderAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FoldersWithCreatorAccess",
                    scope = UserAccessDetails.class)
    public JAXBElement<ArrayOfguid> createUserAccessDetailsFoldersWithCreatorAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsFoldersWithCreatorAccess_QNAME, ArrayOfguid.class,
                                            UserAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfGroupAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "GroupMembershipAccess",
                    scope = UserAccessDetails.class)
    public JAXBElement<ArrayOfGroupAccessDetails> createUserAccessDetailsGroupMembershipAccess(ArrayOfGroupAccessDetails value) {
        return new JAXBElement<ArrayOfGroupAccessDetails>(_UserAccessDetailsGroupMembershipAccess_QNAME,
                                                          ArrayOfGroupAccessDetails.class, UserAccessDetails.class,
                                                          value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "FoldersWithViewerAccess",
                    scope = UserAccessDetails.class)
    public JAXBElement<ArrayOfguid> createUserAccessDetailsFoldersWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsFoldersWithViewerAccess_QNAME, ArrayOfguid.class,
                                            UserAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Panopto.Server.Services.PublicAPI.V40",
                    name = "SessionsWithViewerAccess",
                    scope = UserAccessDetails.class)
    public JAXBElement<ArrayOfguid> createUserAccessDetailsSessionsWithViewerAccess(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_GroupAccessDetailsSessionsWithViewerAccess_QNAME, ArrayOfguid.class,
                                            UserAccessDetails.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SessionAccessDetails }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetSessionAccessDetailsResult",
                    scope = GetSessionAccessDetailsResponse.class)
    public JAXBElement<SessionAccessDetails> createGetSessionAccessDetailsResponseGetSessionAccessDetailsResult(SessionAccessDetails value) {
        return new JAXBElement<SessionAccessDetails>(
                                                     _GetSessionAccessDetailsResponseGetSessionAccessDetailsResult_QNAME,
                                                     SessionAccessDetails.class, GetSessionAccessDetailsResponse.class,
                                                     value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GrantGroupViewerAccessToSession.class)
    public JAXBElement<AuthenticationInfo> createGrantGroupViewerAccessToSessionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GrantGroupViewerAccessToSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GrantUsersViewerAccessToSession.class)
    public JAXBElement<AuthenticationInfo> createGrantUsersViewerAccessToSessionAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GrantUsersViewerAccessToSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfguid }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userIds", scope = GrantUsersViewerAccessToSession.class)
    public JAXBElement<ArrayOfguid> createGrantUsersViewerAccessToSessionUserIds(ArrayOfguid value) {
        return new JAXBElement<ArrayOfguid>(_RevokeUsersAccessFromFolderUserIds_QNAME, ArrayOfguid.class,
                                            GrantUsersViewerAccessToSession.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = GrantGroupAccessToFolder.class)
    public JAXBElement<AuthenticationInfo> createGrantGroupAccessToFolderAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   GrantGroupAccessToFolder.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationInfo }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "auth", scope = RevokeGroupAccessFromFolder.class)
    public JAXBElement<AuthenticationInfo> createRevokeGroupAccessFromFolderAuth(AuthenticationInfo value) {
        return new JAXBElement<AuthenticationInfo>(_GetSelfUserAccessDetailsAuth_QNAME, AuthenticationInfo.class,
                                                   RevokeGroupAccessFromFolder.class, value);
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
    
}
