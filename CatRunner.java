
public class CatRunner {
	public static void main(String[] args)
	{
		Cat cat = new Cat("Manx", "Bark", true);
		cat.speak();
		cat.setBreed("Siamese");
		cat.speak();
		cat.setName("Steve");
		cat.speak();
		Cat sphynx = new Cat("Sphynx", "Charlie", false);
		sphynx.speak();
	}
}
