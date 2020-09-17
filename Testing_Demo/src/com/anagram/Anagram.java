package com.anagram;
import java.util.*;
public class Anagram {
public boolean isAnagram(String str1,String str2)
{
	boolean b=false;
	char arr1[];
	char arr2[];
	if(str1.length()!=str2.length())
	{
		b=false;
	}
	
	else
	{
		str1=str1.replaceAll(" ", "");
		arr1=str1.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		str2=str2.replaceAll(" ", "");
		arr2=str2.toLowerCase().toCharArray();
		Arrays.sort(arr2);
	b=Arrays.equals(arr1,arr2);
	}
	return b;
}
}
