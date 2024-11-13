package center.helloworld.c1_ReadXml;

import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.io.IOException;

/**
 * @author zhishun.cai
 * @date 2024/11/11
 */
public class C1_PathMatchingResourcePatternResolver {


	/**
	 * PathMatchingResourcePatternResolver用来解析路径资源
	 *
	 * 加载配置文件：在 Spring 配置中，可以通过 PathMatchingResourcePatternResolver
	 * 加载各种配置文件（如 .xml、.properties 等），尤其适用于 Spring Boot 项目中的多环境配置加载。
	 *
	 * 加载 Bean 定义文件：在基于 XML 配置的 Spring 应用中，可以使用此类加载多个 XML 文件来定义 Bean。
	 * 例如，当应用程序有多个模块，每个模块有各自的 XML 配置文件时，PathMatchingResourcePatternResolver 可以使用模式匹配将这些文件批量加载进来。
	 *
	 * 扫描注解：在使用 Spring 的类路径扫描功能时（如 @ComponentScan），
	 * 可以利用该类来递归扫描特定包或路径下的类文件，从而实现自动注册符合条件的组件。
	 *
	 * 自定义资源加载：有时项目需要加载非标准位置的资源，例如从网络地址加载配置文件，或者动态扫描某个目录，
	 * PathMatchingResourcePatternResolver 能通过自定义模式加载这些资源。
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		Resource[] resources = resolver.getResources("classpath*:/*.xml");
		for (Resource resource : resources) {
			System.out.println(resource.getFilename());
		}
	}
}
