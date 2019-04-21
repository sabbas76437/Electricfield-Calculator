import java.util.*;
public class ElectricField implements INT1
{
double efield =0.0;
Charge q1=new Charge();
public static final double k = 8.99*Math.pow(10,9); 
public ElectricField()
{
efield =0.0;
q1 = new Charge();
}
public ElectricField(double e, Charge q)
{
efield =e;
q1 =q;
}
public double calculateElectricField(Point l) throws Exception
{
double r = calculateDistance(l);
efield = (k * q1.getCharge())/(r*r);
return efield;

}
public double calculateDistance(Point v) throws DistanceException
{
double distance = Math.sqrt(Math.pow((v.getX()-q1.getX()), 2) + Math.pow((v.getY()-q1.getY()), 2));
if(distance < 0)
{
	throw new DistanceException("DistanceException thrown");
}
return distance;
}
public double calculateSin(Point p, Charge r)
{
	return 0.0;
	
}
public double calculateCos(Point p, Charge r)
{
	
	return 0.0;
}
 public  double getAngle(Point j, Charge c)
 {
	 return 0.0;
	 
 }




}