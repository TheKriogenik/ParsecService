
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
 *         &lt;element name="GetOrgUnitResult" type="{http://parsec.ru/Parsec3IntergationService}OrgUnit" minOccurs="0"/&gt;
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
    "getOrgUnitResult"
})
@XmlRootElement(name = "GetOrgUnitResponse")
public class GetOrgUnitResponse {

    @XmlElement(name = "GetOrgUnitResult")
    protected OrgUnit getOrgUnitResult;

    /**
     * Gets the value of the getOrgUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link OrgUnit }
     *     
     */
    public OrgUnit getGetOrgUnitResult() {
        return getOrgUnitResult;
    }

    /**
     * Sets the value of the getOrgUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrgUnit }
     *     
     */
    public void setGetOrgUnitResult(OrgUnit value) {
        this.getOrgUnitResult = value;
    }

}
