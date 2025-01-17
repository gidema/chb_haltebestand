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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopsign"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}audiobutton"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopsigntype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}shelter" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}shelterpublicity" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}illuminatedstop" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}seatavailable" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}leantosupport" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}timetableinformation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}infounit" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}routenetworkmap" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}passengerinformationdisplay" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}passengerinformationdisplaytype" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}bicycleparking" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}numberofbicycleplaces" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}bins" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}ovccico" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}ovccharging" minOccurs="0"/&gt;
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
    "stopsign",
    "audiobutton",
    "mutationdate",
    "stopsigntype",
    "shelter",
    "shelterpublicity",
    "illuminatedstop",
    "seatavailable",
    "leantosupport",
    "timetableinformation",
    "infounit",
    "routenetworkmap",
    "passengerinformationdisplay",
    "passengerinformationdisplaytype",
    "bicycleparking",
    "numberofbicycleplaces",
    "bins",
    "ovccico",
    "ovccharging"
})
@XmlRootElement(name = "quayfacilities")
public class Quayfacilities {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime validfrom;
    protected boolean stopsign;
    protected boolean audiobutton;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(LocalDateTimeXmlAdapter.class)
    protected LocalDateTime mutationdate;
    protected String stopsigntype;
    protected Boolean shelter;
    protected Boolean shelterpublicity;
    protected Boolean illuminatedstop;
    protected Boolean seatavailable;
    protected Boolean leantosupport;
    protected Boolean timetableinformation;
    protected Boolean infounit;
    protected Boolean routenetworkmap;
    protected Boolean passengerinformationdisplay;
    protected String passengerinformationdisplaytype;
    protected Boolean bicycleparking;
    protected Integer numberofbicycleplaces;
    protected Boolean bins;
    protected Boolean ovccico;
    protected Boolean ovccharging;

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
     * Gets the value of the stopsign property.
     * 
     */
    public boolean isStopsign() {
        return stopsign;
    }

    /**
     * Sets the value of the stopsign property.
     * 
     */
    public void setStopsign(boolean value) {
        this.stopsign = value;
    }

    /**
     * Gets the value of the audiobutton property.
     * 
     */
    public boolean isAudiobutton() {
        return audiobutton;
    }

    /**
     * Sets the value of the audiobutton property.
     * 
     */
    public void setAudiobutton(boolean value) {
        this.audiobutton = value;
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
     * Gets the value of the stopsigntype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopsigntype() {
        return stopsigntype;
    }

    /**
     * Sets the value of the stopsigntype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopsigntype(String value) {
        this.stopsigntype = value;
    }

    /**
     * Gets the value of the shelter property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShelter() {
        return shelter;
    }

    /**
     * Sets the value of the shelter property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShelter(Boolean value) {
        this.shelter = value;
    }

    /**
     * Gets the value of the shelterpublicity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isShelterpublicity() {
        return shelterpublicity;
    }

    /**
     * Sets the value of the shelterpublicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setShelterpublicity(Boolean value) {
        this.shelterpublicity = value;
    }

    /**
     * Gets the value of the illuminatedstop property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIlluminatedstop() {
        return illuminatedstop;
    }

    /**
     * Sets the value of the illuminatedstop property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIlluminatedstop(Boolean value) {
        this.illuminatedstop = value;
    }

    /**
     * Gets the value of the seatavailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSeatavailable() {
        return seatavailable;
    }

    /**
     * Sets the value of the seatavailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSeatavailable(Boolean value) {
        this.seatavailable = value;
    }

    /**
     * Gets the value of the leantosupport property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLeantosupport() {
        return leantosupport;
    }

    /**
     * Sets the value of the leantosupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLeantosupport(Boolean value) {
        this.leantosupport = value;
    }

    /**
     * Gets the value of the timetableinformation property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTimetableinformation() {
        return timetableinformation;
    }

    /**
     * Sets the value of the timetableinformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTimetableinformation(Boolean value) {
        this.timetableinformation = value;
    }

    /**
     * Gets the value of the infounit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isInfounit() {
        return infounit;
    }

    /**
     * Sets the value of the infounit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setInfounit(Boolean value) {
        this.infounit = value;
    }

    /**
     * Gets the value of the routenetworkmap property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRoutenetworkmap() {
        return routenetworkmap;
    }

    /**
     * Sets the value of the routenetworkmap property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRoutenetworkmap(Boolean value) {
        this.routenetworkmap = value;
    }

    /**
     * Gets the value of the passengerinformationdisplay property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassengerinformationdisplay() {
        return passengerinformationdisplay;
    }

    /**
     * Sets the value of the passengerinformationdisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassengerinformationdisplay(Boolean value) {
        this.passengerinformationdisplay = value;
    }

    /**
     * Gets the value of the passengerinformationdisplaytype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerinformationdisplaytype() {
        return passengerinformationdisplaytype;
    }

    /**
     * Sets the value of the passengerinformationdisplaytype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerinformationdisplaytype(String value) {
        this.passengerinformationdisplaytype = value;
    }

    /**
     * Gets the value of the bicycleparking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBicycleparking() {
        return bicycleparking;
    }

    /**
     * Sets the value of the bicycleparking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBicycleparking(Boolean value) {
        this.bicycleparking = value;
    }

    /**
     * Gets the value of the numberofbicycleplaces property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumberofbicycleplaces() {
        return numberofbicycleplaces;
    }

    /**
     * Sets the value of the numberofbicycleplaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumberofbicycleplaces(Integer value) {
        this.numberofbicycleplaces = value;
    }

    /**
     * Gets the value of the bins property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBins() {
        return bins;
    }

    /**
     * Sets the value of the bins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBins(Boolean value) {
        this.bins = value;
    }

    /**
     * Gets the value of the ovccico property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvccico() {
        return ovccico;
    }

    /**
     * Sets the value of the ovccico property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvccico(Boolean value) {
        this.ovccico = value;
    }

    /**
     * Gets the value of the ovccharging property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOvccharging() {
        return ovccharging;
    }

    /**
     * Sets the value of the ovccharging property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOvccharging(Boolean value) {
        this.ovccharging = value;
    }

}
