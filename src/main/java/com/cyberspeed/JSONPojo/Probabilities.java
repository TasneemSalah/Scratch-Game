
package com.cyberspeed.JSONPojo;

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
    "standard_symbols",
    "bonus_symbols"
})
@Generated("jsonschema2pojo")
public class Probabilities {

    @JsonProperty("standard_symbols")
    private List<StandardSymbol> standardSymbols = new ArrayList<StandardSymbol>();
    @JsonProperty("bonus_symbols")
    private BonusSymbols bonusSymbols;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("standard_symbols")
    public List<StandardSymbol> getStandardSymbols() {
        return standardSymbols;
    }

    @JsonProperty("standard_symbols")
    public void setStandardSymbols(List<StandardSymbol> standardSymbols) {
        this.standardSymbols = standardSymbols;
    }

    public Probabilities withStandardSymbols(List<StandardSymbol> standardSymbols) {
        this.standardSymbols = standardSymbols;
        return this;
    }

    @JsonProperty("bonus_symbols")
    public BonusSymbols getBonusSymbols() {
        return bonusSymbols;
    }

    @JsonProperty("bonus_symbols")
    public void setBonusSymbols(BonusSymbols bonusSymbols) {
        this.bonusSymbols = bonusSymbols;
    }

    public Probabilities withBonusSymbols(BonusSymbols bonusSymbols) {
        this.bonusSymbols = bonusSymbols;
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

    public Probabilities withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Probabilities.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("standardSymbols");
        sb.append('=');
        sb.append(((this.standardSymbols == null)?"<null>":this.standardSymbols));
        sb.append(',');
        sb.append("bonusSymbols");
        sb.append('=');
        sb.append(((this.bonusSymbols == null)?"<null>":this.bonusSymbols));
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
        result = ((result* 31)+((this.bonusSymbols == null)? 0 :this.bonusSymbols.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.standardSymbols == null)? 0 :this.standardSymbols.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Probabilities) == false) {
            return false;
        }
        Probabilities rhs = ((Probabilities) other);
        return ((((this.bonusSymbols == rhs.bonusSymbols)||((this.bonusSymbols!= null)&&this.bonusSymbols.equals(rhs.bonusSymbols)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.standardSymbols == rhs.standardSymbols)||((this.standardSymbols!= null)&&this.standardSymbols.equals(rhs.standardSymbols))));
    }

}
