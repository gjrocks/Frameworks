
package com.infracast.schemas.emx.v10_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSendVoiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSendVoiceResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="txVoiceMessageResult" type="{http://www.infracast.com/schemas/emx/v10_2}EmxTxVoiceMessageResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSendVoiceResponse", propOrder = {
    "txVoiceMessageResult"
})
public class EmxSendVoiceResponse
    extends EmxResponseMessage
{

    protected List<EmxTxVoiceMessageResult> txVoiceMessageResult;

    /**
     * Gets the value of the txVoiceMessageResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txVoiceMessageResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxVoiceMessageResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmxTxVoiceMessageResult }
     * 
     * 
     */
    public List<EmxTxVoiceMessageResult> getTxVoiceMessageResult() {
        if (txVoiceMessageResult == null) {
            txVoiceMessageResult = new ArrayList<EmxTxVoiceMessageResult>();
        }
        return this.txVoiceMessageResult;
    }

}
