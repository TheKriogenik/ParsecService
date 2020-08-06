
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
 *         &lt;element name="SaveOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "saveOrgUnitResult"
})
@XmlRootElement(name = "SaveOrgUnitResponse")
public class SaveOrgUnitResponse {

    @XmlElement(name = "SaveOrgUnitResult")
    protected BaseResult saveOrgUnitResult;

    /**
     * Gets the value of the saveOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getSaveOrgUnitResult() {
        return saveOrgUnitResult;
    }

    /**
     * Sets the value of the saveOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setSaveOrgUnitResult(BaseResult value) {
        this.saveOrgUnitResult = value;
    }

}
