package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the t_user_info database table.
 * 
 */
@Entity
@Table(name="t_user_info")
@NamedQuery(name="TUserInfo.findAll", query="SELECT t FROM TUserInfo t")
public class TUserInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TUserInfoPK id;

	@Column(name="rcrd_actv_fl")
	private String rcrdActvFl;

	@Column(name="rcrd_crt_id")
	private String rcrdCrtId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rcrd_crt_ts")
	private Date rcrdCrtTs;

	@Temporal(TemporalType.DATE)
	@Column(name="rcrd_end_dt")
	private Date rcrdEndDt;

	@Temporal(TemporalType.DATE)
	@Column(name="rcrd_strt_dt")
	private Date rcrdStrtDt;

	@Column(name="rcrd_upd_id")
	private String rcrdUpdId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="rcrd_upd_ts")
	private Date rcrdUpdTs;

	@Column(name="user_mob")
	private String userMob;

	@Column(name="usr_email")
	private String usrEmail;

	@Column(name="usr_fs_nm")
	private String usrFsNm;

	@Column(name="usr_login_id")
	private String usrLoginId;

	@Column(name="usr_login_pwd")
	private String usrLoginPwd;

	@Column(name="usr_ls_nm")
	private String usrLsNm;

	@Temporal(TemporalType.DATE)
	@Column(name="usr_strt_dt")
	private Date usrStrtDt;

	//bi-directional many-to-one association to TUserDepInfo
	@OneToMany(mappedBy="TUserInfo")
	private List<TUserDepInfo> TUserDepInfos;

	public TUserInfo() {
	}

	public TUserInfoPK getId() {
		return this.id;
	}

	public void setId(TUserInfoPK id) {
		this.id = id;
	}

	public String getRcrdActvFl() {
		return this.rcrdActvFl;
	}

	public void setRcrdActvFl(String rcrdActvFl) {
		this.rcrdActvFl = rcrdActvFl;
	}

	public String getRcrdCrtId() {
		return this.rcrdCrtId;
	}

	public void setRcrdCrtId(String rcrdCrtId) {
		this.rcrdCrtId = rcrdCrtId;
	}

	public Date getRcrdCrtTs() {
		return this.rcrdCrtTs;
	}

	public void setRcrdCrtTs(Date rcrdCrtTs) {
		this.rcrdCrtTs = rcrdCrtTs;
	}

	public Date getRcrdEndDt() {
		return this.rcrdEndDt;
	}

	public void setRcrdEndDt(Date rcrdEndDt) {
		this.rcrdEndDt = rcrdEndDt;
	}

	public Date getRcrdStrtDt() {
		return this.rcrdStrtDt;
	}

	public void setRcrdStrtDt(Date rcrdStrtDt) {
		this.rcrdStrtDt = rcrdStrtDt;
	}

	public String getRcrdUpdId() {
		return this.rcrdUpdId;
	}

	public void setRcrdUpdId(String rcrdUpdId) {
		this.rcrdUpdId = rcrdUpdId;
	}

	public Date getRcrdUpdTs() {
		return this.rcrdUpdTs;
	}

	public void setRcrdUpdTs(Date rcrdUpdTs) {
		this.rcrdUpdTs = rcrdUpdTs;
	}

	public String getUserMob() {
		return this.userMob;
	}

	public void setUserMob(String userMob) {
		this.userMob = userMob;
	}

	public String getUsrEmail() {
		return this.usrEmail;
	}

	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
	}

	public String getUsrFsNm() {
		return this.usrFsNm;
	}

	public void setUsrFsNm(String usrFsNm) {
		this.usrFsNm = usrFsNm;
	}

	public String getUsrLoginId() {
		return this.usrLoginId;
	}

	public void setUsrLoginId(String usrLoginId) {
		this.usrLoginId = usrLoginId;
	}

	public String getUsrLoginPwd() {
		return this.usrLoginPwd;
	}

	public void setUsrLoginPwd(String usrLoginPwd) {
		this.usrLoginPwd = usrLoginPwd;
	}

	public String getUsrLsNm() {
		return this.usrLsNm;
	}

	public void setUsrLsNm(String usrLsNm) {
		this.usrLsNm = usrLsNm;
	}

	public Date getUsrStrtDt() {
		return this.usrStrtDt;
	}

	public void setUsrStrtDt(Date usrStrtDt) {
		this.usrStrtDt = usrStrtDt;
	}

	public List<TUserDepInfo> getTUserDepInfos() {
		return this.TUserDepInfos;
	}

	public void setTUserDepInfos(List<TUserDepInfo> TUserDepInfos) {
		this.TUserDepInfos = TUserDepInfos;
	}

	public TUserDepInfo addTUserDepInfo(TUserDepInfo TUserDepInfo) {
		getTUserDepInfos().add(TUserDepInfo);
		TUserDepInfo.setTUserInfo(this);

		return TUserDepInfo;
	}

	public TUserDepInfo removeTUserDepInfo(TUserDepInfo TUserDepInfo) {
		getTUserDepInfos().remove(TUserDepInfo);
		TUserDepInfo.setTUserInfo(null);

		return TUserDepInfo;
	}

}