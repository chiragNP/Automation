package day4;

public class demoString {

	public static void main(String[] args) {
		String s= "welcome";
		String s1="Java";
		
		String s2 = "Welcome in Java";
		
		System.out.println("uppercase==>"+s.toUpperCase());
        System.out.println("Lowercase==>"+s.toLowerCase());
        System.out.println("lenght==>"+s.length());
        
        System.out.println("concat==>"+s.concat(s2));
        System.out.println("equals==>"+s.equals("welcome"));
        System.out.println("equalsingnorecase==>"+s.equalsIgnoreCase("Welcome"));
        System.out.println("contains==>"+s1.contains(s));
        
        System.out.println("charat==>"+s.charAt(3));
        System.out.println("indexof==>"+s.indexOf("c"));
        System.out.println("replace==>"+s.replace("o", "a"));
        
        
        
        
        
        
        
        
        
        
	}

}
