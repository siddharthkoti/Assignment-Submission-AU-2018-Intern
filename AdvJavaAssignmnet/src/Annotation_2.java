import java.lang.annotation.*;  
import java.lang.reflect.*;  


public class Annotation_2 {
	@Student(rollNum=10, name = "Siddharth")  
	public void sayHello(){
		System.out.println("Student Annotation method");
	}
	
}
