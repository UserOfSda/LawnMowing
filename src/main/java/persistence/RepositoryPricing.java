package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryPricing {
    private EntityManager em;

    public RepositoryPricing() {
        em = DBUtil.getEntityManager();
    }
}
