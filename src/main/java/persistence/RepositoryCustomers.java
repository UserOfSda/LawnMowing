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

    public List<Customers> listAllCustomersByAddress() {
        return em.createQuery("FROM Customers order by customerAddress")
                .getResultList();
    }

    public List<Customers> listAllCustomersByWorkingArea() {
        return em.createQuery("FROM Customers order by customerWorkingArea")
                .getResultList();
    }

    public List<Customers> addCustomer(Customers customers) {
        try {
            em.getTransaction().begin();
            em.persist(customers);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();

        }
        return null;
    }

    public List<Customers> updateCustomer(Customers customers) {
        try {
            em.getTransaction().begin();
            em.merge(updateCustomer(customers));
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();

        }
        return null;
    }
    public void updateEmployeeSalary(int employeeId, int newSalary) {
        em.getTransaction().begin();
        //String sql = "Insert INTO Employee";
        //String sql = "DELETE FROM";
        String sql = "UPDATE Employee e SET e.salary = :newValue WHERE e.employeeId = :id";
        int result = em
                .createQuery(sql)
                .setParameter("newValue", newSalary)
                .setParameter("id", employeeId).executeUpdate();
        em.getTransaction().commit();
        if (result > 0) {
            System.out.println("Employee updated with success!");
        }
    }
}

