//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.01.03 at 12:38:54 PM UTC 
//


package nl.chb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}ID"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}validfrom"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacecode"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacetype"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacename"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacestatusdata"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}mutationdate"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}quays" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}uiccode" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}internalname" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacelocation" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacemunicipality" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceowner" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacevisualaccessibility" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacedisabledaccessibility" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceaccessibilityadaptions" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacefacilities" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplaceremarks" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}stopplacephotos" minOccurs="0"/&gt;
 *         &lt;element ref="{http://bison.connekt.nl/tmi8/chb/msg}iconuri" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="placecode" type="{http://bison.connekt.nl/tmi8/chb/msg}placecodeassignment" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "validfrom",
    "stopplacecode",
    "stopplacetype",
    "stopplacename",
    "stopplacestatusdata",
    "mutationdate",
    "quays",
    "uiccode",
    "internalname",
    "stopplacelocation",
    "stopplacemunicipality",
    "stopplaceowner",
    "stopplacevisualaccessibility",
    "stopplacedisabledaccessibility",
    "stopplaceaccessibilityadaptions",
    "stopplacefacilities",
    "stopplaceremarks",
    "stopplacephotos",
    "iconuri"
})
@XmlRootElement(name = "stopplace")
public class Stopplace {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(required = true)
    protected XMLGregorianCalendar validfrom;
    @XmlElement(required = true)
    protected String stopplacecode;
    @XmlElement(required = true)
    protected String stopplacetype;
    @XmlElement(required = true)
    protected Stopplacename stopplacename;
    @XmlElement(required = true)
    protected Stopplacestatusdata stopplacestatusdata;
    @XmlElement(required = true)
    protected XMLGregorianCalendar mutationdate;
    protected Quays quays;
    protected Long uiccode;
    protected String internalname;
    protected Stopplacelocation stopplacelocation;
    protected Stopplacemunicipality stopplacemunicipality;
    protected Stopplaceowner stopplaceowner;
    protected Stopplacevisualaccessibility stopplacevisualaccessibility;
    protected Stopplacedisabledaccessibility stopplacedisabledaccessibility;
    protected Stopplaceaccessibilityadaptions stopplaceaccessibilityadaptions;
    protected Stopplacefacilities stopplacefacilities;
    protected Stopplaceremarks stopplaceremarks;
    protected Stopplacephotos stopplacephotos;
    protected String iconuri;
    @XmlAttribute(name = "placecode")
    protected String placecode;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
     * Gets the value of the stopplacecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplacecode() {
        return stopplacecode;
    }

    /**
     * Sets the value of the stopplacecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplacecode(String value) {
        this.stopplacecode = value;
    }

    /**
     * Gets the value of the stopplacetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStopplacetype() {
        return stopplacetype;
    }

    /**
     * Sets the value of the stopplacetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStopplacetype(String value) {
        this.stopplacetype = value;
    }

    /**
     * Gets the value of the stopplacename property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacename }
     *     
     */
    public Stopplacename getStopplacename() {
        return stopplacename;
    }

    /**
     * Sets the value of the stopplacename property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacename }
     *     
     */
    public void setStopplacename(Stopplacename value) {
        this.stopplacename = value;
    }

    /**
     * Gets the value of the stopplacestatusdata property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacestatusdata }
     *     
     */
    public Stopplacestatusdata getStopplacestatusdata() {
        return stopplacestatusdata;
    }

