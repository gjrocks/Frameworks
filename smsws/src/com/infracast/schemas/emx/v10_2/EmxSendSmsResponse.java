
package com.infracast.schemas.emx.v10_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EmxSendSmsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmxSendSmsResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.infracast.com/schemas/emx/v10_2}EmxResponseMessage">
 *       &lt;sequence>
 *         &lt;element name="txSmsMessageResult" type="{http://www.infracast.com/schemas/emx/v10_2}EmxTxSmsMessageResult" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmxSendSmsResponse", propOrder = {
    "txSmsMessageResult"
})
public class EmxSendSmsResponse
    extends EmxResponseMessage
{

    protected List<EmxTxSmsMessageResult> txSmsMessageResult;

    /**
     * Gets the value of the txSmsMessageResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the txSmsMessageResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxSmsMessageResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmxTxSmsMessageResult }
     * 
     * 
     */
    public List<EmxTxSmsMessageResult> getTxSmsMessageResult() {
        if (txSmsMessageResult == null) {
            txSmsMessageResult = new ArrayList<EmxTxSmsMessageResult>();
        }
        return this.txSmsMessageResult;
    }

}
