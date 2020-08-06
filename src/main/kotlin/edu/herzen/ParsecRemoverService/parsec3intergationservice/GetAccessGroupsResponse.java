
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
 *         &lt;element name="GetAccessGroupsResult" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfAccessGroup" minOccurs="0"/&gt;
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
    "getAccessGroupsResult"
})
@XmlRootElement(name = "GetAccessGroupsResponse")
public class GetAccessGroupsResponse {

    @XmlElement(name = "GetAccessGroupsResult")
    protected ArrayOfAccessGroup getAccessGroupsResult;

    /**
     * Gets the value of the getAccessGroupsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAccessGroup }
     *     
     */
    public ArrayOfAccessGroup getGetAccessGroupsResult() {
        return getAccessGroupsResult;
    }

    /**
     * Sets the value of the getAccessGroupsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAccessGroup }
     *     
     */
    public void setGetAccessGroupsResult(ArrayOfAccessGroup value) {
        this.getAccessGroupsResult = value;
    }

}
