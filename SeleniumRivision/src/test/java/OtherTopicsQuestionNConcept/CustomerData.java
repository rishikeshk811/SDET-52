package OtherTopicsQuestionNConcept;

import java.io.Serializable;

public class CustomerData implements Serializable{

String	customername ;
int age;
String deptName;
Double salary;
long contact;
	public static void main(String[] args) {

	}
	public CustomerData(String customername, int age, String deptName, Double salary, long contact) {
		super();
		this.customername = customername;
		this.age = age;
		this.deptName = deptName;
		this.salary = salary;
		this.contact = contact;
	}
	
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "CustomerData [customername=" + customername + ", age=" + age + ", deptName=" + deptName + ", salary="
				+ salary + ", contact=" + contact + "]";
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}

}
