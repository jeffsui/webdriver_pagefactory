package linfeng.webdriver.cto.page;

import linfeng.webdriver.cto.bean.LoginUser;
import linfeng.webdriver.util.DriverUtil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * 
 * 项目名称:webdriver_2
 * 包    名:linfeng.webdriver.cto.page
 * 类    名:CTOLoginPage.java
 * 功能描述:
 * 创 建 人:jeffsui pinghailinfeng79@gmail.com
 * 创建时间:2013-10-30 上午11:01:48
 * 修改记录:
 *-------------------------------
 * 修 改 人:
 * 修改时间:
 * 修改内容:
 *--------------------------------
 * 版    本: v1.0
 */
public class CTOLoginPage {
	private WebDriver driver;
	/**
	 * 构造方法
	 * 初始化PageFactory
	 * @param driver
	 */
	public CTOLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	/**
	 * 页面元素:电子邮件
	 */
	@FindBy(name = "email")
	private WebElement loginNameField;
	/**
	 * 页面元素:密码
	 */
	@FindBy(name = "passwd")
	private WebElement passWordField;
	/**
	 * 页面元素:登陆按钮
	 */
	@FindBy(xpath = "//input[2] ")
	private WebElement loginSubmitButton;
	/**
	 * 页面元素:退出超链接
	 */
	@FindBy(xpath="//div[contains(concat(' ', @class, ' '), ' login2 ')]//div[1]//a[3] ")
	private WebElement loginout;
	
	/**
	 * 
	 * 方 法 名:login51CTO
	 * 功能说明:登陆51CTO
	 * @author jeffsui
	 * @time 2013-10-30 上午11:02:41
	 * @param user
	 * @throws InterruptedException
	 */
	public void login51CTO(LoginUser user) throws InterruptedException{
		driver.navigate().refresh();
		loginNameField.sendKeys(user.getUserName());
		passWordField.sendKeys(user.getPassWord());
		loginSubmitButton.click();
	}
	/**
	 * 
	 * 方 法 名:logout51CTO
	 * 功能说明:退出51CTO
	 * @author jeffsui
	 * @time 2013-10-30 上午11:02:55
	 */
    public void logout51CTO(){
    	loginout.click();
    }
    /**
     * 
     * 方 法 名:assertLoginSuccess
     * 功能说明:验证登陆是否成功
     * @author jeffsui
     * @time 2013-10-30 上午11:03:07
     * @param userName
     * @return
     */
	public boolean assertLoginSuccess(String userName) {
		return DriverUtil.isContantAppeared(driver, userName);
	}

}
