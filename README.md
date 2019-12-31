# propertise
实例@PropertySource注解，通过@Component将装配到spring容器，
// spring 注解，装配到spring容器中
@Component
//yml 不适用于此注解，在 Java 配置中，可以通过 @PropertySource 来引入配置：
@PropertySource("classpath:application.properties")
// 引入 @ConfigurationProperties(prefix = “book”) 注解，并且配置了属性的前缀，就不用通过 @Value 注解挨个注入了
@ConfigurationProperties(prefix = "book")

//@Value 注解，在属性上加下面：
@Value("${book.id}")


