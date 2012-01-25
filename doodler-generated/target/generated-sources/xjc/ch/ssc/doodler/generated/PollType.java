//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.01.24 at 11:58:48 PM MEZ 
//


package ch.ssc.doodler.generated;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PollType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PollType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="latestChange" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="type" type="{http://doodle.com/xsd1}PollTypeType" minOccurs="0"/>
 *         &lt;element name="extensions" type="{http://doodle.com/xsd1}ExtensionsType" minOccurs="0"/>
 *         &lt;element name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="writeOnce" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireAddress" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requireEMail" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="requirePhone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="byInvitationOnly" type="{http://doodle.com/xsd1}ByInvitationOnlyType" minOccurs="0"/>
 *         &lt;element name="levels" type="{http://doodle.com/xsd1}LevelsType" minOccurs="0"/>
 *         &lt;element name="state" type="{http://doodle.com/xsd1}StatesType" minOccurs="0"/>
 *         &lt;element name="title" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="initiator" type="{http://doodle.com/xsd1}InitiatorType"/>
 *         &lt;element name="options" type="{http://doodle.com/xsd1}OptionsType"/>
 *         &lt;element name="participants" type="{http://doodle.com/xsd1}ParticipantsType" minOccurs="0"/>
 *         &lt;element name="comments" type="{http://doodle.com/xsd1}CommentsType" minOccurs="0"/>
 *         &lt;element name="mandator" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="features" type="{http://doodle.com/xsd1}FeaturesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PollType", propOrder = {
    "latestChange",
    "type",
    "extensions",
    "hidden",
    "writeOnce",
    "requireAddress",
    "requireEMail",
    "requirePhone",
    "byInvitationOnly",
    "levels",
    "state",
    "title",
    "location",
    "description",
    "initiator",
    "options",
    "participants",
    "comments",
    "mandator",
    "features"
})
public class PollType {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar latestChange;
    protected PollTypeType type;
    protected ExtensionsType extensions;
    protected Boolean hidden;
    protected Boolean writeOnce;
    protected Boolean requireAddress;
    protected Boolean requireEMail;
    protected Boolean requirePhone;
    protected ByInvitationOnlyType byInvitationOnly;
    protected Integer levels;
    protected StatesType state;
    @XmlElement(required = true)
    protected String title;
    protected String location;
    @XmlElement(required = true)
    protected String description;
    @XmlElement(required = true)
    protected InitiatorType initiator;
    @XmlElement(required = true)
    protected OptionsType options;
    protected ParticipantsType participants;
    protected CommentsType comments;
    protected BigInteger mandator;
    protected FeaturesType features;

    /**
     * Gets the value of the latestChange property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLatestChange() {
        return latestChange;
    }

    /**
     * Sets the value of the latestChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLatestChange(XMLGregorianCalendar value) {
        this.latestChange = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link PollTypeType }
     *     
     */
    public PollTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollTypeType }
     *     
     */
    public void setType(PollTypeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the extensions property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionsType }
     *     
     */
    public ExtensionsType getExtensions() {
        return extensions;
    }

    /**
     * Sets the value of the extensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionsType }
     *     
     */
    public void setExtensions(ExtensionsType value) {
        this.extensions = value;
    }

    /**
     * Gets the value of the hidden property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHidden() {
        return hidden;
    }

    /**
     * Sets the value of the hidden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHidden(Boolean value) {
        this.hidden = value;
    }

    /**
     * Gets the value of the writeOnce property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWriteOnce() {
        return writeOnce;
    }

    /**
     * Sets the value of the writeOnce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWriteOnce(Boolean value) {
        this.writeOnce = value;
    }

    /**
     * Gets the value of the requireAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireAddress() {
        return requireAddress;
    }

    /**
     * Sets the value of the requireAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireAddress(Boolean value) {
        this.requireAddress = value;
    }

    /**
     * Gets the value of the requireEMail property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequireEMail() {
        return requireEMail;
    }

    /**
     * Sets the value of the requireEMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequireEMail(Boolean value) {
        this.requireEMail = value;
    }

    /**
     * Gets the value of the requirePhone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequirePhone() {
        return requirePhone;
    }

    /**
     * Sets the value of the requirePhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequirePhone(Boolean value) {
        this.requirePhone = value;
    }

    /**
     * Gets the value of the byInvitationOnly property.
     * 
     * @return
     *     possible object is
     *     {@link ByInvitationOnlyType }
     *     
     */
    public ByInvitationOnlyType getByInvitationOnly() {
        return byInvitationOnly;
    }

    /**
     * Sets the value of the byInvitationOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link ByInvitationOnlyType }
     *     
     */
    public void setByInvitationOnly(ByInvitationOnlyType value) {
        this.byInvitationOnly = value;
    }

    /**
     * Gets the value of the levels property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLevels() {
        return levels;
    }

    /**
     * Sets the value of the levels property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLevels(Integer value) {
        this.levels = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link StatesType }
     *     
     */
    public StatesType getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatesType }
     *     
     */
    public void setState(StatesType value) {
        this.state = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
     * Gets the value of the initiator property.
     * 
     * @return
     *     possible object is
     *     {@link InitiatorType }
     *     
     */
    public InitiatorType getInitiator() {
        return initiator;
    }

    /**
     * Sets the value of the initiator property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitiatorType }
     *     
     */
    public void setInitiator(InitiatorType value) {
        this.initiator = value;
    }

    /**
     * Gets the value of the options property.
     * 
     * @return
     *     possible object is
     *     {@link OptionsType }
     *     
     */
    public OptionsType getOptions() {
        return options;
    }

    /**
     * Sets the value of the options property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptionsType }
     *     
     */
    public void setOptions(OptionsType value) {
        this.options = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantsType }
     *     
     */
    public ParticipantsType getParticipants() {
        return participants;
    }

    /**
     * Sets the value of the participants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantsType }
     *     
     */
    public void setParticipants(ParticipantsType value) {
        this.participants = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link CommentsType }
     *     
     */
    public CommentsType getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommentsType }
     *     
     */
    public void setComments(CommentsType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the mandator property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMandator() {
        return mandator;
    }

    /**
     * Sets the value of the mandator property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMandator(BigInteger value) {
        this.mandator = value;
    }

    /**
     * Gets the value of the features property.
     * 
     * @return
     *     possible object is
     *     {@link FeaturesType }
     *     
     */
    public FeaturesType getFeatures() {
        return features;
    }

    /**
     * Sets the value of the features property.
     * 
     * @param value
     *     allowed object is
     *     {@link FeaturesType }
     *     
     */
    public void setFeatures(FeaturesType value) {
        this.features = value;
    }

}
