package com.tcs;

public class CommaSeparatorNamesLengths 
{
    public static int[] convertToLengths(String[] names) 
    {
        int[] lengths = new int[names.length];
        for (int i = 0; i < lengths.length; i++)
        {
            lengths[i] = names[i].length();		
        }
        return lengths;
    }
	
    public static void main(String[] args) 
    {
        String[] names = {"shiva", "nani", "arun", "tharun"}; 
        int[] lengths = CommaSeparatorNamesLengths
        		.convertToLengths(names);
        for (int len : lengths) {
            System.out.println(len);
        }
    }
}
