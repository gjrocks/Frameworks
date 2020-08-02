
package com.infracast.schemas.emx.v10_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSMSNotificationRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSMSNotificationRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="SmsNotificationDetails" type="{http://www.infracast.com/schemas/emx/v10_2}EmxSMSNotificationDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSMSNotificationRequest", propOrder = {
    "smsNotificationDetails"
})
public class EmxSMSNotificationRequest
    extends EmxRequestMessage
{

    @XmlElement(name = "SmsNotificationDetails")
    protected List<EmxSMSNotificationDetails> smsNotificationDetails;

    /**
     * Gets the value of the smsNotificationDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the smsNotificationDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmsNotificationDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmxSMSNotificationDetails }
     * 
     * 
     */
    public List<EmxSMSNotificationDetails> getSmsNotificationDetails() {
        if (smsNotificationDetails == null) {
            smsNotificationDetails = new ArrayList<EmxSMSNotificationDetails>();
        }
        return this.smsNotificationDetails;
    }

}
