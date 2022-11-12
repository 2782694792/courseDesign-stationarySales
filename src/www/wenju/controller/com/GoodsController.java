package www.wenju.controller.com;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import www.wenju.po.com.Goods;
import www.wenju.service.com.GoodsService;
import www.wenju.utils.com.Page;
@Controller
public class GoodsController {

	@Autowired
	private GoodsService goodsService;

	@RequestMapping("/goods/create.action")
	@ResponseBody
	public String createGoods(Goods goods, HttpSession session) {
		// 执行Service层中的创建方法，返回的是受影响的行数
		int rows = goodsService.createGoods(goods);
		if (rows > 0) {
			System.out.println("文具创建成功！");
			return "OK";
		} else {
			System.out.println("文具创建失败！"+rows);
			return "FAIL";
		}
	}

	/**
	 * 删除
	 */
	@RequestMapping("/goods/delete.action")
	@ResponseBody
	public String deleteGoods(@RequestParam("id") String g_id) {
		int rows = goodsService.deleteGoods(g_id);
		System.out.println("删除：" + rows + "——" + g_id);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 更新
	 */
	@RequestMapping("/goods/update.action")
	@ResponseBody
	public String updateGoods(Goods goods) {
		int rows = goodsService.updateGoods(goods);
		System.out.println("修改：" + rows + "——" + goods);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * 通过id查询
	 */
	@RequestMapping("/goods/selectById.action")
	@ResponseBody
	public Goods selectGoodsById(@RequestParam("id") String g_id) {
		System.out.println("id查询：" + goodsService.selectGoodsById(g_id));
		Goods goods = goodsService.selectGoodsById(g_id);
		return goods;
	}

	/**
	 * 文具数据列表
	 */
	@RequestMapping("/goods/list.action")
	public String list(@Value("${navigationTag.page.homepage}") Integer page,
			@Value("${navigationTag.page.rows}") Integer rows, @Value("${navigationTag.page.maxnumber}") int number,
			String g_id,String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime,String g_specification,
			String g_manufacturers, Integer g_quantity,String g_sno,Float minprice,Float maxprice,String g_tid,String sno, Model model) {
		// 条件查询 
		Page<Goods> goods = goodsService.selectGoodsList(page, rows, number, g_id, g_gtid, g_name, g_price, g_vipprice, g_producttime, g_specification,
				g_manufacturers, g_quantity, g_sno, minprice, maxprice);
		System.out.println(g_id+"--"+g_gtid+"--"+g_name+"--"+minprice+"--"+maxprice+"--"+g_specification+"--"+g_manufacturers+"--"+g_sno);   
		model.addAttribute("page", goods);
		// 用于下拉列表展示
		List<Goods> gidtype = goodsService.findGoodsToGid();
		List<Goods> ggtidtype = goodsService.findGoodsToGgtid();
		List<Goods> gmanufacturerstype = goodsService.findGoodsToGmanufacturers();
		List<Goods> gsnotype = goodsService.findGoodsToGSno();
		// 添加参数
		model.addAttribute("g_id", g_id);
		model.addAttribute("g_gtid", g_gtid);
		model.addAttribute("g_name", g_name);
		model.addAttribute("minprice", minprice);   
		model.addAttribute("maxprice", maxprice);
		model.addAttribute("g_sno", g_sno);
		model.addAttribute("g_specification", g_specification);
		model.addAttribute("g_manufacturers", g_manufacturers);
		model.addAttribute("gsnotype", gsnotype); 
		model.addAttribute("gidtype", gidtype);
		model.addAttribute("ggtidtype", ggtidtype);
		model.addAttribute("gmanufacturerstype", gmanufacturerstype);
		return "goodsmanage";
	}
}
