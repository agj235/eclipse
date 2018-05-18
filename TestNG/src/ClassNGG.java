import org.testng.annotations.Test;

public class ClassNGG {
	
	@Test(priority=1)
	public void bProgram() {
		System.out.println("This is a test annotation... ");
	}
	@Test(priority=3)
	public void aProgram() {
		System.out.println("This is another test annotation... ");
	}
	@Test(priority=2)
	public void cProgram() {
		System.out.println("This is a test annotation... ");
	}
	}


