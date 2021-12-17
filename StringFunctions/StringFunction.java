public class StringFunction
{
    public static void main(String[] args)
    {
        // length() function 
        String na = "It is nice";
        System.out.println(na.length());
        
        String name = "Ishan";
        System.out.println(name.length());
        
        String str = "Children's Academy Malad";
        System.out.println("length = "+str.length());
        //charAt() function usage
        System.out.println("Character at index 9 = "+str.charAt(9));
        
        String s1 = "Children's", s2 = " Academy";
        // using concat() function
        System.out.println(s1.concat(s2));
        //output is Children's Academy
        
        String s = "india";
        int c = 0, k = 0;
        for(int i = 0; i < s.length() ; i++)
        {
            c = s.indexOf('i');
            k = s.lastIndexOf('i');
        }
        //using indexOf() & lastIndexOf() function
        System.out.println("Index of i is : "+c);
        System.out.println("Last index of i is : "+k);
        
        //the answer is false, equals() fn used.
        String s4 = "java", s5 = "JAVA";
        boolean ans = s4.equals(s5);
        System.out.println(ans);
        
        //using equalsIgnoreCase() function
        String s6 = "welcome", s7 = "WELCOME";
        System.out.println(s6.equalsIgnoreCase(s7));
        
        //compareToIgnoreCase() function usage
        String s8 = "maze", s9 = "matter";
        System.out.println(s8.compareToIgnoreCase(s9));
        
        //using startsWith() & endsWith() function
        String s10 = "wheat", s11 = "whether";
        //boolean type so output will be true.
        System.out.println(s10.startsWith("whe"));
        System.out.println(s11.endsWith("er"));
        
        // using replace() & substring() function
        String s12 = "Javatpoint";
        System.out.println(s12.substring(5,10));
        System.out.println(s12.replace('t', 'm'));
        
        // using the substring() function
        String n = "Java Knowledge", m = "Computer Applications";
        System.out.println(n.substring(0,4).concat(m.substring(9)));
    }
}
