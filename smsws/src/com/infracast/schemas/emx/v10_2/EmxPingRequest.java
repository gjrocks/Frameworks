
package com.infracast.schemas.emx.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxPingRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxPingRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxRequestMessage">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}pingText" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxPingRequest", propOrder = {
    "pingText"
})
public class EmxPingRequest
    extends EmxRequestMessage
{

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected String pingText;

    /**
     * Gets the value of the pingText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPingText() {
        return pingText;
    }

    /**
     * Sets the value of the pingText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPingText(String value) {
        this.pingText = value;
    }

}
