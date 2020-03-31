package helloworld.demo.provider.Service;
import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@RestSchema(schemaId = "helloWorld") // 该注解声明这是一个 REST 接口类， CSEJavaSDK 会扫描到这个类，根据它的代码生成接口契约
@RequestMapping(path = "/provider/v0") // @RequestMapping 是 Spring 的注解，这里在使用 Spring MVC 风格开发 REST 接口
public class HelloWorldService {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(HelloWorldService.class);//调用时可打印日志
    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    public String hello (@RequestParam(name = "name") String name){
        LOGGER.info("hello is called! name = [{}]", name);
        return "Hello " + name;
    }
}