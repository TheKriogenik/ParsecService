
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
 *         &lt;element name="GetOrgUnitsHierarhyResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfOrgUnit" minOccurs="0"/&gt;
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
    "getOrgUnitsHierarhyResult"
})
@XmlRootElement(name = "GetOrgUnitsHierarhyResponse")
public class GetOrgUnitsHierarhyResponse {

    @XmlElement(name = "GetOrgUnitsHierarhyResult")
    protected ArrayOfOrgUnit getOrgUnitsHierarhyResult;

    /**
     * Gets the value of the getOrgUnitsHierarhyResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOrgUnit }
     *     
     */
    public ArrayOfOrgUnit getGetOrgUnitsHierarhyResult() {
        return getOrgUnitsHierarhyResult;
    }

    /**
     * Sets the value of the getOrgUnitsHierarhyResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOrgUnit }
     *     
     */
    public void setGetOrgUnitsHierarhyResult(ArrayOfOrgUnit value) {
        this.getOrgUnitsHierarhyResult = value;
    }

}
