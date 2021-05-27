package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryWorkschedule {
    private EntityManager em;

    public RepositoryWorkschedule() {
        em = DBUtil.getEntityManager();
    }
}
