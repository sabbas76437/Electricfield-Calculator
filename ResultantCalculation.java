import java.util.ArrayList;
public class ResultantCalculation   implements INT1
{
public double resultant =0.0;
Point sa = null;
Charge as =null;
public ResultantCalculation()
{
	resultant =0.0;
}
public ResultantCalculation(Point s, Charge a, double r)
{
sa=s;
as=a;	
resultant =r;
}

public double getAngle(Point target,Charge c) {
	
  
   double angle =  (double)Math.atan2(target.getY() -c.getY(), target.getX() - c.getX());


    return angle;
}
public double decomposeY(Point j, Charge c) throws Exception
{

	ElectricField e = new ElectricField(0.0,c);//did this becuz calcdis method only has point var
	double r= e.calculateElectricField(j);
	double s = getAngle(j,c);
	double re= r*(Math.sin(s)); 
	

return re;
}

public double decomposeX(Point j, Charge c) throws Exception
{
ElectricField e = new ElectricField(0.0,c);//did this becuz calcdis method only has point var
	double r= e.calculateElectricField(j);
	//System.out.println();
	//System.out.println(r);
	//System.out.println();
	double re= r*(Math.cos(getAngle(j,c))); 
	

return re;
}
public  double calculateSin(Point j, Charge c) throws Exception
{


ElectricField e = new ElectricField(0.0,c);
double  hypotenuse = e.calculateElectricField(j);
double opposite = decomposeY(j,c);
double ans = opposite/hypotenuse;

return ans;

}
public String directionXY(Point p, Charge c) throws Exception
{
	
      
if(c.getCharge() >0 )
{
	if((p.getX() > c.getX()) && (p.getY() >c.getY()))
	{
		String out = "The direction of the x-component is Positive and the direction of the y component is Positive";
		return out;
	}
	if((p.getX() > c.getX()) && (p.getY() < c.getY()))
	{
		String out = "The direction of the x-component is Positive and the direction of the y component is Negative";
		return out;
	}
	
	else if((p.getX() < c.getX()) && ((p.getY() > c.getY())))
	{
	String out1 = "The direction of the x-component is Negative and the direction of the y component is Positive";
		return out1;	
	}
	else if((p.getX() < c.getX() && (p.getY() < c.getY())))
	{
	String out5 = "The direction of the x-component is Negative and the direction of the y component is Negative";
		return out5;	
	}
	else if((p.getX() > c.getX() && (p.getY() > c.getY())))
	{
	String out5 = "The direction of the x-component is Positive and the direction of the y component is Positiive";
		return out5;	
	}
	
	else if((p.getX() == c.getX()) && (p.getY() > c.getY()))
	{
	String out2 = "The direction of the x-component is No Direction and the direction of the y component is Positive";
		return out2;	
	}
	else if((p.getX() > c.getX()) && (p.getY() == c.getY()))
	{
	String out3 = "The direction of the x-component is Positive and the direction of the y component is No Direction";
		return out3;	
	}
	else if((p.getX() == c.getX()) && (p.getY() < c.getY()))
	{
	String out4 = "The direction of the x-component is No Direction and the direction of the y component is Negative";
		return out4;	
	}
	else if((p.getX() < c.getX() && (p.getY() == c.getY())))
	{
	String out5 = "The direction of the x-component is Negative and the direction of the y component is No Direction";
		return out5;	
	}
	else if((p.getX() == c.getX() && (p.getY() > c.getY())))
	{
	String out5 = "The direction of the x-component is No Direction and the direction of the y component is Positive";
		return out5;	
	}
	else  
	{
		return "The direction of the x-component is No direction and the direction of the y component is No direction";
	}
}
else 
{
if((p.getX() > c.getX()) && (p.getY() >c.getY()))
	{
		String out = "The direction of the x-component is Negative and the direction of the y component is Negative";
		return out;
	}
	if((p.getX() > c.getX()) && (p.getY() < c.getY()))
	{
		String out = "The direction of the x-component is Negative and the direction of the y component is Positive";
		return out;
	}
	
	else if((p.getX() < c.getX()) && ((p.getY() > c.getY())))
	{
	String out1 = "The direction of the x-component is Positve and the direction of the y component is Negative";
		return out1;	
	}
	else if((p.getX() < c.getX() && (p.getY() < c.getY())))
	{
	String out5 = "The direction of the x-component is Positive and the direction of the y component is Positive";
		return out5;	
	}
	else if((p.getX() > c.getX() && (p.getY() > c.getY())))
	{
	String out5 = "The direction of the x-component is Negative and the direction of the y component is Negative";
		return out5;	
	}
	
	else if((p.getX() == c.getX()) && (p.getY() > c.getY()))
	{
	String out2 = "The direction of the x-component is No Direction and the direction of the y component is Negative";
		return out2;	
	}
	else if((p.getX() > c.getX()) && (p.getY() == c.getY()))
	{
	String out3 = "The direction of the x-component is Positive and the direction of the y component is No Direction";
		return out3;	
	}
	else if((p.getX() == c.getX()) && (p.getY() < c.getY()))
	{
	String out4 = "The direction of the x-component is No Direction and the direction of the y component is Positive";
		return out4;	
	}
	else if((p.getX() < c.getX() && (p.getY() == c.getY())))
	{
	String out5 = "The direction of the x-component is Positive and the direction of the y component is No Direction";
		return out5;	
	}
	else if((p.getX() == c.getX() && (p.getY() > c.getY())))
	{
	String out5 = "The direction of the x-component is No Direction and the direction of the y component is Negative";
		return out5;	
	}
	else  
	{
		return "The direction of the x-component is No direction and the direction of the y component is No direction";
	}	
	
}
	}
public  double calculateCos(Point j, Charge c)throws Exception
{

ElectricField e = new ElectricField(0.0,c);

double  hypotenuse = e.calculateElectricField(j);
double adjacent = decomposeX(j,c);
double ans = adjacent/hypotenuse;
if(j.getX()==c.getY())
{
	ans=0.0;
	return ans;
}


return ans;
}
public double resultant(ArrayList<Charge> charges, Point p) throws Exception
{
	ArrayList<Double> ex = new ArrayList<Double>();
ArrayList<Double> ey = new ArrayList<Double>();	
int count =0;
for(Charge c:charges)
{
	double angle = calculateCos(p,c);
	double ang = calculateSin(p,c);
	ElectricField e =  new ElectricField(0.0,c);
	double mag = e.calculateElectricField(p);
	ex.add(Math.cos(angle)*mag);
	ey.add(Math.sin(ang)*mag);
	count ++;
	
}
double exs =0.0;
double eys =0.0;
for(int i = 0; i<count;i++)
{
	 exs+= ((Double)ex.get(i));
	eys += ((Double)ey.get(i));
}
double tResultant = Math.sqrt((exs*exs)+(eys*eys));
return tResultant;
}
public double calculateElectricField(Point l)
{
	
	return 0.0;
}
public double  calculateDistance(Point a)
{
	return 0.0;
	
}
public String toString()
{
	String out = " ";
	return out;
}


}