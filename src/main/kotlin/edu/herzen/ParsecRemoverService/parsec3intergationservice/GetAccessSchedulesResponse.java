
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
 *         &lt;element name="GetAccessSchedulesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfSchedule" minOccurs="0"/&gt;
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
    "getAccessSchedulesResult"
})
@XmlRootElement(name = "GetAccessSchedulesResponse")
public class GetAccessSchedulesResponse {

    @XmlElement(name = "GetAccessSchedulesResult")
    protected ArrayOfSchedule getAccessSchedulesResult;

    /**
     * Gets the value of the getAccessSchedulesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public ArrayOfSchedule getGetAccessSchedulesResult() {
        return getAccessSchedulesResult;
    }

    /**
     * Sets the value of the getAccessSchedulesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSchedule }
     *     
     */
    public void setGetAccessSchedulesResult(ArrayOfSchedule value) {
        this.getAccessSchedulesResult = value;
    }

}
