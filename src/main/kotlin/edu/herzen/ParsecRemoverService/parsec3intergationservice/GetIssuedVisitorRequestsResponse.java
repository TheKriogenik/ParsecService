
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
 *         &lt;element name="GetIssuedVisitorRequestsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfVisitorRequest" minOccurs="0"/&gt;
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
    "getIssuedVisitorRequestsResult"
})
@XmlRootElement(name = "GetIssuedVisitorRequestsResponse")
public class GetIssuedVisitorRequestsResponse {

    @XmlElement(name = "GetIssuedVisitorRequestsResult")
    protected ArrayOfVisitorRequest getIssuedVisitorRequestsResult;

    /**
     * Gets the value of the getIssuedVisitorRequestsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public ArrayOfVisitorRequest getGetIssuedVisitorRequestsResult() {
        return getIssuedVisitorRequestsResult;
    }

    /**
     * Sets the value of the getIssuedVisitorRequestsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVisitorRequest }
     *     
     */
    public void setGetIssuedVisitorRequestsResult(ArrayOfVisitorRequest value) {
        this.getIssuedVisitorRequestsResult = value;
    }

}
