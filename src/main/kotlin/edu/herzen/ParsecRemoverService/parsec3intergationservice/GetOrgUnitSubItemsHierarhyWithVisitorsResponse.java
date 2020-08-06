
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
 *         &lt;element name="GetOrgUnitSubItemsHierarhyWithVisitorsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/&gt;
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
    "getOrgUnitSubItemsHierarhyWithVisitorsResult"
})
@XmlRootElement(name = "GetOrgUnitSubItemsHierarhyWithVisitorsResponse")
public class GetOrgUnitSubItemsHierarhyWithVisitorsResponse {

    @XmlElement(name = "GetOrgUnitSubItemsHierarhyWithVisitorsResult")
    protected ArrayOfBaseObject getOrgUnitSubItemsHierarhyWithVisitorsResult;

    /**
     * Gets the value of the getOrgUnitSubItemsHierarhyWithVisitorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitSubItemsHierarhyWithVisitorsResult() {
        return getOrgUnitSubItemsHierarhyWithVisitorsResult;
    }

    /**
     * Sets the value of the getOrgUnitSubItemsHierarhyWithVisitorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitSubItemsHierarhyWithVisitorsResult(ArrayOfBaseObject value) {
        this.getOrgUnitSubItemsHierarhyWithVisitorsResult = value;
    }

}
