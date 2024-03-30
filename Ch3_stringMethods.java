public class Ch2_stringMethods {
    public static void main(String[] args) {
        String name = "Kaushal";
        // Lower Case
        String lname = name.toLowerCase();
        System.out.println(lname);
        
        // Upper case
        String uname = name.toUpperCase();
        System.out.println(uname);

        // Trimmed string
        String nonTrimmeString = "     Kaushal     ";
        System.out.println(nonTrimmeString);
        String trimmString = nonTrimmeString.trim();
        System.out.println(trimmString);

        // Substring 
        System.out.println(name.substring(2));
        System.out.println(name.substring(2, 6));

        // Replace 
        System.out.println(name.replace('a', 'u'));

        // Endwith and Startwith --> always return boolean 
        System.out.println(name.startsWith("aa"));
        System.out.println(name.endsWith("aa"));

        // char index
        System.out.println(name.charAt(2));

        // Index of char --> return first occurance
        System.out.println(name.indexOf("a"));
        System.out.println(name.indexOf("a", 3)); 

        // Last index 
        System.out.println(name.lastIndexOf("a",4));

        // Equal
        System.out.println(name.equals("kaushal"));
        System.out.println(name.equalsIgnoreCase("kaushal"));
    }
}
