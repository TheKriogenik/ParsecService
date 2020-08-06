
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfPersonExtraFieldTemplate complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfPersonExtraFieldTemplate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PersonExtraFieldTemplate" type="{http://parsec.ru/Parsec3IntergationService}PersonExtraFieldTemplate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPersonExtraFieldTemplate", propOrder = {
    "personExtraFieldTemplate"
})
public class ArrayOfPersonExtraFieldTemplate {

    @XmlElement(name = "PersonExtraFieldTemplate", nillable = true)
    protected List<PersonExtraFieldTemplate> personExtraFieldTemplate;

    /**
     * Gets the value of the personExtraFieldTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personExtraFieldTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonExtraFieldTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonExtraFieldTemplate }
     * 
     * 
     */
    public List<PersonExtraFieldTemplate> getPersonExtraFieldTemplate() {
        if (personExtraFieldTemplate == null) {
            personExtraFieldTemplate = new ArrayList<PersonExtraFieldTemplate>();
        }
        return this.personExtraFieldTemplate;
    }

}
