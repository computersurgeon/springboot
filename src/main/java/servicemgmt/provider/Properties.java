package servicemgmt.provider;

public class Properties {

	public String providerName;
	public String providerId;
	public String providerAddress;
	public String providerServiceType;
	
	public Properties() {}

	public Properties(String providerName, String providerId, String providerAddress, String providerServiceType) {
		super();
		this.providerName = providerName;
		this.providerId = providerId;
		this.providerAddress = providerAddress;
		this.providerServiceType = providerServiceType;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getProviderId() {
		return providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProviderAddress() {
		return providerAddress;
	}

	public void setProviderAddress(String providerAddress) {
		this.providerAddress = providerAddress;
	}

	public String getProviderServiceType() {
		return providerServiceType;
	}

	public void setProviderServiceType(String providerServiceType) {
		this.providerServiceType = providerServiceType;
	}
	
}
