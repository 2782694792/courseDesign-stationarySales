package www.wenju.po.com;

import java.io.Serializable;

/*
 * �û��־û��࣬�����û��Ĺ˿͵�����
 */
public class Administrator implements Serializable {
	/*
	 * ����������л�ID�����л�ID��ͬ�������֤����Ҫ���ڳ���İ汾���ƣ�ά����ͬ�汾�ļ������Լ������ڳ���汾����ʱ���򱨸�Ĵ���
	 * ͨ��������ʱȷ�����serialVersionUID����֤�汾һ����
	 * @Override �����ã�
	 * 		�ɶ������
	 * 		��������У��д�ķ����ڸ������Ƿ����
	 */
	private static final long serialVersionUID = 1L;
	private String admin_id;					// ���
	private String admin_name; 				// ����
	private String admin_account;			// �˺�
	private String admin_password; 		// ����
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
