package test.java;

import main.java.Library;

import org.junit.Test;
import static org.junit.Assert.*;

/*
 * This Java source file was auto generated by running 'gradle init --type java-library'
 * by 'hp' at '4/7/15 10:53 AM' with Gradle 2.4
 *
 * @author hp, @date 4/7/15 10:53 AM
 */
public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }
}