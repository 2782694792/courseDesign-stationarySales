package www.wenju.serviceimpl.com;

import java.sql.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.wenju.dao.com.GoodsDao;
import www.wenju.po.com.Goods;
import www.wenju.service.com.GoodsService;
import www.wenju.utils.com.Page;

@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
	// 注入Dao
	@Autowired
	private GoodsDao goodsDao;

	// 添加
	@Override
	public int createGoods(Goods goods) {
		return goodsDao.createGoods(goods);
	}

	// 删除
	@Override
	public int deleteGoods(String g_id) {
		return goodsDao.deleteGoods(g_id);
	}

	// 修改
	@Override
	public int updateGoods(Goods goods) {
		return goodsDao.updateGoods(goods);
	}

	// 列表查询
	@Override
	public Page<Goods> selectGoodsList(Integer page, Integer rows, int number, String g_id, String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime, String g_specification,
			String g_manufactures, Integer g_quantity, String g_sno,Float minprice, Float maxprice) {
	
		// 创建文具对象
		Goods good = new Goods();
		
		// 判断是否为空
		if (g_price != null && g_price >= 0) {
			good.setG_price(g_price);
		}
		if (g_vipprice != null && g_vipprice >= 0) {
			good.setG_vipprice(g_vipprice);
		}
		if (StringUtils.isNotBlank(g_id)) {
			good.setG_id(g_id);
		}
		if (StringUtils.isNotBlank(g_name)) {
			good.setG_name(g_name);
		}
		if (StringUtils.isNotBlank(g_gtid)) {
			good.setG_gtid(g_gtid);
		}
		if (g_producttime != null) {
			good.setG_producttime(g_producttime);
		}
		if (StringUtils.isNotBlank(g_specification)) {
			good.setG_gtid(g_specification);
		}
		if (StringUtils.isNotBlank(g_manufactures)) {
			good.setG_gtid(g_manufactures);
		}
		if (StringUtils.isNotBlank(g_sno)) {
			good.setG_gtid(g_sno);
		}
		// 当前页
		good.setStart((page - 1));
		// 每页数
		good.setRows(rows);
		// 查询列表
		List<Goods> goods = goodsDao.selectGoodsList(good);
		// 查询列表总记录数
		Integer count = goodsDao.selectGoodsListCount(good);
		// 创建Page返回对象
		Page<Goods> goodsresult = new Page<>();
		// 计算可显示的最大页码
		int maxPageNum = (int) Math.ceil(count * 1.0 / rows);
		goodsresult.setMaxpageNum(maxPageNum);
		goodsresult.setPage(page);
		goodsresult.setNumber(number);
		goodsresult.setRows(goods);
		goodsresult.setSize(rows);
		goodsresult.setTotal(count);
		return goodsresult;
	}

	// ID查询
	@Override
	public Goods selectGoodsById(String g_id) {
	 	Goods goods = goodsDao.selectGoodsById(g_id);
	 	return goods;
	}

	// ID
	@Override
	public List<Goods> findGoodsToGid() {
		System.out.println("文具Gid列表：" + goodsDao.findGoodsToGid());
		return goodsDao.findGoodsToGid();
	}
	
	// 类型ID
	@Override
	public List<Goods> findGoodsToGgtid() {
		System.out.println("文具类型Ggtid列表：" + goodsDao.findGoodsToGgtid());
		return goodsDao.findGoodsToGgtid();
	}

	// 制造商
	@Override
	public List<Goods> findGoodsToGmanufacturers() {
		System.out.println("文具规格Gmanufacturers列表：" + goodsDao.findGoodsToGmanufacturers());
		return goodsDao.findGoodsToGmanufacturers();
	}
	
	//服务员编号
		@Override
		public List<Goods> findGoodsToGSno() {
			System.out.println("服务员编号GSno列表：" + goodsDao.findGoodsToGSno());
			return goodsDao.findGoodsToGSno();
		}
}