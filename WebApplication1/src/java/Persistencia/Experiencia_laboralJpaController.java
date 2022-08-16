/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Estudios;
import Logica.Experiencia_laboral;
import Persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Usuario
 */
public class Experiencia_laboralJpaController implements Serializable {

    public Experiencia_laboralJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
      public Experiencia_laboralJpaController() {
       emf=Persistence.createEntityManagerFactory("miporfolio");
    }
    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Experiencia_laboral experiencia_laboral) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(experiencia_laboral);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Experiencia_laboral experiencia_laboral) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            experiencia_laboral = em.merge(experiencia_laboral);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = experiencia_laboral.getId_exp();
                if (findExperiencia_laboral(id) == null) {
                    throw new NonexistentEntityException("The experiencia_laboral with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Experiencia_laboral experiencia_laboral;
            try {
                experiencia_laboral = em.getReference(Experiencia_laboral.class, id);
                experiencia_laboral.getId_exp();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The experiencia_laboral with id " + id + " no longer exists.", enfe);
            }
            em.remove(experiencia_laboral);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Experiencia_laboral> findExperiencia_laboralEntities() {
        return findExperiencia_laboralEntities(true, -1, -1);
    }

    public List<Experiencia_laboral> findExperiencia_laboralEntities(int maxResults, int firstResult) {
        return findExperiencia_laboralEntities(false, maxResults, firstResult);
    }

    private List<Experiencia_laboral> findExperiencia_laboralEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Experiencia_laboral.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Experiencia_laboral findExperiencia_laboral(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Experiencia_laboral.class, id);
        } finally {
            em.close();
        }
    }

    public int getExperiencia_laboralCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Experiencia_laboral> rt = cq.from(Experiencia_laboral.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    void create(Estudios exp) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
