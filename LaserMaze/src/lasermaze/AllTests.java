package lasermaze;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TestGetNextStatus.class, TestGetParameters.class, TestMazeParameterConstructor.class,
		TestMazeReadParametersFromFiles.class, TestMirrorChangeDirections.class, TestOutOfBoundary.class,
		TestSolveMaze.class, TestStatustEquals.class })
public class AllTests {

}
