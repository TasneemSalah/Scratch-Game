
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
    "columns",
    "rows",
    "symbols",
    "probabilities",
    "win_combinations"
})
@Generated("jsonschema2pojo")
public class Root {

    @JsonProperty("columns")
    private Integer columns;
    @JsonProperty("rows")
    private Integer rows;
    @JsonProperty("symbols")
    private Symbols symbols;
    @JsonProperty("probabilities")
    private Probabilities probabilities;
    @JsonProperty("win_combinations")
    private WinCombinations winCombinations;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("columns")
    public Integer getColumns() {
        return columns;
    }

    @JsonProperty("columns")
    public void setColumns(Integer columns) {
        this.columns = columns;
    }

    public Root withColumns(Integer columns) {
        this.columns = columns;
        return this;
    }

    @JsonProperty("rows")
    public Integer getRows() {
        return rows;
    }

    @JsonProperty("rows")
    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Root withRows(Integer rows) {
        this.rows = rows;
        return this;
    }

    @JsonProperty("symbols")
    public Symbols getSymbols() {
        return symbols;
    }

    @JsonProperty("symbols")
    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public Root withSymbols(Symbols symbols) {
        this.symbols = symbols;
        return this;
    }

    @JsonProperty("probabilities")
    public Probabilities getProbabilities() {
        return probabilities;
    }

    @JsonProperty("probabilities")
    public void setProbabilities(Probabilities probabilities) {
        this.probabilities = probabilities;
    }

    public Root withProbabilities(Probabilities probabilities) {
        this.probabilities = probabilities;
        return this;
    }

    @JsonProperty("win_combinations")
    public WinCombinations getWinCombinations() {
        return winCombinations;
    }

    @JsonProperty("win_combinations")
    public void setWinCombinations(WinCombinations winCombinations) {
        this.winCombinations = winCombinations;
    }

    public Root withWinCombinations(WinCombinations winCombinations) {
        this.winCombinations = winCombinations;
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

    public Root withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Root.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("columns");
        sb.append('=');
        sb.append(((this.columns == null)?"<null>":this.columns));
        sb.append(',');
        sb.append("rows");
        sb.append('=');
        sb.append(((this.rows == null)?"<null>":this.rows));
        sb.append(',');
        sb.append("symbols");
        sb.append('=');
        sb.append(((this.symbols == null)?"<null>":this.symbols));
        sb.append(',');
        sb.append("probabilities");
        sb.append('=');
        sb.append(((this.probabilities == null)?"<null>":this.probabilities));
        sb.append(',');
        sb.append("winCombinations");
        sb.append('=');
        sb.append(((this.winCombinations == null)?"<null>":this.winCombinations));
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
        result = ((result* 31)+((this.winCombinations == null)? 0 :this.winCombinations.hashCode()));
        result = ((result* 31)+((this.columns == null)? 0 :this.columns.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.rows == null)? 0 :this.rows.hashCode()));
        result = ((result* 31)+((this.probabilities == null)? 0 :this.probabilities.hashCode()));
        result = ((result* 31)+((this.symbols == null)? 0 :this.symbols.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Root) == false) {
            return false;
        }
        Root rhs = ((Root) other);
        return (((((((this.winCombinations == rhs.winCombinations)||((this.winCombinations!= null)&&this.winCombinations.equals(rhs.winCombinations)))&&((this.columns == rhs.columns)||((this.columns!= null)&&this.columns.equals(rhs.columns))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.rows == rhs.rows)||((this.rows!= null)&&this.rows.equals(rhs.rows))))&&((this.probabilities == rhs.probabilities)||((this.probabilities!= null)&&this.probabilities.equals(rhs.probabilities))))&&((this.symbols == rhs.symbols)||((this.symbols!= null)&&this.symbols.equals(rhs.symbols))));
    }

}
