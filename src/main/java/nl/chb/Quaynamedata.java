//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.03 at 12:38:54 PM UTC 
//


package nl.chb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}quayname"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopsidecode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}iconuri" minOccurs="0"/&gt;
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
    "quayname",
    "mutationdate",
    "stopsidecode",
    "iconuri"
})
@XmlRootElement(name = "quaynamedata")
public class Quaynamedata {

    @XmlElement(required = true)
    protected XMLGregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String quayname;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;
    protected String stopsidecode;
    protected String iconuri;

    /**
     * Gets the value of the validfrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidfrom() {
        return validfrom;
    }

    /**
     * Sets the value of the validfrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidfrom(XMLGregorianCalendar value) {
        this.validfrom = value;
    }

    /**
     * Gets the value of the quayname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuayname() {
        return quayname;
    }

    /**
     * Sets the value of the quayname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuayname(String value) {
        this.quayname = value;
    }

    /**
     * Gets the value of the mutationdate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMutationdate() {
        return mutationdate;
    }

    /**
     * Sets the value of the mutationdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMutationdate(XMLGregorianCalendar value) {
        this.mutationdate = value;
    }

    /**
     * Gets the value of the stopsidecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopsidecode() {
        return stopsidecode;
    }

    /**
     * Sets the value of the stopsidecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopsidecode(String value) {
        this.stopsidecode = value;
    }

    /**
     * Gets the value of the iconuri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIconuri() {
        return iconuri;
    }

    /**
     * Sets the value of the iconuri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIconuri(String value) {
        this.iconuri = value;
    }

}