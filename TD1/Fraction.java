
public class Fraction {
	private double num,denum;
	public Fraction( double num,double denum)
	{ this.num=num;
	this.denum=denum;
	}
	
public Fraction() {
	this(0,0);}

@Override
public String toString() {
	return "num:"+ Double.valueOf(num).toString()+""+"denum:"+Double.valueOf(denum).toString();
}}
