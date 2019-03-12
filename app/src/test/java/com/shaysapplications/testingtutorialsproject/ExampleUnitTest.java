package com.shaysapplications.testingtutorialsproject;

import org.junit.Test;

import static com.shaysapplications.testingtutorialsproject.util.FirstNameExtractor.extractFirstName;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void extractFirstNameNullReturnsEmptyString(){
        assertThat(extractFirstName(null),is(""));
    }

    @Test
    public void extractFirstNameEmptyStringReturnsEmptyString(){
        assertThat(extractFirstName(""),is(""));
    }
    @Test
   public void extractFirstNameFullNameReturnsFirstName(){
        assertThat(extractFirstName("Shay Yaakobov"),is("Shay"));
    }


    @Test
    public void extractFirstNameFullNameArroundWhiteSpacesReturnsFirstName(){
        assertThat(extractFirstName("   Shay Yaakobov "),is("Shay"));
        assertThat(extractFirstName("Shay    Yaakobov  "),is("Shay"));
        assertThat(extractFirstName(" Shay     Yaakobov"),is("Shay"));
        assertThat(extractFirstName("   Shay Yaakobov"),is("Shay"));
        assertThat(extractFirstName(" Shay Yaakobov        "),is("Shay"));
    }

    @Test
    public void extractFirstNameFirstNameArroundWhiteSpacesReturnsFirstName(){
        assertThat(extractFirstName("   Shay  "),is("Shay"));
        assertThat(extractFirstName("Shay    "),is("Shay"));
        assertThat(extractFirstName(" Shay   "),is("Shay"));
        assertThat(extractFirstName("   Shay "),is("Shay"));
        assertThat(extractFirstName(" Shay "),is("Shay"));
    }




}