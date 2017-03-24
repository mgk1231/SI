//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.10.13 at 10:37:59 AM KST 
//


package net.herit.iot.onem2m.resource;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announceableResource">
 *       &lt;sequence>
 *         &lt;element name="provideToNSE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="periodicIndicator" type="{http://www.onem2m.org/xml/protocols}periodicIndicator" minOccurs="0"/>
 *         &lt;element name="periodicDurationTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="periodicIntervalTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="stationaryIndication" type="{http://www.onem2m.org/xml/protocols}stationaryIndication" minOccurs="0"/>
 *         &lt;element name="dataSizeIndicator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="validityTime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="targetNetwork" type="{http://www.onem2m.org/xml/protocols}listOfM2MID"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}schedule" minOccurs="0"/>
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
    "provideToNSE",
    "periodicIndicator",
    "periodicDurationTime",
    "periodicIntervalTime",
    "stationaryIndication",
    "dataSizeIndicator",
    "validityTime",
    "targetNetwork",
    "childResource",
    "subscriptionOrSchedule"
})
public class TrafficPattern
    extends AnnounceableResource
{
//	public final static String SCHEMA_LOCATION = "CDT-node-v1_6_0.xsd";
	public final static String SCHEMA_LOCATION = "CDT-node-v2_7_0.xsd";
	
	@XmlElement(name = Naming.PROVIDEDTONSE_SN)
    protected Boolean provideToNSE;
	@XmlElement(name = Naming.PERIODICINDICATOR_SN)
    protected Integer periodicIndicator;
	@XmlElement(name = Naming.PERIODICDURATIONTIME_SN)
    @XmlSchemaType(name = "unsignedInt")
    protected Long periodicDurationTime;
	@XmlElement(name = Naming.PERIODICINTERVALTIME_SN)
    @XmlSchemaType(name = "unsignedInt")
    protected Long periodicIntervalTime;
	@XmlElement(name = Naming.STATIONARYINDICATION_SN)
    protected Integer stationaryIndication;
	@XmlElement(name = Naming.DATASIZEINDICATOR_SN)
    @XmlSchemaType(name = "positiveInteger")
    protected Integer dataSizeIndicator;
	@XmlElement(name = Naming.VALIDITYTIME_SN)
    protected String validityTime;
    @XmlList
    //@XmlElement(required = true)
    @XmlElement(name = Naming.TARGETNETWORK_SN, required = true)
    protected List<String> targetNetwork;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = "schedule", namespace = "http://www.onem2m.org/xml/protocols", type = Schedule.class)
    })
    protected List<Resource> subscriptionOrSchedule;

    /**
     * Gets the value of the provideToNSE property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProvideToNSE() {
        return provideToNSE;
    }

    /**
     * Sets the value of the provideToNSE property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProvideToNSE(Boolean value) {
        this.provideToNSE = value;
    }

    /**
     * Gets the value of the periodicIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPeriodicIndicator() {
        return periodicIndicator;
    }

    /**
     * Sets the value of the periodicIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPeriodicIndicator(Integer value) {
        this.periodicIndicator = value;
    }

    /**
     * Gets the value of the periodicDurationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicDurationTime() {
        return periodicDurationTime;
    }

    /**
     * Sets the value of the periodicDurationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicDurationTime(Long value) {
        this.periodicDurationTime = value;
    }

    /**
     * Gets the value of the periodicIntervalTime property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPeriodicIntervalTime() {
        return periodicIntervalTime;
    }

    /**
     * Sets the value of the periodicIntervalTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPeriodicIntervalTime(Long value) {
        this.periodicIntervalTime = value;
    }

    /**
     * Gets the value of the stationaryIndication property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStationaryIndication() {
        return stationaryIndication;
    }

    /**
     * Sets the value of the stationaryIndication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStationaryIndication(Integer value) {
        this.stationaryIndication = value;
    }

    /**
     * Gets the value of the dataSizeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDataSizeIndicator() {
        return dataSizeIndicator;
    }

    /**
     * Sets the value of the dataSizeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDataSizeIndicator(Integer value) {
        this.dataSizeIndicator = value;
    }

    /**
     * Gets the value of the validityTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValidityTime() {
        return validityTime;
    }

    /**
     * Sets the value of the validityTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValidityTime(String value) {
        this.validityTime = value;
    }

    /**
     * Gets the value of the targetNetwork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetNetwork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetNetwork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetNetwork() {
      //  if (targetNetwork == null) {
      //      targetNetwork = new ArrayList<String>();
      //  }
        return this.targetNetwork;
    }
    
    public void addTargetNetwork(String value) {
    	if (targetNetwork == null) {
    		targetNetwork = new ArrayList<String>();
    	}
    	this.targetNetwork.add(value);
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
     //   if (childResource == null) {
     //       childResource = new ArrayList<ChildResourceRef>();
     //   }
        return this.childResource;
    }
    
    public void addChildResource(ChildResourceRef value) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
    	}
    	this.childResource.add(value);
    }

    /**
     * Gets the value of the subscriptionOrSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionOrSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionOrSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * {@link Schedule }
     * 
     * 
     */
    public List<Resource> getSubscriptionOrSchedule() {
      //  if (subscriptionOrSchedule == null) {
      //      subscriptionOrSchedule = new ArrayList<Resource>();
      //  }
        return this.subscriptionOrSchedule;
    }
    
    public void addSubscriptionOrSchedule(Resource value) {
    	if (subscriptionOrSchedule == null) {
    		subscriptionOrSchedule = new ArrayList<Resource>();
    	}
    	this.subscriptionOrSchedule.add(value);
    }
    
 // added in CDT-2.7.0
    @Override
	public void validate(OPERATION operation) throws OneM2MException {
				
		if (operation.equals(OPERATION.CREATE)) {	// CREATE 요청에 대한 데이터 유효성 체크
			
			if (this.provideToNSE != null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "provideToNSE is NP on CREATE");		
			}
			if (this.targetNetwork == null) {				
				throw new OneM2MException(RESPONSE_STATUS.INVALID_ARGUMENTS, "targetNetwork is M on CREATE");		
			}
			
			
		} else if (operation.equals(OPERATION.UPDATE)) {	// UPDATE 요청에 대한 데이터 유효성 체크
		
		}
		
		super.validate(operation);
		
	}

}
