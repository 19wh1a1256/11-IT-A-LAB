class StringFunctions{
public static void main(String args[]){
String s1 = "Java";
String s2 = "Programming";
System.out.println("1.concat(): "+s1.concat(s2));
System.out.println("2.length(): "+s2.length());
System.out.println("3.charAt(): "+s2.charAt(5));
System.out.println("4.equals(): "+s1.equals(s2));
System.out.println("5.strCmp(): "+s1.compareTo(s2));
System.out.println("6.strartsWith(): "+s2.startsWith("J"));
System.out.println("7.endsWith(): "+s2.endsWith("ing"));
System.out.println("8.indexOf(): "+s1.indexOf("v"));
System.out.println("9.lastIndexOf(): "+s2.lastIndexOf("m"));
System.out.println("10.substring(): "+s2.substring(3));
System.out.println("11.toLowerCase(): "+s1.toLowerCase());
System.out.println("12.toUpperCase(): "+s2.toUpperCase());
System.out.println("13.trim(): "+s1.trim());
String a[] = s2.split("a");
System.out.println("14.split()");
for(int i=0;i<a.length;i++){
System.out.println(a[i]);
}
System.out.println("15.replace(): "+s1.replace("v", "l"));
System.out.println("16.ignoreCase(): "+s1.equalsIgnoreCase("JAVA"));
}
}
