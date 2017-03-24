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
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}flexContainerResource">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.onem2m.org/xml/protocols}allJoynDirection"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}semanticDescriptor"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}allJoynSvcObject"/>
 *           &lt;/choice>
 *         &lt;/choice>
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
    "direction",
    "childResource",
    "semanticDescriptorOrSubscriptionOrAllJoynSvcObject"
})

@XmlRootElement(name = Naming.ALLJOYNAPP_SN)
public class AllJoynApp
    extends FlexContainerResource
{
	
	public final static String SCHEMA_LOCATION = "CDT-allJoynApp-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.DIRECTION_SN, required = true)
    protected Integer direction;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "semanticDescriptor", namespace = "http://www.onem2m.org/xml/protocols", type = SemanticDescriptor.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "allJoynSvcObject", namespace = "http://www.onem2m.org/xml/protocols", type = AllJoynSvcObject.class)
    })
    protected List<Object> semanticDescriptorOrSubscriptionOrAllJoynSvcObject;

    /**
     * Gets the value of the direction property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDirection(Integer value) {
        this.direction = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
      //  if (childResource == null) {
      //      childResource = new ArrayList<ChildResourceRef>();
      //  }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the semanticDescriptorOrSubscriptionOrAllJoynSvcObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the semanticDescriptorOrSubscriptionOrAllJoynSvcObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSemanticDescriptorOrSubscriptionOrAllJoynSvcObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SemanticDescriptor }
     * {@link Subscription }
     * {@link AllJoynSvcObject }
     * 
     * 
     */
    public List<Object> getSemanticDescriptorOrSubscriptionOrAllJoynSvcObject() {
      //  if (semanticDescriptorOrSubscriptionOrAllJoynSvcObject == null) {
      //      semanticDescriptorOrSubscriptionOrAllJoynSvcObject = new ArrayList<Object>();
      //  }
        return this.semanticDescriptorOrSubscriptionOrAllJoynSvcObject;
    }
    
    public void addSemanticDescriptorOrSubscriptionOrAllJoynSvcObject(Object value) {
    	if (semanticDescriptorOrSubscriptionOrAllJoynSvcObject == null) {
    		semanticDescriptorOrSubscriptionOrAllJoynSvcObject = new ArrayList<Object>();
    	}
    	this.semanticDescriptorOrSubscriptionOrAllJoynSvcObject.add(value);
    }
    
 // added in CDT-2.7.0
   	public void validate(OPERATION operation) throws OneM2MException {
   		
   		super.validate(operation);
   		
   		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
   			
   			if (this.direction == null) {				
   				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "direction is M on CREATE");				
   			}
   			
   		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크
   			if (this.direction != null) {				
   				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "direction is NP on UPDATE");				
   			}
   		}
   		
   	}

}
