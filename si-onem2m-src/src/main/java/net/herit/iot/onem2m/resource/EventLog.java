//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:16 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}mgmtResource">
 *       &lt;sequence>
 *         &lt;element name="logTypeId" type="{http://www.onem2m.org/xml/protocols}logTypeId"/>
 *         &lt;element name="logData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="logStatus" type="{http://www.onem2m.org/xml/protocols}logStatus"/>
 *         &lt;element name="logStart" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="logStop" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded"/>
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
    "logTypeId",
    "logData",
    "logStatus",
    "logStart",
    "logStop",
    "childResource",
    "subscription"
})
//@XmlRootElement(name = "eventLog")
@XmlRootElement(name = Naming.EVENTLOG_SN)
public class EventLog
    extends MgmtResource
{
//	public static final String SCHEMA_LOCATION = "CDT-eventLog-v1_2_0.xsd";
//	public static final String SCHEMA_LOCATION = "CDT-eventLog-v1_6_0.xsd";
	public static final String SCHEMA_LOCATION = "CDT-eventLog-v2_7_0.xsd";

    //@XmlElement(required = true)
    @XmlElement(name = Naming.LOGTYPEID_SN)
    protected Integer logTypeId;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.LOGDATA_SN)
    protected String logData;
    //@XmlElement(required = true)
    @XmlElement(name = Naming.LOGSTATUS_SN)
    protected Integer logStatus;
    @XmlElement(name = Naming.LOGSTART_SN)
//    protected boolean logStart;
    protected Boolean logStart;
    @XmlElement(name = Naming.LOGSTOP_SN)
//    protected boolean logStop;
    protected Boolean logStop;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    //@XmlElement(namespace = "http://www.onem2m.org/xml/protocols")
    @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols")
    protected List<Subscription> subscription;

    /**
     * Gets the value of the logTypeId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogTypeId() {
        return logTypeId;
    }

    /**
     * Sets the value of the logTypeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogTypeId(Integer value) {
        this.logTypeId = value;
    }

    /**
     * Gets the value of the logData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogData() {
        return logData;
    }

    /**
     * Sets the value of the logData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogData(String value) {
        this.logData = value;
    }

    /**
     * Gets the value of the logStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLogStatus() {
        return logStatus;
    }

    /**
     * Sets the value of the logStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLogStatus(Integer value) {
        this.logStatus = value;
    }

    /**
     * Gets the value of the logStart property.
     * 
     */
    public Boolean isLogStart() {
        return logStart;
    }

    /**
     * Sets the value of the logStart property.
     * 
     */
    public void setLogStart(Boolean value) {
        this.logStart = value;
    }

    /**
     * Gets the value of the logStop property.
     * 
     */
    public Boolean isLogStop() {
        return logStop;
    }

    /**
     * Sets the value of the logStop property.
     * 
     */
    public void setLogStop(Boolean value) {
        this.logStop = value;
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
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//    	}
    	return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(ch);
    }

    /**
     * Gets the value of the subscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * 
     * 
     */
    public List<Subscription> getSubscription() {
//    	if (subscription == null) {
//    		subscription = new ArrayList<Subscription>();
//    	}
    	return this.subscription;
    }
    
    public void addSubscription(Subscription sub) {
    	if (subscription == null) {
    		subscription = new ArrayList<Subscription>();
    	}
    	this.subscription.add(sub);
    }

    @Override
	public void validate(OPERATION operation) throws OneM2MException {
		
		if (operation.equals(OPERATION.CREATE)) {	// create 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)

			if (this.mgmtDefinition == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is M on CREATE operation");
			}
			if (this.logTypeId == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'logTypeId' is M on CREATE operation");
			}
			if (this.logData == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'logData' is M on CREATE operation");
			}
			if (this.logStatus == null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'logStatus' is M on CREATE operation");
			}
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// update 요청에 의해 생성된 리소스에 대한 유효성 체크 (DB저장전)
			
			if (this.mgmtDefinition != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'mgmtDefinition' is NP on UPDATE operation");
			}
			if (this.objectIDs != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectIDs' is NP on UPDATE operation");
			}
			if (this.objectPaths != null) {
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "'objectPaths' is NP on UPDATE operation");
			}
			
		}
	
		super.validate(operation);
		
	}
}
