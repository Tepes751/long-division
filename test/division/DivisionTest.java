package division;

import static org.junit.Assert.*;

import org.junit.Test;

import division.Division;
import division.PairNumber;

public class DivisionTest {

	@Test
	public void testResultDivisionProcesses() {		
		
		int dividend = 78459;
		int divisor = 4;
		String expectedResultNumber = "19614.75"; 
		Division division = new Division(dividend, divisor);
		String expectedResultLine = "7-4, 38-36, 24-24, 5-4, 19-16, 3-0, 30-28, 20-20, 0-0, ";
		assertEquals(expectedResultLine, divisionProcessListToString(division));
		assertEquals(expectedResultNumber, division.getDivisionResult());
		
		int dividend1 = 10000;
		int divisor1 = 10;
		String expectedResultNumber1 = "1000"; 
		Division division1 = new Division(dividend1, divisor1);
		String expectedResultLine1 = "10-10, 0-0, 0-0, 0-0, ";
		assertEquals(expectedResultLine1, divisionProcessListToString(division1));
		assertEquals(expectedResultNumber1, division1.getDivisionResult());
		
		int dividend2 = 12345;
		int divisor2 = 5;
		String expectedResultNumber2 = "2469"; 
		Division division2 = new Division(dividend2, divisor2);
		String expectedResultLine2 = "12-10, 23-20, 34-30, 45-45, 0-0, ";
		assertEquals(expectedResultLine2, divisionProcessListToString(division2));
		assertEquals(expectedResultNumber2, division2.getDivisionResult());
		
		int dividend3 = 12345;
		int divisor3 = 1;
		String expectedResultNumber3 = "12345"; 
		Division division3 = new Division(dividend3, divisor3);
		String expectedResultLine3 = "1-1, 2-2, 3-3, 4-4, 5-5, 0-0, ";
		assertEquals(expectedResultLine3, divisionProcessListToString(division3));
		assertEquals(expectedResultNumber3, division3.getDivisionResult());
		
	}
	
	public String divisionProcessListToString(Division division){
		String result = "";
		
		for(PairNumber pairNumber: division.divisionDetailsList){
			result += pairNumber.getTopNumber() + "-" + pairNumber.getBottomNumber() + ", ";
		}
		
		return result;		
	}	
	
	@Test
	public void testPrintDivisionResult() {
		
		int dividend = 78459;
		int divisor = 4;	
		Division division = new Division(dividend, divisor);
		String expectedResultLine = " 78459|4\r\n"
								  + "-     |________\r\n"
								  + " 4    |19614.75\r\n"
								  + " _\r\n"
								  + " 38\r\n"
								  + "-\r\n"
								  + " 36\r\n"
								  + " __\r\n"
								  + "  24\r\n"
								  + " -\r\n"
								  + "  24\r\n"
								  + "  __\r\n"
								  + "    5\r\n"
								  + "   -\r\n"
								  + "    4\r\n"
								  + "    _\r\n"
								  + "    19\r\n"
								  + "   -\r\n"
								  + "    16\r\n"
								  + "    __\r\n"
								  + "     30\r\n"
								  + "    -\r\n"
								  + "     28\r\n"
								  + "     __\r\n"
								  + "      20\r\n"
								  + "     -\r\n"
								  + "      20\r\n"
								  + "      __\r\n"
								  + "       0\r\n";
		assertEquals(expectedResultLine, division.findDivisionDetails());
	
		int dividend1 = 100500;
		int divisor1 = 5;		
		Division division1 = new Division(dividend1, divisor1);
		String expectedResultLine1 = " 100500|5\r\n"
								   + "-      |_____\r\n"
								   + " 10    |20100\r\n"
								   + " __\r\n"
								   + "    5\r\n"
								   + "   -\r\n"
								   + "    5\r\n"
								   + "    _\r\n"
								   + "    0\r\n";								 
		assertEquals(expectedResultLine1, division1.findDivisionDetails());
		
		
		int dividend2 = 251012242;
		int divisor2 = 12515;		
		Division division2 = new Division(dividend2, divisor2);
		String expectedResultLine2 = " 251012242|12515\r\n"
								   + "-         |________________\r\n"
								   + " 25030    |20056.9110667199\r\n"
								   + " _____\r\n"
								   + "    71224\r\n"
								   + "   -\r\n"
								   + "    62575\r\n"
								   + "    _____\r\n"
								   + "     86492\r\n"
								   + "    -\r\n"
								   + "     75090\r\n"
								   + "     _____\r\n"
								   + "     114020\r\n"
								   + "    -\r\n"
								   + "     112635\r\n"
								   + "     ______\r\n"
								   + "       13850\r\n"
								   + "      -\r\n"
								   + "       12515\r\n"
								   + "       _____\r\n"
								   + "        13350\r\n"
								   + "       -\r\n"
								   + "        12515\r\n"
								   + "        _____\r\n"
								   + "          83500\r\n"
								   + "         -\r\n"
								   + "          75090\r\n"
								   + "          _____\r\n"
								   + "           84100\r\n"
								   + "          -\r\n"
								   + "           75090\r\n"
								   + "           _____\r\n"
								   + "            90100\r\n"
								   + "           -\r\n"
								   + "            87605\r\n"
								   + "            _____\r\n"
								   + "             24950\r\n"
								   + "            -\r\n"
								   + "             12515\r\n"
								   + "             _____\r\n"
								   + "             124350\r\n"
								   + "            -\r\n"
								   + "             112635\r\n"
								   + "             ______\r\n"
								   + "              117150\r\n"
								   + "             -\r\n"
								   + "              112635\r\n"
								   + "              ______\r\n"
								   + "                4515\r\n";								 
		assertEquals(expectedResultLine2, division2.findDivisionDetails());
		
		int dividend3 = 1000;
		int divisor3 = 3;		
		Division division3 = new Division(dividend3, divisor3);
		String expectedResultLine3 = " 1000|3\r\n"
								   + "-    |_______\r\n"
								   + "  9  |333.(3)\r\n"
								   + "  _\r\n"
								   + "  10\r\n"
								   + " -\r\n"
								   + "   9\r\n"
								   + "   _\r\n"
								   + "   10\r\n"
								   + "  -\r\n"
								   + "    9\r\n"
								   + "    _\r\n"
								   + "    10\r\n"
								   + "   -\r\n"
								   + "     9\r\n"
								   + "     _\r\n"
								   + "     1\r\n";								 
		assertEquals(expectedResultLine3, division3.findDivisionDetails());
		
		int dividend4 = 7;
		int divisor4 = 12;		
		Division division4 = new Division(dividend4, divisor4);
		String expectedResultLine4 = " 7 |12\r\n"
								   + "-  |_______\r\n"
								   + " 60|0.58(3)\r\n"
								   + " __\r\n"
								   + " 100\r\n"
								   + "-\r\n"
								   + "  96\r\n"
								   + "  __\r\n"
								   + "   40\r\n"
								   + "  -\r\n"
								   + "   36\r\n"
								   + "   __\r\n"
								   + "    4\r\n";								 
		assertEquals(expectedResultLine4, division4.findDivisionDetails());
				
	}
	
	
	@Test(expected = ArithmeticException.class)
	public void testThrowsArithmeticException() {
		new Division(15, 0);
	}
	
	
}
