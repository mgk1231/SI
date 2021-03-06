//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.10 at 01:16:41 오후 KST 
//


package org.onem2m.xml.protocols;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="applicableEventCategory" type="{http://www.onem2m.org/xml/protocols}listOfEventCatWithDef"/>
 *         &lt;element name="maxBufferSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="storagePriority">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *               &lt;maxExclusive value="11"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "applicableEventCategory",
    "maxBufferSize",
    "storagePriority"
})
@XmlRootElement(name = "cmdhBuffer")
public class CmdhBuffer
    extends MgmtResource
{

    @XmlList
    @XmlElement(required = true)
    protected List<String> applicableEventCategory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxBufferSize;
    protected int storagePriority;

    /**
     * Gets the value of the applicableEventCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the applicableEventCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApplicableEventCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getApplicableEventCategory() {
        if (applicableEventCategory == null) {
            applicableEventCategory = new ArrayList<String>();
        }
        return this.applicableEventCategory;
    }

    /**
     * Gets the value of the maxBufferSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxBufferSize() {
        return maxBufferSize;
    }

    /**
     * Sets the value of the maxBufferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxBufferSize(BigInteger value) {
        this.maxBufferSize = value;
    }

    /**
     * Gets the value of the storagePriority property.
     * 
     */
    public int getStoragePriority() {
        return storagePriority;
    }

    /**
     * Sets the value of the storagePriority property.
     * 
     */
    public void setStoragePriority(int value) {
        this.storagePriority = value;
    }

}
