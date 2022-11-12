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

	// Controller�߼�ִ��֮ǰ��������
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// ��ȡ�����URL
		String url = request.getRequestURI();
		// ���˵�¼�����⣬��������������
		if (url.indexOf("/adminlogin.action") >= 0) {
			return true;
		}
		// ��ȡ�˿͵�¼��Session
		HttpSession session = request.getSession();
		Administrator administrator = (Administrator) session.getAttribute("admin_session");
		// �ж�session�Ƿ����û�����
		if (administrator != null) {
			return true;
		}
		// ��������Ϣ��������ʾ����ת�����˿͵�¼ҳ��
		request.setAttribute("msg", "����û�е�¼�����ȵ�¼��");
		request.getRequestDispatcher("/WEB-INF/jsp/adminlogin.jsp").forward(request, response);
		return false;
	}
}
