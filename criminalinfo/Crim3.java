package criminalinfo;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

//import UI.*;

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
		Crim3 CG = new Crim3("Catherine Gu","17", "5'4''", "F", "black", "CA", "Annoying Sravani", "Last Seen: Over a Zoom call");
		System.out.println(CG);
		
		return CG.toString() ;
	}
	
	public static String delete() {
		// TODO Auto-generated method stub
		return null;
	}
}