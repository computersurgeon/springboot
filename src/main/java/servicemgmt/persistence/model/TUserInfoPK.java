package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_user_info database table.
 * 
 */
@Embeddable
public class TUserInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="usr_info_skey")
	private int usrInfoSkey;

	@Column(name="usr_id")
	private String usrId;

	public TUserInfoPK() {
	}
	public int getUsrInfoSkey() {
		return this.usrInfoSkey;
	}
	public void setUsrInfoSkey(int usrInfoSkey) {
		this.usrInfoSkey = usrInfoSkey;
	}
	public String getUsrId() {
		return this.usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TUserInfoPK)) {
			return false;
		}
		TUserInfoPK castOther = (TUserInfoPK)other;
		return 
			(this.usrInfoSkey == castOther.usrInfoSkey)
			&& this.usrId.equals(castOther.usrId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.usrInfoSkey;
		hash = hash * prime + this.usrId.hashCode();
		
		return hash;
	}
}