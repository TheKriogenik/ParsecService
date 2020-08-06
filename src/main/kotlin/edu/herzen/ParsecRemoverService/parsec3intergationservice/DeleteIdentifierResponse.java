
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
 *         &lt;element name="DeleteIdentifierResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "deleteIdentifierResult"
})
@XmlRootElement(name = "DeleteIdentifierResponse")
public class DeleteIdentifierResponse {

    @XmlElement(name = "DeleteIdentifierResult")
    protected BaseResult deleteIdentifierResult;

    /**
     * Gets the value of the deleteIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getDeleteIdentifierResult() {
        return deleteIdentifierResult;
    }

    /**
     * Sets the value of the deleteIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setDeleteIdentifierResult(BaseResult value) {
        this.deleteIdentifierResult = value;
    }

}
