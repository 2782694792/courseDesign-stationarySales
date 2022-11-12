package www.wenju.dao.com;

import java.util.List;

import org.springframework.stereotype.Repository;

import www.wenju.po.com.Goods;


@Repository
public interface GoodsDao {
		// ����
		public int createGoods(Goods goods);
		// ɾ��
		public int deleteGoods(String g_id);
		// �޸�
		public int updateGoods(Goods goods);
		// ���飩
		public List<Goods> selectGoodsList(Goods goods);
		// ����
		public Integer selectGoodsListCount(Goods goods);
		// id��ѯ
		public Goods selectGoodsById(String g_id);
		
		// ��ѯ�ľ�ID 
		public List<Goods> findGoodsToGid();
		// ��ѯ�ľ�����ID 
		public List<Goods> findGoodsToGgtid();
		// ��ѯ�ľ������� 
		public List<Goods> findGoodsToGmanufacturers();
		// ��ѯ����Ա���
		public List<Goods> findGoodsToGSno();
}
