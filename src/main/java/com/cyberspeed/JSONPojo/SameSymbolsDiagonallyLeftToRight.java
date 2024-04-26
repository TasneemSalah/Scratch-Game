
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
    "reward_multiplier",
    "when",
    "group",
    "covered_areas"
})
@Generated("jsonschema2pojo")
public class SameSymbolsDiagonallyLeftToRight {

    @JsonProperty("reward_multiplier")
    private Integer rewardMultiplier;
    @JsonProperty("when")
    private String when;
    @JsonProperty("group")
    private String group;
    @JsonProperty("covered_areas")
    private List<List<String>> coveredAreas = new ArrayList<List<String>>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("reward_multiplier")
    public Integer getRewardMultiplier() {
        return rewardMultiplier;
    }

    @JsonProperty("reward_multiplier")
    public void setRewardMultiplier(Integer rewardMultiplier) {
        this.rewardMultiplier = rewardMultiplier;
    }

    public SameSymbolsDiagonallyLeftToRight withRewardMultiplier(Integer rewardMultiplier) {
        this.rewardMultiplier = rewardMultiplier;
        return this;
    }

    @JsonProperty("when")
    public String getWhen() {
        return when;
    }

    @JsonProperty("when")
    public void setWhen(String when) {
        this.when = when;
    }

    public SameSymbolsDiagonallyLeftToRight withWhen(String when) {
        this.when = when;
        return this;
    }

    @JsonProperty("group")
    public String getGroup() {
        return group;
    }

    @JsonProperty("group")
    public void setGroup(String group) {
        this.group = group;
    }

    public SameSymbolsDiagonallyLeftToRight withGroup(String group) {
        this.group = group;
        return this;
    }

    @JsonProperty("covered_areas")
    public List<List<String>> getCoveredAreas() {
        return coveredAreas;
    }

    @JsonProperty("covered_areas")
    public void setCoveredAreas(List<List<String>> coveredAreas) {
        this.coveredAreas = coveredAreas;
    }

    public SameSymbolsDiagonallyLeftToRight withCoveredAreas(List<List<String>> coveredAreas) {
        this.coveredAreas = coveredAreas;
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

    public SameSymbolsDiagonallyLeftToRight withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SameSymbolsDiagonallyLeftToRight.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rewardMultiplier");
        sb.append('=');
        sb.append(((this.rewardMultiplier == null)?"<null>":this.rewardMultiplier));
        sb.append(',');
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
        sb.append(',');
        sb.append("coveredAreas");
        sb.append('=');
        sb.append(((this.coveredAreas == null)?"<null>":this.coveredAreas));
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
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.rewardMultiplier == null)? 0 :this.rewardMultiplier.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        result = ((result* 31)+((this.coveredAreas == null)? 0 :this.coveredAreas.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SameSymbolsDiagonallyLeftToRight) == false) {
            return false;
        }
        SameSymbolsDiagonallyLeftToRight rhs = ((SameSymbolsDiagonallyLeftToRight) other);
        return ((((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.rewardMultiplier == rhs.rewardMultiplier)||((this.rewardMultiplier!= null)&&this.rewardMultiplier.equals(rhs.rewardMultiplier))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))))&&((this.coveredAreas == rhs.coveredAreas)||((this.coveredAreas!= null)&&this.coveredAreas.equals(rhs.coveredAreas))));
    }

}
