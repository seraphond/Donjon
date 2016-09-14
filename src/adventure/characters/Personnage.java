package adventure.characters;

public abstract class Personnage {
	protected int pv;
	protected int force;
	protected int po;
	//protected String name;
	public Personnage(int pdv,int fo,int po){
		this.pv=pdv;
		this.force=fo;
		this.po=po;
	}
	public int getPv(){
		return this.pv;
	}
	public int getForce(){
		return this.force;
	}
	public int getPo(){
		return this.po;
	}
	public void changePv(int val){
		this.pv=this.pv+val;
	}
	public void changeForce(int val){
		this.force=this.force+val;
	}
	public void changePo(int val){
		this.po=this.po+val;
	}
	public void attack(Personnage perso){
		perso.pv=perso.pv-this.force;
		if(perso.pv>0){
			this.pv=this.pv-perso.force;
		}
		
	}
	public abstract void die();
}


