import java.util.List;
 
import javax.persistence.EntityManager;
import javax.persistence.Query;
 
import org.springframework.stereotype.Repository;
 
@Repository
public class UserImpl implements {
	private static final long serialVersionUID = 1L;
	
	private EntityManager entityManager;
    
	public UserImpl() {
		super();
	}
	
	public UserImpl(EntityManager manager) {
		this();
		entityManager = manager;
	}

	@Override
	public List getAll() {
		Query query = entityManager.createQuery("from User");

		@SuppressWarnings("unchecked")
		List list = query.getResultList();
		entityManager.close();
		return list;
	}
}}
