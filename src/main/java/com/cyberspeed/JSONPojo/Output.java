
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
    "matrix",
    "reward",
    "applied_winning_combinations",
    "applied_bonus_symbol"
})
@Generated("jsonschema2pojo")
public class Output {

    @JsonProperty("matrix")
    private List<List<String>> matrix = new ArrayList<List<String>>();
    @JsonProperty("reward")
    private Integer reward;
    @JsonProperty("applied_winning_combinations")
    private JSONPojo.AppliedWinningCombinations appliedWinningCombinations;
    @JsonProperty("applied_bonus_symbol")
    private String appliedBonusSymbol;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("matrix")
    public List<List<String>> getMatrix() {
        return matrix;
    }

    @JsonProperty("matrix")
    public void setMatrix(List<List<String>> matrix) {
        this.matrix = matrix;
    }

    public Output withMatrix(List<List<String>> matrix) {
        this.matrix = matrix;
        return this;
    }

    @JsonProperty("reward")
    public Integer getReward() {
        return reward;
    }

    @JsonProperty("reward")
    public void setReward(Integer reward) {
        this.reward = reward;
    }

    public Output withReward(Integer reward) {
        this.reward = reward;
        return this;
    }

    @JsonProperty("applied_winning_combinations")
    public JSONPojo.AppliedWinningCombinations getAppliedWinningCombinations() {
        return appliedWinningCombinations;
    }

    @JsonProperty("applied_winning_combinations")
    public void setAppliedWinningCombinations(JSONPojo.AppliedWinningCombinations appliedWinningCombinations) {
        this.appliedWinningCombinations = appliedWinningCombinations;
    }

    public Output withAppliedWinningCombinations(JSONPojo.AppliedWinningCombinations appliedWinningCombinations) {
        this.appliedWinningCombinations = appliedWinningCombinations;
        return this;
    }

    @JsonProperty("applied_bonus_symbol")
    public String getAppliedBonusSymbol() {
        return appliedBonusSymbol;
    }

    @JsonProperty("applied_bonus_symbol")
    public void setAppliedBonusSymbol(String appliedBonusSymbol) {
        this.appliedBonusSymbol = appliedBonusSymbol;
    }

    public Output withAppliedBonusSymbol(String appliedBonusSymbol) {
        this.appliedBonusSymbol = appliedBonusSymbol;
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

    public Output withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Output.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("matrix");
        sb.append('=');
        sb.append(((this.matrix == null)?"<null>":this.matrix));
        sb.append(',');
        sb.append("reward");
        sb.append('=');
        sb.append(((this.reward == null)?"<null>":this.reward));
        sb.append(',');
        sb.append("appliedWinningCombinations");
        sb.append('=');
        sb.append(((this.appliedWinningCombinations == null)?"<null>":this.appliedWinningCombinations));
        sb.append(',');
        sb.append("appliedBonusSymbol");
        sb.append('=');
        sb.append(((this.appliedBonusSymbol == null)?"<null>":this.appliedBonusSymbol));
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
        result = ((result* 31)+((this.reward == null)? 0 :this.reward.hashCode()));
        result = ((result* 31)+((this.appliedWinningCombinations == null)? 0 :this.appliedWinningCombinations.hashCode()));
        result = ((result* 31)+((this.appliedBonusSymbol == null)? 0 :this.appliedBonusSymbol.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.matrix == null)? 0 :this.matrix.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Output) == false) {
            return false;
        }
        Output rhs = ((Output) other);
        return ((((((this.reward == rhs.reward)||((this.reward!= null)&&this.reward.equals(rhs.reward)))&&((this.appliedWinningCombinations == rhs.appliedWinningCombinations)||((this.appliedWinningCombinations!= null)&&this.appliedWinningCombinations.equals(rhs.appliedWinningCombinations))))&&((this.appliedBonusSymbol == rhs.appliedBonusSymbol)||((this.appliedBonusSymbol!= null)&&this.appliedBonusSymbol.equals(rhs.appliedBonusSymbol))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.matrix == rhs.matrix)||((this.matrix!= null)&&this.matrix.equals(rhs.matrix))));
    }

}
