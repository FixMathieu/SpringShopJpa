package fr.fms.business;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import fr.fms.entities.Article;
import fr.fms.entities.Category;

public interface IBusiness {
	/**
	 * méthode qui renvoi tous les articles de la table t_articles en bdd
	 * @return Liste d'articles en base
	 */
	public List<Article> readArticles();
	public List<Category> readCategory();
	public void createArticle(String description, String marque, double price, long idCate);
	public void updateArticle(long idArticle,String description, String marque, double price, long idCate);
	public void deleteArticle(long idArticle);
	public void addCategory(String name);
	public void deleteCategory(long idCategory);
	public void updateCategory(long idCategory, String name);
	public List<Article>  readArticlesByCategory(long idCategory);
	public List<Category> readCategoryById(long idCategory);
	public List<Article> readArticlesById(long idArticle);
}
