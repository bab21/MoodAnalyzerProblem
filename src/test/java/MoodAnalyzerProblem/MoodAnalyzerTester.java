package MoodAnalyzerProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.*;

public class MoodAnalyzerTester {
	

	@Test
	public void testAnalyseMood() {
		//fail("Not yet implemented");
		try {
		MoodAnalyzer object1=new MoodAnalyzer("I am in sad mood");
		assertEquals("SAD",object1.analyseMood());
		}
		catch(MoodAnalysisException e) {
			System.out.println("inside testing mood analysis");
		}
				
	}
	
	@Test
	public void givenNullMoodShouldInformUser() {
		MoodAnalyzer object;
		try {
        object=new MoodAnalyzer(null);
        String ans=object.analyseMood();
		
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.type);
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL,e.type);
		}
		
	}
	@Test
	public void givenEmptyMoodInformUser() {
		MoodAnalyzer object;
		try {
        object=new MoodAnalyzer("");
        String ans=object.analyseMood();
		
		}
		catch(MoodAnalysisException e) {
			System.out.println(e.type);
			assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,e.type);
			
		}
	}

}
