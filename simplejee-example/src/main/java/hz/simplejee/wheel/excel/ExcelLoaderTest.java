package hz.simplejee.wheel.excel;

import com.tqmall.wheel.component.excel.loader.ExcelLoader;
import com.tqmall.wheel.exception.WheelException;
import com.tqmall.wheel.helper.ExcelHelper;
import com.tqmall.wheel.lang.Objects;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.io.IOException;
import java.util.List;

/**
 * Created by wanghui on 26/11/2016.
 */
public class ExcelLoaderTest {

    public static void main(String[] args) {
        ExcelLoader loader = null;
        try {
            loader = ExcelHelper.createExcelLoader(ExcelLoaderTest.class.getResourceAsStream("物料模板.xls"));
            List<GoodsVo> records = loader.readRecords(0, 1, 5, GoodsVo.class);
            System.out.println(Objects.toJSON(records));
            //以下为读取到数据后的业务处理
            //TODO
            loader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        } catch (WheelException e) {
            e.printStackTrace();
        } finally {
            ExcelHelper.closeQuiet(loader);
        }
    }
}
