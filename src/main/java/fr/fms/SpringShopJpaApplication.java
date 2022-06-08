package fr.fms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.fms.dao.ArticleRepository;
import fr.fms.dao.CategoryRepository;
import fr.fms.entities.Article;
import fr.fms.entities.Category;

@SpringBootApplication
public class SpringShopJpaApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ArticleRepository articleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringShopJpaApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
//		categoryRepository.save(new Category("Smartphone"));
//		articleRepository.save(new Article("59","Samsung",250));
//		articleRepository.save(new Article("S8","Samsung",250));
		
		
//	for(Article article : articleRepository.findByBrandAndPrice("Samsung",250)) {
//			System.out.println(article);
//		}
//		categoryRepository.save(new Category("Tablet"));
//		categoryRepository.save(new Category("pc"));
		Category smartphone = categoryRepository.save(new Category ("Smartphone"));
		Category tablet = categoryRepository.save(new Category("Tablet"));
		Category pc = categoryRepository.save(new Category("PC"));
		
		articleRepository.save(new Article("S11","Samsung",750,smartphone));
		articleRepository.save(new Article("MI10","Xiaomi",350,smartphone));
		
		articleRepository.save(new Article("ipad","Apple",250,tablet));
		
		articleRepository.save(new Article("mac","Apple",1250,pc));
		
//		for(Article article : articleRepository.searchArticles("sung",200)) {
//			System.out.println(article);
//		}
//		
		for (Article article : articleRepository.findByCategoryId( (long) 2)) {
			System.out.println(article);
		}
		
	}


	
}
