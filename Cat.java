import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
public class Cat 
{
	private String breed;
	private String name;
	private boolean hasHair;
	public Cat()
	{
		this.breed = "";
		this.name = "";
		this.hasHair = false;
	}
	public Cat(String breed, String name, boolean hasHair)
	{
		this.breed = breed;
		this.name = name;
		this.hasHair = hasHair;
	}
}