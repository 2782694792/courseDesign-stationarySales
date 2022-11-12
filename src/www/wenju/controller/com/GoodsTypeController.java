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
		// 依赖注入
		@Autowired
		private GoodsTypeService goodsTypeService;
		// 文具标签，此处用于表结合另一个表属性列做主外键的时候进行的数据展示
		// @Value("${goodstype.gtid.type}")
		// private String GTID_TYPE;

		/**
		 * 创建
		 * @ResponseBody返回结果不会被解析为跳转路径，通过转换直接写入HTTP Response对象的body中
		 * @ResponseBody 后台返回JSON数据到前端
		 * @RequestBody 前端传递JSON数据到后台
		 */
		@RequestMapping("/goodstype/create.action")
		@ResponseBody
		public String createGoodsType(GoodsType goodsType,HttpSession session) {
			/*         对用户可以进行数据的创建、修改、删除等操作的监控            */
		    // 获取Session中的当前用户信息
		    // User user = (goods) session.getAttribute("USER_SESSION");
		    // 将当前用户id存储在客户对象中
		    // customer.setCust_create_id(user.getUser_id());
		    // 创建Date对象
		    // Date date = new Date();
		    // 得到一个Timestamp格式的时间，存入mysql中的时间格式“yyyy/MM/dd HH:mm:ss”
		    // Timestamp timeStamp = new Timestamp(date.getTime());
		    // customer.setCust_createtime(timeStamp);
		    // 执行Service层中的创建方法，返回的是受影响的行数
		    int rows = goodsTypeService.createGoodsType(goodsType);
		    if(rows > 0){
		    	System.out.println("文具类型创建成功！");
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}

		/**
		 * 删除
		 */
		@RequestMapping("/goodstype/delete.action")
		@ResponseBody
		public String deleteGoodsType(@RequestParam("id") String gt_id) {
		    int rows = goodsTypeService.deleteGoodsType(gt_id);
		    System.out.println("删除："+rows+"——"+gt_id);
		    if(rows > 0){			
		        return "OK";
		    }else{
		        return "FAIL";	
		    }
		}
		
		/**
		 * 更新
		 */
		@RequestMapping("/goodstype/update.action")
		@ResponseBody
		public String updateGoodsType(GoodsType goodsType) {
		    int rows = goodsTypeService.updateGoodsType(goodsType);
		    System.out.println("修改："+rows+"——"+goodsType);
		    if(rows > 0){
		        return "OK";
		    }else{
		        return "FAIL";
		    }
		}

		/**
		 * 通过id查询
		 */
		@RequestMapping("/goodstype/selectById.action")
		@ResponseBody
		public GoodsType selectGoodsTypeById(@RequestParam("id") String id) { 
		    System.out.println("id查询："+goodsTypeService.selectGoodsTypeById(id)); 
			GoodsType goodsType = goodsTypeService.selectGoodsTypeById(id); 
			return goodsType;
		}

		/**
		 *  文具类型数据列表
		 */
		@RequestMapping(value="/goodstype/list.action")
		// 设置默认页和默认最大行数，@RequestParam(defaultValue="1")，@RequestParam(defaultValue="10")
		public String list(@Value("${navigationTag.page.homepage}") Integer page,
				@Value("${navigationTag.page.rows}") Integer rows,
				@Value("${navigationTag.page.maxnumber}") int number,
				String gt_id, String gt_name, String gt_about, Model model) {
			// 条件查询
			Page<GoodsType> goodstype  = goodsTypeService
					.selectGoodsTypeList(page, rows, number, gt_id, gt_name, gt_about);
			model.addAttribute("page", goodstype);
			// 用于下拉列表展示文具ID
			List<GoodsType> gtidtype = goodsTypeService.findGoodsTypeToId();
			// 用于下拉列表展示文具名称
			List<GoodsType> gtnametype = goodsTypeService.findGoodsTypeToName();
			// 添加参数
			model.addAttribute("gt_id", gt_id);
			model.addAttribute("gt_name", gt_name);
			model.addAttribute("gt_about", gt_about);
			model.addAttribute("gtidtype", gtidtype);
			model.addAttribute("gtnametype", gtnametype);
			return "goodstypemanage";
		}
}
