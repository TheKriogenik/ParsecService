
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TimeInterval complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TimeInterval"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="START" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="END" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeInterval", propOrder = {
    "start",
    "end"
})
public class TimeInterval
    extends BaseObject
{

    @XmlElement(name = "START", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar start;
    @XmlElement(name = "END", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSTART() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSTART(XMLGregorianCalendar value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEND() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEND(XMLGregorianCalendar value) {
        this.end = value;
    }

}
