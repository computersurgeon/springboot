package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_user_dep_info database table.
 * 
 */
@Entity
@Table(name="t_user_dep_info")
@NamedQuery(name="TUserDepInfo.findAll", query="SELECT t FROM TUserDepInfo t")
public class TUserDepInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="T_USER_DEP_INFO_USRDEPSKEY_GENERATOR", sequenceName="ORDER_SEQUENCE")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="T_USER_DEP_INFO_USRDEPSKEY_GENERATOR")
	@Column(name="usr_dep_skey")
	private int usrDepSkey;

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

	@Column(name="usr_dep_fs_nm")
	private String usrDepFsNm;

	@Column(name="usr_dep_gndr")
	private String usrDepGndr;

	@Column(name="usr_dep_ls_nm")
	private String usrDepLsNm;

	@Column(name="usr_dep_rel")
	private String usrDepRel;

	@Temporal(TemporalType.DATE)
	@Column(name="usr_dep_strt_dt")
	private Date usrDepStrtDt;

	//bi-directional many-to-one association to TUserInfo
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="usr_id", referencedColumnName="usr_id"),
		@JoinColumn(name="usr_info_skey", referencedColumnName="usr_info_skey")
		})
	private TUserInfo TUserInfo;

	public TUserDepInfo() {
	}

	public int getUsrDepSkey() {
		return this.usrDepSkey;
	}

	public void setUsrDepSkey(int usrDepSkey) {
		this.usrDepSkey = usrDepSkey;
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

	public String getUsrDepFsNm() {
		return this.usrDepFsNm;
	}

	public void setUsrDepFsNm(String usrDepFsNm) {
		this.usrDepFsNm = usrDepFsNm;
	}

	public String getUsrDepGndr() {
		return this.usrDepGndr;
	}

	public void setUsrDepGndr(String usrDepGndr) {
		this.usrDepGndr = usrDepGndr;
	}

	public String getUsrDepLsNm() {
		return this.usrDepLsNm;
	}

	public void setUsrDepLsNm(String usrDepLsNm) {
		this.usrDepLsNm = usrDepLsNm;
	}

	public String getUsrDepRel() {
		return this.usrDepRel;
	}

	public void setUsrDepRel(String usrDepRel) {
		this.usrDepRel = usrDepRel;
	}

	public Date getUsrDepStrtDt() {
		return this.usrDepStrtDt;
	}

	public void setUsrDepStrtDt(Date usrDepStrtDt) {
		this.usrDepStrtDt = usrDepStrtDt;
	}

	public TUserInfo getTUserInfo() {
		return this.TUserInfo;
	}

	public void setTUserInfo(TUserInfo TUserInfo) {
		this.TUserInfo = TUserInfo;
	}

}