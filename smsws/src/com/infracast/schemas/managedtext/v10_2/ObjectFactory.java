
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.infracast.schemas.emx.v10_2.EmxPingRequest;
import com.infracast.schemas.emx.v10_2.EmxPingResponse;
import com.infracast.schemas.emx.v10_2.EmxSMSNotificationRequest;
import com.infracast.schemas.emx.v10_2.EmxSMSNotificationResponse;
import com.infracast.schemas.emx.v10_2.EmxSendSmsRequest;
import com.infracast.schemas.emx.v10_2.EmxSendSmsResponse;
import com.infracast.schemas.emx.v10_2.EmxSendVoiceRequest;
import com.infracast.schemas.emx.v10_2.EmxSendVoiceResponse;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.infracast.schemas.managedtext.v10_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _NumericDestination_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "numericDestination");
    private final static QName _SendVoiceRequest_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "sendVoiceRequest");
    private final static QName _SendSmsRequest_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "sendSmsRequest");
    private final static QName _ServiceId_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "serviceId");
    private final static QName _Username_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "username");
    private final static QName _CustomerId_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "customerId");
    private final static QName _PingResponse_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "PingResponse");
    private final static QName _CustMessageId_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "custMessageId");
    private final static QName _MtMessageId_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "mtMessageId");
    private final static QName _TxtMessageStatus_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "txtMessageStatus");
    private final static QName _SmsMmsOriginator_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "smsMmsOriginator");
    private final static QName _SendSMSResponse_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "SendSMSResponse");
    private final static QName _SMSNotification_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "SMSNotification");
    private final static QName _VxMessageId_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "vxMessageId");
    private final static QName _VoiceOriginator_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "voiceOriginator");
    private final static QName _Status_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "status");
    private final static QName _TxVoiceAttributes_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "txVoiceAttributes");
    private final static QName _TxSmsAttributes_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "txSmsAttributes");
    private final static QName _CustMessageRef_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "custMessageRef");
    private final static QName _MessageText_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "messageText");
    private final static QName _VoiceAccent_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "voiceAccent");
    private final static QName _SmsNotificationRequest_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "smsNotificationRequest");
    private final static QName _SendVoiceResponse_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "SendVoiceResponse");
    private final static QName _PingText_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "pingText");
    private final static QName _PingRequest_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "pingRequest");
    private final static QName _Password_QNAME = new QName("http://www.infracast.com/schemas/managedtext/v10_2", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.infracast.schemas.managedtext.v10_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmxTextMessageStatus }
     * 
     */
    public EmxTextMessageStatus createEmxTextMessageStatus() {
        return new EmxTextMessageStatus();
    }

    /**
     * Create an instance of {@link EmxTxVoiceMessageAttribs }
     * 
     */
    public EmxTxVoiceMessageAttribs createEmxTxVoiceMessageAttribs() {
        return new EmxTxVoiceMessageAttribs();
    }

    /**
     * Create an instance of {@link EmxTxSmsMessageAttribs }
     * 
     */
    public EmxTxSmsMessageAttribs createEmxTxSmsMessageAttribs() {
        return new EmxTxSmsMessageAttribs();
    }

    /**
     * Create an instance of {@link EmxStatus }
     * 
     */
    public EmxStatus createEmxStatus() {
        return new EmxStatus();
    }

    /**
     * Create an instance of {@link EmxSmsMmsOriginator }
     * 
     */
    public EmxSmsMmsOriginator createEmxSmsMmsOriginator() {
        return new EmxSmsMmsOriginator();
    }

    /**
     * Create an instance of {@link EmxTxMessageAttribs }
     * 
     */
    public EmxTxMessageAttribs createEmxTxMessageAttribs() {
        return new EmxTxMessageAttribs();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "numericDestination")
    public JAXBElement<String> createNumericDestination(String value) {
        return new JAXBElement<String>(_NumericDestination_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSendVoiceRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "sendVoiceRequest")
    public JAXBElement<EmxSendVoiceRequest> createSendVoiceRequest(EmxSendVoiceRequest value) {
        return new JAXBElement<EmxSendVoiceRequest>(_SendVoiceRequest_QNAME, EmxSendVoiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSendSmsRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "sendSmsRequest")
    public JAXBElement<EmxSendSmsRequest> createSendSmsRequest(EmxSendSmsRequest value) {
        return new JAXBElement<EmxSendSmsRequest>(_SendSmsRequest_QNAME, EmxSendSmsRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "serviceId")
    public JAXBElement<Integer> createServiceId(Integer value) {
        return new JAXBElement<Integer>(_ServiceId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "username")
    public JAXBElement<String> createUsername(String value) {
        return new JAXBElement<String>(_Username_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "customerId")
    public JAXBElement<Integer> createCustomerId(Integer value) {
        return new JAXBElement<Integer>(_CustomerId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxPingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "PingResponse")
    public JAXBElement<EmxPingResponse> createPingResponse(EmxPingResponse value) {
        return new JAXBElement<EmxPingResponse>(_PingResponse_QNAME, EmxPingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "custMessageId")
    public JAXBElement<Integer> createCustMessageId(Integer value) {
        return new JAXBElement<Integer>(_CustMessageId_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "mtMessageId")
    public JAXBElement<Long> createMtMessageId(Long value) {
        return new JAXBElement<Long>(_MtMessageId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxTextMessageStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "txtMessageStatus")
    public JAXBElement<EmxTextMessageStatus> createTxtMessageStatus(EmxTextMessageStatus value) {
        return new JAXBElement<EmxTextMessageStatus>(_TxtMessageStatus_QNAME, EmxTextMessageStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSmsMmsOriginator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "smsMmsOriginator")
    public JAXBElement<EmxSmsMmsOriginator> createSmsMmsOriginator(EmxSmsMmsOriginator value) {
        return new JAXBElement<EmxSmsMmsOriginator>(_SmsMmsOriginator_QNAME, EmxSmsMmsOriginator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSendSmsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "SendSMSResponse")
    public JAXBElement<EmxSendSmsResponse> createSendSMSResponse(EmxSendSmsResponse value) {
        return new JAXBElement<EmxSendSmsResponse>(_SendSMSResponse_QNAME, EmxSendSmsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSMSNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "SMSNotification")
    public JAXBElement<EmxSMSNotificationResponse> createSMSNotification(EmxSMSNotificationResponse value) {
        return new JAXBElement<EmxSMSNotificationResponse>(_SMSNotification_QNAME, EmxSMSNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "vxMessageId")
    public JAXBElement<Long> createVxMessageId(Long value) {
        return new JAXBElement<Long>(_VxMessageId_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "voiceOriginator")
    public JAXBElement<String> createVoiceOriginator(String value) {
        return new JAXBElement<String>(_VoiceOriginator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "status")
    public JAXBElement<EmxStatus> createStatus(EmxStatus value) {
        return new JAXBElement<EmxStatus>(_Status_QNAME, EmxStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxTxVoiceMessageAttribs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "txVoiceAttributes")
    public JAXBElement<EmxTxVoiceMessageAttribs> createTxVoiceAttributes(EmxTxVoiceMessageAttribs value) {
        return new JAXBElement<EmxTxVoiceMessageAttribs>(_TxVoiceAttributes_QNAME, EmxTxVoiceMessageAttribs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxTxSmsMessageAttribs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "txSmsAttributes")
    public JAXBElement<EmxTxSmsMessageAttribs> createTxSmsAttributes(EmxTxSmsMessageAttribs value) {
        return new JAXBElement<EmxTxSmsMessageAttribs>(_TxSmsAttributes_QNAME, EmxTxSmsMessageAttribs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "custMessageRef")
    public JAXBElement<String> createCustMessageRef(String value) {
        return new JAXBElement<String>(_CustMessageRef_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "messageText")
    public JAXBElement<String> createMessageText(String value) {
        return new JAXBElement<String>(_MessageText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "voiceAccent")
    public JAXBElement<String> createVoiceAccent(String value) {
        return new JAXBElement<String>(_VoiceAccent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSMSNotificationRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "smsNotificationRequest")
    public JAXBElement<EmxSMSNotificationRequest> createSmsNotificationRequest(EmxSMSNotificationRequest value) {
        return new JAXBElement<EmxSMSNotificationRequest>(_SmsNotificationRequest_QNAME, EmxSMSNotificationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxSendVoiceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "SendVoiceResponse")
    public JAXBElement<EmxSendVoiceResponse> createSendVoiceResponse(EmxSendVoiceResponse value) {
        return new JAXBElement<EmxSendVoiceResponse>(_SendVoiceResponse_QNAME, EmxSendVoiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "pingText")
    public JAXBElement<String> createPingText(String value) {
        return new JAXBElement<String>(_PingText_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmxPingRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "pingRequest")
    public JAXBElement<EmxPingRequest> createPingRequest(EmxPingRequest value) {
        return new JAXBElement<EmxPingRequest>(_PingRequest_QNAME, EmxPingRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.infracast.com/schemas/managedtext/v10_2", name = "password")
    public JAXBElement<String> createPassword(String value) {
        return new JAXBElement<String>(_Password_QNAME, String.class, null, value);
    }

}
