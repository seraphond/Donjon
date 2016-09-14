package adventure.characters;
import adventure.item.Purse;
import adventure.room.*;


public class Monster extends Personnage {

	public Monster(int pdv, int fo, int po) {
		super(pdv, fo, po);
		this.pv=pdv;
		this.force=fo;
		this.po=po;
	}

	
	public void die() {
		Room current;
		current=getCurrentRoom();
		Purse p=New Purse(po);
		current.addItem(p);
		current.removeMonster(this);
		
	}

}
