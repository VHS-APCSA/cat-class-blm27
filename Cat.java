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
	public void speak()
	{
		ImageIcon icon = null;
		if(breed.equals("Persian"))
		{
			icon = new ImageIcon("Persian-icon.png");
		}
		else if(breed.equals("Siamese"))
		{
			icon = new ImageIcon("Siamese-icon.png");
		}
		else if(breed.equals("Sphynx"))
		{
			icon = new ImageIcon("Sphynx-icon.png");
		}
		else
		{
			icon = new ImageIcon("Tabby-icon.png");
		}
		String words = "My name is " + name + ", feed me! Meow.";
		JLabel label = new JLabel(words, icon, JLabel.CENTER);
		JOptionPane.showMessageDialog(null, label);
	}
	public void setBreed(String breed)
	{
		this.breed = breed;
	}
	public String getBreed()
	{
		return breed;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return breed;
	}
	public void setHasHair(boolean hasHair)
	{
		this.hasHair = hasHair;
	}
	public boolean getHasHair()
	{
		return hasHair;
	}
	
}