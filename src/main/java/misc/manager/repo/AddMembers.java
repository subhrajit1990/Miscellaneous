package misc.manager.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import misc.manager.domain.AddMembersDomain;


/**
 * @author Troublem@ker
 */

@Repository
public interface AddMembers extends CrudRepository<AddMembersDomain,String> {

	/**
	 * @param addMembersDomain
	 */


}
 