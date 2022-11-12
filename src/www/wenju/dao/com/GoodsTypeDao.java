package www.wenju.dao.com;

import java.util.List;
import org.springframework.stereotype.Repository;

import www.wenju.po.com.GoodsType;

@Repository
public interface GoodsTypeDao {
	// 创建文具类型,以int返回结果（增）
	public int createGoodsType(GoodsType goodsType);
	// 删除文具类型,以int返回结果（删）
	public int deleteGoodsType(String gt_id);
	// 修改文具类型（改）
	public int updateGoodsType(GoodsType goodsType);
	// 获取文具类型数据列表（查）
	public List<GoodsType> selectGoodsTypeList(GoodsType goodsType);
	// 相应数据数量
	public Integer selectGoodsTypeListCount(GoodsType goodsType);
	// 通过id查询文具类型信息，以进行更改操作
	public GoodsType selectGoodsTypeById(String gt_id);
	// 查询文具类型的ID 
	public List<GoodsType> findGoodsTypeToId();
	// 查询文具类型的ID 
	public List<GoodsType> findGoodsTypeToName();
}
 