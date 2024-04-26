
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
    "column",
    "row",
    "symbols"
})
@Generated("jsonschema2pojo")
public class StandardSymbol {

    @JsonProperty("column")
    private Integer column;
    @JsonProperty("row")
    private Integer row;
    @JsonProperty("symbols")
    private Symbols__1 symbols;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("column")
    public Integer getColumn() {
        return column;
    }

    @JsonProperty("column")
    public void setColumn(Integer column) {
        this.column = column;
    }

    public StandardSymbol withColumn(Integer column) {
        this.column = column;
        return this;
    }

    @JsonProperty("row")
    public Integer getRow() {
        return row;
    }

    @JsonProperty("row")
    public void setRow(Integer row) {
        this.row = row;
    }

    public StandardSymbol withRow(Integer row) {
        this.row = row;
        return this;
    }

    @JsonProperty("symbols")
    public Symbols__1 getSymbols() {
        return symbols;
    }

    @JsonProperty("symbols")
    public void setSymbols(Symbols__1 symbols) {
        this.symbols = symbols;
    }

    public StandardSymbol withSymbols(Symbols__1 symbols) {
        this.symbols = symbols;
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

    public StandardSymbol withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(StandardSymbol.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("column");
        sb.append('=');
        sb.append(((this.column == null)?"<null>":this.column));
        sb.append(',');
        sb.append("row");
        sb.append('=');
        sb.append(((this.row == null)?"<null>":this.row));
        sb.append(',');
        sb.append("symbols");
        sb.append('=');
        sb.append(((this.symbols == null)?"<null>":this.symbols));
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
        result = ((result* 31)+((this.column == null)? 0 :this.column.hashCode()));
        result = ((result* 31)+((this.row == null)? 0 :this.row.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.symbols == null)? 0 :this.symbols.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StandardSymbol) == false) {
            return false;
        }
        StandardSymbol rhs = ((StandardSymbol) other);
        return (((((this.column == rhs.column)||((this.column!= null)&&this.column.equals(rhs.column)))&&((this.row == rhs.row)||((this.row!= null)&&this.row.equals(rhs.row))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.symbols == rhs.symbols)||((this.symbols!= null)&&this.symbols.equals(rhs.symbols))));
    }

}
