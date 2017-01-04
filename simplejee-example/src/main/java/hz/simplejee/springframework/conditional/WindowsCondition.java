package hz.simplejee.springframework.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by 辉辉大侠 on 30/10/2016.
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        System.out.println(">>>>>>>>>"+context.getEnvironment().getProperty("os.name"));
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
