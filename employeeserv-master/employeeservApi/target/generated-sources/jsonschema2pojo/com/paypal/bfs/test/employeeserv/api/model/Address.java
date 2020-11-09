
package com.paypal.bfs.test.employeeserv.api.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "employeeId",
    "line1",
    "line2",
    "city",
    "state",
    "country",
    "zip_code"
})
public class Address {

    /**
     * Address id
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Address id")
    private Integer id;
    @JsonProperty("employeeId")
    private Integer employeeId;
    /**
     * line 1
     * 
     */
    @JsonProperty("line1")
    @JsonPropertyDescription("line 1")
    private String line1;
    /**
     * line 2
     * 
     */
    @JsonProperty("line2")
    @JsonPropertyDescription("line 2")
    private String line2;
    /**
     * City
     * 
     */
    @JsonProperty("city")
    @JsonPropertyDescription("City")
    private String city;
    /**
     * state
     * 
     */
    @JsonProperty("state")
    @JsonPropertyDescription("state")
    private String state;
    /**
     * country
     * 
     */
    @JsonProperty("country")
    @JsonPropertyDescription("country")
    private String country;
    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    @JsonPropertyDescription("zip_code")
    private String zipCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Address id
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Address id
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("employeeId")
    public Integer getEmployeeId() {
        return employeeId;
    }

    @JsonProperty("employeeId")
    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    /**
     * line 1
     * 
     */
    @JsonProperty("line1")
    public String getLine1() {
        return line1;
    }

    /**
     * line 1
     * 
     */
    @JsonProperty("line1")
    public void setLine1(String line1) {
        this.line1 = line1;
    }

    /**
     * line 2
     * 
     */
    @JsonProperty("line2")
    public String getLine2() {
        return line2;
    }

    /**
     * line 2
     * 
     */
    @JsonProperty("line2")
    public void setLine2(String line2) {
        this.line2 = line2;
    }

    /**
     * City
     * 
     */
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    /**
     * City
     * 
     */
    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * state
     * 
     */
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    /**
     * state
     * 
     */
    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    /**
     * country
     * 
     */
    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    /**
     * country
     * 
     */
    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public String getZipCode() {
        return zipCode;
    }

    /**
     * zip_code
     * 
     */
    @JsonProperty("zip_code")
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Address.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("employeeId");
        sb.append('=');
        sb.append(((this.employeeId == null)?"<null>":this.employeeId));
        sb.append(',');
        sb.append("line1");
        sb.append('=');
        sb.append(((this.line1 == null)?"<null>":this.line1));
        sb.append(',');
        sb.append("line2");
        sb.append('=');
        sb.append(((this.line2 == null)?"<null>":this.line2));
        sb.append(',');
        sb.append("city");
        sb.append('=');
        sb.append(((this.city == null)?"<null>":this.city));
        sb.append(',');
        sb.append("state");
        sb.append('=');
        sb.append(((this.state == null)?"<null>":this.state));
        sb.append(',');
        sb.append("country");
        sb.append('=');
        sb.append(((this.country == null)?"<null>":this.country));
        sb.append(',');
        sb.append("zipCode");
        sb.append('=');
        sb.append(((this.zipCode == null)?"<null>":this.zipCode));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
