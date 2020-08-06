
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
 *         &lt;element name="FindPeopleResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPerson" minOccurs="0"/&gt;
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
    "findPeopleResult"
})
@XmlRootElement(name = "FindPeopleResponse")
public class FindPeopleResponse {

    @XmlElement(name = "FindPeopleResult")
    protected ArrayOfPerson findPeopleResult;

    /**
     * Gets the value of the findPeopleResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getFindPeopleResult() {
        return findPeopleResult;
    }

    /**
     * Sets the value of the findPeopleResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setFindPeopleResult(ArrayOfPerson value) {
        this.findPeopleResult = value;
    }

}
