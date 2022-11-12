package www.wenju.po.com;

import java.io.Serializable;
import java.sql.Date;

public class Order implements Serializable {
	private static final long serialVersionUID = 1L;
	private String o_phone;
	private String o_id;
	private String o_connent;
	private Float o_sum;
	private Date o_time;
	public String getO_phone() {
		return o_phone;
	}
	public void setO_phone(String o_phone) {
		this.o_phone = o_phone;
	}
	public String getO_id() {
		return o_id;
	}
	public void setO_id(String o_id) {
		this.o_id = o_id;
	}
	public String getO_connent() {
		return o_connent;
	}
	public void setO_connent(String o_connent) {
		this.o_connent = o_connent;
	}
	public Float getO_sum() {
		return o_sum;
	}
	public void setO_sum(Float o_sum) {
		this.o_sum = o_sum;
	}
	public Date getO_time() {
		return o_time;
	}
	public void setO_time(Date o_time) {
		this.o_time = o_time;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Order [o_phone=" + o_phone + ", o_id=" + o_id + ", o_connent=" + o_connent + ", o_sum=" + o_sum
				+ ", o_time=" + o_time + "]";
	}
	
}
