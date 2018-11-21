package soft.eng.stepsbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import soft.eng.stepsbackend.dao.CategoryDAO;
import soft.eng.stepsbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	
	private Category category;
	
	
	@BeforeClass
	public static void init() {		
		context = new AnnotationConfigApplicationContext();
		context.scan("soft.eng.stepsbackend");
		context.refresh();		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		
	}
	
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("Boots");
		category.setDescription("This is the description of Boots category");
		category.setImageURL("CAT_1.png");
		
		assertEquals("Successfully added a category inside the table!", true, categoryDAO.add(category));
		
	}

}
