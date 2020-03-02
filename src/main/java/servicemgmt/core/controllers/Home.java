package servicemgmt.core.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {

	@RequestMapping("/")
	public String home() {
		return "Provider : Consumer, service management application home. Change URL /consumer or /provider to view details";
	}
	
	@RequestMapping("consumer")
	public String consumer() {
				
		return "[{consumerId:1000,consumerName:'consumer 1001',consumerAddress:'1001 Bakers st, PA 15218.'},"
				+ "{consumerId:1001,consumerName:'consumer 1002',consumerAddress:'1002 Bakers st, PA 15219.'}"
				+ "{consumerId:1003,consumerName:'consumer 1003',consumerAddress:'1003 Bakers st, PA 15220.'}]";
	}
	
	@RequestMapping("provider")
	public String provider() {
		
		return "[{providerId:100,providerName:'Provider 101',providerService:'Health'},"
				+ "{providerId:101,providerName:'Provider 102',providerService:'Restaurent'}"
				+ "{providerId:103,providerName:'Provider 103',providerService:'Transportation'}]";
	}
}
