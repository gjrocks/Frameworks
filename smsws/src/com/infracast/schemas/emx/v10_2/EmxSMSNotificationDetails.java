
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSMSNotificationDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSMSNotificationDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}mtMessageId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSMSNotificationDetails", propOrder = {
    "mtMessageId"
})
public class EmxSMSNotificationDetails {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    @XmlSchemaType(name = "unsignedInt")
    protected long mtMessageId;

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

}
