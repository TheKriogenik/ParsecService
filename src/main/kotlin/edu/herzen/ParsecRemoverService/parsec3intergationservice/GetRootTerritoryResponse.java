
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
 *         &lt;element name="GetRootTerritoryResult" type="{http://parsec.ru/Parsec3IntergationService}Territory" minOccurs="0"/&gt;
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
    "getRootTerritoryResult"
})
@XmlRootElement(name = "GetRootTerritoryResponse")
public class GetRootTerritoryResponse {

    @XmlElement(name = "GetRootTerritoryResult")
    protected Territory getRootTerritoryResult;

    /**
     * Gets the value of the getRootTerritoryResult property.
     * 
     * @return
     *     possible object is
     *     {@link Territory }
     *     
     */
    public Territory getGetRootTerritoryResult() {
        return getRootTerritoryResult;
    }

    /**
     * Sets the value of the getRootTerritoryResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Territory }
     *     
     */
    public void setGetRootTerritoryResult(Territory value) {
        this.getRootTerritoryResult = value;
    }

}
