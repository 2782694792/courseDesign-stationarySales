/*
 * package www.wenju.utils.com;
 * 
 * import java.io.IOException; import java.util.Map; import
 * javax.servlet.http.HttpServletRequest; import javax.servlet.jsp.JspException;
 * import javax.servlet.jsp.JspWriter; import
 * javax.servlet.jsp.tagext.TagSupport;
 * 
 * import org.springframework.beans.factory.annotation.Value;
 * 
 *//**
	 * ��ʾ��ʽ����ҳ ��һҳ 1 2 3 4 5 ... ��һҳ βҳ
	 */
/*
 * public class NavigationTag extends TagSupport { static final long
 * serialVersionUID = 2372405317744358833L;
 *//**
	 * request �����ڱ���Page<E> ����ı�����,Ĭ��Ϊ��page��
	 */
/*
 * private String bean = "page";
 *//**
	 * ��ҳ��ת��url��ַ,�����Ա���
	 */
/*
 * private String url = null;
 *//**
	 * ��ʾҳ������
	 */
/*
 * @Value("${navigationTag.page.maxnumber}") private int number;
 * 
 * @Override public int doStartTag() throws JspException { JspWriter writer =
 * pageContext.getOut(); HttpServletRequest request = (HttpServletRequest)
 * pageContext.getRequest(); Page page = (Page) request.getAttribute(bean); if
 * (page == null) return SKIP_BODY; url = resolveUrl(url, pageContext); try { //
 * ������ҳ�� int pageCount = page.getTotal() / page.getSize(); if (page.getTotal() %
 * page.getSize() > 0) { pageCount++; }
 * writer.print("<nav><ul class=\"pagination\">"); // ��ҳ����·�� String homeUrl =
 * append(url, "page", 1); // ĩҳ����·�� String backUrl = append(url, "page",
 * pageCount); // ��ʾ����һҳ����ť,����ȡҳ������1���������ҳ��ǰһҳ��ѡ���෴�򲻴�����һҳ��ҳ��仯 if
 * (page.getPage() > 1) { String preUrl = append(url, "page", page.getPage() -
 * 1); preUrl = append(preUrl, "rows", page.getSize());
 * writer.print("<li><a href=\"" + homeUrl + "\">" + "��ҳ</a></li>");
 * writer.print("<li><a href=\"" + preUrl + "\">" + "��һҳ</a></li>"); } else {
 * writer.print("<li class=\"disabled\"><a href=\"#\">" + "��ҳ </a></li>");
 * writer.print("<li class=\"disabled\"><a href=\"#\">" + "��һҳ </a></li>"); } //
 * ��ʾ��ǰҳ���ǰ2ҳ��ͺ���ҳ��,����ǰҳΪ�м�ҳ��ʼ�շ����м� // ��1 �� 1 2 3 4 5, ��2 �� 1 2 3 4 5, ��3 ��1 2 3
 * 4 5, // ��4 �� 2 3 4 5 6 ,��10 �� 8 9 10 11 12 int indexPage = 1; //
 * ��ȡҳ����2�������£���Ϊ�м�ҳ if (page.getPage() - 2 <= 0) { indexPage = 1; } else if
 * (pageCount - page.getPage() <= 2) { indexPage = pageCount - 4; } else {
 * indexPage = page.getPage() - 2; } for (int i = 1; i <= number && indexPage <
 * pageCount; indexPage++, i++) { if (indexPage == page.getPage()) {
 * writer.print("<li class=\"active\"><a href=\"#\">" + indexPage +
 * "<spanclass=\"sr-only\"></span></a></li>"); continue; } String pageUrl =
 * append(url, "page", indexPage); pageUrl = append(pageUrl, "rows",
 * page.getSize()); writer.print("<li><a href=\"" + pageUrl + "\">" + indexPage
 * + "</a></li>"); } // ��ʾ����һҳ����ť������ȡҳ��С����ҳ�������url������ֱ��չʾ if (page.getPage() <
 * pageCount) { String nextUrl = append(url, "page", page.getPage() + 1);
 * nextUrl = append(nextUrl, "rows", page.getSize());
 * writer.print("<li><a href=\"" + nextUrl + "\">" + "��һҳ</a></li>");
 * writer.print("<li><a href=\"" + backUrl + "\">" + "βҳ</a></li>"); } else {
 * writer.print("<li class=\"disabled\"><a href=\"#\">" + "��һҳ</a></li>");
 * writer.print("<li class=\"disabled\"><a href=\"#\">" + "βҳ</a></li>"); }
 * writer.print("</nav>"); } catch (IOException e) { e.printStackTrace(); }
 * return SKIP_BODY; }
 * 
 * private String append(String url, String key, int value) { return append(url,
 * key, String.valueOf(value)); }
 * 
 *//**
	 * Ϊ url �μ� ������
	 */
