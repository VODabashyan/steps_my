package soft.eng.stepsbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import soft.eng.stepsbackend.dao.CategoryDAO;
import soft.eng.stepsbackend.dto.Category;


@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	
	private static List<Category> categories = new ArrayList<>();

	
	static {
		
		Category category = new Category();
		
		//adding the first category
		category.setId(1);
		category.setName("Boots");
		category.setDescription("This is the description of Boots category");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		
		//second category
		category = new Category();
		category.setId(2);
		category.setName("Oxfords");
		category.setDescription("This is the description of Oxfords category");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
	
		
		//third category
		category = new Category();
		category.setId(3);
		category.setName("Sneakers");
		category.setDescription("This is the description of Sneakers category");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
		
		
		
		
	}
	
	
	
	@Override
	public List<Category> list() {
		
		return categories;
	}



	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			
			if(category.getId() == id) return category;
		}
		
		return null;
		
	}

}
