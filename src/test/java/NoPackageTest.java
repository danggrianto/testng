import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

/**
 * @author Filippo Diotalevi
 */
public class NoPackageTest {
	private boolean m_run = false;
	int num=0;

	@Test(groups = {"nopackage"}, invocationCount =2)
	public void test() {
	   m_run = true;
		num++;
		Assert.assertTrue(num>2);

	}

   @AfterMethod(groups = {"nopackage"}, enabled = false)
   public void after() {
      assert m_run : "test method was not run";
   }
}
