import java.util.*;
import java.io.*;
public class CalculationofFields
{
public static void main(String[] args) throws Exception
	{
		
		ResultantCalculation rc = new ResultantCalculation();
		ElectricField e = new ElectricField();
		ArrayList<Charge> charg = new ArrayList<Charge>();
			ArrayList<Point> poin = new ArrayList<Point>();
			ArrayList eField = new ArrayList();
	
	
	ArrayList<String> chargePoint = new ArrayList<String>();
	try
	{
		
		Scanner scan = new Scanner(System.in);
		String d = "";
		FileInputStream file = new FileInputStream("Input.txt");
			
			BufferedReader os=new BufferedReader(new InputStreamReader(file));
			
			FileOutputStream fos = new FileOutputStream("Input.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			
			//While loop for each line and store in d
			while((d=os.readLine())!=null)
			{
			StringTokenizer stok = new StringTokenizer (d,":");
			String charge =stok.nextToken();
			String rest = stok.nextToken();
			if(charge.equalsIgnoreCase("Q"))
			{
			StringTokenizer stok2 = new StringTokenizer (rest,",");
			String a = stok2.nextToken();
			int xcord = Integer.parseInt(a);
		
			String ch=stok2.nextToken();
			int ycord = Integer.parseInt(ch);
			String cho=stok2.nextToken();
			Double chargeNum = Double.parseDouble(cho);
			Charge c = new Charge(xcord,ycord,chargeNum);
			charg.add(c);
			System.out.println(d);
			}
			else if(charge.equalsIgnoreCase("P"))
			{
			StringTokenizer stok3 = new StringTokenizer (rest,",");
			String pointName = stok3.nextToken();
			String a = stok3.nextToken();
			int pXCord = Integer.parseInt(a);
			String ch=stok3.nextToken();
			int pYCord = Integer.parseInt(ch);
			Point p = new Point(pointName,pXCord,pYCord);
			poin.add(p);
			System.out.println(d);
			
			}
			
			}
	
			
			
			for(int i=0;i<poin.size();i++)
			{
			
			
			String n = poin.get(i).getName();
			int g =i+1;

			for(int j=0;j<charg.size();j++)
			{
				
				int a =j+1;
				e=new ElectricField(0,charg.get(j));
				 rc = new ResultantCalculation(poin.get(i),charg.get(j),0);
				eField.add(e.calculateElectricField(poin.get(i)));
			System.out.println("The magnitude of electric field at point:"+n+" due to charge point #:"+g+" is"+ e.calculateElectricField(poin.get(i)));
			System.out.println("the point coordinates are: "+poin.get(i).getX()+" "+poin.get(i).getY());	
			System.out.println("The charge is: "+charg.get(j).getCharge());
						System.out.println("the charge coordinates are: "+charg.get(j).getX()+" "+charg.get(j).getY());
			System.out.println("cosine of the angle= "+ rc.calculateCos(poin.get(i),charg.get(j)));
			System.out.println("The value of the x component of the Electric field at point:"+n+" due to point charge #: "+a +" is:"+rc.decomposeX(poin.get(i),charg.get(j)));
			System.out.println("sine of the angle= "+ rc.calculateSin(poin.get(i),charg.get(j)));
			System.out.println("The value of the y component of the Electric field at point:"+n+" due to point charge #: "+a +" is:"+rc.decomposeY(poin.get(i),charg.get(j)));
			System.out.println(rc.directionXY(poin.get(i),charg.get(j)));
			System.out.println("x--------------------------------x ");
			//System.out.println("The magnitude of the resultant field is: "+rc.resultant(charg,poin.get(i))+" for "+n);
			System.out.println(" ");
			String na = "The x coordinate is x= "+poin.get(i).getX() + "The y coordinate is y= "+poin.get(i).getY()+"The point is" +poin.get(i);
			String ag = "The individual fields from each charge are: "+"\n"+e.calculateElectricField(poin.get(i))+ "\n"+ "The ResultantField is: "+rc.resultant(charg,poin.get(i));
			chargePoint.add(na);
			chargePoint.add(ag);
			
			
			
			
			
			}
			 
			
			System.out.println("The magnitude of the resultant field is: "+rc.resultant(charg,poin.get(i))+" for point:"+n);
			System.out.println("x------------------------------------------Next Point-----------------------------------------------x ");
			}
			
			
			System.out.println("-------------VALUES BEFORE WRITTEN IN .SER FILE-----------------------------------------------");
			for(int y=0; y<chargePoint.size(); y++)
			{
			System.out.println(chargePoint.get(y));
			}
			for(int y=0; y<chargePoint.size(); y++)
			
			{
				Object obj=chargePoint.get(y);
				String cus=(String)obj;
			    oos.writeObject(cus);
				
			
			}
		
			
			oos.close();
			
			file.close();
				os.close();
	}
			catch(IOException IO)
			{
				System.out.println(IO.getMessage());
			}
		Scanner scan2=new Scanner(System.in);
		System.out.println("Do you want to have the .ser binary coded file read?");

		String str1=scan2.nextLine();	
		
		
		if(str1.equalsIgnoreCase("yes"))
			{
			try{
				System.out.println("------------------------DATA READ FROM .ser FILE");
				System.out.println("The data read from the binary coded file is:");
				FileInputStream fis=new FileInputStream("Input.ser");
				ObjectInputStream os = new ObjectInputStream(fis);         
				while(true)
				{
					try{
					
			String chargePoin= (String)os.readObject();
			 for(String temp: chargePoint){
            System.out.println(temp);
        }
				os.close();
				fis.close();
					}//end of inner try 
				
					catch(EOFException eof)
				{
					System.out.println(eof.getMessage());
				}//end of inner catch
				
				}//end of while
			}//end of outer try
				catch(IOException fnf)
			{
				System.out.println(fnf.getMessage());
			}//end of outer catch
			}			//end of if
			else
		{		   
	   System.out.println("The program will exit without reading the file");
	System.exit(0);
		}
	}
}