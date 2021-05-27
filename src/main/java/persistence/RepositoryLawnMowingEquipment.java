package persistence;

import util.DBUtil;

import javax.persistence.EntityManager;

public class RepositoryLawnMowingEquipment {
    private EntityManager em;

    public RepositoryLawnMowingEquipment() {
        em = DBUtil.getEntityManager();
    }

}
