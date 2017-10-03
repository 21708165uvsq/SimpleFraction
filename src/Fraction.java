
public class Fraction {
	private double num,denum;
	public Fraction( double num,double denum)
	{ this.num=num;
	this.denum=denum;
	
	}
	public double result ()
	{
		return num / denum;
		
	}
	
public Fraction() {
	this(0,0);}

@Override
public String toString() {
	return " le num:"+ Double.valueOf(num).toString()+""+"  le denum:"+Double.valueOf(denum).toString();
}



}
