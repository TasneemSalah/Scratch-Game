
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
    "same_symbol_3_times",
    "same_symbol_4_times",
    "same_symbol_5_times",
    "same_symbol_6_times",
    "same_symbol_7_times",
    "same_symbol_8_times",
    "same_symbol_9_times",
    "same_symbols_horizontally",
    "same_symbols_vertically",
    "same_symbols_diagonally_left_to_right",
    "same_symbols_diagonally_right_to_left"
})
@Generated("jsonschema2pojo")
public class WinCombinations {

    @JsonProperty("same_symbol_3_times")
    private SameSymbol3Times sameSymbol3Times;
    @JsonProperty("same_symbol_4_times")
    private SameSymbol4Times sameSymbol4Times;
    @JsonProperty("same_symbol_5_times")
    private SameSymbol5Times sameSymbol5Times;
    @JsonProperty("same_symbol_6_times")
    private SameSymbol6Times sameSymbol6Times;
    @JsonProperty("same_symbol_7_times")
    private SameSymbol7Times sameSymbol7Times;
    @JsonProperty("same_symbol_8_times")
    private SameSymbol8Times sameSymbol8Times;
    @JsonProperty("same_symbol_9_times")
    private SameSymbol9Times sameSymbol9Times;
    @JsonProperty("same_symbols_horizontally")
    private SameSymbolsHorizontally sameSymbolsHorizontally;
    @JsonProperty("same_symbols_vertically")
    private SameSymbolsVertically sameSymbolsVertically;
    @JsonProperty("same_symbols_diagonally_left_to_right")
    private SameSymbolsDiagonallyLeftToRight sameSymbolsDiagonallyLeftToRight;
    @JsonProperty("same_symbols_diagonally_right_to_left")
    private SameSymbolsDiagonallyRightToLeft sameSymbolsDiagonallyRightToLeft;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("same_symbol_3_times")
    public SameSymbol3Times getSameSymbol3Times() {
        return sameSymbol3Times;
    }

    @JsonProperty("same_symbol_3_times")
    public void setSameSymbol3Times(SameSymbol3Times sameSymbol3Times) {
        this.sameSymbol3Times = sameSymbol3Times;
    }

    public WinCombinations withSameSymbol3Times(SameSymbol3Times sameSymbol3Times) {
        this.sameSymbol3Times = sameSymbol3Times;
        return this;
    }

    @JsonProperty("same_symbol_4_times")
    public SameSymbol4Times getSameSymbol4Times() {
        return sameSymbol4Times;
    }

    @JsonProperty("same_symbol_4_times")
    public void setSameSymbol4Times(SameSymbol4Times sameSymbol4Times) {
        this.sameSymbol4Times = sameSymbol4Times;
    }

    public WinCombinations withSameSymbol4Times(SameSymbol4Times sameSymbol4Times) {
        this.sameSymbol4Times = sameSymbol4Times;
        return this;
    }

    @JsonProperty("same_symbol_5_times")
    public SameSymbol5Times getSameSymbol5Times() {
        return sameSymbol5Times;
    }

    @JsonProperty("same_symbol_5_times")
    public void setSameSymbol5Times(SameSymbol5Times sameSymbol5Times) {
        this.sameSymbol5Times = sameSymbol5Times;
    }

    public WinCombinations withSameSymbol5Times(SameSymbol5Times sameSymbol5Times) {
        this.sameSymbol5Times = sameSymbol5Times;
        return this;
    }

    @JsonProperty("same_symbol_6_times")
    public SameSymbol6Times getSameSymbol6Times() {
        return sameSymbol6Times;
    }

    @JsonProperty("same_symbol_6_times")
    public void setSameSymbol6Times(SameSymbol6Times sameSymbol6Times) {
        this.sameSymbol6Times = sameSymbol6Times;
    }

    public WinCombinations withSameSymbol6Times(SameSymbol6Times sameSymbol6Times) {
        this.sameSymbol6Times = sameSymbol6Times;
        return this;
    }

    @JsonProperty("same_symbol_7_times")
    public SameSymbol7Times getSameSymbol7Times() {
        return sameSymbol7Times;
    }

    @JsonProperty("same_symbol_7_times")
    public void setSameSymbol7Times(SameSymbol7Times sameSymbol7Times) {
        this.sameSymbol7Times = sameSymbol7Times;
    }

    public WinCombinations withSameSymbol7Times(SameSymbol7Times sameSymbol7Times) {
        this.sameSymbol7Times = sameSymbol7Times;
        return this;
    }

    @JsonProperty("same_symbol_8_times")
    public SameSymbol8Times getSameSymbol8Times() {
        return sameSymbol8Times;
    }

    @JsonProperty("same_symbol_8_times")
    public void setSameSymbol8Times(SameSymbol8Times sameSymbol8Times) {
        this.sameSymbol8Times = sameSymbol8Times;
    }

    public WinCombinations withSameSymbol8Times(SameSymbol8Times sameSymbol8Times) {
        this.sameSymbol8Times = sameSymbol8Times;
        return this;
    }

