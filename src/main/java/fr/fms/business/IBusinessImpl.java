package fr.fms.business;
import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.fms.dao.*;
import fr.fms.entities.Article;
import fr.fms.entities.Category;
@Service
public class IBusinessImpl implements IBusiness{
	@Autowired
	private CategoryRepository categoryRepository;

	@Autowired
	private  ArticleRepository articleRepository;
	
	public List<Article> readArticles() {
		
		return  articleRepository.findAll();
	}

	public List<Category> readCategory() {
		
		return categoryRepository.findAll();
	}

	public void createArticle(String description, String marque, double price, long idCate ) {
		for(Category category : categoryRepository.findById(idCate)) {
			articleRepository.save(new Article(description, marque,  price,  category));
		}
		
		
		
	}

	public void updateArticle(long idArticle,String description, String marque, double price, long idCate) {
		for(Category category : categoryRepository.findById(idCate)) {
			articleRepository.save(new Article(idArticle,description, marque,  price,  category));
		}
	}

	public void deleteArticle(long idArticle) {
		
			articleRepository.deleteById(idArticle);
		
		
	}

	public void addCategory(String name) {
		categoryRepository.save(new Category(name));
		
	}

	public void deleteCategory(long idCategory) {
		categoryRepository.deleteById(idCategory);
		
	}

	public void updateCategory(long idCategory, String name) {
		categoryRepository.save(new Category(idCategory,name));
		
	}

	public List<Article>  readArticlesByCategory(long idCategory) {
		
		return articleRepository.findByCategoryId(idCategory);
	}

	public List<Category> readCategoryById(long idCategory) {
	
		return categoryRepository.findById(idCategory);
	}

	public List<Article> readArticlesById(long idArticle) {
		
		return articleRepository.findById(idArticle);
	}

}
