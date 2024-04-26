
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
    "F",
    "10x",
    "5x",
    "+1000",
    "+500",
    "MISS"
})
@Generated("jsonschema2pojo")
public class Symbols {

    @JsonProperty("A")
    private A a;
    @JsonProperty("B")
    private B b;
    @JsonProperty("C")
    private C c;
    @JsonProperty("D")
    private D d;
    @JsonProperty("E")
    private E e;
    @JsonProperty("F")
    private F f;
    @JsonProperty("10x")
    private com.cyberspeed.JSONPojo._10x _10x;
    @JsonProperty("5x")
    private com.cyberspeed.JSONPojo._5x _5x;
    @JsonProperty("+1000")
    private com.cyberspeed.JSONPojo._1000 _1000;
    @JsonProperty("+500")
    private com.cyberspeed.JSONPojo._500 _500;
    @JsonProperty("MISS")
    private Miss miss;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("A")
    public A getA() {
        return a;
    }

    @JsonProperty("A")
    public void setA(A a) {
        this.a = a;
    }

    public Symbols withA(A a) {
        this.a = a;
        return this;
    }

    @JsonProperty("B")
    public B getB() {
        return b;
    }

    @JsonProperty("B")
    public void setB(B b) {
        this.b = b;
    }

    public Symbols withB(B b) {
        this.b = b;
        return this;
    }

    @JsonProperty("C")
    public C getC() {
        return c;
    }

    @JsonProperty("C")
    public void setC(C c) {
        this.c = c;
    }

    public Symbols withC(C c) {
        this.c = c;
        return this;
    }

    @JsonProperty("D")
    public D getD() {
        return d;
    }

    @JsonProperty("D")
    public void setD(D d) {
        this.d = d;
    }

    public Symbols withD(D d) {
        this.d = d;
        return this;
    }

    @JsonProperty("E")
    public E getE() {
        return e;
    }

    @JsonProperty("E")
    public void setE(E e) {
        this.e = e;
    }

    public Symbols withE(E e) {
        this.e = e;
        return this;
    }

    @JsonProperty("F")
    public F getF() {
        return f;
    }

    @JsonProperty("F")
    public void setF(F f) {
        this.f = f;
    }

    public Symbols withF(F f) {
        this.f = f;
        return this;
    }

    @JsonProperty("10x")
    public com.cyberspeed.JSONPojo._10x get10x() {
        return _10x;
    }

    @JsonProperty("10x")
    public void set10x(com.cyberspeed.JSONPojo._10x _10x) {
        this._10x = _10x;
    }

    public Symbols with10x(com.cyberspeed.JSONPojo._10x _10x) {
        this._10x = _10x;
        return this;
    }

    @JsonProperty("5x")
    public com.cyberspeed.JSONPojo._5x get5x() {
        return _5x;
    }

    @JsonProperty("5x")
    public void set5x(com.cyberspeed.JSONPojo._5x _5x) {
        this._5x = _5x;
    }

    public Symbols with5x(com.cyberspeed.JSONPojo._5x _5x) {
        this._5x = _5x;
        return this;
    }

    @JsonProperty("+1000")
    public com.cyberspeed.JSONPojo._1000 get1000() {
        return _1000;
    }

    @JsonProperty("+1000")
    public void set1000(com.cyberspeed.JSONPojo._1000 _1000) {
        this._1000 = _1000;
    }

    public Symbols with1000(com.cyberspeed.JSONPojo._1000 _1000) {
        this._1000 = _1000;
        return this;
    }

    @JsonProperty("+500")
    public com.cyberspeed.JSONPojo._500 get500() {
        return _500;
    }

    @JsonProperty("+500")
    public void set500(com.cyberspeed.JSONPojo._500 _500) {
        this._500 = _500;
    }

    public Symbols with500(com.cyberspeed.JSONPojo._500 _500) {
        this._500 = _500;
        return this;
    }

    @JsonProperty("MISS")
    public Miss getMiss() {
        return miss;
    }

    @JsonProperty("MISS")
    public void setMiss(Miss miss) {
        this.miss = miss;
    }

    public Symbols withMiss(Miss miss) {
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

    public Symbols withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Symbols.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
        result = ((result* 31)+((this.a == null)? 0 :this.a.hashCode()));
        result = ((result* 31)+((this.b == null)? 0 :this.b.hashCode()));
        result = ((result* 31)+((this.c == null)? 0 :this.c.hashCode()));
        result = ((result* 31)+((this._5x == null)? 0 :this._5x.hashCode()));
        result = ((result* 31)+((this.d == null)? 0 :this.d.hashCode()));
        result = ((result* 31)+((this.e == null)? 0 :this.e.hashCode()));
        result = ((result* 31)+((this.f == null)? 0 :this.f.hashCode()));
        result = ((result* 31)+((this._1000 == null)? 0 :this._1000 .hashCode()));
        result = ((result* 31)+((this.miss == null)? 0 :this.miss.hashCode()));
        result = ((result* 31)+((this._10x == null)? 0 :this._10x.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this._500 == null)? 0 :this._500 .hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Symbols) == false) {
            return false;
        }
        Symbols rhs = ((Symbols) other);
        return (((((((((((((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a)))&&((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b))))&&((this.c == rhs.c)||((this.c!= null)&&this.c.equals(rhs.c))))&&((this._5x == rhs._5x)||((this._5x!= null)&&this._5x.equals(rhs._5x))))&&((this.d == rhs.d)||((this.d!= null)&&this.d.equals(rhs.d))))&&((this.e == rhs.e)||((this.e!= null)&&this.e.equals(rhs.e))))&&((this.f == rhs.f)||((this.f!= null)&&this.f.equals(rhs.f))))&&((this._1000 == rhs._1000)||((this._1000 != null)&&this._1000 .equals(rhs._1000))))&&((this.miss == rhs.miss)||((this.miss!= null)&&this.miss.equals(rhs.miss))))&&((this._10x == rhs._10x)||((this._10x!= null)&&this._10x.equals(rhs._10x))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this._500 == rhs._500)||((this._500 != null)&&this._500 .equals(rhs._500))));
    }

}
