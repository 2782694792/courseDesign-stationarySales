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
	// ע��Dao
	@Autowired
	private GoodsDao goodsDao;

	// ���
	@Override
	public int createGoods(Goods goods) {
		return goodsDao.createGoods(goods);
	}

	// ɾ��
	@Override
	public int deleteGoods(String g_id) {
		return goodsDao.deleteGoods(g_id);
	}

	// �޸�
	@Override
	public int updateGoods(Goods goods) {
		return goodsDao.updateGoods(goods);
	}

	// �б��ѯ
	@Override
	public Page<Goods> selectGoodsList(Integer page, Integer rows, int number, String g_id, String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime, String g_specification,
			String g_manufactures, Integer g_quantity, String g_sno,Float minprice, Float maxprice) {
	
		// �����ľ߶���
		Goods good = new Goods();
		
		// �ж��Ƿ�Ϊ��
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
		// ��ǰҳ
		good.setStart((page - 1));
		// ÿҳ��
		good.setRows(rows);
		// ��ѯ�б�
		List<Goods> goods = goodsDao.selectGoodsList(good);
		// ��ѯ�б��ܼ�¼��
		Integer count = goodsDao.selectGoodsListCount(good);
		// ����Page���ض���
		Page<Goods> goodsresult = new Page<>();
		// �������ʾ�����ҳ��
		int maxPageNum = (int) Math.ceil(count * 1.0 / rows);
		goodsresult.setMaxpageNum(maxPageNum);
		goodsresult.setPage(page);
		goodsresult.setNumber(number);
		goodsresult.setRows(goods);
		goodsresult.setSize(rows);
		goodsresult.setTotal(count);
		return goodsresult;
	}

	// ID��ѯ
	@Override
	public Goods selectGoodsById(String g_id) {
	 	Goods goods = goodsDao.selectGoodsById(g_id);
	 	return goods;
	}

	// ID
	@Override
	public List<Goods> findGoodsToGid() {
		System.out.println("�ľ�Gid�б�" + goodsDao.findGoodsToGid());
		return goodsDao.findGoodsToGid();
	}
	
	// ����ID
	@Override
	public List<Goods> findGoodsToGgtid() {
		System.out.println("�ľ�����Ggtid�б�" + goodsDao.findGoodsToGgtid());
		return goodsDao.findGoodsToGgtid();
	}

	// ������
	@Override
	public List<Goods> findGoodsToGmanufacturers() {
		System.out.println("�ľ߹��Gmanufacturers�б�" + goodsDao.findGoodsToGmanufacturers());
		return goodsDao.findGoodsToGmanufacturers();
	}
	
	//����Ա���
		@Override
		public List<Goods> findGoodsToGSno() {
			System.out.println("����Ա���GSno�б�" + goodsDao.findGoodsToGSno());
			return goodsDao.findGoodsToGSno();
		}
}