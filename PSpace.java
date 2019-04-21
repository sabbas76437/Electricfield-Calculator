public abstract class PSpace
{
double x =0;
double y =0;
public PSpace()
{
x=0;
y=0;
}
public PSpace(double a, double b)
{
x=a;
y=b;
}
public double getX()
{
return x;
}
public double getY()
{
return y;
}
public void setX(double n)
{
x=n;
}
public void setY(double h)
{
y=h;
}
public abstract String toString();





}