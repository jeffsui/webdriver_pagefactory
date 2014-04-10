package linfeng.webdriver.cto.bean;
/**
 * 
 * 
 * 项目名称:webdriver_2
 * 包    名:linfeng.cto.bean
 * 类    名:LoginUser.java
 * 功能描述:登陆页面元素封装
 * 创 建 人:jeffsui pinghailinfeng79@gmail.com
 * 创建时间:2013-10-30 上午10:33:07
 * 修改记录:
 *-------------------------------
 * 修 改 人:
 * 修改时间:
 * 修改内容:
 *--------------------------------
 * 版    本: v1.0
 */
public class LoginUser {
	/**
	 * 登陆用户名
	 */
	private String userName;
	/**
	 * 登陆密码
	 */
	private String passWord;
	/**
	 * 默认无参构造
	 */
	public LoginUser(){}
	/**
	 * 有参构造方法
	 * @param userName 用户名
	 * @param passWord 密码
	 */
	public LoginUser(String userName, String passWord) {
		this.userName = userName;
		this.passWord = passWord;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	

}
