package www.wenju.po.com;

import java.io.Serializable;
import java.sql.Date;

public class Goods implements Serializable {
	private static final long serialVersionUID = 1L;
	private String g_id; 						// 文具ID
	private String g_gtid; 						// 文具类型
	private String g_name; 					// 文具名称
	private Float g_price; 						// 文具价格
	private Float g_vipprice; 					// 会员价格
	private Date g_producttime; 			// 生产日期
	private String g_specification; 			// 文具规格
	private String g_manufacturers;			 // 制造商
	private Integer g_quantity; 				// 现有数量	
	private String g_sno; 						// 职工号
	private String g_picture;			 		// 图片名称
	private Integer start; 						// 起始行
	private Integer rows; 						// 所取行数
	private Float minprice;				// 最小接受价格
	private Float maxprice;				// 最大承受价格

	public Float getMinprice() {
		return minprice;
	}

	public String getG_manufacturers() {
		return g_manufacturers;
	}

	public void setG_manufacturers(String g_manufacturers) {
		this.g_manufacturers = g_manufacturers;
	}

	public void setMinprice(Float minprice) {
		this.minprice = minprice;
	}

	public Float getMaxprice() {
		return maxprice;
	}

	public void setMaxprice(Float maxprice) {
		this.maxprice = maxprice;
	}

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}


	@Override
	public String toString() {
		return "Goods [g_id=" + g_id + ", g_name=" + g_name + ", g_gtid=" + g_gtid + ", g_price=" + g_price
				+ ", g_vipprice=" + g_vipprice + ", g_producttime=" + g_producttime + ", g_specification="
				+ g_specification + ", g_manufacture=" + g_manufacturers + ", g_quantity=" + g_quantity + ", g_picture="
				+ g_picture + ", g_sno=" + g_sno + ", start=" + start + ", rows=" + rows + ", minprice=" + minprice
				+ ", maxprice=" + maxprice + ", getMinprice()=" + getMinprice() + ", getMaxprice()=" + getMaxprice()
				+ ", getStart()=" + getStart() + ", getRows()=" + getRows() + ", getG_id()=" + getG_id()
				+ ", getG_name()=" + getG_name() + ", getG_gtid()=" + getG_gtid() + ", getG_price()=" + getG_price()
				+ ", getG_vipprice()=" + getG_vipprice() + ", getG_producttime()=" + getG_producttime()
				+ ", getG_specification()=" + getG_specification() + ", getG_manufacture()=" + getG_manufacturers()
				+ ", getG_quantity()=" + getG_quantity() + ", getG_sno()=" + getG_sno() + ", getG_picture()="
				+ getG_picture() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getG_id() {
		return g_id;
	}

	public void setG_id(String g_id) {
		this.g_id = g_id;
	}

	public String getG_name() {
		return g_name;
	}

	public void setG_name(String g_name) {
		this.g_name = g_name;
	}

	public String getG_gtid() {
		return g_gtid;
	}

	public void setG_gtid(String g_type) {
		this.g_gtid = g_type;
	}

	public Float getG_price() {
		return g_price;
	}

	public void setG_price(Float g_price) {
		this.g_price = g_price;
	}

	public Float getG_vipprice() {
		return g_vipprice;
	}

	public void setG_vipprice(Float g_vipprice) {
		this.g_vipprice = g_vipprice;
	}

	public Date getG_producttime() {
		return g_producttime;
	}

	public void setG_producttime(Date g_protime) {
		this.g_producttime = g_protime;
	}

	public String getG_specification() {
		return g_specification;
	}

	public void setG_specification(String g_specification) {
		this.g_specification = g_specification;
	}


	public Integer getG_quantity() {
		return g_quantity;
	}

	public void setG_quantity(Integer g_quantity) {
		this.g_quantity = g_quantity;
	}

	public String getG_sno() {
		return g_sno;
	}

	public void setG_sno(String sno) {
		this.g_sno = sno;
	}

	public String getG_picture() {
		return g_picture;
	}

	public void setG_picture(String g_picture) {
		this.g_picture = g_picture;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