    @JsonProperty("same_symbol_9_times")
    public SameSymbol9Times getSameSymbol9Times() {
        return sameSymbol9Times;
    }

    @JsonProperty("same_symbol_9_times")
    public void setSameSymbol9Times(SameSymbol9Times sameSymbol9Times) {
        this.sameSymbol9Times = sameSymbol9Times;
    }

    public WinCombinations withSameSymbol9Times(SameSymbol9Times sameSymbol9Times) {
        this.sameSymbol9Times = sameSymbol9Times;
        return this;
    }

    @JsonProperty("same_symbols_horizontally")
    public SameSymbolsHorizontally getSameSymbolsHorizontally() {
        return sameSymbolsHorizontally;
    }

    @JsonProperty("same_symbols_horizontally")
    public void setSameSymbolsHorizontally(SameSymbolsHorizontally sameSymbolsHorizontally) {
        this.sameSymbolsHorizontally = sameSymbolsHorizontally;
    }

    public WinCombinations withSameSymbolsHorizontally(SameSymbolsHorizontally sameSymbolsHorizontally) {
        this.sameSymbolsHorizontally = sameSymbolsHorizontally;
        return this;
    }

    @JsonProperty("same_symbols_vertically")
    public SameSymbolsVertically getSameSymbolsVertically() {
        return sameSymbolsVertically;
    }

    @JsonProperty("same_symbols_vertically")
    public void setSameSymbolsVertically(SameSymbolsVertically sameSymbolsVertically) {
        this.sameSymbolsVertically = sameSymbolsVertically;
    }

    public WinCombinations withSameSymbolsVertically(SameSymbolsVertically sameSymbolsVertically) {
        this.sameSymbolsVertically = sameSymbolsVertically;
        return this;
    }

    @JsonProperty("same_symbols_diagonally_left_to_right")
    public SameSymbolsDiagonallyLeftToRight getSameSymbolsDiagonallyLeftToRight() {
        return sameSymbolsDiagonallyLeftToRight;
    }

    @JsonProperty("same_symbols_diagonally_left_to_right")
    public void setSameSymbolsDiagonallyLeftToRight(SameSymbolsDiagonallyLeftToRight sameSymbolsDiagonallyLeftToRight) {
        this.sameSymbolsDiagonallyLeftToRight = sameSymbolsDiagonallyLeftToRight;
    }

    public WinCombinations withSameSymbolsDiagonallyLeftToRight(SameSymbolsDiagonallyLeftToRight sameSymbolsDiagonallyLeftToRight) {
        this.sameSymbolsDiagonallyLeftToRight = sameSymbolsDiagonallyLeftToRight;
        return this;
    }

    @JsonProperty("same_symbols_diagonally_right_to_left")
    public SameSymbolsDiagonallyRightToLeft getSameSymbolsDiagonallyRightToLeft() {
        return sameSymbolsDiagonallyRightToLeft;
    }

    @JsonProperty("same_symbols_diagonally_right_to_left")
    public void setSameSymbolsDiagonallyRightToLeft(SameSymbolsDiagonallyRightToLeft sameSymbolsDiagonallyRightToLeft) {
        this.sameSymbolsDiagonallyRightToLeft = sameSymbolsDiagonallyRightToLeft;
    }

