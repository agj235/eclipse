import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {
	@BeforeSuite
	public void beforeSuiteAnnotation() {
		System.out.println("This is a Before Suite ANnotation");
	
	}
	@AfterSuite
	public void afterSuiteAnnotation() {
	System.out.println("This is a afterSuite Annotation");
}
	@BeforeTest
	public void beforetestAnnotation() {
	System.out.println("This is a Before Test Annotation");
}
	@AfterTest
	public void afterTestAnnotation() {
	System.out.println("This is a After Test Annotation");
	
}
	@BeforeClass
	public void beforeClassAnnotation() {
	System.out.println("Thisis a Before Class Annotation");
}
	@AfterClass
	public void afterClassAnnotation() {
	System.out.println("Thisis a After Class Annotation");
}
	@BeforeMethod
	public void beforeMethodAnnotation() {
	System.out.println("Thisis a Before Method Annotation");
}
	@AfterMethod
	public void afterMethodAnnotation() {
		System.out.println("Thisis a After Method Annotation");
	}
	@Test
	public void testAnnotation1() {
	System.out.println("This is a Test Annotation1");
}
	@Test
	public void testAnnotation2() {
	System.out.println("This is a Test Annotation2");
}
	@Test
	public void testAnnotation3() {
	System.out.println("This is a Test Annotation3");
}
}

