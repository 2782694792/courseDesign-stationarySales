package www.wenju.service.com;

import java.util.List;

import www.wenju.po.com.GoodsType;
import www.wenju.utils.com.Page;

public interface GoodsTypeService {
	// �����ľ�����
	public int createGoodsType(GoodsType GoodsType);

	// ɾ���ͻ�
	public int deleteGoodsType(String gt_id);

	// ���¿ͻ�
	public int updateGoodsType(GoodsType GoodsType);

	// ͨ��id��ѯ�ͻ�
	public GoodsType selectGoodsTypeById(String gt_id);

	// ��ѯ�ͻ��б�
	public Page<GoodsType> selectGoodsTypeList(Integer page, Integer rows, int number, String gt_id, String gt_name,
			String gt_about);

	// �����ľ��������Ʋ�ѯ
	public List<GoodsType> findGoodsTypeToId();

	// �����ľ��������Ʋ�ѯ
	public List<GoodsType> findGoodsTypeToName();
}
