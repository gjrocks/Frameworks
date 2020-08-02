
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxRequestMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxRequestMessage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}customerId"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}serviceId"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}username" minOccurs="0"/>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}password" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxRequestMessage", propOrder = {
    "customerId",
    "serviceId",
    "username",
    "password"
})
@XmlSeeAlso({
    EmxSMSNotificationRequest.class,
    EmxSendSmsRequest.class,
    EmxPingRequest.class,
    EmxSendVoiceRequest.class
})
public class EmxRequestMessage {

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected int customerId;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected int serviceId;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String username;
    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String password;

    /**
     * Gets the value of the customerId property.
     * 
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the value of the customerId property.
     * 
     */
    public void setCustomerId(int value) {
        this.customerId = value;
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
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
