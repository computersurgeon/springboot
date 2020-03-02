package servicemgmt.consumer;

public class Properties {
	
	public Properties(String consumerName, String consumerId, String consumerAddress) {
		super();
		this.consumerName = consumerName;
		this.consumerId = consumerId;
		this.consumerAddress = consumerAddress;
	}
	public String consumerName;
	public String consumerId;
	public String consumerAddress;
	
	public Properties() {}
	
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	public String getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerAddress() {
		return consumerAddress;
	}
	public void setConsumerAddress(String consumerAddress) {
		this.consumerAddress = consumerAddress;
	}

}
