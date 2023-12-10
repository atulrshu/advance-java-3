package app;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var user = new User(0L, "Thor");
		
		var rep = new Repository<User>();
		
		rep.save(user);
		
	}

}
