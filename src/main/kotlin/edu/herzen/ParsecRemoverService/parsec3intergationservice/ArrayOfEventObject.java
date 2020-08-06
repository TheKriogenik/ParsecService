
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfEventObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfEventObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventObject" type="{http://parsec.ru/Parsec3IntergationService}EventObject" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfEventObject", propOrder = {
    "eventObject"
})
public class ArrayOfEventObject {

    @XmlElement(name = "EventObject", nillable = true)
    protected List<EventObject> eventObject;

    /**
     * Gets the value of the eventObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eventObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEventObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EventObject }
     * 
     * 
     */
    public List<EventObject> getEventObject() {
        if (eventObject == null) {
            eventObject = new ArrayList<EventObject>();
        }
        return this.eventObject;
    }

}
