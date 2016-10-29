  Profile为在不同环境下使用不同的配置提供了支持;
  激活某个profile可使用一些方式指定:
- 通过设定Environment的ActiveProfiles来设定当前context需要使用的配置环境。在开发中使用@Profile注解类或者方法,达到在不同情况下选择实例化不同的Bean;
- 通过设定JVM的spring.profiles.active参数来设置配置环境;
- web项目设置在Servlet的context parameter;