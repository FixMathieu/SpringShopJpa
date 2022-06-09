package fr.fms.business;
import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import java.util.ArrayList;
import java.util.List;

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

}
