package fr.fms;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.business.IBusinessImpl;
import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}

	@Autowired
	private IBusinessImpl business;

	@Override
	public void run(String... args) throws Exception {
//		for (Article article : articleRepository.findAll()) {
//			System.out.println(article);
//		}
		boolean menu = true;
		System.out.println(
				"-------------------------------------------------- Menu -----------------------------------------");
		Scanner scan = new Scanner(System.in);
		int menuChoice = 0;
		while (menu = true) {
			System.out.println("\nQue souhaitez vous faire ? ");
			System.out.println(" ");

			System.out.println("1/ Afficher tous les articles\n" + "2/ Afficher 5 articles par page\n"
					+ "3/ Ajouter un article\n" + "4/ Mettre à jour un article\n" + "5/ Supprimer un article\n"
					+ "6/ Afficher toutes les catégories\n" + "7/ Ajouter une categorie\n"
					+ "8/ Mettre à jour une categorie\n" + "9/ Supprimer une categorie\n" + "0/ Sortir");
			while (!scan.hasNextInt())
				scan.next();
			menuChoice = scan.nextInt();
			switch (menuChoice) {
			case 1:
				readArticle();
				break;
			case 2:
				read5ArticlesByPage();
				break;
			case 3:
				addArticle();
				break;
			case 4:
				updateArticle();
				break;
			case 5:
				deleteArticle();
				break;

			case 6:
				readCategory();
				break;
			case 7:
				addCategory();
				break;
			case 8:
				updateCategory();
				break;
			case 9:
				deleteCategory();
				break;
				
			case 0:
				// Exit
				menu=false;
				break;
			default:
				System.out.println("\nMauvaise saisie.");
			}
		}
	}

	private static void deleteCategory() {
		// TODO Auto-generated method stub

	}

	private static void updateCategory() {
		// TODO Auto-generated method stub

	}

	private static void addCategory() {
		// TODO Auto-generated method stub

	}

	private static void show5CategoryByPage() {
		// TODO Auto-generated method stub

	}

	private static void deleteArticle() {
		// TODO Auto-generated method stub

	}

	private static void updateArticle() {
		// TODO Auto-generated method stub

	}

	private static void addArticle() {
		// TODO Auto-generated method stub

	}

	private static void read5ArticlesByPage() {
		// TODO Auto-generated method stub

	}

	private void readCategory() {
		System.out.println("+--------+-------------------------------+");
		System.out.println("+              CATEGORIES                +");
		System.out.println("+--------+-------------------------------+");
		System.out.printf("|  %-5s | %-30s| %n", " ID", "            Name");
		System.out.println("+--------+-------------------------------+");
		for (Category category : business.readCategory()) {
			System.out.printf("|  %-5s | %-30s|%n", category.getId(), category.getName());
		}
		System.out.println("+--------+-------------------------------+");

	}

	private void readArticle() {
		System.out.println(
				"+------+------------------------------------------+--------------------------------+---------------------+");
		System.out.println(
				"+                                            ARTICLES                                                    +");
		System.out.println(
				"+------+------------------------------------------+--------------------------------+---------------------+");
		System.out.printf("| %-5s| %-40s | %-30s | %-20s|%n", " ID", "               Description", "           Marque",
				"        Prix");
		System.out.println(
				"+------+------------------------------------------+--------------------------------+---------------------+");
		for (Article article : business.readArticles()) {
			System.out.printf("| %-5s| %-40s | %-30s | %20s|%n", article.getId(), article.getBrand(),
					article.getDescription(), article.getPrice() + " €uros ");
		}
		System.out.println(
				"+------+------------------------------------------+--------------------------------+---------------------+");

	}

//		articleRepository.deleteAll();
//		categoryRepository.deleteAll();

//		categoryRepository.save(new Category("Smartphone"));
//		articleRepository.save(new Article("59","Samsung",250));
//		articleRepository.save(new Article("S8","Samsung",250));

//		for (Article article : articleRepository.findByBrandAndPrice("Samsung", 750)) {
//			System.out.println(article);
//		}

//		Category smartphone = categoryRepository.save(new Category("Smartphone"));
//		Category tablet = categoryRepository.save(new Category("Tablet"));
//		Category pc = categoryRepository.save(new Category("PC"));
//	
//		articleRepository.save(new Article("S11","Samsung",750,smartphone));
//		articleRepository.save(new Article("MI10","Xiaomi",350,smartphone));
//		articleRepository.save(new Article("Iphone","Apple",950,smartphone));
//		articleRepository.save(new Article("MI11","Xiaomi",850,smartphone));
//		articleRepository.save(new Article("S10","Samsung",450,smartphone));
//		articleRepository.save(new Article("MI9","Xiaomi",150,smartphone));
//		
//		articleRepository.save(new Article("ipad","Apple",1250,tablet));
//		articleRepository.save(new Article("Galaxy A8","Samsung",250,tablet));
//		articleRepository.save(new Article("Galaxy S8","Samsung",1450,tablet));
//		
//		
//		articleRepository.save(new Article("mac","Apple",1250,pc));

//		for (Article article : articleRepository.findAll()) {
//			System.out.println(article);
//		}
//
//		for(Article article : articleRepository.searchArticles("sung",200)) {
//			System.out.println(article);
//		}
//		
//		for (Article article : articleRepository.findByCategoryId( (long) 2)) {
//			System.out.println(article);
//		}

//		for (Article article : articleRepository.findByDescriptionAndBrand("S11", "Samsung")) {
//			System.out.println(article);
//		}
// méthode delete
//		for (Article article : articleRepository.deleteById(1)) {
//			System.out.println(article);
//		}

//	méthode update :
//	articleRepository.save(new Article( 2,"S8","Samsung",250,smartphone));

//		for (Category category : categoryRepository.findAll()) {
//			System.out.println(category);
//		}

//	for (Category category : categoryRepository.findAllByOrderByNameAsc()) {
//		System.out.println(category);
//	}
//	for (Category category : categoryRepository.findAllByOrderByNameDesc()) {
//		System.out.println(category);
//	}

}
