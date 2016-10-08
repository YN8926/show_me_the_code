package hz.simplejee.springframework.mvc.hello.controller;

import java.net.URLEncoder;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.document.AbstractExcelView;

@RequestMapping("/excel")
@Controller
public class ExcelExportController {

	@RequestMapping
	public String index() {
		return "excel/index";
	}

	@RequestMapping("download1")
	public ModelAndView downloadHSSF(ModelMap model) {
		List<String> list = new LinkedList();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		model.addAttribute("list", list);
		return new ModelAndView(new ExcelView(), model);
	}

	static class ExcelView extends AbstractExcelView {

		@Override
		protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
				HttpServletResponse response) throws Exception {
			HSSFSheet sheet = workbook.createSheet("测试Sheet");
			sheet.setDefaultColumnWidth(12);
			HSSFCell cell = getCell(sheet, 1, 1);
			setText(cell, "这是测试单元格-1");

			List<String> list = (List<String>) model.get("list");
			for (int i = 0; i < list.size(); i++) {
				getCell(sheet, 2, i).setCellValue(list.get(i));
			}

			HSSFRow row = sheet.createRow(3);
			for (int i = 0; i < 10; i++) {
				row.createCell(i).setCellValue("测试数据" + i);
			}
			String filename = "测试Excel导出-1.xls";
			response.setContentType("application/vnd.ms-excel");
			response.setHeader("Content-disposition", "attachment;filename=" + encodeFilename(filename, request));
			ServletOutputStream os = response.getOutputStream();
			workbook.write(os);
			os.flush();
			os.close();
		}

		public static String encodeFilename(String filename, HttpServletRequest request) {
			String agent = request.getHeader("USER-AGENT");
			try {
				if ((agent != null) && (-1 != agent.indexOf("MSIE"))) {
					String newFileName = URLEncoder.encode(filename, "UTF-8");
					newFileName = StringUtils.replace(newFileName, "+", "%20");
					if (newFileName.length() > 150) {
						newFileName = new String(filename.getBytes("GB2312"), "ISO8859-1");
						newFileName = StringUtils.replace(newFileName, " ", "%20");
					}
					return newFileName;
				}
				// if ((agent != null) && (-1 != agent.indexOf("Mozilla")))
				// return MimeUtility.encodeText(filename, "UTF-8", "B");

				return filename;
			} catch (Exception ex) {
				return filename;
			}
		}
	}
}
