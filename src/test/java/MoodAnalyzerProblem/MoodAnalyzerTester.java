package MoodAnalyzerProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.*;

public class MoodAnalyzerTester {
	

	@Test
	public void testAnalyseMood() {
		//fail("Not yet implemented");
		MoodAnalyzer object1=new MoodAnalyzer("I am in Sad mood");
		MoodAnalyzer object2=new MoodAnalyzer("I am in any mood");
		
		assertEquals("SAD",object1.analyseMood());
		assertEquals("HAPPY",object2.analyseMood());		
	}

}
