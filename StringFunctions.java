public class StringFunctions {
   public static void main(String[]args){
   
   String str = " Java Programming ";

   System.out.println("Length:"+ str.length());
   System.out.println("Character at 2:"+ str.charAt(2));
   System.out.println("Substring:" + str.substring(1,5));
   System.out.println("Uppercase:" + str.toUppercase());
   System.out.println("Lowercase:" + str.toLowercase());
   System.out.println("Trim:"+ str.trim());
   System.out.println("Contains Java:"+ str.contains("Java"));
   System.out.println("Starts with Ja:"+ str.trim().startsWith("Ja"));
   System.out.println("Ends with ing:"+ str.trim().endsWith("ing"));
   System.out.println("Replace:"+ str.replace("Java","Python"));
   System.out.println("Index of a:"+ str.indexOf('a'));
   }
}
   
   