
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import com.infracast.schemas.managedtext.v10_2.EmxStatus;


/**
 * <p>Java class for EmxResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxResponseMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}status" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxResponseMessage", propOrder = {
    "status"
})
@XmlSeeAlso({
    EmxSendVoiceResponse.class,
    EmxSMSNotificationResponse.class,
    EmxSendSmsResponse.class,
    EmxPingResponse.class
})
public class EmxResponseMessage {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected EmxStatus status;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link EmxStatus }
     *     
     */
    public EmxStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmxStatus }
     *     
     */
    public void setStatus(EmxStatus value) {
        this.status = value;
    }

}
