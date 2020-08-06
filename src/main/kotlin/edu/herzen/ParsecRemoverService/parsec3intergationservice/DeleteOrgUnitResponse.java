
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
 *         &lt;element name="DeleteOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "deleteOrgUnitResult"
})
@XmlRootElement(name = "DeleteOrgUnitResponse")
public class DeleteOrgUnitResponse {

    @XmlElement(name = "DeleteOrgUnitResult")
    protected BaseResult deleteOrgUnitResult;

    /**
     * Gets the value of the deleteOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getDeleteOrgUnitResult() {
        return deleteOrgUnitResult;
    }

    /**
     * Sets the value of the deleteOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setDeleteOrgUnitResult(BaseResult value) {
        this.deleteOrgUnitResult = value;
    }

}
