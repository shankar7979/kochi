/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package GradlePrj1;

import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        classUnderTest.addition(11, 22);
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}
