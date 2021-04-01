import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        //Given:

        //When:
        String actual = hamletParser.changeHamletToLeon();

        //Then:
        Assert.assertFalse(actual.contains("Hamlet"));
    }

    @Test
    public void testChangeHamletToLeonContainsLeon() {
        //Given:

        //When:
        String actual = hamletParser.changeHamletToLeon();

        //Then:
        Assert.assertTrue(actual.contains("Leon"));
    }

    @Test
    public void testChangeHamletToLeonCaps() {
        //Given:

        //When:
        String actual = hamletParser.changeHamletToLeon();

        //Then:
        Assert.assertFalse(actual.contains("HAMLET"));
    }

    @Test
    public void testChangeHamletToLeonContainsLeonCaps() {
        //Given:

        //When:
        String actual = hamletParser.changeHamletToLeon();

        //Then:
        Assert.assertTrue(actual.contains("LEON"));
    }

    @Test
    public void testChangeHoratioToTariq() {
        //Given:

        //When:
        String actual = hamletParser.changeHoratioToTariq();

        //Then:
        Assert.assertFalse(actual.contains("Horatio"));
    }

    @Test
    public void testChangeHoratioToTariqContainsTariq() {
        //Given:

        //When:
        String actual = hamletParser.changeHoratioToTariq();

        //Then:
        Assert.assertTrue(actual.contains("Tariq"));
    }

    @Test
    public void testChangeHoratioToTariqCaps() {
        //Given:

        //When:
        String actual = hamletParser.changeHoratioToTariq();

        //Then:
        Assert.assertFalse(actual.contains("HORATIO"));
    }

    @Test
    public void testChangeHoratioToTariqContainsTariqCaps() {
        //Given:

        //When:
        String actual = hamletParser.changeHoratioToTariq();

        //Then:
        Assert.assertTrue(actual.contains("TARIQ"));
    }

    @Test
    public void testFindHoratio() {
        //Given:

        //When:
        boolean expected = true;
        boolean actual = hamletParser.findHoratio(hamletParser.getHamletData());

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratioFalse() {
        //Given:

        //When:
        boolean expected = false;
        String changedPoem = hamletParser.changeHoratioToTariq();
        boolean actual = hamletParser.findHoratio(changedPoem);

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHamlet() {
        //Given:

        //When:
        boolean expected = true;
        boolean actual = hamletParser.findHamlet(hamletParser.getHamletData());

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHamletFalse() {
        //Given:

        //When:
        boolean expected = false;
        String changedPoem = hamletParser.changeHamletToLeon();
        boolean actual = hamletParser.findHamlet(changedPoem);

        //Then:
        Assert.assertEquals(expected, actual);
    }
}