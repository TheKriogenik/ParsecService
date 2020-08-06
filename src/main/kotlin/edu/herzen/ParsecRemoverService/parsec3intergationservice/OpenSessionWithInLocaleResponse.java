
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
 *         &lt;element name="OpenSessionWithInLocaleResult" type="{http://parsec.ru/Parsec3IntergationService}SessionResult" minOccurs="0"/&gt;
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
    "openSessionWithInLocaleResult"
})
@XmlRootElement(name = "OpenSessionWithInLocaleResponse")
public class OpenSessionWithInLocaleResponse {

    @XmlElement(name = "OpenSessionWithInLocaleResult")
    protected SessionResult openSessionWithInLocaleResult;

    /**
     * Gets the value of the openSessionWithInLocaleResult property.
     * 
     * @return
     *     possible object is
     *     {@link SessionResult }
     *     
     */
    public SessionResult getOpenSessionWithInLocaleResult() {
        return openSessionWithInLocaleResult;
    }

    /**
     * Sets the value of the openSessionWithInLocaleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionResult }
     *     
     */
    public void setOpenSessionWithInLocaleResult(SessionResult value) {
        this.openSessionWithInLocaleResult = value;
    }

}
