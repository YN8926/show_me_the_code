# 概述
## 关于dozer
  dozer是一种JavaBean映射工具,类是与Apache的org.apache.commons.beanutils.BeanUtils和Spring的org.springframework.beans.BeanUtils,
但dozer更为强大可以更为复杂的对象属性映射,支持包括:
* 简单属性映射
* 复杂属性映射
* 双向映射
* 循环映射

## 官方网站
  site:http://dozer.sourceforge.net/
  Github:https://github.com/DozerMapper/dozer/

## 解决问题
* 默认属性的自动Mapping
  如果属性名一样,不需要显示配置,dozer会自动映射
* 自动进行类型转换
  如果二个属性名称一样,即使类型不一样,在dozer可理解的范围内会帮忙自动处理  
* 不必担心NPE
  dozer会自动处理null,并将对应值设为null,不会抛出NPE

## 场景
  系统中的每一层一般都会使用不同的对象,如DAO层使用领域模型,业务层使用BO对象,对外接口使用DTO等,而每一层对象之间的传递就涉及到对象属性之间的复制,使用纯粹的反射机制无法解决此种场景;

# 使用
## pom依赖
```
<dependency>
    <groupId>net.sf.dozer</groupId>
    <artifactId>dozer</artifactId>
    <version>5.5.1</version>
</dependency>
```
