//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.07 at 09:56:03 AM KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlType;

import net.herit.iot.message.onem2m.OneM2mRequest.OPERATION;
import net.herit.iot.message.onem2m.OneM2mResponse.RESPONSE_STATUS;
import net.herit.iot.onem2m.core.util.OneM2MException;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}regularResource">
 *       &lt;sequence>
 *         &lt;element name="dynamicAuthorizationEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="dynamicAuthorizationPoA" type="{http://www.onem2m.org/xml/protocols}listOfURIs"/>
 *         &lt;element name="dynamicAuthorizationLifetime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
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
    "dynamicAuthorizationEnabled",
    "dynamicAuthorizationPoA",
    "dynamicAuthorizationLifetime"
})
public class DynamicAuthorizationConsultation
    extends RegularResource
{

	public final static String SCHEMA_LOCATION = "CDT-dynamicAuthorizationConsultation-v2_7_0.xsd";
	
	@XmlElement(name = Naming.DYNAMICAUTHORIZATIONENABLED_SN)
    protected boolean dynamicAuthorizationEnabled;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.DYNAMICAUTHORIZATIONPOA_SN, required = true)
    protected List<String> dynamicAuthorizationPoA;
    @XmlElement(name = Naming.DYNAMICAUTHORIZATIONLIFETIME_SN)
    protected String dynamicAuthorizationLifetime;

    /**
     * Gets the value of the dynamicAuthorizationEnabled property.
     * 
     */
    public boolean isDynamicAuthorizationEnabled() {
        return dynamicAuthorizationEnabled;
    }

    /**
     * Sets the value of the dynamicAuthorizationEnabled property.
     * 
     */
    public void setDynamicAuthorizationEnabled(boolean value) {
        this.dynamicAuthorizationEnabled = value;
    }

    /**
     * Gets the value of the dynamicAuthorizationPoA property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dynamicAuthorizationPoA property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDynamicAuthorizationPoA().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDynamicAuthorizationPoA() {
      //  if (dynamicAuthorizationPoA == null) {
      //      dynamicAuthorizationPoA = new ArrayList<String>();
      //  }
        return this.dynamicAuthorizationPoA;
    }
    
    public void addDynamicAuthorizationPoA(String value) {
    	if (dynamicAuthorizationPoA == null) {
    		dynamicAuthorizationPoA = new ArrayList<String>();
    	}
    	this.dynamicAuthorizationPoA.add(value);
    }

    /**
     * Gets the value of the dynamicAuthorizationLifetime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDynamicAuthorizationLifetime() {
        return dynamicAuthorizationLifetime;
    }

    /**
     * Sets the value of the dynamicAuthorizationLifetime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDynamicAuthorizationLifetime(String value) {
        this.dynamicAuthorizationLifetime = value;
    }
    
 // added in CDT-2.7.0
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크
			
		}
		
		super.validate(operation);
		
	}

}
