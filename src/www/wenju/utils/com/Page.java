package www.wenju.utils.com;

import java.util.List;

/*
 * ҳ������
 */
public class Page<T> {
	private int number; 			// ҳ������
	private int total; 				// ������
	private int page; 				// ��ǰҳ
	private int indexPage; 				// ��ȡ��ǰҳ
	private int size; 					// ÿҳ��
	private List<T> rows;	 		// �����
	private int maxpageNum; 	// ��ѡ������ҳ��

	public int getNumber() {
		return number;
	}

	public int getIndexpage() {
		return indexPage;
	}

	public void setIndexpage(int selectindexpage) {
		this.indexPage = selectindexpage;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getTotal() {
		return total;
	}

	public int getMaxpageNum() {
		return maxpageNum;
	}

	public void setMaxpageNum(int maxpageNum) {
		this.maxpageNum = maxpageNum;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<T> getRows() {
		return rows;
	}

	public void setRows(List<T> rows) {
		this.rows = rows;
	}
}
