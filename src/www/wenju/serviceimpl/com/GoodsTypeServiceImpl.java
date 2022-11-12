package www.wenju.serviceimpl.com;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.wenju.dao.com.GoodsTypeDao;
import www.wenju.po.com.GoodsType;
import www.wenju.service.com.GoodsTypeService;
import www.wenju.utils.com.Page;

/**
 * 客户管理
 */
@Service
@Transactional
public class GoodsTypeServiceImpl implements GoodsTypeService {
	// 注入Dao
	@Autowired
	private GoodsTypeDao goodsTypeDao;

	// 添加
	@Override
	public int createGoodsType(GoodsType goodsType) {
		return goodsTypeDao.createGoodsType(goodsType);
	}

	// 删除
	@Override
	public int deleteGoodsType(String gt_id) {
		return goodsTypeDao.deleteGoodsType(gt_id);
	}

	// 修改
	@Override
	public int updateGoodsType(GoodsType goodsType) {
		return goodsTypeDao.updateGoodsType(goodsType);
	}

	// 列表查询
	@Override
	public Page<GoodsType> selectGoodsTypeList(Integer page, Integer rows, int number, String gt_id,
			String gt_name, String gt_about) {
		// 创建文具类型对象
		GoodsType goodsType = new GoodsType();
		// 判断编号是否为空
		if (StringUtils.isNotBlank(gt_id)) {
			goodsType.setGt_id(gt_id);
		}
		// 判断名称是否为空
		if (StringUtils.isNotBlank(gt_name)) {
			goodsType.setGt_name(gt_name);
		}
		// 判断内容是否为空
		if (StringUtils.isNotBlank(gt_about)) {
			goodsType.setGt_about(gt_about);
		}
		// 当前页
		goodsType.setStart((page - 1));
		// 每页数
		goodsType.setRows(rows);
		// 查询列表
		List<GoodsType> goodsTypes = goodsTypeDao.selectGoodsTypeList(goodsType);
		// 查询列表总记录数
		Integer count = goodsTypeDao.selectGoodsTypeListCount(goodsType);
		// 创建Page返回对象
		Page<GoodsType> result = new Page<>();
		// 计算可显示的最大页码
		int maxPageNum = (int) Math.ceil(count * 1.0 / rows);
		result.setMaxpageNum(maxPageNum);
		result.setPage(page);
		result.setNumber(number);
		result.setRows(goodsTypes);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

	// ID查询
	@Override
	public GoodsType selectGoodsTypeById(String gt_id) {
	 	GoodsType goodsType = goodsTypeDao.selectGoodsTypeById(gt_id);
	 	return goodsType;
	}

	// 类型ID查询
	@Override
	public List<GoodsType> findGoodsTypeToId() {
		System.out.println("文具类型ID列表：" + goodsTypeDao.findGoodsTypeToId());
		return goodsTypeDao.findGoodsTypeToId();
	}

	// 类型Name查询
	@Override
	public List<GoodsType> findGoodsTypeToName() {
		System.out.println("文具类型Name列表：" + goodsTypeDao.findGoodsTypeToName());
		return goodsTypeDao.findGoodsTypeToName();
	}

}
