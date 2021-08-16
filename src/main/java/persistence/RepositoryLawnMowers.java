package persistence;

import model.LawnMowers;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryLawnMowers {
    private EntityManager em;

    public RepositoryLawnMowers() {
        em = DBUtil.getEntityManager();
    }
    public List<LawnMowers> listOfWorkers() {
        return em.createQuery("FROM LawnMowers order by lawnMower_Name")
                .getResultList();
    }
}
