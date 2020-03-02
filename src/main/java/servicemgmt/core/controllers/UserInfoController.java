package servicemgmt.core.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import servicemgmt.service.UserInfoService;
import servicemgmt.service.model.ServiceMgmtResponse;

@RestController
@RequestMapping("/user")
public class UserInfoController {

	@Autowired
	private UserInfoService userInfoService;
	
	@RequestMapping(value="/{userId}", method=RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ServiceMgmtResponse getUserInfo(@PathVariable String userId) {
		return userInfoService.getUserInfo(userId);
	}
}
