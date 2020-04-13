package criminalinfo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//import UI.*;

/**
 * 
 * @author Catherine
 * Crim2: Sravani
 *
 */
public class Crim2
{
	//make objects
	String name;
	String age;
	String height;
	String gender;
	String hair;
	String state;
	String crime;
	String other;
	
	public Crim2( String n, String a, String ht, String g, String ha, String s, String c, String o)
	{	
		this.name = n;
		this.age = a;
		this.height = ht;
		this.gender = g;
		this.hair = ha;
		this.state = s;
		this.crime = c;
		this.other = o;
	}

	public String toString() 
	{
		//toString
		return ( "\n" + name + "\n" + age + "\n" + height + "\n" + gender + "\n" + hair + "\n" + state + "\n" + crime + "\n" + other);
	}
	
	public static String main(String[] args)
	{
		//add
		Crim2 SD = new Crim2("Sravani","18", "5'5''", "F", "black", "CA", "Not doing work", "Last seen: On a Zoom call");
		System.out.println(SD);
		
		return SD.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}