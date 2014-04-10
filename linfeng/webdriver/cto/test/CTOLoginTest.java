package linfeng.webdriver.cto.test;

import linfeng.webdriver.cto.bean.LoginUser;
import linfeng.webdriver.cto.page.CTOLoginPage;
import linfeng.webdriver.cto.page.IndexPage;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * 
 * 项目名称:webdriver_2
 * 包    名:linfeng.webdriver.cto.test
 * 类    名:CTOLoginTest.java
 * 功能描述:测试类
 * 创 建 人:jeffsui pinghailinfeng79@gmail.com
 * 创建时间:2013-10-30 上午10:59:47
 * 修改记录:
 *-------------------------------
 * 修 改 人:
 * 修改时间:
 * 修改内容:
 *--------------------------------
 * 版    本: v1.0
 */
public class CTOLoginTest {
   
    private  static WebDriver driver;
    
    @BeforeClass
    public static  void setUp() {
    		
            driver = new FirefoxDriver();//初始化火狐浏览器驱动
    }

    @AfterClass
    public static void tearDown() {
            driver.quit();//退出浏览器
    }
    
    @Test
    public void CTOTest() throws InterruptedException{
    	   /**
    	    * 测试流程:
    	    * 1.初始化账号密码
    	    * 2.初始化首页
    	    * 3.打开登陆页面
    	    * 4.输入账号密码
    	    * 5.判断登陆是否成功
    	    * 6.退出登陆
    	    */
    	    LoginUser user = new LoginUser("test", "123456");//此处替换成51CTO的账号密码
            IndexPage index=new IndexPage(driver);//初始化首页
            CTOLoginPage login=index.openLoginPage();//打开登陆页面
            login.login51CTO(user);//输入账号密码
            Assert.assertTrue(login.assertLoginSuccess(user.getUserName()));//判断登陆是否成功
            login.logout51CTO();//退出登陆
    }
}