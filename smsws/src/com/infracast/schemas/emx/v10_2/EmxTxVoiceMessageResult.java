
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import com.infracast.schemas.managedtext.v10_2.EmxStatus;


/**
 * <p>Java class for EmxTxVoiceMessageResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxVoiceMessageResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageId"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}custMessageRef" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}status" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}vxMessageId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxVoiceMessageResult", propOrder = {
    "custMessageId",
    "custMessageRef",
    "status",
    "vxMessageId"
})
public class EmxTxVoiceMessageResult {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected int custMessageId;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String custMessageRef;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected EmxStatus status;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    @XmlSchemaType(name = "unsignedInt")
    protected Long vxMessageId;

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

    /**
     * Gets the value of the vxMessageId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getVxMessageId() {
        return vxMessageId;
    }

    /**
     * Sets the value of the vxMessageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setVxMessageId(Long value) {
        this.vxMessageId = value;
    }

}
