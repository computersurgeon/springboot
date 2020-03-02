package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the t_usr_role database table.
 * 
 */
@Entity
@Table(name="t_usr_role")
@NamedQuery(name="TUsrRole.findAll", query="SELECT t FROM TUsrRole t")
public class TUsrRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_USR_ROLE_ROLEID_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_USR_ROLE_ROLEID_GENERATOR")
	@Column(name="role_id")
	private int roleId;

	@Column(name="role_desc")
	private String roleDesc;

	@Column(name="role_nm")
	private String roleNm;

	//bi-directional many-to-one association to TUserCmpRoleInfo
	@OneToMany(mappedBy="TUsrRole")
	private List<TUserCmpRoleInfo> TUserCmpRoleInfos;

	public TUsrRole() {
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleDesc() {
		return this.roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public String getRoleNm() {
		return this.roleNm;
	}

	public void setRoleNm(String roleNm) {
		this.roleNm = roleNm;
	}

	public List<TUserCmpRoleInfo> getTUserCmpRoleInfos() {
		return this.TUserCmpRoleInfos;
	}

	public void setTUserCmpRoleInfos(List<TUserCmpRoleInfo> TUserCmpRoleInfos) {
		this.TUserCmpRoleInfos = TUserCmpRoleInfos;
	}

	public TUserCmpRoleInfo addTUserCmpRoleInfo(TUserCmpRoleInfo TUserCmpRoleInfo) {
		getTUserCmpRoleInfos().add(TUserCmpRoleInfo);
		TUserCmpRoleInfo.setTUsrRole(this);

		return TUserCmpRoleInfo;
	}

	public TUserCmpRoleInfo removeTUserCmpRoleInfo(TUserCmpRoleInfo TUserCmpRoleInfo) {
		getTUserCmpRoleInfos().remove(TUserCmpRoleInfo);
		TUserCmpRoleInfo.setTUsrRole(null);

		return TUserCmpRoleInfo;
	}

}