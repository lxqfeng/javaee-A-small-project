package domain;

import java.util.Date;

//传输对象，保存User相关数据
public class Person {	
	private String ID;		//类属性需要与数据库中的字段一一对应
	private String name;
	private String password;
	private Date birthday; 
	
	public Person() {
		super();
	}

	public Person(String iD, String name, String password, Date birthDate) {
		super();
		ID = iD;
		this.name = name;
		this.password = password;
		this.birthday = birthDate;
	}	
	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthday;
	}

	public void setBirthDate(Date birthDate) {
		this.birthday = birthDate;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
