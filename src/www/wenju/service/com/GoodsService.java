package www.wenju.service.com;

import java.sql.Date;
import java.util.List;

import www.wenju.po.com.Goods;
import www.wenju.utils.com.Page;

public interface GoodsService {
	// ����
	public int createGoods(Goods Goods);

	// ɾ��
	public int deleteGoods(String g_id);

	// ����
	public int updateGoods(Goods Goods);

	// id��ѯ
	public Goods selectGoodsById(String g_id);

	// ��ѯ�б�
	public Page<Goods> selectGoodsList(Integer page, Integer rows, int number, String g_id, String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime, String g_specification, 
			String g_manufactures, Integer g_quantity, String g_sno, Float minprice, Float maxprice);
	
	// ��ѯ�ľ�ID 
	public List<Goods> findGoodsToGid();
	// ��ѯ�ľ�����ID 
	public List<Goods> findGoodsToGgtid();
	// ��ѯ�ľ������� 
	public List<Goods> findGoodsToGmanufacturers();
	// ��ѯ����Ա���
	public List<Goods> findGoodsToGSno();

}