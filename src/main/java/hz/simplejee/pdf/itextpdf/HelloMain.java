package hz.simplejee.pdf.itextpdf;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.DottedLineSeparator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Created by 辉辉大侠 on 09/10/2016.
 */
public class HelloMain {
    public static void main(String[] args) throws Exception {
        File f = new File("ceshi.pdf");
        if (f.exists()) {
            f.delete();
        }
        f.createNewFile();

        BaseFont bfChinese;
        Font fontChinese = null;
        bfChinese = BaseFont.createFont("/Users/wanghui/Downloads/simyou.ttf", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
        // fontChinese = new Font(bfChinese, 12, Font.NORMAL);
        fontChinese = new Font(bfChinese, 12, Font.NORMAL, BaseColor.BLUE);

        Rectangle rectangle = new Rectangle(PageSize.A4);
        Document doc = new Document(rectangle, 40, 40, 40, 40);
        PdfWriter.getInstance(doc, new FileOutputStream(f));
        doc.open();
        doc.addTitle("标题");
        doc.add(new Paragraph("测试中文", fontChinese));

        DottedLineSeparator dottedline = new DottedLineSeparator();
        dottedline.setOffset(-2);
        dottedline.setGap(0f);

        doc.add(dottedline);

        doc.add(new Paragraph("Hello World"));
        doc.add(new Chunk("----------"));
        PdfPTable table = new PdfPTable(3);
        for (int i = 0; i < 6; i++) {
            table.addCell(new Paragraph("测试-1" + i, fontChinese));
        }

        doc.add(table);
        doc.close();

    }
}
