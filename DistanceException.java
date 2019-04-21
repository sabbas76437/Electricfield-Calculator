public class DistanceException extends Exception
{
public  DistanceException(String s)
{
super (s);
}
public String getMessage()
{
return "The distance calculated shouldnt be negative";
}
public String toString()
{
return "DistanceException occurred";
}

}