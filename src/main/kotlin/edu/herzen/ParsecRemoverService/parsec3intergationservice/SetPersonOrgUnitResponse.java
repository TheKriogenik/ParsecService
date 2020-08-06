
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
 *         &lt;element name="SetPersonOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}BaseResult" minOccurs="0"/&gt;
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
    "setPersonOrgUnitResult"
})
@XmlRootElement(name = "SetPersonOrgUnitResponse")
public class SetPersonOrgUnitResponse {

    @XmlElement(name = "SetPersonOrgUnitResult")
    protected BaseResult setPersonOrgUnitResult;

    /**
     * Gets the value of the setPersonOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link BaseResult }
     *     
     */
    public BaseResult getSetPersonOrgUnitResult() {
        return setPersonOrgUnitResult;
    }

    /**
     * Sets the value of the setPersonOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseResult }
     *     
     */
    public void setSetPersonOrgUnitResult(BaseResult value) {
        this.setPersonOrgUnitResult = value;
    }

}
