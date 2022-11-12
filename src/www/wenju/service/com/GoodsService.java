package www.wenju.service.com;

import java.sql.Date;
import java.util.List;

import www.wenju.po.com.Goods;
import www.wenju.utils.com.Page;

public interface GoodsService {
	// 增加
	public int createGoods(Goods Goods);

	// 删除
	public int deleteGoods(String g_id);

	// 更新
	public int updateGoods(Goods Goods);

	// id查询
	public Goods selectGoodsById(String g_id);

	// 查询列表
	public Page<Goods> selectGoodsList(Integer page, Integer rows, int number, String g_id, String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime, String g_specification, 
			String g_manufactures, Integer g_quantity, String g_sno, Float minprice, Float maxprice);
	
	// 查询文具ID 
	public List<Goods> findGoodsToGid();
	// 查询文具类型ID 
	public List<Goods> findGoodsToGgtid();
	// 查询文具制造商 
	public List<Goods> findGoodsToGmanufacturers();
	// 查询服务员编号
	public List<Goods> findGoodsToGSno();

}