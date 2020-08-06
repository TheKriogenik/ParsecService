
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
 *         &lt;element name="personEditSessionID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="photoByteArray" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
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
    "personEditSessionID",
    "photoByteArray"
})
@XmlRootElement(name = "SetPersonPhoto")
public class SetPersonPhoto {

    @XmlElement(required = true)
    protected String personEditSessionID;
    protected byte[] photoByteArray;

    /**
     * Gets the value of the personEditSessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonEditSessionID() {
        return personEditSessionID;
    }

    /**
     * Sets the value of the personEditSessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonEditSessionID(String value) {
        this.personEditSessionID = value;
    }

    /**
     * Gets the value of the photoByteArray property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPhotoByteArray() {
        return photoByteArray;
    }

    /**
     * Sets the value of the photoByteArray property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPhotoByteArray(byte[] value) {
        this.photoByteArray = value;
    }

}
