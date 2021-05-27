package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryLawnMowers {
    private EntityManager em;

    public RepositoryLawnMowers() {
        em = DBUtil.getEntityManager();
    }
}
