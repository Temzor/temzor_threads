package ru.chtz.json;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class CrptBodyPOJO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "description",
            "doc_id",
            "doc_status",
            "doc_type",
            "importRequest",
            "owner_inn",
            "participant_inn",
            "producer_inn",
            "production_date",
            "production_type",
            "products",
            "reg_date",
            "reg_number"
    })
    @Generated("jsonschema2pojo")
    public class Example {

        @JsonProperty("description")
        private Description description;
        @JsonProperty("doc_id")
        private String docId;
        @JsonProperty("doc_status")
        private String docStatus;
        @JsonProperty("doc_type")
        private String docType;
        @JsonProperty("importRequest")
        private Boolean importRequest;
        @JsonProperty("owner_inn")
        private String ownerInn;
        @JsonProperty("participant_inn")
        private String participantInn;
        @JsonProperty("producer_inn")
        private String producerInn;
        @JsonProperty("production_date")
        private String productionDate;
        @JsonProperty("production_type")
        private String productionType;
        @JsonProperty("products")
        private List<CrptProductPOJO> products;
        @JsonProperty("reg_date")
        private String regDate;
        @JsonProperty("reg_number")
        private String regNumber;
        @JsonIgnore
        private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

        @JsonProperty("description")
        public Description getDescription() {
            return description;
        }

        @JsonProperty("description")
        public void setDescription(Description description) {
            this.description = description;
        }

        @JsonProperty("doc_id")
        public String getDocId() {
            return docId;
        }

        @JsonProperty("doc_id")
        public void setDocId(String docId) {
            this.docId = docId;
        }

        @JsonProperty("doc_status")
        public String getDocStatus() {
            return docStatus;
        }

        @JsonProperty("doc_status")
        public void setDocStatus(String docStatus) {
            this.docStatus = docStatus;
        }

        @JsonProperty("doc_type")
        public String getDocType() {
            return docType;
        }

        @JsonProperty("doc_type")
        public void setDocType(String docType) {
            this.docType = docType;
        }

        @JsonProperty("importRequest")
        public Boolean getImportRequest() {
            return importRequest;
        }

        @JsonProperty("importRequest")
        public void setImportRequest(Boolean importRequest) {
            this.importRequest = importRequest;
        }

        @JsonProperty("owner_inn")
        public String getOwnerInn() {
            return ownerInn;
        }

        @JsonProperty("owner_inn")
        public void setOwnerInn(String ownerInn) {
            this.ownerInn = ownerInn;
        }

        @JsonProperty("participant_inn")
        public String getParticipantInn() {
            return participantInn;
        }

        @JsonProperty("participant_inn")
        public void setParticipantInn(String participantInn) {
            this.participantInn = participantInn;
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

        @JsonProperty("production_type")
        public String getProductionType() {
            return productionType;
        }

        @JsonProperty("production_type")
        public void setProductionType(String productionType) {
            this.productionType = productionType;
        }

        @JsonProperty("products")
        public List<CrptProductPOJO> getProducts() {
            return products;
        }

        @JsonProperty("products")
        public void setProducts(List<CrptProductPOJO> products) {
            this.products = products;
        }

        @JsonProperty("reg_date")
        public String getRegDate() {
            return regDate;
        }

        @JsonProperty("reg_date")
        public void setRegDate(String regDate) {
            this.regDate = regDate;
        }

        @JsonProperty("reg_number")
        public String getRegNumber() {
            return regNumber;
        }

        @JsonProperty("reg_number")
        public void setRegNumber(String regNumber) {
            this.regNumber = regNumber;
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
