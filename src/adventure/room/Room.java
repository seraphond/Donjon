package adventure.room;

import java.util.List;
import java.util.Map;

import adventure.characters.Monster;
import adventure.item.Item;

public class Room {
	protected Map<Direction,Room> voisins;
	protected List<Monster> monsters;
	protected List<Item> items;
	protected List<Direction> directions;
	
	public Room(){
		
	}
	public boolean isExit(){
		return false;
	}

	public List<Item> getItem(){
		return this.items;
	}

	public List<Monster> getMonster(){
		return this.monsters;
	}

	public List<Direction> getDirections(){
		return this.directions;
	}

	public Room getRoom(Direction d){
		
	}
}
