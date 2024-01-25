//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.03 at 12:38:54 PM UTC 
//


package nl.chb;

import java.util.GregorianCalendar;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}publicname"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}town"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}publicnamemedium" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}publicnamelong" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}description" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceindication" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}street" minOccurs="0"/&gt;
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
    "publicname",
    "town",
    "mutationdate",
    "publicnamemedium",
    "publicnamelong",
    "description",
    "stopplaceindication",
    "street"
})
@XmlRootElement(name = "stopplacename")
public class Stopplacename {

    @XmlElement(required = true)
    protected GregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String publicname;
    @XmlElement(required = true)
    protected String town;
    @XmlElement(required = true)
    protected GregorianCalendar mutationdate;
    protected String publicnamemedium;
    protected String publicnamelong;
    protected String description;
    protected String stopplaceindication;
    protected String street;

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link GregorianCalendar }
     *     
     */
    public GregorianCalendar getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link GregorianCalendar }
     *     
     */
    public void setValidfrom(GregorianCalendar value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the publicname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicname() {
        return publicname;
    }

    /**
     * Sets the value of the publicname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicname(String value) {
        this.publicname = value;
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
     * Gets the value of the mutationdate property.
     * 
     * @return
     *     possible object is
     *     {@link GregorianCalendar }
     *     
     */
    public GregorianCalendar getMutationdate() {
        return mutationdate;
    }

    /**
     * Sets the value of the mutationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link GregorianCalendar }
     *     
     */
    public void setMutationdate(GregorianCalendar value) {
        this.mutationdate = value;
    }

    /**
     * Gets the value of the publicnamemedium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicnamemedium() {
        return publicnamemedium;
    }

    /**
     * Sets the value of the publicnamemedium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicnamemedium(String value) {
        this.publicnamemedium = value;
    }

    /**
     * Gets the value of the publicnamelong property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicnamelong() {
        return publicnamelong;
    }

    /**
     * Sets the value of the publicnamelong property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicnamelong(String value) {
        this.publicnamelong = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the stopplaceindication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplaceindication() {
        return stopplaceindication;
    }

    /**
     * Sets the value of the stopplaceindication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplaceindication(String value) {
        this.stopplaceindication = value;
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

}
