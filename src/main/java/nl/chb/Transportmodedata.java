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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}transportmode"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
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
    "transportmode",
    "mutationdate"
})
@XmlRootElement(name = "transportmodedata")
public class Transportmodedata {

    @XmlElement(required = true)
    protected GregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String transportmode;
    @XmlElement(required = true)
    protected GregorianCalendar mutationdate;

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
     * Gets the value of the transportmode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransportmode() {
        return transportmode;
    }

    /**
     * Sets the value of the transportmode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransportmode(String value) {
        this.transportmode = value;
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

}
