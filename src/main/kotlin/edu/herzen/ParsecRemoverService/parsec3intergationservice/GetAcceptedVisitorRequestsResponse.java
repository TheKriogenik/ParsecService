
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
 *         &lt;element name="GetAcceptedVisitorRequestsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfVisitorRequest" minOccurs="0"/&gt;
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
    "getAcceptedVisitorRequestsResult"
})
@XmlRootElement(name = "GetAcceptedVisitorRequestsResponse")
public class GetAcceptedVisitorRequestsResponse {

    @XmlElement(name = "GetAcceptedVisitorRequestsResult")
    protected ArrayOfVisitorRequest getAcceptedVisitorRequestsResult;

    /**
     * Gets the value of the getAcceptedVisitorRequestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public ArrayOfVisitorRequest getGetAcceptedVisitorRequestsResult() {
        return getAcceptedVisitorRequestsResult;
    }

    /**
     * Sets the value of the getAcceptedVisitorRequestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public void setGetAcceptedVisitorRequestsResult(ArrayOfVisitorRequest value) {
        this.getAcceptedVisitorRequestsResult = value;
    }

}
