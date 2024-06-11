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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceimagedate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceimageurl"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceimagedescription"/&gt;
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
    "stopplaceimagedate",
    "stopplaceimageurl",
    "stopplaceimagedescription",
    "mutationdate"
})
@XmlRootElement(name = "stopplacephotodata")
public class Stopplacephotodata {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime stopplaceimagedate;
    @XmlElement(required = true)
    protected String stopplaceimageurl;
    @XmlElement(required = true)
    protected String stopplaceimagedescription;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime mutationdate;

    /**
     * Gets the value of the stopplaceimagedate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDateTime getStopplaceimagedate() {
        return stopplaceimagedate;
    }

    /**
     * Sets the value of the stopplaceimagedate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplaceimagedate(LocalDateTime value) {
        this.stopplaceimagedate = value;
    }

    /**
     * Gets the value of the stopplaceimageurl property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplaceimageurl() {
        return stopplaceimageurl;
    }

    /**
     * Sets the value of the stopplaceimageurl property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplaceimageurl(String value) {
        this.stopplaceimageurl = value;
    }

    /**
     * Gets the value of the stopplaceimagedescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplaceimagedescription() {
        return stopplaceimagedescription;
    }

    /**
     * Sets the value of the stopplaceimagedescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplaceimagedescription(String value) {
        this.stopplaceimagedescription = value;
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

}
