//package AbstractClass 不需要吗????

public abstract class Personnages(int num){
    
	public String name;
	private int pointVie;
	
	public String getNom(){
		return this.nom;
	}
	public boolean mort(){
		if(this.pointVie<=0){
			return true;
		}else{
			return false;
		}
	}
	public int getVie(){
		return this.pointVie;
	}
	public static addVie(int num){
		this.pointVie=this.pointVie+num;
	}
	public void toString(){
		if (this.mort()==true){
			System.out.println(this.name+"est mort.");
			
		}else{
			System.out.println("Je m’appelle "+this.nom+" et j’ai"+this.pointVie+"points de vie.");
		}
	}
	
	
	public abtract void attaque(Personnage p){

	}
	public static int subitFrappe(int coup){

	}
	public static int subitCharme(int coup){

	}
}