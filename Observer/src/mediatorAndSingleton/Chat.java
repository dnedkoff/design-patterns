package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	BotCreator myChatBot = BotCreator.createBot();
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void sendMessage(String message, User user) {
		System.out.println(" #[ " + user.name + " in chat: " + " ] "+ ": " + message);
		
		if(myChatBot != null && message.contains("cat")){
			System.out.println("----------------------------------------");
			removeUser(user);
			System.out.println("----------------------------------------");
			myChatBot.showMessage();		
			System.out.println("----------------------------------------");
		}		
		else if(message.equalsIgnoreCase("addBot")){
			myChatBot = BotCreator.createBot();	
		}
		
		for(User chatUser: this.users) {
			if(chatUser != user) {
				if(message.equalsIgnoreCase("addBot")){
					continue;
				}
				if(message.contains("cat")) {
					message = message.replace("cat", "***");
				}
				chatUser.receive(message);
			}
		}		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	public void removeUser(User user) {
			if(user!= null && users.contains(user)) {
				users.remove(user);
				System.out.println(user.name + " was kicked from the chat!");
		}
	}
	
	

}
