package www.wenju.dao.com;

import java.util.List;

import org.springframework.stereotype.Repository;

import www.wenju.po.com.Goods;


@Repository
public interface GoodsDao {
		// 创建
		public int createGoods(Goods goods);
		// 删除
		public int deleteGoods(String g_id);
		// 修改
		public int updateGoods(Goods goods);
		// （查）
		public List<Goods> selectGoodsList(Goods goods);
		// 数量
		public Integer selectGoodsListCount(Goods goods);
		// id查询
		public Goods selectGoodsById(String g_id);
		
		// 查询文具ID 
		public List<Goods> findGoodsToGid();
		// 查询文具类型ID 
		public List<Goods> findGoodsToGgtid();
		// 查询文具制造商 
		public List<Goods> findGoodsToGmanufacturers();
		// 查询服务员编号
		public List<Goods> findGoodsToGSno();
}
