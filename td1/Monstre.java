  //9.6  Bootcamp
    
  public class Monstre extends Personnage{

	  public Monstre(String name,int pointVie ){
		  super(name,pointVie);
	  }
	  protected void attaque(Personnage p){
		  if(!(this.mort())){
			  int pointVieMonstre=this.getVie();
			  int force=pointVieMonstre/2;
			  int degatsSubisAttaquant=p.subitFrappe(force);
			  this.addVie(degatsSubisAttaquant);
			  
		  }

	  }



  } 
    private int coup;
	public Monstre(String MonsterName,int pointVie){
		name=MonsterName;
	}
	if (Math.random()<){

	}
	else {

	}
	Monster m=new Monster();

}