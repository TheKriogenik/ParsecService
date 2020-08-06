
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
 *         &lt;element name="CreateVisitorRequestResult" type="{http://parsec.ru/Parsec3IntergationService}VisitorRequest" minOccurs="0"/&gt;
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
    "createVisitorRequestResult"
})
@XmlRootElement(name = "CreateVisitorRequestResponse")
public class CreateVisitorRequestResponse {

    @XmlElement(name = "CreateVisitorRequestResult")
    protected VisitorRequest createVisitorRequestResult;

    /**
     * Gets the value of the createVisitorRequestResult property.
     * 
     * @return
     *     possible object is
     *     {@link VisitorRequest }
     *     
     */
    public VisitorRequest getCreateVisitorRequestResult() {
        return createVisitorRequestResult;
    }

    /**
     * Sets the value of the createVisitorRequestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VisitorRequest }
     *     
     */
    public void setCreateVisitorRequestResult(VisitorRequest value) {
        this.createVisitorRequestResult = value;
    }

}
