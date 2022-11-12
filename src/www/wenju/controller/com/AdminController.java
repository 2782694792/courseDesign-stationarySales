package www.wenju.controller.com;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * �û��������࣬���û���Ϣ�Ĵ����Լ���������һ��(ҳ�桢�������͡�ע��Ự��)����
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import www.wenju.po.com.Administrator;
import www.wenju.service.com.AdminService;
@Controller
public class AdminController 
//extends TagSupport
{
	/**
	 * 
	 */
	// private static final long serialVersionUID = 1L;
	// ��ʾ���Ե�ǰҪע���bean�������ֱ��ע�룬û��������
	// ����Ϊ�Զ�ʱ��service�ӿ�����ʵ����Ĺ�ϵ�γ�Լ��������̳и��࣬����������½���bean�޷���飬���޷��Զ����������bean   
	@Autowired
	private AdminService adminService; 
	
	/**
	 * ��¼ҳ��
	 * @throws IOException 
	 */
	// @ResponseBody : ���ڽ�ǰ���������е�JSON��ʽ���ݽ��а�
	// @RequestMapping : �ÿ�������������������󶼱�ӳ�䵽ע���µ�value����ֵ��ָ����·����
	@RequestMapping(value = "/adminlogin.action", method = RequestMethod.POST)
	public String adminLogin(@RequestParam("admin_account")  String admin_account,@RequestParam("admin_password") String admin_password,Model model,HttpServletRequest request,HttpSession session)
			// throws JspException, IOException
	{
		System.out.println("���Ʋ㣺"+admin_account+"\t"+admin_password);
		Administrator administrator = adminService.findAdminnews(admin_account, admin_password);
		System.out.println("��¼����"+administrator);
		if (administrator == null) {
			model.addAttribute("msg","�˺Ż����������������������룡");
			// ���ص���¼ҳ��
			return "adminlogin";
		}
		// ��Ϊ�գ���ɨ��ó����ݽ�����Ա��ӵ��Ự��
		session.setAttribute("admin_session", administrator);
		// session.removeAttribute("admin_session");
		// Ĭ����ת������ҳ��
		/*
		 * JspWriter writer = pageContext.getOut();
		 * writer.print("<script type=\"text/javascript\">\r\n" +
		 * "		alert(\"��¼�ɹ�����ӭ�����ľ�ϵͳ����\");\r\n" + "	</script>");
		 */
		return "redirect:goodstype/list.action";
	}
	
	/**
	 * �ľ����͹���ҳ��
	 */
	@RequestMapping("/togoodstypemanage.action")
	public String toGoodsTypeManage() {
		return "goodstypemanage";
	}
	
	/**
	 * �ľ߹���ҳ��
	 */
	@RequestMapping("/togoodsmanage.action")
	public String toGoodsManage() {
		return "goodsmanage";
	}
	
	/**
	 * �˳���¼
	 */
	@RequestMapping("/toadminlogout.action")
	public String adminLogout(HttpSession session) {
	    // ���Session
	    session.invalidate();
	    // �ض��򵽵�¼ҳ�����ת����
	    return "redirect:toadminlogin.action";
	}
	
	/**
	 * ���أ�����ã���¼��ֻ���˳���¼
	 */
	@RequestMapping(value = "/toadminlogin.action", method = RequestMethod.GET)
	public String toAdminLogin() {
	    return "adminlogin";
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      