
package edu.herzen.ParsecRemoverService.parsec3intergationservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XmlTypeCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="XmlTypeCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="None"/&gt;
 *     &lt;enumeration value="Item"/&gt;
 *     &lt;enumeration value="Node"/&gt;
 *     &lt;enumeration value="Document"/&gt;
 *     &lt;enumeration value="Element"/&gt;
 *     &lt;enumeration value="Attribute"/&gt;
 *     &lt;enumeration value="Namespace"/&gt;
 *     &lt;enumeration value="ProcessingInstruction"/&gt;
 *     &lt;enumeration value="Comment"/&gt;
 *     &lt;enumeration value="Text"/&gt;
 *     &lt;enumeration value="AnyAtomicType"/&gt;
 *     &lt;enumeration value="UntypedAtomic"/&gt;
 *     &lt;enumeration value="String"/&gt;
 *     &lt;enumeration value="Boolean"/&gt;
 *     &lt;enumeration value="Decimal"/&gt;
 *     &lt;enumeration value="Float"/&gt;
 *     &lt;enumeration value="Double"/&gt;
 *     &lt;enumeration value="Duration"/&gt;
 *     &lt;enumeration value="DateTime"/&gt;
 *     &lt;enumeration value="Time"/&gt;
 *     &lt;enumeration value="Date"/&gt;
 *     &lt;enumeration value="GYearMonth"/&gt;
 *     &lt;enumeration value="GYear"/&gt;
 *     &lt;enumeration value="GMonthDay"/&gt;
 *     &lt;enumeration value="GDay"/&gt;
 *     &lt;enumeration value="GMonth"/&gt;
 *     &lt;enumeration value="HexBinary"/&gt;
 *     &lt;enumeration value="Base64Binary"/&gt;
 *     &lt;enumeration value="AnyUri"/&gt;
 *     &lt;enumeration value="QName"/&gt;
 *     &lt;enumeration value="Notation"/&gt;
 *     &lt;enumeration value="NormalizedString"/&gt;
 *     &lt;enumeration value="Token"/&gt;
 *     &lt;enumeration value="Language"/&gt;
 *     &lt;enumeration value="NmToken"/&gt;
 *     &lt;enumeration value="Name"/&gt;
 *     &lt;enumeration value="NCName"/&gt;
 *     &lt;enumeration value="Id"/&gt;
 *     &lt;enumeration value="Idref"/&gt;
 *     &lt;enumeration value="Entity"/&gt;
 *     &lt;enumeration value="Integer"/&gt;
 *     &lt;enumeration value="NonPositiveInteger"/&gt;
 *     &lt;enumeration value="NegativeInteger"/&gt;
 *     &lt;enumeration value="Long"/&gt;
 *     &lt;enumeration value="Int"/&gt;
 *     &lt;enumeration value="Short"/&gt;
 *     &lt;enumeration value="Byte"/&gt;
 *     &lt;enumeration value="NonNegativeInteger"/&gt;
 *     &lt;enumeration value="UnsignedLong"/&gt;
 *     &lt;enumeration value="UnsignedInt"/&gt;
 *     &lt;enumeration value="UnsignedShort"/&gt;
 *     &lt;enumeration value="UnsignedByte"/&gt;
 *     &lt;enumeration value="PositiveInteger"/&gt;
 *     &lt;enumeration value="YearMonthDuration"/&gt;
 *     &lt;enumeration value="DayTimeDuration"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "XmlTypeCode")
@XmlEnum
public enum XmlTypeCode {

