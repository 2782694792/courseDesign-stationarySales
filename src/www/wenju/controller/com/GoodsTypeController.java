package www.wenju.controller.com;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import www.wenju.po.com.GoodsType;
import www.wenju.service.com.GoodsTypeService;
import www.wenju.utils.com.Page;
@Controller
public class GoodsTypeController {
		// ����ע��
		@Autowired
		private GoodsTypeService goodsTypeService;
		// �ľ߱�ǩ���˴����ڱ�����һ�������������������ʱ����е�����չʾ
		// @Value("${goodstype.gtid.type}")
		// private String GTID_TYPE;

		/**
		 * ����
		 * @ResponseBody���ؽ�����ᱻ����Ϊ��ת·����ͨ��ת��ֱ��д��HTTP Response�����body��
		 * @ResponseBody ��̨����JSON���ݵ�ǰ��
		 * @RequestBody ǰ�˴���JSON���ݵ���̨
		 */
		@RequestMapping("/goodstype/create.action")
		@ResponseBody
		public String createGoodsType(GoodsType goodsType,HttpSession session) {
			/*         ���û����Խ������ݵĴ������޸ġ�ɾ���Ȳ����ļ��            */
		    // ��ȡSession�еĵ�ǰ�û���Ϣ
		    // User user = (goods) session.getAttribute("USER_SESSION");
		    // ����ǰ�û�id�洢�ڿͻ�������
		    // customer.setCust_create_id(user.getUser_id());
		    // ����Date����
		    // Date date = new Date();
		    // �õ�һ��Timestamp��ʽ��ʱ�䣬����mysql�е�ʱ���ʽ��yyyy/MM/dd HH:mm:ss��
		    // Timestamp timeStamp = new Timestamp(date.getTime());
		    // customer.setCust_createtime(timeStamp);
		    // ִ��Service���еĴ������������ص�����Ӱ�������
		    int rows = goodsTypeService.createGoodsType(goodsType);
		    if(rows > 0){
		    	System.out.println("�ľ����ʹ����ɹ���");
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}

		/**
		 * ɾ��
		 */
		@RequestMapping("/goodstype/delete.action")
		@ResponseBody
		public String deleteGoodsType(@RequestParam("id") String gt_id) {
		    int rows = goodsTypeService.deleteGoodsType(gt_id);
		    System.out.println("ɾ����"+rows+"����"+gt_id);
		    if(rows > 0){			
		        return "OK";
		    }else{
		        return "FAIL";	
		    }
		}
		
		/**
		 * ����
		 */
		@RequestMapping("/goodstype/update.action")
		@ResponseBody
		public String updateGoodsType(GoodsType goodsType) {
		    int rows = goodsTypeService.updateGoodsType(goodsType);
		    System.out.println("�޸ģ�"+rows+"����"+goodsType);
		    if(rows > 0){
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}

		/**
		 * ͨ��id��ѯ
		 */
		@RequestMapping("/goodstype/selectById.action")
		@ResponseBody
		public GoodsType selectGoodsTypeById(@RequestParam("id") String id) { 
		    System.out.println("id��ѯ��"+goodsTypeService.selectGoodsTypeById(id)); 
			GoodsType goodsType = goodsTypeService.selectGoodsTypeById(id); 
			return goodsType;
		}

		/**
		 *  �ľ����������б�
		 */
		@RequestMapping(value="/goodstype/list.action")
		// ����Ĭ��ҳ��Ĭ�����������@RequestParam(defaultValue="1")��@RequestParam(defaultValue="10")
		public String list(@Value("${navigationTag.page.homepage}") Integer page,
				@Value("${navigationTag.page.rows}") Integer rows,
				@Value("${navigationTag.page.maxnumber}") int number,
				String gt_id, String gt_name, String gt_about, Model model) {
			// ������ѯ
			Page<GoodsType> goodstype  = goodsTypeService
					.selectGoodsTypeList(page, rows, number, gt_id, gt_name, gt_about);
			model.addAttribute("page", goodstype);
			// ���������б�չʾ�ľ�ID
			List<GoodsType> gtidtype = goodsTypeService.findGoodsTypeToId();
			// ���������б�չʾ�ľ�����
			List<GoodsType> gtnametype = goodsTypeService.findGoodsTypeToName();
			// ��Ӳ���
			model.addAttribute("gt_id", gt_id);
			model.addAttribute("gt_name", gt_name);
			model.addAttribute("gt_about", gt_about);
			model.addAttribute("gtidtype", gtidtype);
			model.addAttribute("gtnametype", gtnametype);
			return "goodstypemanage";
		}
}
