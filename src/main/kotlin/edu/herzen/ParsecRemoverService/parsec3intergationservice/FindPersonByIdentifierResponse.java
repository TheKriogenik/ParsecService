
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
 *         &lt;element name="FindPersonByIdentifierResult" type="{http://parsec.ru/Parsec3IntergationService}Person" minOccurs="0"/&gt;
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
    "findPersonByIdentifierResult"
})
@XmlRootElement(name = "FindPersonByIdentifierResponse")
public class FindPersonByIdentifierResponse {

    @XmlElement(name = "FindPersonByIdentifierResult")
    protected Person findPersonByIdentifierResult;

    /**
     * Gets the value of the findPersonByIdentifierResult property.
     * 
     * @return
     *     possible object is
     *     {@link Person }
     *     
     */
    public Person getFindPersonByIdentifierResult() {
        return findPersonByIdentifierResult;
    }

    /**
     * Sets the value of the findPersonByIdentifierResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Person }
     *     
     */
    public void setFindPersonByIdentifierResult(Person value) {
        this.findPersonByIdentifierResult = value;
    }

}
