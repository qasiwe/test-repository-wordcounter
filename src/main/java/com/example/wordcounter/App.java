package com.example.wordcounter;

public class App 
{
	
	
	
	
    public static void main( String[] args )
    {
        System.out.println("Word Count Testing App!");
    }
    
    public static int wordcount(String s) {
		String trim = s.trim();
		if (trim.isEmpty())
		    return 0;
		return trim.split("\\s+").length;
    }
}
