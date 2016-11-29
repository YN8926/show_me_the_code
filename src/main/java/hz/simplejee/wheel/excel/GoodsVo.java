package hz.simplejee.wheel.excel;

import com.tqmall.wheel.component.excel.annotation.Excel;
import com.tqmall.wheel.component.excel.annotation.ExcelCol;
import com.tqmall.wheel.component.excel.annotation.ExcelRowNumber;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Excel
@Data
public class GoodsVo {

    @ExcelRowNumber
    private Long rowNumber;
    @ExcelCol(value = 0, title = "配件名称")
    private String goodsName;
    @ExcelCol(value = 1, title = "零件号")
    private String goodsFormat;
    @ExcelCol(value = 2, title = "配件名称", defaultValue = "通用配件")
    private String goodsCat;
    @ExcelCol(value = 3, title = "单位", defaultValue = "个")
    private String goodsUnit;
    @ExcelCol(value = 4, title = "品牌")
    private String goodsBrand;
    @ExcelCol(value = 5, title = "销售价格")
    private BigDecimal salePrice;
    @ExcelCol(value = 6, title = "库存")
    private BigDecimal stock;
    @ExcelCol(value = 7, title = "成本单价")
    private BigDecimal inventoryPrice;
    @ExcelCol(value = 8, title = "缺货临界数量")
    private BigDecimal shortAgeNumber;
    @ExcelCol(value = 9, title = "仓位信息")
    private String depot;
    @ExcelCol(value = 10, title = "适配车型")
    private String carModel;
    @ExcelCol(value = 11, title = "适用部位")
    private String usedPart;
}
