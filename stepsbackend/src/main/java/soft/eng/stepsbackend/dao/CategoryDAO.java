package soft.eng.stepsbackend.dao;

import java.util.List;

import soft.eng.stepsbackend.dto.Category;

public interface CategoryDAO {
	
	
	boolean add(Category category);
	
	List<Category> list(); //list of categories
	Category get(int id);

}
