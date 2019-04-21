public class Point extends PSpace
{
	String name = "";
public Point()
{
	super();
	name =" ";

}
public Point(String n,double c,double l)
{
	super(c,l);
	name =n;

}
public String getName()
{
	return name;
}
public String toString()
{
String out = " "+name;
return out;
}








}