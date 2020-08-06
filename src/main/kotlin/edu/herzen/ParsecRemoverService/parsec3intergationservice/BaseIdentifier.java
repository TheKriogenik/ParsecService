
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for BaseIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CODE" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PERSON_ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *         &lt;element name="IS_PRIMARY" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseIdentifier", propOrder = {
    "code",
    "personid",
    "isprimary"
})
@XmlSeeAlso({
    Identifier.class
})
public class BaseIdentifier
    extends BaseObject
{

    @XmlElement(name = "CODE")
    protected String code;
    @XmlElement(name = "PERSON_ID", required = true)
    protected String personid;
    @XmlElement(name = "IS_PRIMARY")
    protected boolean isprimary;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCODE() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCODE(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the personid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPERSONID() {
        return personid;
    }

    /**
     * Sets the value of the personid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPERSONID(String value) {
        this.personid = value;
    }

    /**
     * Gets the value of the isprimary property.
     * 
     */
    public boolean isISPRIMARY() {
        return isprimary;
    }

    /**
     * Sets the value of the isprimary property.
     * 
     */
    public void setISPRIMARY(boolean value) {
        this.isprimary = value;
    }

}
