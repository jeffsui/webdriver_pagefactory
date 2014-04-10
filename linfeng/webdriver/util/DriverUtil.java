package linfeng.webdriver.util;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
/**
 * 
 * 
 * 项目名称:webdriver_1
 * 包    名:linfeng.webdriver.util
 * 类    名:DriverUtil.java
 * 功能描述:针对WebDriver一些方法封装的工具类
 * 创 建 人:jeffsui pinghailinfeng79@gmail.com
 * 创建时间:2013-10-28 下午4:42:05
 * 修改记录:
 *-------------------------------
 * 修 改 人:
 * 修改时间:
 * 修改内容:
 *--------------------------------
 * 版    本: v1.0
 */
public class DriverUtil {
     /**
      * 
      * 方 法 名:isContantAppeared
      * 功能说明:页面文字是否出现
      * @author jeffsui
      * @time 2013-10-28 下午4:46:13
      * @param driver
      * @param content
      * @return 如果为true,则页面文字存在;反之亦然
      */
	public static boolean isContantAppeared(WebDriver driver,String content){
		boolean status=false;
		try {
			driver.findElement(By.xpath("//*[contains(.,'"+content+"')]"));
			System.out.println(content+" is appeard!");
			status=true;
		} catch (NoSuchElementException e) {
			status = false;
			System.out.println(" ' "+content+" 'does't exsist!");
		}
		return status;
	}
	/**
	 * 
	 * 方 法 名:waitPageRefresh
	 * 功能说明:页面是否刷新
	 * @author jeffsui
	 * @time 2013-10-28 下午4:46:40
	 * @param trigger
	 * @return 如果为true,则页面刷新;反之亦然
	 */
	public static boolean waitPageRefresh(WebElement trigger) {
		int refreshTime = 0;
		boolean isRefresh = false;
		try {
			for (int i = 1; i < 60; i++) {
				refreshTime = i;
				trigger.getTagName();
				Thread.sleep(1000);
			}
		} catch (StaleElementReferenceException e) {
			isRefresh = true;
			System.out.println("Page refresh time is:" + refreshTime + " seconds!");
			return isRefresh;
		} catch (WebDriverException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Page didnt refresh in 60 seconds!");
		return isRefresh;
	}
	/**
	 * 
	 * 方 法 名:isElementExsit
	 * 功能说明:元素是否存在
	 * @author jeffsui
	 * @time 2013-10-28 下午5:03:08
	 * @param driver
	 * @param locator
	 * @return 如果为true,则页面元素存在;反之亦然
	 */
	public static boolean isElementExsit(WebDriver driver, By locator) {
		boolean flag = false;
		try {
			WebElement element=driver.findElement(locator);
			flag=null!=element;
		} catch (NoSuchElementException e) {
			System.out.println("Element:" + locator.toString()
					+ " is not exsit!");
		}
		return flag;
	}

}
