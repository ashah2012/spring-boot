package org.ashah.sbdatajpah2.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.ashah.sbdatajpah2.entities.User;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserService {
	@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

	public User find(long id) {
		return entityManager.find(User.class, id);
	}

	public List<User> findAll() {
		Query query = entityManager.createNamedQuery("query_find_all_users", User.class);
		return query.getResultList();
	}
}
