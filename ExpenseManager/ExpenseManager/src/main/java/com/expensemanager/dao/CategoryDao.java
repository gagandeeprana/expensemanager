package com.expensemanager.dao;

import java.util.List;

import org.hibernate.Session;

import com.expensemanager.entity.Category;

public interface CategoryDao extends GenericDao<Category> {

	List<Category> findAll(Session session);

	Category findById(Long id, Session session);

	List<Category> getCategoryByCategoryName(Session session,
			String categoryName);


}
