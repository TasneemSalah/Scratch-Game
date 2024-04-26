
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
    "A",
    "B",
    "C",
    "D",
    "E",
    "F"
})
@Generated("jsonschema2pojo")
public class Symbols__1 {

    @JsonProperty("A")
    private Integer a;
    @JsonProperty("B")
    private Integer b;
    @JsonProperty("C")
    private Integer c;
    @JsonProperty("D")
    private Integer d;
    @JsonProperty("E")
    private Integer e;
    @JsonProperty("F")
    private Integer f;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("A")
    public Integer getA() {
        return a;
    }

    @JsonProperty("A")
    public void setA(Integer a) {
        this.a = a;
    }

    public Symbols__1 withA(Integer a) {
        this.a = a;
        return this;
    }

    @JsonProperty("B")
    public Integer getB() {
        return b;
    }

    @JsonProperty("B")
    public void setB(Integer b) {
        this.b = b;
    }

    public Symbols__1 withB(Integer b) {
        this.b = b;
        return this;
    }

    @JsonProperty("C")
    public Integer getC() {
        return c;
    }

    @JsonProperty("C")
    public void setC(Integer c) {
        this.c = c;
    }

    public Symbols__1 withC(Integer c) {
        this.c = c;
        return this;
    }

    @JsonProperty("D")
    public Integer getD() {
        return d;
    }

    @JsonProperty("D")
    public void setD(Integer d) {
        this.d = d;
    }

    public Symbols__1 withD(Integer d) {
        this.d = d;
        return this;
    }

    @JsonProperty("E")
    public Integer getE() {
        return e;
    }

    @JsonProperty("E")
    public void setE(Integer e) {
        this.e = e;
    }

    public Symbols__1 withE(Integer e) {
        this.e = e;
        return this;
    }

    @JsonProperty("F")
    public Integer getF() {
        return f;
    }

    @JsonProperty("F")
    public void setF(Integer f) {
        this.f = f;
    }

    public Symbols__1 withF(Integer f) {
        this.f = f;
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

    public Symbols__1 withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Symbols__1 .class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("a");
        sb.append('=');
        sb.append(((this.a == null)?"<null>":this.a));
        sb.append(',');
        sb.append("b");
        sb.append('=');
        sb.append(((this.b == null)?"<null>":this.b));
        sb.append(',');
        sb.append("c");
        sb.append('=');
        sb.append(((this.c == null)?"<null>":this.c));
        sb.append(',');
        sb.append("d");
        sb.append('=');
        sb.append(((this.d == null)?"<null>":this.d));
        sb.append(',');
        sb.append("e");
        sb.append('=');
        sb.append(((this.e == null)?"<null>":this.e));
        sb.append(',');
        sb.append("f");
        sb.append('=');
        sb.append(((this.f == null)?"<null>":this.f));
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
        result = ((result* 31)+((this.a == null)? 0 :this.a.hashCode()));
        result = ((result* 31)+((this.b == null)? 0 :this.b.hashCode()));
        result = ((result* 31)+((this.c == null)? 0 :this.c.hashCode()));
        result = ((result* 31)+((this.d == null)? 0 :this.d.hashCode()));
        result = ((result* 31)+((this.e == null)? 0 :this.e.hashCode()));
        result = ((result* 31)+((this.f == null)? 0 :this.f.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Symbols__1) == false) {
            return false;
        }
        Symbols__1 rhs = ((Symbols__1) other);
        return ((((((((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a)))&&((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b))))&&((this.c == rhs.c)||((this.c!= null)&&this.c.equals(rhs.c))))&&((this.d == rhs.d)||((this.d!= null)&&this.d.equals(rhs.d))))&&((this.e == rhs.e)||((this.e!= null)&&this.e.equals(rhs.e))))&&((this.f == rhs.f)||((this.f!= null)&&this.f.equals(rhs.f))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
