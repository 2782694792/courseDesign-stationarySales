package www.wenju.serviceimpl.com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.wenju.dao.com.AdminDao;
import www.wenju.po.com.Administrator;
import www.wenju.service.com.AdminService;

// @Component
// @Serviceע�⣺��ʶҵ����ʵ����
@Service
@Transactional
// @MapperScan({"www.wenju.dao.com.AdminDao"}) 
public class AdminServiceImpl implements AdminService {
	@Autowired
//	@Resource
	private AdminDao adminDao;

	public Administrator findAdminnews(String admin_account,String admin_password) {
		System.out.println("ʵ�ֲ㣺"+admin_account+"\t"+admin_password);
		return this.adminDao.findAdminnews(admin_account, admin_password);
	}

}
