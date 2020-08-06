
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
 *         &lt;element name="GetPersonExtraFieldValueResult" type="{http://parsec.ru/Parsec3IntergationService}ObjectResult" minOccurs="0"/&gt;
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
    "getPersonExtraFieldValueResult"
})
@XmlRootElement(name = "GetPersonExtraFieldValueResponse")
public class GetPersonExtraFieldValueResponse {

    @XmlElement(name = "GetPersonExtraFieldValueResult")
    protected ObjectResult getPersonExtraFieldValueResult;

    /**
     * Gets the value of the getPersonExtraFieldValueResult property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectResult }
     *     
     */
    public ObjectResult getGetPersonExtraFieldValueResult() {
        return getPersonExtraFieldValueResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldValueResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectResult }
     *     
     */
    public void setGetPersonExtraFieldValueResult(ObjectResult value) {
        this.getPersonExtraFieldValueResult = value;
    }

}
