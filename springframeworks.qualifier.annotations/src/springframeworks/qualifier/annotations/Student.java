package springframeworks.qualifier.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Student {
	@Autowired
	@Qualifier(value="2")
	private Address address;/**
	* Address was injected
	**/
	public Student() { 
	}
	public Student(Address address) { 
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showInfo(){
		System.out.println("Student addres is: "+ address.getAddress());
	}
}
