//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.25 at 12:04:50 AM MEZ 
//


package ch.ssc.doodler.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExtensionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExtensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="timeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="columnConstraint" type="{http://doodle.com/xsd1}ColumnConstraintType" />
 *       &lt;attribute name="rowConstraint" type="{http://doodle.com/xsd1}RowConstraintType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtensionsType")
public class ExtensionsType {

    @XmlAttribute
    protected Boolean timeZone;
    @XmlAttribute
    protected BigInteger columnConstraint;
    @XmlAttribute
    protected Integer rowConstraint;

    /**
     * Gets the value of the timeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimeZone() {
        return timeZone;
    }

    /**
     * Sets the value of the timeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimeZone(Boolean value) {
        this.timeZone = value;
    }

    /**
     * Gets the value of the columnConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnConstraint() {
        return columnConstraint;
    }

    /**
     * Sets the value of the columnConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnConstraint(BigInteger value) {
        this.columnConstraint = value;
    }

    /**
     * Gets the value of the rowConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRowConstraint() {
        return rowConstraint;
    }

    /**
     * Sets the value of the rowConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRowConstraint(Integer value) {
        this.rowConstraint = value;
    }

}
