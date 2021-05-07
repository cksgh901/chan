package pratice;

public class Star {

	public static void main(String[] args) {
		Marin marin = new Marin("Áü·¹ÀÌ³Ê", 80);
		Madiec madiec = new Madiec("¸ð¶ö·¹½º", 60, 60);
		marin.stem();
		madiec.heal(marin);

	}

}
class Marin {
	String name;
	int hp;
	Marin(String name , int hp){
		this.name = name;
		this.hp = hp;
	}
	void stem() {
		System.out.printf("[%s]ÀÇ ½ºÆÀÆÑ! %d -> ",this.name,hp);
		this.hp=this.hp-10;
		System.out.printf("%d\n",this.hp);
	}
	
}
class Madiec{
	String name;
	int hp;
	int mp;
	Madiec(String name , int hp , int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	void heal(Marin marin) {
		System.out.printf("[%sÀÇ Ä¡À¯! =>[%s] HP(%d->",name,marin.name,marin.hp);
		marin.hp += 10;
		this.mp= this.mp-10;
		System.out.printf("%d)\n",marin.hp);
	}
}
