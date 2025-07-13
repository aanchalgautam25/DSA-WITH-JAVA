public class StringCapitalizer
{

public static void capitalizeFirstLetters(String s)
{
String[] arr = s.split(" ");
StringBuffer sb = new StringBuffer();

for(String word : arr)
{ 
String output = word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
sb.append(output).append(" ");
}
 System.out.println(sb.toString()); 
}
public static void main(String[] args)
{
String s1 = "please keep silence";
System.out.println(s1); 
capitalizeFirstLetters(s1);
}
}