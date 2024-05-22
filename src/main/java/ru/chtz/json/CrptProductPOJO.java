package ru.chtz.json;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class CrptProductPOJO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "certificate_document",
            "certificate_document_date",
            "certificate_document_number",
            "owner_inn",
            "producer_inn",
            "production_date",
            "tnved_code",
            "uit_code",
            "uitu_code"
    })
    @Generated("jsonschema2pojo")
    public class Product {

        @JsonProperty("certificate_document")
        private String certificateDocument;
        @JsonProperty("certificate_document_date")
        private String certificateDocumentDate;
        @JsonProperty("certificate_document_number")
        private String certificateDocumentNumber;
        @JsonProperty("owner_inn")
        private String ownerInn;
        @JsonProperty("producer_inn")
        private String producerInn;
        @JsonProperty("production_date")
        private String productionDate;
        @JsonProperty("tnved_code")
        private String tnvedCode;
        @JsonProperty("uit_code")
        private String uitCode;
        @JsonProperty("uitu_code")
        private String uituCode;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

        @JsonProperty("certificate_document")
        public String getCertificateDocument() {
            return certificateDocument;
        }

        @JsonProperty("certificate_document")
        public void setCertificateDocument(String certificateDocument) {
            this.certificateDocument = certificateDocument;
        }

        @JsonProperty("certificate_document_date")
        public String getCertificateDocumentDate() {
            return certificateDocumentDate;
        }

        @JsonProperty("certificate_document_date")
        public void setCertificateDocumentDate(String certificateDocumentDate) {
            this.certificateDocumentDate = certificateDocumentDate;
        }

        @JsonProperty("certificate_document_number")
        public String getCertificateDocumentNumber() {
            return certificateDocumentNumber;
        }

        @JsonProperty("certificate_document_number")
        public void setCertificateDocumentNumber(String certificateDocumentNumber) {
            this.certificateDocumentNumber = certificateDocumentNumber;
        }

        @JsonProperty("owner_inn")
        public String getOwnerInn() {
            return ownerInn;
        }

        @JsonProperty("owner_inn")
        public void setOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
        }

        @JsonProperty("producer_inn")
        public String getProducerInn() {
            return producerInn;
        }

        @JsonProperty("producer_inn")
        public void setProducerInn(String producerInn) {
            this.producerInn = producerInn;
        }

        @JsonProperty("production_date")
        public String getProductionDate() {
            return productionDate;
        }

        @JsonProperty("production_date")
        public void setProductionDate(String productionDate) {
            this.productionDate = productionDate;
        }

        @JsonProperty("tnved_code")
        public String getTnvedCode() {
            return tnvedCode;
        }

        @JsonProperty("tnved_code")
        public void setTnvedCode(String tnvedCode) {
            this.tnvedCode = tnvedCode;
        }

        @JsonProperty("uit_code")
        public String getUitCode() {
            return uitCode;
        }

        @JsonProperty("uit_code")
        public void setUitCode(String uitCode) {
            this.uitCode = uitCode;
        }

        @JsonProperty("uitu_code")
        public String getUituCode() {
            return uituCode;
        }

        @JsonProperty("uitu_code")
        public void setUituCode(String uituCode) {
            this.uituCode = uituCode;
        }

        @JsonAnyGetter
        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        @JsonAnySetter
        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

    }
}
