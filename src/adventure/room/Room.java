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
		//if(this.voisins.containsKey(d)){
			return this.voisins.get(d);
		
	}
	
	public void addMonster(Monster m){
		this.monsters.add(m);
		
	}

	public void addItem(Item i){
		this.items.add(i);
	}
	
	public void addVoisin(Direction d,Room r){
		this.voisins.put(d,r);
	}
	
	public void removeItem(Item i){
		this.items.remove(i);
	}
	
	public void removeMonster(Monster m){
		this.monsters.remove(m);
	}
	
	public boolean hasMonsters(){
		return !monsters.isEmpty();
	}
}
