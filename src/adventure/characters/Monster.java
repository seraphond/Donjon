package adventure.characters;

public class Monster extends Personnage {

	public Monster(int pdv, int fo, int po) {
		super(pdv, fo, po);
		this.pv=pdv;
		this.force=fo;
		this.po=po;
	}

	
	public void die() {
		
	}

}
