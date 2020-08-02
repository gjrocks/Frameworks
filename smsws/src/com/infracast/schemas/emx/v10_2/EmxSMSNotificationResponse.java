
package com.infracast.schemas.emx.v10_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.infracast.schemas.managedtext.v10_2.EmxTextMessageStatus;


/**
 * <p>Java class for EmxSMSNotificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSMSNotificationResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxResponseMessage">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.infracast.com/schemas/managedtext/v10_2}txtMessageStatus" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSMSNotificationResponse", propOrder = {
    "txtMessageStatus"
})
public class EmxSMSNotificationResponse
    extends EmxResponseMessage
{

    @XmlElement(namespace = "http://www.infracast.com/schemas/managedtext/v10_2")
    protected List<EmxTextMessageStatus> txtMessageStatus;

    /**
     * Gets the value of the txtMessageStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txtMessageStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxtMessageStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmxTextMessageStatus }
     * 
     * 
     */
    public List<EmxTextMessageStatus> getTxtMessageStatus() {
        if (txtMessageStatus == null) {
            txtMessageStatus = new ArrayList<EmxTextMessageStatus>();
        }
        return this.txtMessageStatus;
    }

}
