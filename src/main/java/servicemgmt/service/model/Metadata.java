package servicemgmt.service.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "success", "status", "error" })
public class Metadata {

	@JsonProperty("success")
	private String success;
	
	@JsonProperty("status")
	private String status;
	
	@JsonProperty("error")
	private String error;

	@JsonProperty("success")
	public String getSuccess() {
		return success;
	}

	@JsonProperty("success")
	public void setSuccess(String success) {
		this.success = success;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("error")
	public String getError() {
		return error;
	}

	@JsonProperty("error")
	public void setError(String error) {
		this.error = error;
	}
	
	
}
