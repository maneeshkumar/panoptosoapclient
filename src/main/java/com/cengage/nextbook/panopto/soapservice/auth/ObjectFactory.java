package com.cengage.nextbook.panopto.soapservice.auth;

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
 * com.cengage.nextbook.panopto.soapservice.auth package.
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
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedByte");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "dateTime");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "anyType");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                              "unsignedInt");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                                "unsignedShort");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "decimal");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "double");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "base64Binary");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                           "duration");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                         "string");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                               "unsignedLong");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/",
                                                          "boolean");
    private static final QName _LogOnWithExternalProviderUserKey_QNAME = new QName("http://tempuri.org/", "userKey");
    private static final QName _LogOnWithExternalProviderAuthCode_QNAME = new QName("http://tempuri.org/", "authCode");
    private static final QName _GetServerVersionResponseGetServerVersionResult_QNAME = new QName("http://tempuri.org/",
                                                                                                 "GetServerVersionResult");
    private static final QName _LogOnWithPasswordPassword_QNAME = new QName("http://tempuri.org/", "password");
    
    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package:
     * com.cengage.nextbook.panopto.soapservice.auth
     * 
     */
    public ObjectFactory() {
    }
    
    /**
     * Create an instance of {@link LogOnWithPasswordResponse }
     * 
     */
    public LogOnWithPasswordResponse createLogOnWithPasswordResponse() {
        return new LogOnWithPasswordResponse();
    }
    
    /**
     * Create an instance of {@link GetServerVersion }
     * 
     */
    public GetServerVersion createGetServerVersion() {
        return new GetServerVersion();
    }
    
    /**
     * Create an instance of {@link LogOnWithExternalProviderResponse }
     * 
     */
    public LogOnWithExternalProviderResponse createLogOnWithExternalProviderResponse() {
        return new LogOnWithExternalProviderResponse();
    }
    
    /**
     * Create an instance of {@link LogOnWithExternalProvider }
     * 
     */
    public LogOnWithExternalProvider createLogOnWithExternalProvider() {
        return new LogOnWithExternalProvider();
    }
    
    /**
     * Create an instance of {@link GetServerVersionResponse }
     * 
     */
    public GetServerVersionResponse createGetServerVersionResponse() {
        return new GetServerVersionResponse();
    }
    
    /**
     * Create an instance of {@link LogOnWithPassword }
     * 
     */
    public LogOnWithPassword createLogOnWithPassword() {
        return new LogOnWithPassword();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<Short>(_UnsignedByte_QNAME, Short.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<Double>(_Double_QNAME, Double.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<String>(_Guid_QNAME, String.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<Duration>(_Duration_QNAME, Duration.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<Boolean>(_Boolean_QNAME, Boolean.class, null, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userKey", scope = LogOnWithExternalProvider.class)
    public JAXBElement<String> createLogOnWithExternalProviderUserKey(String value) {
        return new JAXBElement<String>(_LogOnWithExternalProviderUserKey_QNAME, String.class,
                                       LogOnWithExternalProvider.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "authCode", scope = LogOnWithExternalProvider.class)
    public JAXBElement<String> createLogOnWithExternalProviderAuthCode(String value) {
        return new JAXBElement<String>(_LogOnWithExternalProviderAuthCode_QNAME, String.class,
                                       LogOnWithExternalProvider.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/",
                    name = "GetServerVersionResult",
                    scope = GetServerVersionResponse.class)
    public JAXBElement<String> createGetServerVersionResponseGetServerVersionResult(String value) {
        return new JAXBElement<String>(_GetServerVersionResponseGetServerVersionResult_QNAME, String.class,
                                       GetServerVersionResponse.class, value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userKey", scope = LogOnWithPassword.class)
    public JAXBElement<String> createLogOnWithPasswordUserKey(String value) {
        return new JAXBElement<String>(_LogOnWithExternalProviderUserKey_QNAME, String.class, LogOnWithPassword.class,
                                       value);
    }
    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "password", scope = LogOnWithPassword.class)
    public JAXBElement<String> createLogOnWithPasswordPassword(String value) {
        return new JAXBElement<String>(_LogOnWithPasswordPassword_QNAME, String.class, LogOnWithPassword.class, value);
    }
    
}
