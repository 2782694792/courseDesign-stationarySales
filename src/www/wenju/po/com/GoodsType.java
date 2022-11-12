package www.wenju.po.com;

import java.io.Serializable;

public class GoodsType implements Serializable{

	private static final long serialVersionUID = 1L;
	private String gt_id;				// �ľ�ID
	private String gt_name;			// �ľ���������
	private String gt_about;			// �ľ��������ݼ��
	private Integer start;				// ��ʼ��
	private Integer rows;					// ��ȡ����
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
