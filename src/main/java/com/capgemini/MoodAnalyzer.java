package com.capgemini;

public class MoodAnalyzer {
	
	public String analyseMood(String message) {
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else return "HAPPY";
		
	}
	public static void main(String[] args) {
		MoodAnalyzer objS=new MoodAnalyzer();
		String ans1=objS.analyseMood("i an very sad");
		System.out.println("Analyzing mood result: "+ans1);
		
		MoodAnalyzer objH=new MoodAnalyzer();
		String ans2=objH.analyseMood("i an fine");
		System.out.println("Analyzing mood result: "+ans2);
		
	}

}
