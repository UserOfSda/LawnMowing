package persistence;

import model.Customers;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryCustomers {
    private EntityManager em;

    public RepositoryCustomers() {
        em = DBUtil.getEntityManager();
    }

    public List<Customers> listAllCustomers() {
        return em.createQuery("From Customers c order by c.customerId")
                .getResultList();

    }
}
