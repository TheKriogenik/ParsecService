
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
 *         &lt;element name="GetOrgUnitsHierarhyWithVisitorsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/&gt;
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
    "getOrgUnitsHierarhyWithVisitorsResult"
})
@XmlRootElement(name = "GetOrgUnitsHierarhyWithVisitorsResponse")
public class GetOrgUnitsHierarhyWithVisitorsResponse {

    @XmlElement(name = "GetOrgUnitsHierarhyWithVisitorsResult")
    protected ArrayOfBaseObject getOrgUnitsHierarhyWithVisitorsResult;

    /**
     * Gets the value of the getOrgUnitsHierarhyWithVisitorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitsHierarhyWithVisitorsResult() {
        return getOrgUnitsHierarhyWithVisitorsResult;
    }

    /**
     * Sets the value of the getOrgUnitsHierarhyWithVisitorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitsHierarhyWithVisitorsResult(ArrayOfBaseObject value) {
        this.getOrgUnitsHierarhyWithVisitorsResult = value;
    }

}
