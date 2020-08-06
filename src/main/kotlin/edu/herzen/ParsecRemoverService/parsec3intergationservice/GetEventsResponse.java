
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
 *         &lt;element name="GetEventsResult" type="{http://parsec.ru/Parsec3IntergationService}EventsHistoryResult" minOccurs="0"/&gt;
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
    "getEventsResult"
})
@XmlRootElement(name = "GetEventsResponse")
public class GetEventsResponse {

    @XmlElement(name = "GetEventsResult")
    protected EventsHistoryResult getEventsResult;

    /**
     * Gets the value of the getEventsResult property.
     * 
     * @return
     *     possible object is
     *     {@link EventsHistoryResult }
     *     
     */
    public EventsHistoryResult getGetEventsResult() {
        return getEventsResult;
    }

    /**
     * Sets the value of the getEventsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventsHistoryResult }
     *     
     */
    public void setGetEventsResult(EventsHistoryResult value) {
        this.getEventsResult = value;
    }

}
