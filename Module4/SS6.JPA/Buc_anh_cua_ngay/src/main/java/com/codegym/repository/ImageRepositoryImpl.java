package com.codegym.repository;

import com.codegym.model.Image;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
public class ImageRepositoryImpl implements ImageRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Image> findAll() {
        TypedQuery<Image> query = em.createQuery("select c from image c", Image.class);
        return query.getResultList();
    }

    @Override
    public Image findById(Long id) {
        TypedQuery<Image> query = em.createQuery("select c from image c where c.id=:id", Image.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void save(Image model) {
        if (model.getId() != null) {
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Image image = findById(id);
        if (image != null) {
            em.remove(image);
        }
    }
}
