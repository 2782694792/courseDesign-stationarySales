package www.wenju.dao.com;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import www.wenju.po.com.Administrator;
// �� DAO ���� IoC ��������ʹδ�������쳣���ʸ�ת��Ϊ Spring DataAccessException
@Repository   
public interface AdminDao {
	public Administrator findAdminnews(
			@Param("admin_account") String admin_account,
			@Param("admin_password") String admin_password);
}
