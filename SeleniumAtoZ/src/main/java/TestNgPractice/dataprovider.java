package TestNgPractice;

import org.testng.annotations.DataProvider;

public class dataprovider {
	@DataProvider(name="login")
	String[][] data()
	{
		String[][] run=new String[2][3];
		run[0][0]="row11";
		run[0][1]="row12";
		run[0][2]="row13";
		run[1][0]="row21";
		run[1][1]="row22";
		run[1][2]="row23";
		return run;
	}
}
