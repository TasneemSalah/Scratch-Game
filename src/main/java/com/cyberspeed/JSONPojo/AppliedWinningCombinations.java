
package JSONPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
public class AppliedWinningCombinations {

    @JsonProperty("A")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> a = new ArrayList<String>();
    @JsonProperty("B")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> b = new ArrayList<String>();
    @JsonProperty("C")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> c = new ArrayList<String>();
    @JsonProperty("D")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> d = new ArrayList<String>();
    @JsonProperty("E")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> e = new ArrayList<String>();
    @JsonProperty("F")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<String> f = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("A")
    public List<String> getA() {
        return a;
    }

    @JsonProperty("A")
    public void setA(List<String> a) {
        this.a = a;
    }

    public AppliedWinningCombinations withA(List<String> a) {
        this.a = a;
        return this;
    }

    @JsonProperty("B")
    public List<String> getB() {
        return b;
    }

    @JsonProperty("B")
    public void setB(List<String> b) {
        this.b = b;
    }

    public AppliedWinningCombinations withB(List<String> b) {
        this.b = b;
        return this;
    }
    @JsonProperty("C")
    public List<String> getC() {
        return c;
    }

    @JsonProperty("C")
    public void setC(List<String> c) {
        this.c = c;
    }

    public AppliedWinningCombinations withC(List<String> c) {
        this.c = c;
        return this;
    }

    @JsonProperty("D")
    public List<String> getD() {
        return d;
    }

    @JsonProperty("D")
    public void setD(List<String> b) {
        this.d = d;
    }

    public AppliedWinningCombinations withD(List<String> d) {
        this.d = d;
        return this;
    }
    @JsonProperty("E")
    public List<String> getE() {
        return e;
    }

    @JsonProperty("E")
    public void setE(List<String> e) {
        this.e = e;
    }

    public AppliedWinningCombinations withE(List<String> e) {
        this.e = e;
        return this;
    }

    @JsonProperty("F")
    public List<String> getF() {
        return f;
    }

    @JsonProperty("F")
    public void setF(List<String> f) {
        this.f = f;
    }

    public AppliedWinningCombinations withF(List<String> f) {
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

    public AppliedWinningCombinations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AppliedWinningCombinations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("a");
        sb.append('=');
        sb.append(((this.a == null)?"<null>":this.a));
        sb.append(',');
        sb.append("b");
        sb.append('=');
        sb.append(((this.b == null)?"<null>":this.b));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppliedWinningCombinations) == false) {
            return false;
        }
        AppliedWinningCombinations rhs = ((AppliedWinningCombinations) other);
        return ((((this.a == rhs.a)||((this.a!= null)&&this.a.equals(rhs.a)))&&((this.b == rhs.b)||((this.b!= null)&&this.b.equals(rhs.b))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
