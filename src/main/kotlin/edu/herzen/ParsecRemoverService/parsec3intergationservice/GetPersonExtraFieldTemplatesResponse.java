
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
 *         &lt;element name="GetPersonExtraFieldTemplatesResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPersonExtraFieldTemplate" minOccurs="0"/&gt;
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
    "getPersonExtraFieldTemplatesResult"
})
@XmlRootElement(name = "GetPersonExtraFieldTemplatesResponse")
public class GetPersonExtraFieldTemplatesResponse {

    @XmlElement(name = "GetPersonExtraFieldTemplatesResult")
    protected ArrayOfPersonExtraFieldTemplate getPersonExtraFieldTemplatesResult;

    /**
     * Gets the value of the getPersonExtraFieldTemplatesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public ArrayOfPersonExtraFieldTemplate getGetPersonExtraFieldTemplatesResult() {
        return getPersonExtraFieldTemplatesResult;
    }

    /**
     * Sets the value of the getPersonExtraFieldTemplatesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPersonExtraFieldTemplate }
     *     
     */
    public void setGetPersonExtraFieldTemplatesResult(ArrayOfPersonExtraFieldTemplate value) {
        this.getPersonExtraFieldTemplatesResult = value;
    }

}
