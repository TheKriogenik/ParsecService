
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EventObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Values" type="{http://parsec.ru/Parsec3IntergationService}ArrayOfAnyType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventObject", propOrder = {
    "values"
})
public class EventObject
    extends BaseObject
{

    @XmlElement(name = "Values")
    protected ArrayOfAnyType values;

    /**
     * Gets the value of the values property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public ArrayOfAnyType getValues() {
        return values;
    }

    /**
     * Sets the value of the values property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAnyType }
     *     
     */
    public void setValues(ArrayOfAnyType value) {
        this.values = value;
    }

}
