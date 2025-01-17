//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.02.13 at 04:42:13 PM CET 
//


package nl.chb;

import java.time.LocalDateTime;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import nl.chb.binding.LocalDateTimeXmlAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}validfrom"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}rd-x"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}rd-y"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}town"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}level"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}rd-z" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}street" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}location" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "validfrom",
    "rdX",
    "rdY",
    "town",
    "level",
    "mutationdate",
    "rdZ",
    "street",
    "location"
})
@XmlRootElement(name = "quaylocationdata")
public class Quaylocationdata {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime validfrom;
    @XmlElement(name = "rd-x")
    protected int rdX;
    @XmlElement(name = "rd-y")
    protected int rdY;
    @XmlElement(required = true)
    protected String town;
    @XmlElement(required = true)
    protected String level;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime mutationdate;
    @XmlElement(name = "rd-z")
    protected Integer rdZ;
    protected String street;
    protected String location;

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidfrom(LocalDateTime value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the rdX property.
     * 
     */
    public int getRdX() {
        return rdX;
    }

    /**
     * Sets the value of the rdX property.
     * 
     */
    public void setRdX(int value) {
        this.rdX = value;
    }

    /**
     * Gets the value of the rdY property.
     * 
     */
    public int getRdY() {
        return rdY;
    }

    /**
     * Sets the value of the rdY property.
     * 
     */
    public void setRdY(int value) {
        this.rdY = value;
    }

    /**
     * Gets the value of the town property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Sets the value of the town property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLevel(String value) {
        this.level = value;
    }

    /**
     * Gets the value of the mutationdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getMutationdate() {
        return mutationdate;
    }

    /**
     * Sets the value of the mutationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMutationdate(LocalDateTime value) {
        this.mutationdate = value;
    }

    /**
     * Gets the value of the rdZ property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRdZ() {
        return rdZ;
    }

    /**
     * Sets the value of the rdZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRdZ(Integer value) {
        this.rdZ = value;
    }

    /**
     * Gets the value of the street property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the value of the street property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

}
