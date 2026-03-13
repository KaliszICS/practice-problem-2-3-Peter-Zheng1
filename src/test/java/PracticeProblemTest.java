import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PracticeProblemTest {

   @Test
   void testExample() {
      assertEquals(0, PracticeProblem.circleArea(0));
   }

   @Test
   void circleAreaTest() {
      assertEquals(0.0, PracticeProblem.circleArea(0));


   }

   @Test
   void minutesToHoursTest() {
      assertEquals("1 hours and 40 minutes", PracticeProblem.minutesToHours(100));
      assertEquals("2 hours and 30 minutes", PracticeProblem.minutesToHours(150));
      assertEquals("100 hours and 0 minutes", PracticeProblem.minutesToHours(6000));
      assertEquals("-9 hours and -40 minutes", PracticeProblem.minutesToHours((-580)));


   }

   @Test
   void  simpleInterestTest() {
      assertEquals(3.2, PracticeProblem.simpleInterest(80.0, 2.0, 2));
      assertEquals(0.0, PracticeProblem.simpleInterest(0.0, 0.0, 0));
      assertEquals(10000.0, PracticeProblem.simpleInterest(100, 100, 100));
      assertEquals(0.08, PracticeProblem.simpleInterest(-2.0, -4.0, 1));
   }
   
   @Test
   void hypotenuseTest() {
      assertEquals(22.360679774997898, PracticeProblem.hypotenuse(10, 20));
      assertEquals(0, PracticeProblem.hypotenuse(0, 0));
      assertEquals(141.4213562373095, PracticeProblem.hypotenuse(100, 100));
      assertEquals(5.0, PracticeProblem.hypotenuse(-3, -4));

   }



   }

