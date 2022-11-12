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
 * �ͻ�����
 */
@Service
@Transactional
public class GoodsTypeServiceImpl implements GoodsTypeService {
	// ע��Dao
	@Autowired
	private GoodsTypeDao goodsTypeDao;

	// ���
	@Override
	public int createGoodsType(GoodsType goodsType) {
		return goodsTypeDao.createGoodsType(goodsType);
	}

	// ɾ��
	@Override
	public int deleteGoodsType(String gt_id) {
		return goodsTypeDao.deleteGoodsType(gt_id);
	}

	// �޸�
	@Override
	public int updateGoodsType(GoodsType goodsType) {
		return goodsTypeDao.updateGoodsType(goodsType);
	}

	// �б��ѯ
	@Override
	public Page<GoodsType> selectGoodsTypeList(Integer page, Integer rows, int number, String gt_id,
			String gt_name, String gt_about) {
		// �����ľ����Ͷ���
		GoodsType goodsType = new GoodsType();
		// �жϱ���Ƿ�Ϊ��
		if (StringUtils.isNotBlank(gt_id)) {
			goodsType.setGt_id(gt_id);
		}
		// �ж������Ƿ�Ϊ��
		if (StringUtils.isNotBlank(gt_name)) {
			goodsType.setGt_name(gt_name);
		}
		// �ж������Ƿ�Ϊ��
		if (StringUtils.isNotBlank(gt_about)) {
			goodsType.setGt_about(gt_about);
		}
		// ��ǰҳ
		goodsType.setStart((page - 1));
		// ÿҳ��
		goodsType.setRows(rows);
		// ��ѯ�б�
		List<GoodsType> goodsTypes = goodsTypeDao.selectGoodsTypeList(goodsType);
		// ��ѯ�б��ܼ�¼��
		Integer count = goodsTypeDao.selectGoodsTypeListCount(goodsType);
		// ����Page���ض���
		Page<GoodsType> result = new Page<>();
		// �������ʾ�����ҳ��
		int maxPageNum = (int) Math.ceil(count * 1.0 / rows);
		result.setMaxpageNum(maxPageNum);
		result.setPage(page);
		result.setNumber(number);
		result.setRows(goodsTypes);
		result.setSize(rows);
		result.setTotal(count);
		return result;
	}

	// ID��ѯ
	@Override
	public GoodsType selectGoodsTypeById(String gt_id) {
	 	GoodsType goodsType = goodsTypeDao.selectGoodsTypeById(gt_id);
	 	return goodsType;
	}

	// ����ID��ѯ
	@Override
	public List<GoodsType> findGoodsTypeToId() {
		System.out.println("�ľ�����ID�б�" + goodsTypeDao.findGoodsTypeToId());
		return goodsTypeDao.findGoodsTypeToId();
	}

	// ����Name��ѯ
	@Override
	public List<GoodsType> findGoodsTypeToName() {
		System.out.println("�ľ�����Name�б�" + goodsTypeDao.findGoodsTypeToName());
		return goodsTypeDao.findGoodsTypeToName();
	}

}
