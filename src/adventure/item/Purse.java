package adventure.item;

import adventure.characters.Personnage;


public class Purse extends Item {
	private int montant;
	
	public Purse(int po){
		this.montant=po;
	}
	
	public void isUsedBy(Personnage p){
		
		p.changePo(this.montant);
	}

}
