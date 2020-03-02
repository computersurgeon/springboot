package servicemgmt.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import servicemgmt.persistence.model.TUserInfo;

public interface TUserInfoRepository extends JpaRepository<TUserInfo, Long> {

	TUserInfo getTUserInfoById(@Param("id") String id);

}
