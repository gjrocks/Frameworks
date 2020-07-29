
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.infracast.schemas.managedtext.v10_2.EmxTxVoiceMessageAttribs;


/**
 * <p>Java class for EmxTxVoiceMessageDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxVoiceMessageDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageId"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}voiceOriginator" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}voiceAccent" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}numericDestination" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}messageText" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}txVoiceAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxVoiceMessageDetails", propOrder = {
    "custMessageId",
    "custMessageRef",
    "voiceOriginator",
    "voiceAccent",
    "numericDestination",
    "messageText",
    "txVoiceAttributes"
})
public class EmxTxVoiceMessageDetails {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected int custMessageId;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String custMessageRef;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String voiceOriginator;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String voiceAccent;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String numericDestination;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String messageText;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected EmxTxVoiceMessageAttribs txVoiceAttributes;

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
     * Gets the value of the voiceOriginator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceOriginator() {
        return voiceOriginator;
    }

    /**
     * Sets the value of the voiceOriginator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceOriginator(String value) {
        this.voiceOriginator = value;
    }

    /**
     * Gets the value of the voiceAccent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceAccent() {
        return voiceAccent;
    }

    /**
     * Sets the value of the voiceAccent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceAccent(String value) {
        this.voiceAccent = value;
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
     * Gets the value of the messageText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageText() {
        return messageText;
    }

    /**
     * Sets the value of the messageText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageText(String value) {
        this.messageText = value;
    }

    /**
     * Gets the value of the txVoiceAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EmxTxVoiceMessageAttribs }
     *     
     */
    public EmxTxVoiceMessageAttribs getTxVoiceAttributes() {
        return txVoiceAttributes;
    }

    /**
     * Sets the value of the txVoiceAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmxTxVoiceMessageAttribs }
     *     
     */
    public void setTxVoiceAttributes(EmxTxVoiceMessageAttribs value) {
        this.txVoiceAttributes = value;
    }

}
