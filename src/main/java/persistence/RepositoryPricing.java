package persistence;

import model.Pricing;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryPricing {
    private EntityManager em;

    public RepositoryPricing() {
        em = DBUtil.getEntityManager();
    }
    public List<Pricing> listOfPricing() {
        return em.createQuery("From Pricing p order by p.priceId")
                .getResultList();
    }
}
