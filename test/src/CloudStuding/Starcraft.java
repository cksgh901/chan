package CloudStuding;

public class Starcraft {

		  public static void main (String[] args) {
			 
			  Marin marin = new Marin("마린" , 80);
			  Madic madic = new Madic("모랄레스", 60);
			  
			  marin.stem();
			  
			  System.out.println();
			  
			  madic.heal(marin);
			  
		    // 객체 생성
		    // 마린의 스팀팩!
		    // 메딕의 힐!
		  }
}

		  class Marin{
		    String name;
		    int hp;
		    
		   public Marin(String name , int hp){
			   this.name = name;
			   this.hp = hp;
		   }
		   
		   
		    public void stem(){
		      System.out.printf("%s 의 스팀팩! hp : %d",name,hp );
		      hp -= 10;
		      System.out.printf("-> %d",hp );
		      
		    }
		  }
		  class Madic{
		    String name;
		    int hp;
		    
		    public Madic(String name , int hp) {
		    	this.name = name;
		    	this.hp = hp;
		    }
		    	
		    
		   public void heal(Marin target){
		      
		      
		      System.out.printf("%s 의 치유! => %s hp %d" ,name,target.name , target.hp);
		      target.hp += 10;
		      System.out.printf("-> %d" , target.hp);
		    }
		  }

		  
		