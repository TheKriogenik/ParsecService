
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
 *         &lt;element name="ChangePersonIdentifierResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "changePersonIdentifierResult"
})
@XmlRootElement(name = "ChangePersonIdentifierResponse")
public class ChangePersonIdentifierResponse {

    @XmlElement(name = "ChangePersonIdentifierResult")
    protected BaseResult changePersonIdentifierResult;

    /**
     * Gets the value of the changePersonIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getChangePersonIdentifierResult() {
        return changePersonIdentifierResult;
    }

    /**
     * Sets the value of the changePersonIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setChangePersonIdentifierResult(BaseResult value) {
        this.changePersonIdentifierResult = value;
    }

}
