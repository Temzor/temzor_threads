
package ru.excangermicroservices.currency.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Valute" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="NumCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
 *                   &lt;element name="CharCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="VunitRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Date" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "valute"
})
@XmlRootElement(name = "ValCurs")
public class ValCurs {

    @XmlElement(name = "Valute", required = true)
    protected List<ValCurs.Valute> valute;
    @XmlAttribute(name = "Date", required = true)
    protected String date;
    @XmlAttribute(name = "name", required = true)
    protected String name;

    /**
     * Gets the value of the valute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValCurs.Valute }
     * 
     * 
     */
    public List<ValCurs.Valute> getValute() {
        if (valute == null) {
            valute = new ArrayList<ValCurs.Valute>();
        }
        return this.valute;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }


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
     *         &lt;element name="NumCode" type="{http://www.w3.org/2001/XMLSchema}unsignedShort"/&gt;
     *         &lt;element name="CharCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Nominal" type="{http://www.w3.org/2001/XMLSchema}unsignedInt"/&gt;
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="VunitRate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "numCode",
        "charCode",
        "nominal",
        "name",
        "value",
        "vunitRate"
    })
    public static class Valute {

        @XmlElement(name = "NumCode")
        @XmlSchemaType(name = "unsignedShort")
        protected int numCode;
        @XmlElement(name = "CharCode", required = true)
        protected String charCode;
        @XmlElement(name = "Nominal")
        @XmlSchemaType(name = "unsignedInt")
        protected long nominal;
        @XmlElement(name = "Name", required = true)
        protected String name;
        @XmlElement(name = "Value", required = true)
        protected String value;
        @XmlElement(name = "VunitRate", required = true)
        protected String vunitRate;
        @XmlAttribute(name = "ID", required = true)
        protected String id;

        /**
         * Gets the value of the numCode property.
         * 
         */
        public int getNumCode() {
            return numCode;
        }

        /**
         * Sets the value of the numCode property.
         * 
         */
        public void setNumCode(int value) {
            this.numCode = value;
        }

        /**
         * Gets the value of the charCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharCode() {
            return charCode;
        }

        /**
         * Sets the value of the charCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharCode(String value) {
            this.charCode = value;
        }

        /**
         * Gets the value of the nominal property.
         * 
         */
        public long getNominal() {
            return nominal;
        }

        /**
         * Sets the value of the nominal property.
         * 
         */
        public void setNominal(long value) {
            this.nominal = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the vunitRate property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVunitRate() {
            return vunitRate;
        }

        /**
         * Sets the value of the vunitRate property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVunitRate(String value) {
            this.vunitRate = value;
        }

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

    }

}
