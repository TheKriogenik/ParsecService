
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
 *         &lt;element name="CreateTempAccessGroupResult" type="{http://parsec.ru/Parsec3IntergationService}GuidResult" minOccurs="0"/&gt;
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
    "createTempAccessGroupResult"
})
@XmlRootElement(name = "CreateTempAccessGroupResponse")
public class CreateTempAccessGroupResponse {

    @XmlElement(name = "CreateTempAccessGroupResult")
    protected GuidResult createTempAccessGroupResult;

    /**
     * Gets the value of the createTempAccessGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link GuidResult }
     *     
     */
    public GuidResult getCreateTempAccessGroupResult() {
        return createTempAccessGroupResult;
    }

    /**
     * Sets the value of the createTempAccessGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link GuidResult }
     *     
     */
    public void setCreateTempAccessGroupResult(GuidResult value) {
        this.createTempAccessGroupResult = value;
    }

}
