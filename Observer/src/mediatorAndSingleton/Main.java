package mediatorAndSingleton;


public class Main {

	public static void main(String[] args) {
		
		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Ivan");
		User user2 = new ChatUser(chat, "Dobri");
		User user3 = new ChatUser(chat, "Petq");


		user1.send("Hi guys!");
		user2.send("Hi!");
		user3.send("Welcome in the chat!");
		
		user1.send("addBot");
		user2.send("My cat is sleeping rn!");
		user3.send("That was important!");
	}

}
