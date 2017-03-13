package hz.simplejee.mybatis.hello;

import lombok.Data;

@Data
public class User extends BaseEntity {
    private Long shopId;
    private String name;
    private String email;
}
