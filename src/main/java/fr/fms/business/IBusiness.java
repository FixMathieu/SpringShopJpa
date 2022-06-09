package fr.fms.business;

import java.util.ArrayList;
import java.util.List;

import fr.fms.entities.Article;
import fr.fms.entities.Category;

public interface IBusiness {
	/**
	 * méthode qui renvoi tous les articles de la table t_articles en bdd
	 * @return Liste d'articles en base
	 */
	public List<Article> readArticles();
	public List<Category> readCategory();
}
