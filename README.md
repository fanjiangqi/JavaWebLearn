# JavaWebLearn
- 2016.12.27 创建，主要为了学习JavaWeb开发，其中核心是Spring 和Mybatis
- 工程创建好。下一步就是springMVC框架的搭建，已经忘了差不多了，需要看文档，web.xml,[servletname]-servlet.xml已经忘了
- 把工程从eclipse 导入到 IntelliJ 中，最近一周准备专注于spring 2017.19-2017.1.15
- 由于工程eclipse换到IntelliJ中出现问题（git目录问题，暂时没有能力解决），删除github repository重新建立
-添加了spirng core学习代码，已经junit代码，主要为了学习spring核心部分DI 2017.1.9
-添加了AOP部分，可是测试一直不过,报如下错误：
 ```
 Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [SpringCoreLearn.JavaConfig.WeiChat] is define
 ```
 - 把WeiChai 不实现APP接口，就不会报错，猜测问题可能是JDK代理和CGLIB代理导致的，待解决 -2017.1.11
 - **重要的一点，bean的ID默认为;IphoneConfig类中方法名，比如是weiChat，而不是WeiChat**，那么又有一个问题，用@Component自动创建的bean，ID是什么呢？Spring in Action写到，**自动将类名第一个字母小写作为ID**