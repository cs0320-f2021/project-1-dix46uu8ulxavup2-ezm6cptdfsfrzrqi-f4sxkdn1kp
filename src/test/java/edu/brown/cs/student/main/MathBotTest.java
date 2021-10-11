package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
<<<<<<< HEAD
=======

    double output2 = matherator9000.add(2.11, 1.00);
    assertEquals(3.11, output2, 0.01);

    double output3 = matherator9000.add(-1.00, 3);
    assertEquals(2.00, output3, 0.01);

    double output4 = matherator9000.add(0.00, 0);
    assertEquals(0.00, output4, 0.01);
>>>>>>> 883e5eccf0785729fe7f1587dc9cbd47a7ce0aad
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
<<<<<<< HEAD
=======

    double output2 = matherator9001.subtract(99999.99, 11111.11);
    assertEquals(88888.88, output2, 0.01);
>>>>>>> 883e5eccf0785729fe7f1587dc9cbd47a7ce0aad
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
<<<<<<< HEAD
  }

  // TODO: add more unit tests of your own
=======

    double output2 = matherator9002.subtract(2.11, 1.00);
    assertEquals(1.11, output2, 0.01);

    double output3 = matherator9002.subtract(3, -1.00);
    assertEquals(4.00, output3, 0.01);

    double output4 = matherator9002.subtract(0.00, 0);
    assertEquals(0.00, output4, 0.01);
  }

  @Test
  public void testZeroes() {
    MathBot matherator9003 = new MathBot();
    double output = matherator9003.subtract(0, 0);
    double output2 = matherator9003.add(0, 0);
    assertEquals(0.00, output, 0.01);
    assertEquals(0.00, output2, 0.01);

    double output3 = matherator9003.subtract(1, 0);
    double output4 = matherator9003.subtract(0, 1);
    assertEquals(1.00, output3, 0.01);
    assertEquals(-1.00, output4, 0.01);

    double output5 = matherator9003.add(1, 0);
    double output6 = matherator9003.add(1.0, 0.0);
    assertEquals(1.00, output5, 0.01);
    assertEquals(1.00, output6, 0.01);
  }
>>>>>>> 883e5eccf0785729fe7f1587dc9cbd47a7ce0aad
}
