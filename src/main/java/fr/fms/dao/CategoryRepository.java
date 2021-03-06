package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Article;
import fr.fms.entities.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

	public List<Category> findAllByOrderByNameAsc();
	
	public List<Category> findAllByOrderByNameDesc();
	public List<Category> findAll();
	public List<Category> findById(long id);
	public List<Category> deleteById(long id);
	
//public void deleteAll();
}
