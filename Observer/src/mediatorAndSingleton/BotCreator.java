package mediatorAndSingleton;



public class BotCreator {

	private static BotCreator newBot;
	
	private BotCreator() {
		// TODO Auto-generated constructor stub
	}

	public static BotCreator createBot() {
		
		if(newBot == null) {
			newBot = new BotCreator();
		}
		
		return newBot;
	}
	public void showMessage() {
		System.out.println("MyChatBot: You can't use the word 'cat'!");
	}
	
}
