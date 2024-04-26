
package com.cyberspeed.JSONPojo;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "10x",
    "5x",
    "+1000",
    "+500",
    "MISS"
})
@Generated("jsonschema2pojo")
public class Symbols__2 {

    @JsonProperty("10x")
    private Integer _10x;
    @JsonProperty("5x")
    private Integer _5x;
    @JsonProperty("+1000")
    private Integer _1000;
    @JsonProperty("+500")
    private Integer _500;
    @JsonProperty("MISS")
    private Integer miss;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("10x")
    public Integer get10x() {
        return _10x;
    }

    @JsonProperty("10x")
    public void set10x(Integer _10x) {
        this._10x = _10x;
    }

    public Symbols__2 with10x(Integer _10x) {
        this._10x = _10x;
        return this;
    }

    @JsonProperty("5x")
    public Integer get5x() {
        return _5x;
    }

    @JsonProperty("5x")
    public void set5x(Integer _5x) {
        this._5x = _5x;
    }

    public Symbols__2 with5x(Integer _5x) {
        this._5x = _5x;
        return this;
    }

    @JsonProperty("+1000")
    public Integer get1000() {
        return _1000;
    }

    @JsonProperty("+1000")
    public void set1000(Integer _1000) {
        this._1000 = _1000;
    }

    public Symbols__2 with1000(Integer _1000) {
        this._1000 = _1000;
        return this;
    }

    @JsonProperty("+500")
    public Integer get500() {
        return _500;
    }

    @JsonProperty("+500")
    public void set500(Integer _500) {
        this._500 = _500;
    }

    public Symbols__2 with500(Integer _500) {
        this._500 = _500;
        return this;
    }

    @JsonProperty("MISS")
    public Integer getMiss() {
        return miss;
    }

    @JsonProperty("MISS")
    public void setMiss(Integer miss) {
        this.miss = miss;
    }

    public Symbols__2 withMiss(Integer miss) {
        this.miss = miss;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public Symbols__2 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Symbols__2 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("_10x");
        sb.append('=');
        sb.append(((this._10x == null)?"<null>":this._10x));
        sb.append(',');
        sb.append("_5x");
        sb.append('=');
        sb.append(((this._5x == null)?"<null>":this._5x));
        sb.append(',');
        sb.append("_1000");
        sb.append('=');
        sb.append(((this._1000 == null)?"<null>":this._1000));
        sb.append(',');
        sb.append("_500");
        sb.append('=');
        sb.append(((this._500 == null)?"<null>":this._500));
        sb.append(',');
        sb.append("miss");
        sb.append('=');
        sb.append(((this.miss == null)?"<null>":this.miss));
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

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this._10x == null)? 0 :this._10x.hashCode()));
        result = ((result* 31)+((this._5x == null)? 0 :this._5x.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._500 == null)? 0 :this._500 .hashCode()));
        result = ((result* 31)+((this._1000 == null)? 0 :this._1000 .hashCode()));
        result = ((result* 31)+((this.miss == null)? 0 :this.miss.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Symbols__2) == false) {
            return false;
        }
        Symbols__2 rhs = ((Symbols__2) other);
        return (((((((this._10x == rhs._10x)||((this._10x!= null)&&this._10x.equals(rhs._10x)))&&((this._5x == rhs._5x)||((this._5x!= null)&&this._5x.equals(rhs._5x))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._500 == rhs._500)||((this._500 != null)&&this._500 .equals(rhs._500))))&&((this._1000 == rhs._1000)||((this._1000 != null)&&this._1000 .equals(rhs._1000))))&&((this.miss == rhs.miss)||((this.miss!= null)&&this.miss.equals(rhs.miss))));
    }

}
