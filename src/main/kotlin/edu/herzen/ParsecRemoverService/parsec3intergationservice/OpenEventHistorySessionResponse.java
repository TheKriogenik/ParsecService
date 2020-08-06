
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
 *         &lt;element name="OpenEventHistorySessionResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/&gt;
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
    "openEventHistorySessionResult"
})
@XmlRootElement(name = "OpenEventHistorySessionResponse")
public class OpenEventHistorySessionResponse {

    @XmlElement(name = "OpenEventHistorySessionResult")
    protected GuidResult openEventHistorySessionResult;

    /**
     * Gets the value of the openEventHistorySessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getOpenEventHistorySessionResult() {
        return openEventHistorySessionResult;
    }

    /**
     * Sets the value of the openEventHistorySessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setOpenEventHistorySessionResult(GuidResult value) {
        this.openEventHistorySessionResult = value;
    }

}
