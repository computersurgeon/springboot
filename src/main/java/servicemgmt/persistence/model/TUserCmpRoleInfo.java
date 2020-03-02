package servicemgmt.persistence.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the t_user_cmp_role_info database table.
 * 
 */
@Entity
@Table(name="t_user_cmp_role_info")
@NamedQuery(name="TUserCmpRoleInfo.findAll", query="SELECT t FROM TUserCmpRoleInfo t")
public class TUserCmpRoleInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TUserCmpRoleInfoPK id;

	//bi-directional many-to-one association to TUsrRole
	@ManyToOne
	@JoinColumn(name="role_id")
	private TUsrRole TUsrRole;

	public TUserCmpRoleInfo() {
	}

	public TUserCmpRoleInfoPK getId() {
		return this.id;
	}

	public void setId(TUserCmpRoleInfoPK id) {
		this.id = id;
	}

	public TUsrRole getTUsrRole() {
		return this.TUsrRole;
	}

	public void setTUsrRole(TUsrRole TUsrRole) {
		this.TUsrRole = TUsrRole;
	}

}