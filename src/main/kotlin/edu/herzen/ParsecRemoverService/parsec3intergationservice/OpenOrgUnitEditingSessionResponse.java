
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
 *         &lt;element name="OpenOrgUnitEditingSessionResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/&gt;
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
    "openOrgUnitEditingSessionResult"
})
@XmlRootElement(name = "OpenOrgUnitEditingSessionResponse")
public class OpenOrgUnitEditingSessionResponse {

    @XmlElement(name = "OpenOrgUnitEditingSessionResult")
    protected GuidResult openOrgUnitEditingSessionResult;

    /**
     * Gets the value of the openOrgUnitEditingSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getOpenOrgUnitEditingSessionResult() {
        return openOrgUnitEditingSessionResult;
    }

    /**
     * Sets the value of the openOrgUnitEditingSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setOpenOrgUnitEditingSessionResult(GuidResult value) {
        this.openOrgUnitEditingSessionResult = value;
    }

}
