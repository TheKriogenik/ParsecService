
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
 *         &lt;element name="GetPersonExtraFieldValuesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfExtraFieldValue" minOccurs="0"/&gt;
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
    "getPersonExtraFieldValuesResult"
})
@XmlRootElement(name = "GetPersonExtraFieldValuesResponse")
public class GetPersonExtraFieldValuesResponse {

    @XmlElement(name = "GetPersonExtraFieldValuesResult")
    protected ArrayOfExtraFieldValue getPersonExtraFieldValuesResult;

    /**
     * Gets the value of the getPersonExtraFieldValuesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfExtraFieldValue }
     *     
     */
    public ArrayOfExtraFieldValue getGetPersonExtraFieldValuesResult() {
        return getPersonExtraFieldValuesResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldValuesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfExtraFieldValue }
     *     
     */
    public void setGetPersonExtraFieldValuesResult(ArrayOfExtraFieldValue value) {
        this.getPersonExtraFieldValuesResult = value;
    }

}
