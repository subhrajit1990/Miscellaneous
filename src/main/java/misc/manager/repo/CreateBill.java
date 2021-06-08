/**
 * 
 */
package misc.manager.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import misc.manager.domain.AddBillDomain;

/**
 * @author Troublem@ker
 */
@Repository
public interface CreateBill extends CrudRepository<AddBillDomain, String> {

}
