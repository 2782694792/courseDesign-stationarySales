package www.wenju.po.com;

import java.io.Serializable;

public class Exchange implements Serializable {
	private static final long serialVersionUID = 1L;
	private String e_gno;			// 文具ID
	private String e_gname;		// 文具名称
	public String getE_gno() {
		return e_gno;
	}
	@Override
	public String toString() {
		return "Exchange [e_gno=" + e_gno + ", e_gname=" + e_gname + ", e_integral=" + e_integral + "]";
	}
	public void setE_gno(String e_gno) {
		this.e_gno = e_gno;
	}
	public String getE_gname() {
		return e_gname;
	}
	public void setE_gname(String e_gname) {
		this.e_gname = e_gname;
	}
	public Float getE_integral() {
		return e_integral;
	}
	public void setE_integral(Float e_integral) {
		this.e_integral = e_integral;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	private Float e_integral;		// 文具积分
}
