package java_spring;

//import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {

	ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");

	Student student=(Student)ac.getBean("studentbean");
	student.setName("Naresh");
	student.id.setId(123);
	student.displayInfo();

}
}
