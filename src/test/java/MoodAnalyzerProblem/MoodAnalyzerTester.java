package MoodAnalyzerProblem;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import com.capgemini.*;

public class MoodAnalyzerTester {
	MoodAnalyzer moodanalyzer;
	
	@Before
	public void before() {
		moodanalyzer=new MoodAnalyzer();
	}

	@Test
	public void testAnalyseMood() {
		//fail("Not yet implemented");
		assertEquals("SAD",moodanalyzer.analyseMood("I am in Sad mood"));
		
		
	}

}
