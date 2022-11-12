package www.wenju.po.com;

import java.io.Serializable;

public class GoodsType implements Serializable{

	private static final long serialVersionUID = 1L;
	private String gt_id;				// 文具ID
	private String gt_name;			// 文具种类名称
	private String gt_about;			// 文具类型内容简介
	private Integer start;				// 起始行
	private Integer rows;					// 所取行数
	public String getGt_id() {
		return gt_id;
	}
	public void setGt_id(String gt_id) {
		this.gt_id = gt_id;
	}
	@Override
	public String toString() {
		return "GoodsType [gt_about=" + gt_about + ", gt_name=" + gt_name + "]";
	}
	public String getGt_about() {
		return gt_about;
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
	public void setRows(Integer row) {
		this.rows = row;
	}
	public void setGt_about(String gt_about) {
		this.gt_about = gt_about;
	}
	public String getGt_name() {
		return gt_name;
	}
	public void setGt_name(String gt_name) {
		this.gt_name = gt_name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
