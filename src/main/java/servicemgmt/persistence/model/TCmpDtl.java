package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the t_cmp_dtl database table.
 * 
 */
@Entity
@Table(name="t_cmp_dtl")
@NamedQuery(name="TCmpDtl.findAll", query="SELECT t FROM TCmpDtl t")
public class TCmpDtl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="cmp_desc")
	private String cmpDesc;

	@Column(name="cmp_id")
	private String cmpId;

	@Column(name="cmp_loc")
	private String cmpLoc;

	@Column(name="cmp_nm")
	private String cmpNm;

	@Column(name="cmp_skey")
	private int cmpSkey;

	@Temporal(TemporalType.DATE)
	@Column(name="cmp_strt_dt")
	private Date cmpStrtDt;

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

	public TCmpDtl() {
	}

	public String getCmpDesc() {
		return this.cmpDesc;
	}

	public void setCmpDesc(String cmpDesc) {
		this.cmpDesc = cmpDesc;
	}

	public String getCmpId() {
		return this.cmpId;
	}

	public void setCmpId(String cmpId) {
		this.cmpId = cmpId;
	}

	public String getCmpLoc() {
		return this.cmpLoc;
	}

	public void setCmpLoc(String cmpLoc) {
		this.cmpLoc = cmpLoc;
	}

	public String getCmpNm() {
		return this.cmpNm;
	}

	public void setCmpNm(String cmpNm) {
		this.cmpNm = cmpNm;
	}

	public int getCmpSkey() {
		return this.cmpSkey;
	}

	public void setCmpSkey(int cmpSkey) {
		this.cmpSkey = cmpSkey;
	}

	public Date getCmpStrtDt() {
		return this.cmpStrtDt;
	}

	public void setCmpStrtDt(Date cmpStrtDt) {
		this.cmpStrtDt = cmpStrtDt;
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

}