/*
 * private String append(String url, String key, String value) { if (url == null
 * || url.trim().length() == 0) { return ""; } if (url.indexOf("?") == -1) { url
 * = url + "?" + key + "=" + value; } else { if (url.endsWith("?")) { url = url
 * + key + "=" + value; } else { url = url + "&amp;" + key + "=" + value; } }
 * return url; }
 * 
 *//**
	 * Ϊurl ��ӷ�ҳ�������
	 *//*
		 * private String resolveUrl(String url, javax.servlet.jsp.PageContext
		 * pageContext) throws JspException { Map params =
		 * pageContext.getRequest().getParameterMap(); for (Object key :
		 * params.keySet()) { if ("page".equals(key) || "rows".equals(key)) { continue;
		 * } Object value = params.get(key); if (value == null) { continue; } if
		 * (value.getClass().isArray()) { url = append(url, key.toString(), ((String[])
		 * value)[0]); } else if (value instanceof String) { url = append(url,
		 * key.toString(), value.toString()); } } return url; }
		 * 
		 * public String getBean() { return bean; }
		 * 
		 * public void setBean(String bean) { this.bean = bean; }
		 * 
		 * public String getUrl() { return url; }
		 * 
		 * public void setUrl(String url) { this.url = url; }
		 * 
		 * public void setNumber(int number) { this.number = number; } }
		 */

package www.wenju.utils.com;

import java.io.IOException;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

import org.springframework.context.annotation.Configuration;

/**
 * ��ʾ��ʽ����ҳ ��һҳ 1 2 3 4 5��һҳ βҳ
 */

@Configuration
public class NavigationTag extends TagSupport {
	static final long serialVersionUID = 2372405317744358833L;

	/**
	 * request �����ڱ���Page<E> ����ı�����,Ĭ��Ϊ��page��
	 */
	private String bean = "page";

	/**
	 * ��ҳ��ת��url��ַ,�����Ա���
	 */
	private String url = null;

	/**
	 * ��ʾҳ������
	 */
//	@Value("${navigationTag.page.maxnumber}") 
	private int number = 5;
	
	/*
	 * �����������@Value��ȡ��������ֵ
		1. �������ؼ���static����
		2. ��û��ʹ��@Component����������ǩ����
		3. ��Bean��ʼ��ʱ���췽�������ñ�@Value���εı���
	 */
	
