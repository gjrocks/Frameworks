
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSmsMmsOriginator complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSmsMmsOriginator">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="internationalPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="alphatag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="shortcode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSmsMmsOriginator", propOrder = {
    "internationalPhoneNumber",
    "alphatag",
    "shortcode"
})
public class EmxSmsMmsOriginator {

    protected String internationalPhoneNumber;
    protected String alphatag;
    protected String shortcode;

    /**
     * Gets the value of the internationalPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternationalPhoneNumber() {
        return internationalPhoneNumber;
    }

    /**
     * Sets the value of the internationalPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternationalPhoneNumber(String value) {
        this.internationalPhoneNumber = value;
    }

    /**
     * Gets the value of the alphatag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlphatag() {
        return alphatag;
    }

    /**
     * Sets the value of the alphatag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlphatag(String value) {
        this.alphatag = value;
    }

    /**
     * Gets the value of the shortcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortcode() {
        return shortcode;
    }

    /**
     * Sets the value of the shortcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortcode(String value) {
        this.shortcode = value;
    }

}
