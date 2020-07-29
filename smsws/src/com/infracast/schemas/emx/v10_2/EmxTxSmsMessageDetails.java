
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.infracast.schemas.managedtext.v10_2.EmxSmsMmsOriginator;
import com.infracast.schemas.managedtext.v10_2.EmxTxSmsMessageAttribs;


/**
 * <p>Java class for EmxTxSmsMessageDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxSmsMessageDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}smsMmsOriginator" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}numericDestination" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}messageText" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageId"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}txSmsAttributes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxSmsMessageDetails", propOrder = {
    "smsMmsOriginator",
    "numericDestination",
    "messageText",
    "custMessageId",
    "custMessageRef",
    "txSmsAttributes"
})
public class EmxTxSmsMessageDetails {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected EmxSmsMmsOriginator smsMmsOriginator;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String numericDestination;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String messageText;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected int custMessageId;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String custMessageRef;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected EmxTxSmsMessageAttribs txSmsAttributes;

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
     * Gets the value of the txSmsAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link EmxTxSmsMessageAttribs }
     *     
     */
    public EmxTxSmsMessageAttribs getTxSmsAttributes() {
        return txSmsAttributes;
    }

    /**
     * Sets the value of the txSmsAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmxTxSmsMessageAttribs }
     *     
     */
    public void setTxSmsAttributes(EmxTxSmsMessageAttribs value) {
        this.txSmsAttributes = value;
    }

}
