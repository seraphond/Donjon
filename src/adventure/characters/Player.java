package adventure.characters;

import java.util.List;


public class Player extends Personnage {
	protected List<Action> actions;

	public Player(int pdv, int fo, int po) {
		super(pdv, fo, po);
		this.pv=pdv;
		this.force=fo;
		this.po=po;
	}

	public void die() {
		
		
	}

}
