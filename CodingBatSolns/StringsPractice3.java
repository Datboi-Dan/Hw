public class StringsPracitce3
{

  public String doubleChar(String str) 
  {
  
  String newString = "";
  
  for (int i = 0; i < str.length(); i++)
    newString += str.charAt(i) + "" + str.charAt(i);
  
  return newString;
  
  }

  
}
