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
		// ִ��Service���еĴ������������ص�����Ӱ�������
		int rows = goodsService.createGoods(goods);
		if (rows > 0) {
			System.out.println("�ľߴ����ɹ���");
			return "OK";
		} else {
			System.out.println("�ľߴ���ʧ�ܣ�"+rows);
			return "FAIL";
		}
	}

	/**
	 * ɾ��
	 */
	@RequestMapping("/goods/delete.action")
	@ResponseBody
	public String deleteGoods(@RequestParam("id") String g_id) {
		int rows = goodsService.deleteGoods(g_id);
		System.out.println("ɾ����" + rows + "����" + g_id);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * ����
	 */
	@RequestMapping("/goods/update.action")
	@ResponseBody
	public String updateGoods(Goods goods) {
		int rows = goodsService.updateGoods(goods);
		System.out.println("�޸ģ�" + rows + "����" + goods);
		if (rows > 0) {
			return "OK";
		} else {
			return "FAIL";
		}
	}

	/**
	 * ͨ��id��ѯ
	 */
	@RequestMapping("/goods/selectById.action")
	@ResponseBody
	public Goods selectGoodsById(@RequestParam("id") String g_id) {
		System.out.println("id��ѯ��" + goodsService.selectGoodsById(g_id));
		Goods goods = goodsService.selectGoodsById(g_id);
		return goods;
	}

	/**
	 * �ľ������б�
	 */
	@RequestMapping("/goods/list.action")
	public String list(@Value("${navigationTag.page.homepage}") Integer page,
			@Value("${navigationTag.page.rows}") Integer rows, @Value("${navigationTag.page.maxnumber}") int number,
			String g_id,String g_gtid,
			String g_name, Float g_price, Float g_vipprice, Date g_producttime,String g_specification,
			String g_manufacturers, Integer g_quantity,String g_sno,Float minprice,Float maxprice,String g_tid,String sno, Model model) {
		// ������ѯ 
		Page<Goods> goods = goodsService.selectGoodsList(page, rows, number, g_id, g_gtid, g_name, g_price, g_vipprice, g_producttime, g_specification,
				g_manufacturers, g_quantity, g_sno, minprice, maxprice);
		System.out.println(g_id+"--"+g_gtid+"--"+g_name+"--"+minprice+"--"+maxprice+"--"+g_specification+"--"+g_manufacturers+"--"+g_sno);   
		model.addAttribute("page", goods);
		// ���������б�չʾ
		List<Goods> gidtype = goodsService.findGoodsToGid();
		List<Goods> ggtidtype = goodsService.findGoodsToGgtid();
		List<Goods> gmanufacturerstype = goodsService.findGoodsToGmanufacturers();
		List<Goods> gsnotype = goodsService.findGoodsToGSno();
		// ��Ӳ���
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
