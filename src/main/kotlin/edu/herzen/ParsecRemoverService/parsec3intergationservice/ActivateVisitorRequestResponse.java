
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
 *         &lt;element name="ActivateVisitorRequestResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "activateVisitorRequestResult"
})
@XmlRootElement(name = "ActivateVisitorRequestResponse")
public class ActivateVisitorRequestResponse {

    @XmlElement(name = "ActivateVisitorRequestResult")
    protected BaseResult activateVisitorRequestResult;

    /**
     * Gets the value of the activateVisitorRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getActivateVisitorRequestResult() {
        return activateVisitorRequestResult;
    }

    /**
     * Sets the value of the activateVisitorRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setActivateVisitorRequestResult(BaseResult value) {
        this.activateVisitorRequestResult = value;
    }

}
