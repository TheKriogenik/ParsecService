
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
 *         &lt;element name="GetOrgUnitSubItemsHierarhyWithPersonsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/&gt;
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
    "getOrgUnitSubItemsHierarhyWithPersonsResult"
})
@XmlRootElement(name = "GetOrgUnitSubItemsHierarhyWithPersonsResponse")
public class GetOrgUnitSubItemsHierarhyWithPersonsResponse {

    @XmlElement(name = "GetOrgUnitSubItemsHierarhyWithPersonsResult")
    protected ArrayOfBaseObject getOrgUnitSubItemsHierarhyWithPersonsResult;

    /**
     * Gets the value of the getOrgUnitSubItemsHierarhyWithPersonsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitSubItemsHierarhyWithPersonsResult() {
        return getOrgUnitSubItemsHierarhyWithPersonsResult;
    }

    /**
     * Sets the value of the getOrgUnitSubItemsHierarhyWithPersonsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitSubItemsHierarhyWithPersonsResult(ArrayOfBaseObject value) {
        this.getOrgUnitSubItemsHierarhyWithPersonsResult = value;
    }

}
