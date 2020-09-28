package com.capgemini;

public class MoodAnalyzer {
	public String message;
	public MoodAnalyzer() {
		
	}
	public MoodAnalyzer(String message) {
		this.message=message;
	}
	
	public String analyseMood() {
		if(message.toLowerCase().contains("sad"))
			return "SAD";
		else return "HAPPY";
		
	}
	public static void main(String[] args) {
		MoodAnalyzer objS=new MoodAnalyzer("I am in sad mood");
		String ans1=objS.analyseMood();
		System.out.println("Analyzing mood result: "+ans1);
		
		MoodAnalyzer objH=new MoodAnalyzer("I am in any mood");
		String ans2=objH.analyseMood();
		System.out.println("Analyzing mood result: "+ans2);
		
	}

}
