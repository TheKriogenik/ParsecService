
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
 *         &lt;element name="GetEventHistoryResultCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "getEventHistoryResultCountResult"
})
@XmlRootElement(name = "GetEventHistoryResultCountResponse")
public class GetEventHistoryResultCountResponse {

    @XmlElement(name = "GetEventHistoryResultCountResult")
    protected int getEventHistoryResultCountResult;

    /**
     * Gets the value of the getEventHistoryResultCountResult property.
     * 
     */
    public int getGetEventHistoryResultCountResult() {
        return getEventHistoryResultCountResult;
    }

    /**
     * Sets the value of the getEventHistoryResultCountResult property.
     * 
     */
    public void setGetEventHistoryResultCountResult(int value) {
        this.getEventHistoryResultCountResult = value;
    }

}
