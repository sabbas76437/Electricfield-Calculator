public class Charge extends PSpace
{
double charge =0.0;
static int id = 0;
int currentid =0;

public Charge()
{
super();
charge =0.0;
 currentid++;

}
public Charge(double c, double v,double s)
{
super(c,v);
charge =s;
 currentid++;
}
public double getCharge()
{
return charge;
}
public int getId()
{
	
	return currentid;
}
public void setId(int i)
{
	currentid = i;
}
public void setCharge(double j)
{
charge = j;
}
public String toString()
{
String out = "The charge is "+ charge;
System.out.println("Pos X is"+x+"Position y is"+y);
return out;
}


}




