package www.wenju.dao.com;

import java.util.List;
import org.springframework.stereotype.Repository;

import www.wenju.po.com.GoodsType;

@Repository
public interface GoodsTypeDao {
	// �����ľ�����,��int���ؽ��������
	public int createGoodsType(GoodsType goodsType);
	// ɾ���ľ�����,��int���ؽ����ɾ��
	public int deleteGoodsType(String gt_id);
	// �޸��ľ����ͣ��ģ�
	public int updateGoodsType(GoodsType goodsType);
	// ��ȡ�ľ����������б��飩
	public List<GoodsType> selectGoodsTypeList(GoodsType goodsType);
	// ��Ӧ��������
	public Integer selectGoodsTypeListCount(GoodsType goodsType);
	// ͨ��id��ѯ�ľ�������Ϣ���Խ��и��Ĳ���
	public GoodsType selectGoodsTypeById(String gt_id);
	// ��ѯ�ľ����͵�ID 
	public List<GoodsType> findGoodsTypeToId();
	// ��ѯ�ľ����͵�ID 
	public List<GoodsType> findGoodsTypeToName();
}
 