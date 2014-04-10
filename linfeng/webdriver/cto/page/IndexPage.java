package linfeng.webdriver.cto.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * 
 * 项目名称:webdriver_2
 * 包    名:linfeng.webdriver.cto.page
 * 类    名:IndexPage.java
 * 功能描述:加载51CTO首页
 * 创 建 人:jeffsui pinghailinfeng79@gmail.com
 * 创建时间:2013-10-30 上午11:03:29
 * 修改记录:
 *-------------------------------
 * 修 改 人:
 * 修改时间:
 * 修改内容:
 *--------------------------------
 * 版    本: v1.0
 */
public class IndexPage {
		/**
		 * 声明WebDriver对象
		 *
		 */
		private WebDriver driver ;
		/**
		 * 访问URL地址
		 */
		private final String url ="http://www.51cto.com/";
		/**
		 * 构造方法
		 * 初始化访问页面首页
		 * @param driver
		 */
		public IndexPage(WebDriver driver){
			this.driver=driver;
			driver.get(url);
			PageFactory.initElements(driver, this);
		}
		/**
		 * 页面登陆超链接
		 */
		@FindBy(xpath="/html/body[contains(concat(' ', @class, ' '), '  ')]/div[@id='home_top']/div[contains(concat(' ', @class, ' '), ' top_nav ')]/div[2]/span[@id='login_status']/div[contains(concat(' ', @class, ' '), ' login ')]/a[2]")
		private WebElement userLoginLink;
		
		/**
		 * 
		 * 方 法 名:openLoginPage
		 * 功能说明:点击超链接访问会员登陆页面
		 * @author jeffsui
		 * @time 2013-10-30 上午11:05:04
		 * @return
		 */
		public CTOLoginPage  openLoginPage(){
			userLoginLink.click();
			return new CTOLoginPage(driver);
		}
}
