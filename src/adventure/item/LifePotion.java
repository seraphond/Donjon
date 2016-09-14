package adventure.item;

import adventure.characters.Personnage;


public class LifePotion extends Item{
	private int montant;
	
	public LifePotion(int m){
		this.montant=m;
	}
	public void isUsedBy(Personnage p) {
		
		p.changePv(this.montant);
	
	}
	

}
