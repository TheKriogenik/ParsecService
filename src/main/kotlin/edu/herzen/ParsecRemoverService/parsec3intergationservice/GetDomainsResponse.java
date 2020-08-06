
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
 *         &lt;element name="GetDomainsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfDomain" minOccurs="0"/&gt;
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
    "getDomainsResult"
})
@XmlRootElement(name = "GetDomainsResponse")
public class GetDomainsResponse {

    @XmlElement(name = "GetDomainsResult")
    protected ArrayOfDomain getDomainsResult;

    /**
     * Gets the value of the getDomainsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDomain }
     *     
     */
    public ArrayOfDomain getGetDomainsResult() {
        return getDomainsResult;
    }

    /**
     * Sets the value of the getDomainsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDomain }
     *     
     */
    public void setGetDomainsResult(ArrayOfDomain value) {
        this.getDomainsResult = value;
    }

}
