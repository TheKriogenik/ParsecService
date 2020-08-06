
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for Identifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://parsec.ru/Parsec3IntergationService}BaseIdentifier"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ACCGROUP_ID" type="{http://microsoft.com/wsdl/types/}guid"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", propOrder = {
    "accgroupid"
})
@XmlSeeAlso({
    IdentifierTemp.class
})
public class Identifier
    extends BaseIdentifier
{

    @XmlElement(name = "ACCGROUP_ID", required = true)
    protected String accgroupid;

    /**
     * Gets the value of the accgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getACCGROUPID() {
        return accgroupid;
    }

    /**
     * Sets the value of the accgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setACCGROUPID(String value) {
        this.accgroupid = value;
    }

}
