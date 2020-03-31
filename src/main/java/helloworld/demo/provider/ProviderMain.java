package helloworld.demo.provider;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;
public class ProviderMain {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init(); // 初始化默认的日志组件
        BeanUtils.init(); // 加载 Spring bean 定义文件，正式开始启动流程
    }
}