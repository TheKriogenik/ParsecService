
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
 *         &lt;element name="GetScheduleIntervalsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfTimeInterval" minOccurs="0"/&gt;
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
    "getScheduleIntervalsResult"
})
@XmlRootElement(name = "GetScheduleIntervalsResponse")
public class GetScheduleIntervalsResponse {

    @XmlElement(name = "GetScheduleIntervalsResult")
    protected ArrayOfTimeInterval getScheduleIntervalsResult;

    /**
     * Gets the value of the getScheduleIntervalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTimeInterval }
     *     
     */
    public ArrayOfTimeInterval getGetScheduleIntervalsResult() {
        return getScheduleIntervalsResult;
    }

    /**
     * Sets the value of the getScheduleIntervalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTimeInterval }
     *     
     */
    public void setGetScheduleIntervalsResult(ArrayOfTimeInterval value) {
        this.getScheduleIntervalsResult = value;
    }

}
