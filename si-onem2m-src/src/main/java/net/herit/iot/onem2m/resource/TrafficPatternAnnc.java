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
import javax.xml.bind.annotation.XmlList;
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
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="provideToNSE" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="periodicIndicator" type="{http://www.onem2m.org/xml/protocols}periodicIndicator" minOccurs="0"/>
 *         &lt;element name="periodicDurationTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="periodicIntervalTime" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *         &lt;element name="stationaryIndication" type="{http://www.onem2m.org/xml/protocols}stationaryIndication" minOccurs="0"/>
 *         &lt;element name="dataSizeIndicator" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *         &lt;element name="validityTime" type="{http://www.onem2m.org/xml/protocols}timestamp" minOccurs="0"/>
 *         &lt;element name="targetNetwork" type="{http://www.onem2m.org/xml/protocols}listOfM2MID" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded" minOccurs="0">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}scheduleAnnc" minOccurs="0"/>
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
    "subscriptionOrScheduleAnnc"
})
public class TrafficPatternAnnc
    extends AnnouncedResource
{

	@XmlElement(name = Naming.PROVIDEDTONSE_SN)
    protected Boolean provideToNSE;
	@XmlElement(name = Naming.PERIODICINDICATOR_SN)
    protected Integer periodicIndicator;
    @XmlSchemaType(name = "unsignedInt")
    @XmlElement(name = Naming.PERIODICDURATIONTIME_SN)
    protected Long periodicDurationTime;
    @XmlSchemaType(name = "unsignedInt")
    @XmlElement(name = Naming.PERIODICINTERVALTIME_SN)
    protected Long periodicIntervalTime;
    @XmlElement(name = Naming.STATIONARYINDICATION_SN)
    protected Integer stationaryIndication;
    @XmlSchemaType(name = "positiveInteger")
    @XmlElement(name = Naming.DATASIZEINDICATOR_SN)
    protected Integer dataSizeIndicator;
    @XmlElement(name = Naming.VALIDITYTIME_SN)
    protected String validityTime;
    @XmlList
    @XmlElement(name = Naming.TARGETNETWORK_SN)
    protected List<String> targetNetwork;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = Naming.SUBSCRIPTION_SN, namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class),
        @XmlElement(name = Naming.SCHEDULEANNC_SN, namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class)
    })
    protected List<Resource> subscriptionOrScheduleAnnc;

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
     //   if (targetNetwork == null) {
     //       targetNetwork = new ArrayList<String>();
     //   }
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
     * Gets the value of the subscriptionOrScheduleAnnc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionOrScheduleAnnc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionOrScheduleAnnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subscription }
     * {@link ScheduleAnnc }
     * 
     * 
     */
    public List<Resource> getSubscriptionOrScheduleAnnc() {
      //  if (subscriptionOrScheduleAnnc == null) {
      //      subscriptionOrScheduleAnnc = new ArrayList<Resource>();
      //  }
        return this.subscriptionOrScheduleAnnc;
    }
    
    public void addSubscriptionOrScheduleAnnc(Resource value) {
    	if (subscriptionOrScheduleAnnc == null) {
    		subscriptionOrScheduleAnnc = new ArrayList<Resource>();
    	}
    	this.subscriptionOrScheduleAnnc.add(value);
    }

}
