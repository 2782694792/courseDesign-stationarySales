package www.wenju.utils.com;

import java.util.List;

/*
 * 页的属性
 */
public class Page<T> {
	private int number; 			// 页数上限
	private int total; 				// 总条数
	private int page; 				// 当前页
	private int indexPage; 				// 获取当前页
	private int size; 					// 每页数
	private List<T> rows;	 		// 结果集
	private int maxpageNum; 	// 可选择的最大页数

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
