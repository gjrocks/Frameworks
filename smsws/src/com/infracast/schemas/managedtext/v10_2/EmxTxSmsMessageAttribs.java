
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxTxSmsMessageAttribs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxSmsMessageAttribs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/managedtext/v10_2}EmxTxMessageAttribs">
 *       &lt;sequence>
 *         &lt;element name="contentType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="flashMessage" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="pricePoint" type="{http://www.w3.org/2001/XMLSchema}short" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxSmsMessageAttribs", propOrder = {
    "contentType",
    "flashMessage",
    "pricePoint"
})
public class EmxTxSmsMessageAttribs
    extends EmxTxMessageAttribs
{

    @XmlSchemaType(name = "unsignedByte")
    protected Short contentType;
    protected Boolean flashMessage;
    protected Short pricePoint;

    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getContentType() {
        return contentType;
    }

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setContentType(Short value) {
        this.contentType = value;
    }

    /**
     * Gets the value of the flashMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFlashMessage() {
        return flashMessage;
    }

    /**
     * Sets the value of the flashMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFlashMessage(Boolean value) {
        this.flashMessage = value;
    }

    /**
     * Gets the value of the pricePoint property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getPricePoint() {
        return pricePoint;
    }

    /**
     * Sets the value of the pricePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setPricePoint(Short value) {
        this.pricePoint = value;
    }

}
