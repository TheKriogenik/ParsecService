
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
 *         &lt;element name="GetOrgUnitSubItemsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseObject" minOccurs="0"/&gt;
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
    "getOrgUnitSubItemsResult"
})
@XmlRootElement(name = "GetOrgUnitSubItemsResponse")
public class GetOrgUnitSubItemsResponse {

    @XmlElement(name = "GetOrgUnitSubItemsResult")
    protected ArrayOfBaseObject getOrgUnitSubItemsResult;

    /**
     * Gets the value of the getOrgUnitSubItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public ArrayOfBaseObject getGetOrgUnitSubItemsResult() {
        return getOrgUnitSubItemsResult;
    }

    /**
     * Sets the value of the getOrgUnitSubItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseObject }
     *     
     */
    public void setGetOrgUnitSubItemsResult(ArrayOfBaseObject value) {
        this.getOrgUnitSubItemsResult = value;
    }

}
