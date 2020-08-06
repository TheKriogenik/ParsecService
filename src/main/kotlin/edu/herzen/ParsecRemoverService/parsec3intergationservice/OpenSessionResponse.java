
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
 *         &lt;element name="OpenSessionResult" type="{http://parsec.ru/Parsec3IntergationService}SessionResult" minOccurs="0"/&gt;
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
    "openSessionResult"
})
@XmlRootElement(name = "OpenSessionResponse")
public class OpenSessionResponse {

    @XmlElement(name = "OpenSessionResult")
    protected SessionResult openSessionResult;

    /**
     * Gets the value of the openSessionResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResult }
     *     
     */
    public SessionResult getOpenSessionResult() {
        return openSessionResult;
    }

    /**
     * Sets the value of the openSessionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResult }
     *     
     */
    public void setOpenSessionResult(SessionResult value) {
        this.openSessionResult = value;
    }

}
