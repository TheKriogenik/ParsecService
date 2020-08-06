
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="UnblockPersonResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "unblockPersonResult"
})
@XmlRootElement(name = "UnblockPersonResponse")
public class UnblockPersonResponse {

    @XmlElement(name = "UnblockPersonResult")
    protected BaseResult unblockPersonResult;

    /**
     * Gets the value of the unblockPersonResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getUnblockPersonResult() {
        return unblockPersonResult;
    }

    /**
     * Sets the value of the unblockPersonResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setUnblockPersonResult(BaseResult value) {
        this.unblockPersonResult = value;
    }

}
