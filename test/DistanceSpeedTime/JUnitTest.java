package DistanceSpeedTime;

import distance_speed_time.DistanceSpeed_Time;
import java.util.Arrays;
import java.util.Collection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author user
 */
@RunWith(Parameterized.class)
public class JUnitTest {
    private double distance;
    private double speed;
    private double time;
    private double expected;
    
    public JUnitTest(double speed, double time, double distance) {
        this.distance = distance;
        this.speed = speed;
        this.time = time;
    }
    
    @Parameters
    public static Collection<Double[]> checknum(){
        Double[][]input;
        input = new Double[][]{{10.0,2.0,20.0},{2.0,5.0,10.0},{50.0,5.0,250.0}};
        return Arrays.asList(input);
    }
    @Test
    public void testCheck(){
        System.out.println("Check Distance");
        DistanceSpeed_Time dst = new DistanceSpeed_Time();
        double actual = dst.distance(speed, time);
        expected = distance;
        assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testCheckSpeed(){
        System.out.println("Check Speed");
        DistanceSpeed_Time dst = new DistanceSpeed_Time();
        double actual = dst.speed(distance, time);
        expected = speed;
        assertEquals(expected, actual, 0.0);
    }
    @Test
    public void testCheckTime(){
        System.out.println("Check Time");
        DistanceSpeed_Time dst = new DistanceSpeed_Time();
        double actual = dst.time(distance, speed);
        expected = time;
        assertEquals(expected, actual, 0.0);
    }
/**
 *
 * @author BAHSEIN
 */
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.out.println("check");
        System.out.println(" ");
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
