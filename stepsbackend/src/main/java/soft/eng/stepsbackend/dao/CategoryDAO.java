package soft.eng.stepsbackend.dao;

import java.util.List;

import soft.eng.stepsbackend.dto.Category;

public interface CategoryDAO {
	
	
	List<Category> list(); //list of categories
	Category get(int id);

}
