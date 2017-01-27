
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(final String[] args) throws Exception {
BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 

System.out.println("Enter p:"); 
BigInteger p=new BigInteger(br.readLine()); 

System.out.println("Enter g:"); 
BigInteger g=new BigInteger(br.readLine());

System.out.println("Enter value for p less than "+p+":"); 
BigInteger x=new BigInteger(br.readLine());

BigInteger a=g.modPow(x,p); 
System.out.println("A="+a); 

System.out.print("Enter value for y less than "+p+":"); 
BigInteger y=new BigInteger(br.readLine()); 

BigInteger b=g.modPow(y,p); 
System.out.println("B="+b);

BigInteger k1=a.modPow(x,p); 
System.out.println("Side A:"+k1); 
BigInteger k2=b.modPow(y,p); 
System.out.println("Side B:"+k2);
       
    }
}