public class SuperHero  extends Person{
	private final String alterEgo;

	public SuperHero(String birthName, String alterEgo){
		super(birthName);
		this.alterEgo = alterEgo;
	}

	public String getName(){
		return alterEgo;
	}

	public String getSecretIdentity(){
		return super.getName();
	}

	public static void main(String[] args) {
		SuperHero darkKnight = new SuperHero("Bruce Wayne", "Batman");

		System.out.println("darkKnight.getName() = " + darkKnight.getName());
		System.out.println("darkKnight.getSecretIdentity() = " + darkKnight.getSecretIdentity());
	}
}
