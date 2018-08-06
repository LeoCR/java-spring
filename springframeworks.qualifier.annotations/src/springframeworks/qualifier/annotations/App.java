package springframeworks.qualifier.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
 
public class App {

	/**
	 * Spring relies heavily on IoC inversion of control
	 * 
	 * ~ the spring container helps to make this inversion of control
	 * 
	 * Create the objects + wire them together + manage their complete lifecycle
	 * from creation to destruction + uses DI ti manage components --> these are
	 * the spring beans
	 * 
	 * instructions + metadata --> the container creates the full application
	 * !!! (XML, annotations)
	 * 
	 * Two containers: 1.) Spring BeanFactory container 2.) Spring
	 * ApplicationContet container INTERFACE --> basically it includes all the
	 * features of BeanFactory so this is the standard way For example: resolve
	 * textual information from a properties file + load beans + wire beans
	 * together org.springframework.context.ApplicationContext Beans --> we have
	 * to define them in the XML file We can specify the scope for the bean
	 * 
	 * For example: we want the bean to be unique then we set the scope to be
	 * singleton To force Spring to produce a new bean instance each time one is
	 * needed, we should set bean's scope attribute to be prototype !!!
	 * 
	 * singleton: single instance of the bean per container prototype: there can
	 * be any number of instances in the container
	 * 
	 * 
	 * @Autowire: how to inject an object without the instantiation phase
	 * @Qualifier: There may be a situation when you create more than one bean
	 *             of the same type and want to wire only one of them with a
	 *             property
	 * 
	 */
	public static void main(String[] args) {
		// ApplicationContext applicationContext= new
		// ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Student student = (Student) applicationContext.getBean("student_bean");

		student.showInfo();

		((ConfigurableApplicationContext) applicationContext).close();
	}
}
