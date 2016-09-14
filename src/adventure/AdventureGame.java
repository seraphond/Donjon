package adventure;

import adventure.characters.Player;
import adventure.room.Room;

public class AdventureGame {
	private Room currentRoom;
	private Player player;
	
	public AdventureGame(Room startingRoom){
		
		
	}
	
	public Room getCurrentRoom(){
		return this.currentRoom;
	}
	
	public Player getPlayer(){
		return this.player;
	}
	
}
