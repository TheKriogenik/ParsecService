
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
 *         &lt;element name="GetEventHistoryResultResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfEventObject" minOccurs="0"/&gt;
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
    "getEventHistoryResultResult"
})
@XmlRootElement(name = "GetEventHistoryResultResponse")
public class GetEventHistoryResultResponse {

    @XmlElement(name = "GetEventHistoryResultResult")
    protected ArrayOfEventObject getEventHistoryResultResult;

    /**
     * Gets the value of the getEventHistoryResultResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfEventObject }
     *     
     */
    public ArrayOfEventObject getGetEventHistoryResultResult() {
        return getEventHistoryResultResult;
    }

    /**
     * Sets the value of the getEventHistoryResultResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfEventObject }
     *     
     */
    public void setGetEventHistoryResultResult(ArrayOfEventObject value) {
        this.getEventHistoryResultResult = value;
    }

}
