package servicemgmt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import servicemgmt.persistence.repository.TUserInfoRepository;
import servicemgmt.service.UserInfoService;
import servicemgmt.service.model.Data;
import servicemgmt.service.model.ServiceMgmtResponse;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private TUserInfoRepository tUserInfoRepository;
	
	@Override
	public ServiceMgmtResponse getUserInfo(String id) {
		ServiceMgmtResponse response = new ServiceMgmtResponse();
		if(id != null && !id.isEmpty()) {
			
			Data data = new Data();
			data.setData("data", tUserInfoRepository.getTUserInfoById(id));
		
		}
		return response;
	}

}
