
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
    "reward_multiplier",
    "when",
    "count",
    "group"
})
@Generated("jsonschema2pojo")
public class SameSymbol9Times {

    @JsonProperty("reward_multiplier")
    private Integer rewardMultiplier;
    @JsonProperty("when")
    private String when;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("group")
    private String group;
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

    public SameSymbol9Times withRewardMultiplier(Integer rewardMultiplier) {
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

    public SameSymbol9Times withWhen(String when) {
        this.when = when;
        return this;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public SameSymbol9Times withCount(Integer count) {
        this.count = count;
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

    public SameSymbol9Times withGroup(String group) {
        this.group = group;
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

    public SameSymbol9Times withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(SameSymbol9Times.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("rewardMultiplier");
        sb.append('=');
        sb.append(((this.rewardMultiplier == null)?"<null>":this.rewardMultiplier));
        sb.append(',');
        sb.append("when");
        sb.append('=');
        sb.append(((this.when == null)?"<null>":this.when));
        sb.append(',');
        sb.append("count");
        sb.append('=');
        sb.append(((this.count == null)?"<null>":this.count));
        sb.append(',');
        sb.append("group");
        sb.append('=');
        sb.append(((this.group == null)?"<null>":this.group));
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
        result = ((result* 31)+((this.count == null)? 0 :this.count.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.when == null)? 0 :this.when.hashCode()));
        result = ((result* 31)+((this.rewardMultiplier == null)? 0 :this.rewardMultiplier.hashCode()));
        result = ((result* 31)+((this.group == null)? 0 :this.group.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SameSymbol9Times) == false) {
            return false;
        }
        SameSymbol9Times rhs = ((SameSymbol9Times) other);
        return ((((((this.count == rhs.count)||((this.count!= null)&&this.count.equals(rhs.count)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.when == rhs.when)||((this.when!= null)&&this.when.equals(rhs.when))))&&((this.rewardMultiplier == rhs.rewardMultiplier)||((this.rewardMultiplier!= null)&&this.rewardMultiplier.equals(rhs.rewardMultiplier))))&&((this.group == rhs.group)||((this.group!= null)&&this.group.equals(rhs.group))));
    }

}
