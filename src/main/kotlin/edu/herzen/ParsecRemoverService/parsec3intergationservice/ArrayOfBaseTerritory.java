
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for ArrayOfBaseTerritory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBaseTerritory"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BaseTerritory" type="{http://parsec.ru/Parsec3IntergationService}BaseTerritory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBaseTerritory", propOrder = {
    "baseTerritory"
})
public class ArrayOfBaseTerritory {

    @XmlElement(name = "BaseTerritory", nillable = true)
    protected List<BaseTerritory> baseTerritory;

    /**
     * Gets the value of the baseTerritory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseTerritory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseTerritory }
     * 
     * 
     */
    public List<BaseTerritory> getBaseTerritory() {
        if (baseTerritory == null) {
            baseTerritory = new ArrayList<BaseTerritory>();
        }
        return this.baseTerritory;
    }

}
