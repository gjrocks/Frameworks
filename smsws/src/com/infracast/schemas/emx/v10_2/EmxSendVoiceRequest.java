
package com.infracast.schemas.emx.v10_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSendVoiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSendVoiceRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxRequestMessage">
 *       &lt;sequence>
 *         &lt;element name="txVoiceMessageDetails" type="{http://www.infracast.com/schemas/emx/v10_2}EmxTxVoiceMessageDetails" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSendVoiceRequest", propOrder = {
    "txVoiceMessageDetails"
})
public class EmxSendVoiceRequest
    extends EmxRequestMessage
{

    protected List<EmxTxVoiceMessageDetails> txVoiceMessageDetails;

    /**
     * Gets the value of the txVoiceMessageDetails property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVoiceMessageDetails property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVoiceMessageDetails().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmxTxVoiceMessageDetails }
     * 
     * 
     */
    public List<EmxTxVoiceMessageDetails> getTxVoiceMessageDetails() {
        if (txVoiceMessageDetails == null) {
            txVoiceMessageDetails = new ArrayList<EmxTxVoiceMessageDetails>();
        }
        return this.txVoiceMessageDetails;
    }

}
