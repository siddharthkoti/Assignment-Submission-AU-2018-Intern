
import java.lang.annotation.*;  
import java.lang.reflect.*;  


@Retention(RetentionPolicy.RUNTIME)  
@Target(ElementType.METHOD)  
@interface Student{  
	int rollNum();
	String name();
} 


//Accessing annotation  
class TestCustomAnnotation_2{  
	public static void main(String args[])throws Exception{  

		Annotation_2 h=new Annotation_2();  
		Method m=h.getClass().getMethod("sayHello");  

		Student manno = m.getAnnotation(Student.class);  
		System.out.println("Roll No is: "+ manno.rollNum() + "  Name is :" + manno.name());  
	}
}




