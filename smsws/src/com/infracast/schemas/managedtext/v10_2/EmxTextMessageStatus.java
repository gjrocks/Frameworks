
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxTextMessageStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTextMessageStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="mtMessageId" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/>
 *         &lt;element name="serviceId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="gatewayId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="custMessageId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="custMessageRef" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="smsMmsOriginator" type="{http://www.infracast.com/schemas/managedtext/v10_2}EmxSmsMmsOriginator" minOccurs="0"/>
 *         &lt;element name="numericDestination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sendStatus" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/>
 *         &lt;element name="completionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryReport" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="deliveryErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submitAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="submittedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enRouteAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="completedAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTextMessageStatus", propOrder = {
    "mtMessageId",
    "serviceId",
    "gatewayId",
    "custMessageId",
    "custMessageRef",
    "smsMmsOriginator",
    "numericDestination",
    "sendStatus",
    "completionText",
    "deliveryReport",
    "deliveryStatus",
    "deliveryErrorCode",
    "createdAt",
    "submitAt",
    "submittedAt",
    "enRouteAt",
    "completedAt"
})
public class EmxTextMessageStatus {

    @XmlSchemaType(name = "unsignedInt")
    protected long mtMessageId;
    protected int serviceId;
    protected int gatewayId;
    protected int custMessageId;
    protected String custMessageRef;
    protected EmxSmsMmsOriginator smsMmsOriginator;
    protected String numericDestination;
    @XmlSchemaType(name = "unsignedByte")
    protected short sendStatus;
    protected String completionText;
    protected String deliveryReport;
    protected String deliveryStatus;
    protected String deliveryErrorCode;
    protected String createdAt;
    protected String submitAt;
    protected String submittedAt;
    protected String enRouteAt;
    protected String completedAt;

    /**
     * Gets the value of the mtMessageId property.
     * 
     */
    public long getMtMessageId() {
        return mtMessageId;
    }

    /**
     * Sets the value of the mtMessageId property.
     * 
     */
    public void setMtMessageId(long value) {
        this.mtMessageId = value;
    }

    /**
     * Gets the value of the serviceId property.
     * 
     */
    public int getServiceId() {
        return serviceId;
    }

    /**
     * Sets the value of the serviceId property.
     * 
     */
    public void setServiceId(int value) {
        this.serviceId = value;
    }

    /**
     * Gets the value of the gatewayId property.
     * 
     */
    public int getGatewayId() {
        return gatewayId;
    }

    /**
     * Sets the value of the gatewayId property.
     * 
     */
    public void setGatewayId(int value) {
        this.gatewayId = value;
    }

    /**
     * Gets the value of the custMessageId property.
     * 
     */
    public int getCustMessageId() {
        return custMessageId;
    }

    /**
     * Sets the value of the custMessageId property.
     * 
     */
    public void setCustMessageId(int value) {
        this.custMessageId = value;
    }

    /**
     * Gets the value of the custMessageRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustMessageRef() {
        return custMessageRef;
    }

    /**
     * Sets the value of the custMessageRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustMessageRef(String value) {
        this.custMessageRef = value;
    }

    /**
     * Gets the value of the smsMmsOriginator property.
     * 
     * @return
     *     possible object is
     *     {@link EmxSmsMmsOriginator }
     *     
     */
    public EmxSmsMmsOriginator getSmsMmsOriginator() {
        return smsMmsOriginator;
    }

    /**
     * Sets the value of the smsMmsOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmxSmsMmsOriginator }
     *     
     */
    public void setSmsMmsOriginator(EmxSmsMmsOriginator value) {
        this.smsMmsOriginator = value;
    }

    /**
     * Gets the value of the numericDestination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumericDestination() {
        return numericDestination;
    }

    /**
     * Sets the value of the numericDestination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumericDestination(String value) {
        this.numericDestination = value;
    }

    /**
     * Gets the value of the sendStatus property.
     * 
     */
    public short getSendStatus() {
        return sendStatus;
    }

    /**
     * Sets the value of the sendStatus property.
     * 
     */
    public void setSendStatus(short value) {
        this.sendStatus = value;
    }

    /**
     * Gets the value of the completionText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletionText() {
        return completionText;
    }

    /**
     * Sets the value of the completionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletionText(String value) {
        this.completionText = value;
    }

    /**
     * Gets the value of the deliveryReport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryReport() {
        return deliveryReport;
    }

    /**
     * Sets the value of the deliveryReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryReport(String value) {
        this.deliveryReport = value;
    }

    /**
     * Gets the value of the deliveryStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryStatus() {
        return deliveryStatus;
    }

    /**
     * Sets the value of the deliveryStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryStatus(String value) {
        this.deliveryStatus = value;
    }

    /**
     * Gets the value of the deliveryErrorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryErrorCode() {
        return deliveryErrorCode;
    }

    /**
     * Sets the value of the deliveryErrorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryErrorCode(String value) {
        this.deliveryErrorCode = value;
    }

    /**
     * Gets the value of the createdAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Sets the value of the createdAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedAt(String value) {
        this.createdAt = value;
    }

    /**
     * Gets the value of the submitAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitAt() {
        return submitAt;
    }

    /**
     * Sets the value of the submitAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmitAt(String value) {
        this.submitAt = value;
    }

    /**
     * Gets the value of the submittedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmittedAt() {
        return submittedAt;
    }

    /**
     * Sets the value of the submittedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmittedAt(String value) {
        this.submittedAt = value;
    }

    /**
     * Gets the value of the enRouteAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnRouteAt() {
        return enRouteAt;
    }

    /**
     * Sets the value of the enRouteAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnRouteAt(String value) {
        this.enRouteAt = value;
    }

    /**
     * Gets the value of the completedAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompletedAt() {
        return completedAt;
    }

    /**
     * Sets the value of the completedAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompletedAt(String value) {
        this.completedAt = value;
    }

}