    @XmlEnumValue("None")
    NONE("None"),
    @XmlEnumValue("Item")
    ITEM("Item"),
    @XmlEnumValue("Node")
    NODE("Node"),
    @XmlEnumValue("Document")
    DOCUMENT("Document"),
    @XmlEnumValue("Element")
    ELEMENT("Element"),
    @XmlEnumValue("Attribute")
    ATTRIBUTE("Attribute"),
    @XmlEnumValue("Namespace")
    NAMESPACE("Namespace"),
    @XmlEnumValue("ProcessingInstruction")
    PROCESSING_INSTRUCTION("ProcessingInstruction"),
    @XmlEnumValue("Comment")
    COMMENT("Comment"),
    @XmlEnumValue("Text")
    TEXT("Text"),
    @XmlEnumValue("AnyAtomicType")
    ANY_ATOMIC_TYPE("AnyAtomicType"),
    @XmlEnumValue("UntypedAtomic")
    UNTYPED_ATOMIC("UntypedAtomic"),
    @XmlEnumValue("String")
    STRING("String"),
    @XmlEnumValue("Boolean")
    BOOLEAN("Boolean"),
    @XmlEnumValue("Decimal")
    DECIMAL("Decimal"),
    @XmlEnumValue("Float")
    FLOAT("Float"),
    @XmlEnumValue("Double")
    DOUBLE("Double"),
    @XmlEnumValue("Duration")
    DURATION("Duration"),
    @XmlEnumValue("DateTime")
    DATE_TIME("DateTime"),
    @XmlEnumValue("Time")
    TIME("Time"),
    @XmlEnumValue("Date")
    DATE("Date"),
    @XmlEnumValue("GYearMonth")
    G_YEAR_MONTH("GYearMonth"),
    @XmlEnumValue("GYear")
    G_YEAR("GYear"),
    @XmlEnumValue("GMonthDay")
    G_MONTH_DAY("GMonthDay"),
    @XmlEnumValue("GDay")
    G_DAY("GDay"),
    @XmlEnumValue("GMonth")
    G_MONTH("GMonth"),
    @XmlEnumValue("HexBinary")
    HEX_BINARY("HexBinary"),
    @XmlEnumValue("Base64Binary")
    BASE_64_BINARY("Base64Binary"),
    @XmlEnumValue("AnyUri")
    ANY_URI("AnyUri"),
    @XmlEnumValue("QName")
    Q_NAME("QName"),
    @XmlEnumValue("Notation")
    NOTATION("Notation"),
    @XmlEnumValue("NormalizedString")
    NORMALIZED_STRING("NormalizedString"),
    @XmlEnumValue("Token")
    TOKEN("Token"),
    @XmlEnumValue("Language")
    LANGUAGE("Language"),
    @XmlEnumValue("NmToken")
    NM_TOKEN("NmToken"),
    @XmlEnumValue("Name")
    NAME("Name"),
    @XmlEnumValue("NCName")
    NC_NAME("NCName"),
    @XmlEnumValue("Id")
    ID("Id"),
    @XmlEnumValue("Idref")
    IDREF("Idref"),
    @XmlEnumValue("Entity")
    ENTITY("Entity"),
    @XmlEnumValue("Integer")
    INTEGER("Integer"),
    @XmlEnumValue("NonPositiveInteger")
    NON_POSITIVE_INTEGER("NonPositiveInteger"),
    @XmlEnumValue("NegativeInteger")
    NEGATIVE_INTEGER("NegativeInteger"),
    @XmlEnumValue("Long")
    LONG("Long"),
    @XmlEnumValue("Int")
    INT("Int"),
    @XmlEnumValue("Short")
    SHORT("Short"),
    @XmlEnumValue("Byte")
    BYTE("Byte"),
    @XmlEnumValue("NonNegativeInteger")
    NON_NEGATIVE_INTEGER("NonNegativeInteger"),
    @XmlEnumValue("UnsignedLong")
    UNSIGNED_LONG("UnsignedLong"),
    @XmlEnumValue("UnsignedInt")
    UNSIGNED_INT("UnsignedInt"),
    @XmlEnumValue("UnsignedShort")
    UNSIGNED_SHORT("UnsignedShort"),
    @XmlEnumValue("UnsignedByte")
    UNSIGNED_BYTE("UnsignedByte"),
    @XmlEnumValue("PositiveInteger")
    POSITIVE_INTEGER("PositiveInteger"),
    @XmlEnumValue("YearMonthDuration")
    YEAR_MONTH_DURATION("YearMonthDuration"),
    @XmlEnumValue("DayTimeDuration")
    DAY_TIME_DURATION("DayTimeDuration");
    private final String value;

    XmlTypeCode(String v) {
        value = v;
    }

    public static XmlTypeCode fromValue(String v) {
        for (XmlTypeCode c: XmlTypeCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

    public String value() {
        return value;
    }

}
