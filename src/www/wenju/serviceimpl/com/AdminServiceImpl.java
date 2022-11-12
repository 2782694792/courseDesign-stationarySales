package www.wenju.serviceimpl.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.wenju.dao.com.AdminDao;
import www.wenju.po.com.Administrator;
import www.wenju.service.com.AdminService;

// @Component
// @Service注解：标识业务层的实现类
@Service
@Transactional
// @MapperScan({"www.wenju.dao.com.AdminDao"}) 
public class AdminServiceImpl implements AdminService {
	@Autowired
//	@Resource
	private AdminDao adminDao;

	public Administrator findAdminnews(String admin_account,String admin_password) {
		System.out.println("实现层："+admin_account+"\t"+admin_password);
		return this.adminDao.findAdminnews(admin_account, admin_password);
	}

}
