
package org.onvif.ver10.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MoveOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MoveOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Absolute" type="{http://www.onvif.org/ver10/schema}AbsoluteFocusOptions" minOccurs="0"/>
 *         &lt;element name="Relative" type="{http://www.onvif.org/ver10/schema}RelativeFocusOptions" minOccurs="0"/>
 *         &lt;element name="Continuous" type="{http://www.onvif.org/ver10/schema}ContinuousFocusOptions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoveOptions", propOrder = {
    "absolute",
    "relative",
    "continuous"
})
public class MoveOptions {

    @XmlElement(name = "Absolute")
    protected AbsoluteFocusOptions absolute;
    @XmlElement(name = "Relative")
    protected RelativeFocusOptions relative;
    @XmlElement(name = "Continuous")
    protected ContinuousFocusOptions continuous;

    /**
     * Gets the value of the absolute property.
     * 
     * @return
     *     possible object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public AbsoluteFocusOptions getAbsolute() {
        return absolute;
    }

    /**
     * Sets the value of the absolute property.
     * 
     * @param value
     *     allowed object is
     *     {@link AbsoluteFocusOptions }
     *     
     */
    public void setAbsolute(AbsoluteFocusOptions value) {
        this.absolute = value;
    }

    /**
     * Gets the value of the relative property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeFocusOptions }
     *     
     */
    public RelativeFocusOptions getRelative() {
        return relative;
    }

    /**
     * Sets the value of the relative property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeFocusOptions }
     *     
     */
    public void setRelative(RelativeFocusOptions value) {
        this.relative = value;
    }

    /**
     * Gets the value of the continuous property.
     * 
     * @return
     *     possible object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public ContinuousFocusOptions getContinuous() {
        return continuous;
    }

    /**
     * Sets the value of the continuous property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContinuousFocusOptions }
     *     
     */
    public void setContinuous(ContinuousFocusOptions value) {
        this.continuous = value;
    }

}
