
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
 *         &lt;element name="FindVisitorsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfPerson" minOccurs="0"/&gt;
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
    "findVisitorsResult"
})
@XmlRootElement(name = "FindVisitorsResponse")
public class FindVisitorsResponse {

    @XmlElement(name = "FindVisitorsResult")
    protected ArrayOfPerson findVisitorsResult;

    /**
     * Gets the value of the findVisitorsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfPerson }
     *     
     */
    public ArrayOfPerson getFindVisitorsResult() {
        return findVisitorsResult;
    }

    /**
     * Sets the value of the findVisitorsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfPerson }
     *     
     */
    public void setFindVisitorsResult(ArrayOfPerson value) {
        this.findVisitorsResult = value;
    }

}
