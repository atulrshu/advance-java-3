package app;

public class User {

	@Field
	@Deprecated
	private Long id;
	
	@Field
	private String name;
	
	private int sequence;
	
	public User(Long id, String name) {
		//super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	
}