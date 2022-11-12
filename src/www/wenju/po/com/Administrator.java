package www.wenju.po.com;

import java.io.Serializable;

/*
 * 用户持久化类，定义用户的顾客的属性
 */
public class Administrator implements Serializable {
	/*
	 * 定义程序序列化ID，序列化ID等同于身份验证，主要用于程序的版本控制，维护不同版本的兼容性以及避免在程序版本升级时程序报告的错误
	 * 通过在运行时确定类的serialVersionUID来验证版本一致性
	 * @Override 的作用：
	 * 		可读性提高
	 * 		编译器会校验写的方法在父类中是否存在
	 */
	private static final long serialVersionUID = 1L;
	private String admin_id;					// 编号
	private String admin_name; 				// 姓名
	private String admin_account;			// 账号
	private String admin_password; 		// 密码
	@Override
	public String toString() {
		return "Administrator [admin_name=" + admin_name + ", admin_account=" + admin_account + ", admin_id=" + admin_id
				+ ", admin_password=" + admin_password + "]";
	}
	public String getAdmin_name() {
		return admin_name;
	}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;
	}
	public String getAdmin_account() {
		return admin_account;
	}
	public void setAdmin_account(String admin_account) {
		this.admin_account = admin_account;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_password() {
		return admin_password;
	}
	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
}
