package servicemgmt.service.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({})
public class Data {

		@JsonIgnore
		private Map<String, Object> data = new HashMap<>();

		@JsonAnyGetter
		public Map<String, Object> getData() {
			return data;
		}

		@JsonAnySetter
		public void setData(String name, Object value) {
			this.data.put(name, value);
		}
}
