
package com.infracast.schemas.managedtext.v10_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxTxVoiceMessageAttribs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxTxVoiceMessageAttribs">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/managedtext/v10_2}EmxTxMessageAttribs">
 *       &lt;sequence>
 *         &lt;element name="subject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="voiceCallType" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" minOccurs="0"/>
 *         &lt;element name="voiceCallbackNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxTxVoiceMessageAttribs", propOrder = {
    "subject",
    "voiceCallType",
    "voiceCallbackNumber"
})
public class EmxTxVoiceMessageAttribs
    extends EmxTxMessageAttribs
{

    protected String subject;
    @XmlSchemaType(name = "unsignedByte")
    protected Short voiceCallType;
    protected String voiceCallbackNumber;

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubject(String value) {
        this.subject = value;
    }

    /**
     * Gets the value of the voiceCallType property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getVoiceCallType() {
        return voiceCallType;
    }

    /**
     * Sets the value of the voiceCallType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setVoiceCallType(Short value) {
        this.voiceCallType = value;
    }

    /**
     * Gets the value of the voiceCallbackNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoiceCallbackNumber() {
        return voiceCallbackNumber;
    }

    /**
     * Sets the value of the voiceCallbackNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoiceCallbackNumber(String value) {
        this.voiceCallbackNumber = value;
    }

}
