package criminalinfo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//import UI.*;

/**
 * 
 * @author Catherine
 * Crim3: Gary Leon Ridgway
 *
 */
public class Crim3
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
	
	public Crim3( String n, String a, String ht, String g, String ha, String s, String c, String o)
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
		Crim3 GR = new Crim3("Gary Ridgway","71", "5'10''", "M", "black", "UT", "49 separate murders, solicitation", "Life sentence without parole");
		System.out.println(GR);
		
		return GR.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}