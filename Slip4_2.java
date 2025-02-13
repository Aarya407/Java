import java.util.*;

import java.io.*;

class Slip4_2

{

public static void main(String args[]) throws IOException

{

Hashtable ht=new Hashtable();

int std_code;

String city_name=null;

Scanner sc=new Scanner(System.in);

System.out.println("\n Enter no of Records:");

int n=sc.nextInt();

for(int i=0;i<n;i++)

{

System.out.println("Enter City Name:");

city_name=sc.next();

System.out.println("Enter STD code:");

std_code=sc.nextInt();

ht.put(city_name, std_code);

} System.out.println("Hash table="+ht);

System.out.println("Enter city name to be search:");

String search_nm=sc.next();

if(ht.containsKey(search_nm))

System.out.println("STD Code of city"+search_nm+"is"+ht.get(search_nm));

else

System.out.println("City not found");

System.out.println("Enter city name tobe remove:");

String removeCity=sc.next(); ht.remove(removeCity);

System.out.println("After removing city"+removeCity+"data is"+ht);
}
}
