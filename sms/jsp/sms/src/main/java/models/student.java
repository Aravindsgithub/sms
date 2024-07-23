package models;

public class student {

	private int id;
	private String name;
	private String branch;
	private String email;
	private long phno;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	
	public student() {
		super();
	}
	
	
	public student(int id, String name, String branch, String email, long phno) {
		super();
		this.id = id;
		this.name = name;
		this.branch = branch;
		this.email = email;
		this.phno = phno;
	}
	
	
	
	
}
