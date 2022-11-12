package www.wenju.dao.com;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import www.wenju.po.com.Administrator;
// 将 DAO 导入 IoC 容器，并使未经检查的异常有资格转换为 Spring DataAccessException
@Repository   
public interface AdminDao {
	public Administrator findAdminnews(
			@Param("admin_account") String admin_account,
			@Param("admin_password") String admin_password);
}
