package edu.brown.cs.student.main;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathBotTest {

  @Test
  public void testAddition() {
    MathBot matherator9000 = new MathBot();
    double output = matherator9000.add(10.5, 3);
    assertEquals(13.5, output, 0.01);
  }

  @Test
  public void testLargerNumbers() {
    MathBot matherator9001 = new MathBot();
    double output = matherator9001.add(100000, 200303);
    assertEquals(300303, output, 0.01);
  }

  @Test
  public void testSubtraction() {
    MathBot matherator9002 = new MathBot();
    double output = matherator9002.subtract(18, 17);
    assertEquals(1, output, 0.01);
  }

  // TODO: add more unit tests of your own
  @Test
  public void testAddZeros() {
    MathBot matherator9003 = new MathBot();
    double output = matherator9003.add(0, 0);
    assertEquals(0.0, output, 0.01);
  }

  @Test
  public void testAddNegativeNums() {
    MathBot matherator9004 = new MathBot();
    double output = matherator9004.add(-100, -100);
    assertEquals(-200.0, output, 0.01);
  }

  @Test
  public void testSubtractZeros() {
    MathBot matherator9005 = new MathBot();
    double output = matherator9005.subtract(0, 0);
    assertEquals(0.0, output, 0.01);
  }

  @Test
  public void testSubtractNegativeNums() {
    MathBot matherator9005 = new MathBot();
    double output = matherator9005.subtract(100, -100);
    assertEquals(200.0, output, 0.01);
  }
}
