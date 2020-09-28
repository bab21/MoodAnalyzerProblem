package MoodAnalyzerProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.*;

public class MoodAnalyzerTester {
	

	@Test
	public void testAnalyseMood() {
		//fail("Not yet implemented");
		MoodAnalyzer object1=new MoodAnalyzer("I am in sad mood");
		assertEquals("SAD",object1.analyseMood());
				
	}
	
	@Test
	public void givenNullMoodShouldReturnHappy() {
        MoodAnalyzer object2=new MoodAnalyzer(null);
		assertEquals("HAPPY",object2.analyseMood());
		
	}
	

}
