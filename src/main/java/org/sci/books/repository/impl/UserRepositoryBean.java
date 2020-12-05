package org.sci.books.repository.impl;

import org.sci.books.entity.ClientDao;
import org.sci.books.entity.ManagementDao;
import org.sci.books.repository.interfaces.UserRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
@Transactional
public class UserRepositoryBean implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    public void createManager(ManagementDao mg){
        em.persist(mg);
    }

    @Override
    public void createClient(ClientDao cl) {
        em.persist(cl);
    }
}
