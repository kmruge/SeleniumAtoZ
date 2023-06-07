package TestNgPractice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class datareceiving {
	@Test(dataProvider="login", dataProviderClass=dataprovider.class)
	void test(String run1, String run2, String run3)
	{
		System.out.println(run1);
		System.out.println(run2);
		System.out.println(run3);
		Assertion asser=new SoftAssert();
	}
}
