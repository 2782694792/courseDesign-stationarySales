package www.wenju.controller.com;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/*
 * 用户控制器类，对用户信息的处理以及处理后的下一步(页面、数据类型、注入会话等)操作
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
	// 表示忽略当前要注入的bean，如果有直接注入，没有则跳过
	// 当设为自动时，service接口类与实现类的关系形成约束。子类继承父类，父类对子类新建的bean无法检查，即无法自动生成子类的bean   
	@Autowired
	private AdminService adminService; 
	
	/**
	 * 登录页面
	 * @throws IOException 
	 */
	// @ResponseBody : 用于将前端请求体中的JSON格式数据进行绑定
	// @RequestMapping : 该控制器所处理的所有请求都被映射到注解下的value属性值所指定的路径下
	@RequestMapping(value = "/adminlogin.action", method = RequestMethod.POST)
	public String adminLogin(@RequestParam("admin_account")  String admin_account,@RequestParam("admin_password") String admin_password,Model model,HttpServletRequest request,HttpSession session)
			// throws JspException, IOException
	{
		System.out.println("控制层："+admin_account+"\t"+admin_password);
		Administrator administrator = adminService.findAdminnews(admin_account, admin_password);
		System.out.println("登录对象："+administrator);
		if (administrator == null) {
			model.addAttribute("msg","账号或密码输入有误，请重新输入！");
			// 返回到登录页面
			return "adminlogin";
		}
		// 不为空，即扫描得出数据将管理员添加到会话中
		session.setAttribute("admin_session", administrator);
		// session.removeAttribute("admin_session");
		// 默认跳转到管理页面
		/*
		 * JspWriter writer = pageContext.getOut();
		 * writer.print("<script type=\"text/javascript\">\r\n" +
		 * "		alert(\"登录成功！欢迎进入文具系统管理！\");\r\n" + "	</script>");
		 */
		return "redirect:goodstype/list.action";
	}
	
	/**
	 * 文具类型管理页面
	 */
	@RequestMapping("/togoodstypemanage.action")
	public String toGoodsTypeManage() {
		return "goodstypemanage";
	}
	
	/**
	 * 文具管理页面
	 */
	@RequestMapping("/togoodsmanage.action")
	public String toGoodsManage() {
		return "goodsmanage";
	}
	
	/**
	 * 退出登录
	 */
	@RequestMapping("/toadminlogout.action")
	public String adminLogout(HttpSession session) {
	    // 清除Session
	    session.invalidate();
	    // 重定向到登录页面的跳转方法
	    return "redirect:toadminlogin.action";
	}
	
	/**
	 * 返回，检查用，登录后只有退出登录
	 */
	@RequestMapping(value = "/toadminlogin.action", method = RequestMethod.GET)
	public String toAdminLogin() {
	    return "adminlogin";
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      