    public WinCombinations withSameSymbolsDiagonallyRightToLeft(SameSymbolsDiagonallyRightToLeft sameSymbolsDiagonallyRightToLeft) {
        this.sameSymbolsDiagonallyRightToLeft = sameSymbolsDiagonallyRightToLeft;
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

    public WinCombinations withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(WinCombinations.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sameSymbol3Times");
        sb.append('=');
        sb.append(((this.sameSymbol3Times == null)?"<null>":this.sameSymbol3Times));
        sb.append(',');
        sb.append("sameSymbol4Times");
        sb.append('=');
        sb.append(((this.sameSymbol4Times == null)?"<null>":this.sameSymbol4Times));
        sb.append(',');
        sb.append("sameSymbol5Times");
        sb.append('=');
        sb.append(((this.sameSymbol5Times == null)?"<null>":this.sameSymbol5Times));
        sb.append(',');
        sb.append("sameSymbol6Times");
        sb.append('=');
        sb.append(((this.sameSymbol6Times == null)?"<null>":this.sameSymbol6Times));
        sb.append(',');
        sb.append("sameSymbol7Times");
        sb.append('=');
        sb.append(((this.sameSymbol7Times == null)?"<null>":this.sameSymbol7Times));
        sb.append(',');
        sb.append("sameSymbol8Times");
        sb.append('=');
        sb.append(((this.sameSymbol8Times == null)?"<null>":this.sameSymbol8Times));
        sb.append(',');
        sb.append("sameSymbol9Times");
        sb.append('=');
        sb.append(((this.sameSymbol9Times == null)?"<null>":this.sameSymbol9Times));
        sb.append(',');
        sb.append("sameSymbolsHorizontally");
        sb.append('=');
        sb.append(((this.sameSymbolsHorizontally == null)?"<null>":this.sameSymbolsHorizontally));
        sb.append(',');
        sb.append("sameSymbolsVertically");
        sb.append('=');
        sb.append(((this.sameSymbolsVertically == null)?"<null>":this.sameSymbolsVertically));
        sb.append(',');
        sb.append("sameSymbolsDiagonallyLeftToRight");
        sb.append('=');
        sb.append(((this.sameSymbolsDiagonallyLeftToRight == null)?"<null>":this.sameSymbolsDiagonallyLeftToRight));
        sb.append(',');
        sb.append("sameSymbolsDiagonallyRightToLeft");
        sb.append('=');
        sb.append(((this.sameSymbolsDiagonallyRightToLeft == null)?"<null>":this.sameSymbolsDiagonallyRightToLeft));
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
        result = ((result* 31)+((this.sameSymbol9Times == null)? 0 :this.sameSymbol9Times.hashCode()));
        result = ((result* 31)+((this.sameSymbol6Times == null)? 0 :this.sameSymbol6Times.hashCode()));
        result = ((result* 31)+((this.sameSymbolsDiagonallyRightToLeft == null)? 0 :this.sameSymbolsDiagonallyRightToLeft.hashCode()));
        result = ((result* 31)+((this.sameSymbolsHorizontally == null)? 0 :this.sameSymbolsHorizontally.hashCode()));
        result = ((result* 31)+((this.sameSymbol7Times == null)? 0 :this.sameSymbol7Times.hashCode()));
        result = ((result* 31)+((this.sameSymbolsDiagonallyLeftToRight == null)? 0 :this.sameSymbolsDiagonallyLeftToRight.hashCode()));
        result = ((result* 31)+((this.sameSymbolsVertically == null)? 0 :this.sameSymbolsVertically.hashCode()));
        result = ((result* 31)+((this.sameSymbol4Times == null)? 0 :this.sameSymbol4Times.hashCode()));
        result = ((result* 31)+((this.sameSymbol5Times == null)? 0 :this.sameSymbol5Times.hashCode()));
        result = ((result* 31)+((this.sameSymbol8Times == null)? 0 :this.sameSymbol8Times.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.sameSymbol3Times == null)? 0 :this.sameSymbol3Times.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WinCombinations) == false) {
            return false;
        }
        WinCombinations rhs = ((WinCombinations) other);
        return (((((((((((((this.sameSymbol9Times == rhs.sameSymbol9Times)||((this.sameSymbol9Times!= null)&&this.sameSymbol9Times.equals(rhs.sameSymbol9Times)))&&((this.sameSymbol6Times == rhs.sameSymbol6Times)||((this.sameSymbol6Times!= null)&&this.sameSymbol6Times.equals(rhs.sameSymbol6Times))))&&((this.sameSymbolsDiagonallyRightToLeft == rhs.sameSymbolsDiagonallyRightToLeft)||((this.sameSymbolsDiagonallyRightToLeft!= null)&&this.sameSymbolsDiagonallyRightToLeft.equals(rhs.sameSymbolsDiagonallyRightToLeft))))&&((this.sameSymbolsHorizontally == rhs.sameSymbolsHorizontally)||((this.sameSymbolsHorizontally!= null)&&this.sameSymbolsHorizontally.equals(rhs.sameSymbolsHorizontally))))&&((this.sameSymbol7Times == rhs.sameSymbol7Times)||((this.sameSymbol7Times!= null)&&this.sameSymbol7Times.equals(rhs.sameSymbol7Times))))&&((this.sameSymbolsDiagonallyLeftToRight == rhs.sameSymbolsDiagonallyLeftToRight)||((this.sameSymbolsDiagonallyLeftToRight!= null)&&this.sameSymbolsDiagonallyLeftToRight.equals(rhs.sameSymbolsDiagonallyLeftToRight))))&&((this.sameSymbolsVertically == rhs.sameSymbolsVertically)||((this.sameSymbolsVertically!= null)&&this.sameSymbolsVertically.equals(rhs.sameSymbolsVertically))))&&((this.sameSymbol4Times == rhs.sameSymbol4Times)||((this.sameSymbol4Times!= null)&&this.sameSymbol4Times.equals(rhs.sameSymbol4Times))))&&((this.sameSymbol5Times == rhs.sameSymbol5Times)||((this.sameSymbol5Times!= null)&&this.sameSymbol5Times.equals(rhs.sameSymbol5Times))))&&((this.sameSymbol8Times == rhs.sameSymbol8Times)||((this.sameSymbol8Times!= null)&&this.sameSymbol8Times.equals(rhs.sameSymbol8Times))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.sameSymbol3Times == rhs.sameSymbol3Times)||((this.sameSymbol3Times!= null)&&this.sameSymbol3Times.equals(rhs.sameSymbol3Times))));
    }

}