    /**
     * Sets the value of the stopplacestatusdata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacestatusdata }
     *     
     */
    public void setStopplacestatusdata(Stopplacestatusdata value) {
        this.stopplacestatusdata = value;
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
     * Gets the value of the quays property.
     * 
     * @return
     *     possible object is
     *     {@link Quays }
     *     
     */
    public Quays getQuays() {
        return quays;
    }

    /**
     * Sets the value of the quays property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quays }
     *     
     */
    public void setQuays(Quays value) {
        this.quays = value;
    }

    /**
     * Gets the value of the uiccode property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getUiccode() {
        return uiccode;
    }

    /**
     * Sets the value of the uiccode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setUiccode(Long value) {
        this.uiccode = value;
    }

    /**
     * Gets the value of the internalname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalname() {
        return internalname;
    }

    /**
     * Sets the value of the internalname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalname(String value) {
        this.internalname = value;
    }

    /**
     * Gets the value of the stopplacelocation property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacelocation }
     *     
     */
    public Stopplacelocation getStopplacelocation() {
        return stopplacelocation;
    }

    /**
     * Sets the value of the stopplacelocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacelocation }
     *     
     */
    public void setStopplacelocation(Stopplacelocation value) {
        this.stopplacelocation = value;
    }

    /**
     * Gets the value of the stopplacemunicipality property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacemunicipality }
     *     
     */
    public Stopplacemunicipality getStopplacemunicipality() {
        return stopplacemunicipality;
    }

    /**
     * Sets the value of the stopplacemunicipality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacemunicipality }
     *     
     */
    public void setStopplacemunicipality(Stopplacemunicipality value) {
        this.stopplacemunicipality = value;
    }

    /**
     * Gets the value of the stopplaceowner property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplaceowner }
     *     
     */
    public Stopplaceowner getStopplaceowner() {
        return stopplaceowner;
    }

    /**
     * Sets the value of the stopplaceowner property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplaceowner }
     *     
     */
    public void setStopplaceowner(Stopplaceowner value) {
        this.stopplaceowner = value;
    }

    /**
     * Gets the value of the stopplacevisualaccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacevisualaccessibility }
     *     
     */
    public Stopplacevisualaccessibility getStopplacevisualaccessibility() {
        return stopplacevisualaccessibility;
    }

    /**
     * Sets the value of the stopplacevisualaccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacevisualaccessibility }
     *     
     */
    public void setStopplacevisualaccessibility(Stopplacevisualaccessibility value) {
        this.stopplacevisualaccessibility = value;
    }

    /**
     * Gets the value of the stopplacedisabledaccessibility property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacedisabledaccessibility }
     *     
     */
    public Stopplacedisabledaccessibility getStopplacedisabledaccessibility() {
        return stopplacedisabledaccessibility;
    }

    /**
     * Sets the value of the stopplacedisabledaccessibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacedisabledaccessibility }
     *     
     */
    public void setStopplacedisabledaccessibility(Stopplacedisabledaccessibility value) {
        this.stopplacedisabledaccessibility = value;
    }

    /**
     * Gets the value of the stopplaceaccessibilityadaptions property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplaceaccessibilityadaptions }
     *     
     */
    public Stopplaceaccessibilityadaptions getStopplaceaccessibilityadaptions() {
        return stopplaceaccessibilityadaptions;
    }

    /**
     * Sets the value of the stopplaceaccessibilityadaptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplaceaccessibilityadaptions }
     *     
     */
    public void setStopplaceaccessibilityadaptions(Stopplaceaccessibilityadaptions value) {
        this.stopplaceaccessibilityadaptions = value;
    }

    /**
     * Gets the value of the stopplacefacilities property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacefacilities }
     *     
     */
    public Stopplacefacilities getStopplacefacilities() {
        return stopplacefacilities;
    }

    /**
     * Sets the value of the stopplacefacilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacefacilities }
     *     
     */
    public void setStopplacefacilities(Stopplacefacilities value) {
        this.stopplacefacilities = value;
    }

    /**
     * Gets the value of the stopplaceremarks property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplaceremarks }
     *     
     */
    public Stopplaceremarks getStopplaceremarks() {
        return stopplaceremarks;
    }

    /**
     * Sets the value of the stopplaceremarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplaceremarks }
     *     
     */
    public void setStopplaceremarks(Stopplaceremarks value) {
        this.stopplaceremarks = value;
    }

    /**
     * Gets the value of the stopplacephotos property.
     * 
     * @return
     *     possible object is
     *     {@link Stopplacephotos }
     *     
     */
    public Stopplacephotos getStopplacephotos() {
        return stopplacephotos;
    }

    /**
     * Sets the value of the stopplacephotos property.
     * 
     * @param value
     *     allowed object is
     *     {@link Stopplacephotos }
     *     
     */
    public void setStopplacephotos(Stopplacephotos value) {
        this.stopplacephotos = value;
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

    /**
     * Gets the value of the placecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlacecode() {
        return placecode;
    }

    /**
     * Sets the value of the placecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlacecode(String value) {
        this.placecode = value;
    }

}
