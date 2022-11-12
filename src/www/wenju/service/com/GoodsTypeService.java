package www.wenju.service.com;

import java.util.List;

import www.wenju.po.com.GoodsType;
import www.wenju.utils.com.Page;

public interface GoodsTypeService {
	// 增加文具类型
	public int createGoodsType(GoodsType GoodsType);

	// 删除客户
	public int deleteGoodsType(String gt_id);

	// 更新客户
	public int updateGoodsType(GoodsType GoodsType);

	// 通过id查询客户
	public GoodsType selectGoodsTypeById(String gt_id);

	// 查询客户列表
	public Page<GoodsType> selectGoodsTypeList(Integer page, Integer rows, int number, String gt_id, String gt_name,
			String gt_about);

	// 根据文具类型名称查询
	public List<GoodsType> findGoodsTypeToId();

	// 根据文具类型名称查询
	public List<GoodsType> findGoodsTypeToName();
}
