
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxTxMessageAttribs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxMessageAttribs">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="submitAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireAt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expireAfter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antisocialStart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="antisocialEnd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="costCentreId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="custBillingRef1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custBillingRef2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="custSystemRef8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receiptMethod" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxMessageAttribs", propOrder = {
    "submitAt",
    "expireAt",
    "expireAfter",
    "antisocialStart",
    "antisocialEnd",
    "costCentreId",
    "custBillingRef1",
    "custBillingRef2",
    "custSystemRef1",
    "custSystemRef2",
    "custSystemRef3",
    "custSystemRef4",
    "custSystemRef5",
    "custSystemRef6",
    "custSystemRef7",
    "custSystemRef8",
    "receiptMethod"
})
@XmlSeeAlso({
    EmxTxVoiceMessageAttribs.class,
    EmxTxSmsMessageAttribs.class
})
public class EmxTxMessageAttribs {

    protected String submitAt;
    protected String expireAt;
    protected String expireAfter;
    protected String antisocialStart;
    protected String antisocialEnd;
    protected Integer costCentreId;
    protected String custBillingRef1;
    protected String custBillingRef2;
    protected String custSystemRef1;
    protected String custSystemRef2;
    protected String custSystemRef3;
    protected String custSystemRef4;
    protected String custSystemRef5;
    protected String custSystemRef6;
    protected String custSystemRef7;
    protected String custSystemRef8;
    @XmlSchemaType(name = "unsignedByte")
    protected Short receiptMethod;

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
     * Gets the value of the expireAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireAt() {
        return expireAt;
    }

    /**
     * Sets the value of the expireAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireAt(String value) {
        this.expireAt = value;
    }

    /**
     * Gets the value of the expireAfter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireAfter() {
        return expireAfter;
    }

    /**
     * Sets the value of the expireAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireAfter(String value) {
        this.expireAfter = value;
    }

    /**
     * Gets the value of the antisocialStart property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntisocialStart() {
        return antisocialStart;
    }

    /**
     * Sets the value of the antisocialStart property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntisocialStart(String value) {
        this.antisocialStart = value;
    }

    /**
     * Gets the value of the antisocialEnd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAntisocialEnd() {
        return antisocialEnd;
    }

    /**
     * Sets the value of the antisocialEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAntisocialEnd(String value) {
        this.antisocialEnd = value;
    }

    /**
     * Gets the value of the costCentreId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCostCentreId() {
        return costCentreId;
    }

    /**
     * Sets the value of the costCentreId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCostCentreId(Integer value) {
        this.costCentreId = value;
    }

    /**
     * Gets the value of the custBillingRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustBillingRef1() {
        return custBillingRef1;
    }

    /**
     * Sets the value of the custBillingRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustBillingRef1(String value) {
        this.custBillingRef1 = value;
    }

    /**
     * Gets the value of the custBillingRef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustBillingRef2() {
        return custBillingRef2;
    }

    /**
     * Sets the value of the custBillingRef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustBillingRef2(String value) {
        this.custBillingRef2 = value;
    }

    /**
     * Gets the value of the custSystemRef1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef1() {
        return custSystemRef1;
    }

    /**
     * Sets the value of the custSystemRef1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef1(String value) {
        this.custSystemRef1 = value;
    }

    /**
     * Gets the value of the custSystemRef2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef2() {
        return custSystemRef2;
    }

    /**
     * Sets the value of the custSystemRef2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef2(String value) {
        this.custSystemRef2 = value;
    }

    /**
     * Gets the value of the custSystemRef3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef3() {
        return custSystemRef3;
    }

    /**
     * Sets the value of the custSystemRef3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef3(String value) {
        this.custSystemRef3 = value;
    }

    /**
     * Gets the value of the custSystemRef4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef4() {
        return custSystemRef4;
    }

    /**
     * Sets the value of the custSystemRef4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef4(String value) {
        this.custSystemRef4 = value;
    }

    /**
     * Gets the value of the custSystemRef5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef5() {
        return custSystemRef5;
    }

    /**
     * Sets the value of the custSystemRef5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef5(String value) {
        this.custSystemRef5 = value;
    }

    /**
     * Gets the value of the custSystemRef6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef6() {
        return custSystemRef6;
    }

    /**
     * Sets the value of the custSystemRef6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef6(String value) {
        this.custSystemRef6 = value;
    }

    /**
     * Gets the value of the custSystemRef7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef7() {
        return custSystemRef7;
    }

    /**
     * Sets the value of the custSystemRef7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef7(String value) {
        this.custSystemRef7 = value;
    }

    /**
     * Gets the value of the custSystemRef8 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustSystemRef8() {
        return custSystemRef8;
    }

    /**
     * Sets the value of the custSystemRef8 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustSystemRef8(String value) {
        this.custSystemRef8 = value;
    }

    /**
     * Gets the value of the receiptMethod property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getReceiptMethod() {
        return receiptMethod;
    }

    /**
     * Sets the value of the receiptMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setReceiptMethod(Short value) {
        this.receiptMethod = value;
    }

}
