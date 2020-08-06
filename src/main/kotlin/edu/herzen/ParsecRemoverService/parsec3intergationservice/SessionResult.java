
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SessionResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SessionResult"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseResult"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Value" type="{http://parsec.ru/Parsec3IntergationService}Session" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SessionResult", propOrder = {
    "value"
})
public class SessionResult
    extends BaseResult
{

    @XmlElement(name = "Value")
    protected Session value;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setValue(Session value) {
        this.value = value;
    }

}
