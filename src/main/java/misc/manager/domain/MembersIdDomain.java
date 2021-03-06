/**
 * 
 */
package misc.manager.domain;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;


/**
 * @author Troublem@ker
 */


public class MembersIdDomain implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "group_id",updatable=false)
	private Long id;

	@Id
	@Column(name="member_acct_number")
	private String memberAccountNumber;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMemberAccountNumber() {
		return memberAccountNumber;
	}

	public void setMemberAccountNumber(String memberAccountNumber) {
		this.memberAccountNumber = memberAccountNumber;
	}
	
	

}
