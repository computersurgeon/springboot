package servicemgmt.persistence.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import servicemgmt.persistence.dao.TUserInfoDao;
import servicemgmt.persistence.model.TUserInfo;
import servicemgmt.persistence.repository.TUserInfoRepository;

@Component
public class TUserInfoDaoImpl implements TUserInfoDao {

	@Autowired
	private TUserInfoRepository tUserInfoRepository;
	
	@Override
	public TUserInfo getUserInfoById(String id) {
		return tUserInfoRepository.getTUserInfoById(id);
	}

}
