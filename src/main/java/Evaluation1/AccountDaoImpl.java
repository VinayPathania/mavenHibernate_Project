package Evaluation1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AccountDaoImpl implements AccountDao{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MavenUnit");
    EntityManager em = emf.createEntityManager();
    @Override
    public String findById(int id) {
       Account ac = em.find(Account.class,id);
       if(ac != null){
           return ac.toString();
       }
       else{
           return "record not found";
       }
    }

    @Override
    public String save(Account account) {
        em.getTransaction().begin();
        em.persist(account);
        em.getTransaction().commit();
        return "record inserted";
    }

    @Override
    public String deleteAccountById(int id) {
        em.getTransaction().begin();
        em.remove(id);
        em.getTransaction().commit();
        return "record inserted";
    }

    @Override
    public String withdraw(double amount, int accountId) {
        Account ac = em.find(Account.class,accountId);
        if (ac == null){
            return "record not found";
        }
        else{
            em.getTransaction().begin();
            ac.setBalance(ac.getBalance()-amount);
            em.getTransaction().commit();
            return "amount withdraw from account";
        }
    }

    @Override
    public String deposit(double amount, int accountId) {
        Account ac = em.find(Account.class,accountId);
        if (ac == null){
            return "record not found";
        }
        else{
            em.getTransaction().begin();
            ac.setBalance(ac.getBalance()+amount);
            em.getTransaction().commit();
            return "amount deposit to account";
        }
    }


}