	public int doStartTag() throws JspException {
		JspWriter writer = pageContext.getOut();
		HttpServletRequest request = (HttpServletRequest) pageContext.getRequest();
		Page page = (Page) request.getAttribute(bean);
//		number = page.getNumber();
		if (page == null)
			return SKIP_BODY;
		url = resolveUrl(url, pageContext);
		try {
			// ������ҳ��
			int pageCount = page.getTotal() / page.getSize();
			if (page.getTotal() % page.getSize() > 0) {
				pageCount++;
			}
			writer.print("<nav><ul class=\"pagination\">");
			// ��ҳ����·��
			String homeUrl = append(url, "page", 1);
			// ĩҳ����·��
			String backUrl = append(url, "page", pageCount);
			
			// ��ʾ����һҳ����ť
			if (page.getPage() > 1) {
				String preUrl = append(url, "page", page.getPage() - 1);
				preUrl = append(preUrl, "rows", page.getSize());
				writer.print("<li><a href=\"" + homeUrl + "\">" + "��ҳ</a></li>");
				writer.print("<li><a href=\"" + preUrl + "\">" + "��һҳ</a></li>");
			} else {
				writer.print("<li class=\"disabled\"><a href=\"#\">" + "��ҳ </a></li>");
				writer.print("<li class=\"disabled\"><a href=\"#\">" + "��һҳ </a></li>");
			}
			// ��ʾ��ǰҳ���ǰ2ҳ��ͺ���ҳ��
			// ��1 �� 1 2 3 4 5, ��2 �� 1 2 3 4 5, ��3 ��1 2 3 4 5,��4 �� 2 3 4 5 6 ,��10 �� 8 9 10 11 12
//			int indexPage = 1;
			int indexPage = (page.getPage() - 2 > 0) ? page.getPage() - 2 : 1;
			if (page.getPage() - 2 <= 0) {
				indexPage = 1;
			} else if (pageCount - page.getPage() <= 2) {
				indexPage = pageCount - 4;
			} else {
				indexPage = page.getPage() - 2;
			}
			
			// ����
			System.out.println("չʾҳ��"+number+"����ǰҳ"+page.getPage()+"��������"+page.getTotal()+"����ҳ��"+pageCount+"�����ҳ"+indexPage+"����ȡ���ҳ"+page.getIndexpage());
			
			for (int i = 1; i <= number && indexPage <= pageCount; indexPage++, i++) {
				if (indexPage == page.getPage()) {
					writer.print("<li class=\"active\"><a href=\"#\">" + indexPage
							+ "<spanclass=\"sr-only\"></span></a></li>");
					continue;
				}
				String pageUrl = append(url, "page", indexPage);
				pageUrl = append(pageUrl, "rows", page.getSize());
				writer.print("<li><a href=\"" + pageUrl + "\">" + indexPage + "</a></li>");
			}
			// ��ʾ����һҳ����ť
			if (page.getPage() < pageCount) {
				String nextUrl = append(url, "page", page.getPage() + 1);
				nextUrl = append(nextUrl, "rows", page.getSize());
				writer.print("<li><a href=\"" + nextUrl + "\">" + "��һҳ</a></li>");
				writer.print("<li><a href=\"" + backUrl + "\">" + "βҳ</a></li>");
			} else {
				writer.print("<li class=\"disabled\"><a href=\"#\">" + "��һҳ</a></li>");
				writer.print("<li class=\"disabled\"><a href=\"#\">" + "βҳ</a></li>");
			}
			
			writer.print("</nav>");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

	private String append(String url, String key, int value) {

		return append(url, key, String.valueOf(value));
	}

	/**
	 * Ϊurl �μӲ�����
	 */
	private String append(String url, String key, String value) {
		if (url == null || url.trim().length() == 0) {
			return "";
		}

		if (url.indexOf("?") == -1) {
			url = url + "?" + key + "=" + value;
		} else {
			if (url.endsWith("?")) {
				url = url + key + "=" + value;
			} else {
				url = url + "&amp;" + key + "=" + value;
			}
		}

		return url;
	}

	/**
	 * Ϊurl ��ӷ�ҳ�������
	 */
	private String resolveUrl(String url, javax.servlet.jsp.PageContext pageContext) throws JspException {
		// UrlSupport.resolveUrl(url, context, pageContext)
		Map params = pageContext.getRequest().getParameterMap();
		for (Object key : params.keySet()) {
			if ("page".equals(key) || "rows".equals(key))
				continue;
			Object value = params.get(key);
			if (value == null)
				continue;
			if (value.getClass().isArray()) {
				url = append(url, key.toString(), ((String[]) value)[0]);
			} else if (value instanceof String) {
				url = append(url, key.toString(), value.toString());
			}
		}
		return url;
	}

	public String getBean() {
		return bean;
	}

	public void setBean(String bean) {
		this.bean = bean;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
