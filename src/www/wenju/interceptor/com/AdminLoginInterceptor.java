package www.wenju.interceptor.com;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import www.wenju.po.com.Administrator;

public class AdminLoginInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub

	}

	// Controller逻辑执行之前进行拦截
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// 获取请求的URL
		String url = request.getRequestURI();
		// 除了登录请求外，其他都进行拦截
		if (url.indexOf("/adminlogin.action") >= 0) {
			return true;
		}
		// 获取顾客登录的Session
		HttpSession session = request.getSession();
		Administrator administrator = (Administrator) session.getAttribute("admin_session");
		// 判断session是否有用户数据
		if (administrator != null) {
			return true;
		}
		// 无数据信息，发出提示，并转发到顾客登录页面
		request.setAttribute("msg", "您还没有登录，请先登录！");
		request.getRequestDispatcher("/WEB-INF/jsp/adminlogin.jsp").forward(request, response);
		return false;
	}
}
