package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the t_user_cmp_role_info database table.
 * 
 */
@Embeddable
public class TUserCmpRoleInfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="usr_id")
	private String usrId;

	@Column(name="cmp_id")
	private String cmpId;

	public TUserCmpRoleInfoPK() {
	}
	public String getUsrId() {
		return this.usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getCmpId() {
		return this.cmpId;
	}
	public void setCmpId(String cmpId) {
		this.cmpId = cmpId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof TUserCmpRoleInfoPK)) {
			return false;
		}
		TUserCmpRoleInfoPK castOther = (TUserCmpRoleInfoPK)other;
		return 
			this.usrId.equals(castOther.usrId)
			&& this.cmpId.equals(castOther.cmpId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.usrId.hashCode();
		hash = hash * prime + this.cmpId.hashCode();
		
		return hash;
	}
}