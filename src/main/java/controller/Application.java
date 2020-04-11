package controller;

import model.Product;
import service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"repository", "dto", "controller", "service", "model", "exception"})
@EnableJpaRepositories(basePackages = {"repository", "dto", "controller", "service", "model", "exception"})
@EntityScan(basePackages = {"repository", "dto", "controller", "service", "model", "exception"})

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "MacBook Pro 16 inch", 2000.00, "https://store.storeimages.cdn-apple.com/4982/as-images.apple.com/is/mbp16touch-space-gallery1-201911?wid=2000&hei=1536&fmt=jpeg&qlt=95&op_usm=0.5,0.5&.v=1573165109376"));
            productService.save(new Product(2L, "Dell XPS 15\"", 1500.00, "https://i.dell.com/is/image/DellContent//content/dam/global-site-design/product_images/dell_client_products/notebooks/xps_notebooks/13_9380/global_spi/notebook-xps-13-9380-whl-silver-campaign-hero-504x350-ng.psd?fmt=jpg&wid=570&hei=400"));
            productService.save(new Product(3L, "Mirosoft Surface Book 2 15\"", 2000.00, "https://img-prod-cms-rt-microsoft-com.akamaized.net/cms/api/am/imageFileData/RE1FU5k?ver=e2c0&q=90&m=6&h=705&w=1253&b=%23FFF0F0F0&o=f&p=140&aim=true"));
            productService.save(new Product(4L, "HP Spectre x360 15.6 inch", 1500.00, "https://images-na.ssl-images-amazon.com/images/I/81ORkyMg7jL._AC_SL1500_.jpg"));
            productService.save(new Product(5L, "Razor Blade 15\"", 1700.00, "https://images-na.ssl-images-amazon.com/images/I/71K7P66CGnL._AC_SL1500_.jpg"));
            productService.save(new Product(6L, "ASUS ZenBook Pro 15\"", 1650.00, "https://images-na.ssl-images-amazon.com/images/I/81KhldL3IyL._AC_SL1500_.jpg"));
            productService.save(new Product(7L, "LG Gram Laptop - 15.6\"", 1300.00, "https://images-na.ssl-images-amazon.com/images/I/71Y1GnUpW3L._AC_SL1500_.jpg"));
        };
    }
}
