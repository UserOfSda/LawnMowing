package persistence;

import model.LawnMowingEquipment;
import util.DBUtil;

import javax.persistence.EntityManager;
import java.util.List;

public class RepositoryLawnMowingEquipment {
    private EntityManager em;

    public RepositoryLawnMowingEquipment() {
        em = DBUtil.getEntityManager();
    }
    public List<LawnMowingEquipment> listAllEquipment() {
        return em.createQuery("From LawnMowingEquipment eq order by eq.equipmentId")
                .getResultList();
    }

}
