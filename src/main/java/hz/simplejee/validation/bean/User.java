package hz.simplejee.validation.bean;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
public class User {
    @NotNull(message = "用户名不能为空.")
    private String name;

    @NotNull(message = "用户年龄不能为空.")
    @Min(value = 0, message = "用户年龄不能小于0.")
    @Max(value = 120, message = "用户年龄不能大于120.")
    private Integer age;
    @Length(max = 120, message = "用户描述信息不能超过120个字符.")
    private String desc;
}
