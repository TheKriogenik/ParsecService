
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
 *         &lt;element name="GetTerritorySubItemsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfBaseTerritory" minOccurs="0"/&gt;
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
    "getTerritorySubItemsResult"
})
@XmlRootElement(name = "GetTerritorySubItemsResponse")
public class GetTerritorySubItemsResponse {

    @XmlElement(name = "GetTerritorySubItemsResult")
    protected ArrayOfBaseTerritory getTerritorySubItemsResult;

    /**
     * Gets the value of the getTerritorySubItemsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBaseTerritory }
     *     
     */
    public ArrayOfBaseTerritory getGetTerritorySubItemsResult() {
        return getTerritorySubItemsResult;
    }

    /**
     * Sets the value of the getTerritorySubItemsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBaseTerritory }
     *     
     */
    public void setGetTerritorySubItemsResult(ArrayOfBaseTerritory value) {
        this.getTerritorySubItemsResult = value;
    }

}
