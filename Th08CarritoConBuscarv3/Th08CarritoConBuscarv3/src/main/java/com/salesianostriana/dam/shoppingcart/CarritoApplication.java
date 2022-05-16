package com.salesianostriana.dam.shoppingcart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.salesianostriana.dam.shoppingcart.model.Producto;
import com.salesianostriana.dam.shoppingcart.repository.ProductoRepository;

@SpringBootApplication
public class CarritoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritoApplication.class, args);
	}
	
	/** Cargamos datos de prueba como se ha visto con Luismi. Las imágenes usadas son directamente
	 * rutas de internet pero solo para el ejemplo, ya que hacerlo así supondría arriesgarse a que las páginas dejen de 
	 * estar disponibles, cambios en su ruta, etc.*/
	
	@Bean
	public CommandLineRunner demoData(ProductoRepository repo) {
		return (args) -> {
			if (repo.count() == 0) {				
				repo.save(new Producto("Kingston ValueRAM SO-DIMM DDR3L 1600 PC3-12800 4GB CL11","Kingston ValueRAM SO-DIMM DDR3L 1600 PC3-12800 4GB CL11",30.95,"https://img.pccomponentes.com/articles/6/61657/kingston-4gb-ddr3-1600mhz-pc3l-12800-so-dimm.jpg"));
				repo.save(new Producto("G.Skill Ripjaws SO-DIMM DDR3L 1600 PC3-12800 8GB CL9","G.Skill Ripjaws SO-DIMM DDR3L 1600 PC3-12800 8GB CL9",59.0,"https://thumb.pccomponentes.com/w-530-530/articles/5/59170/g-skill-ripjaws-ddr3-1600mhz-pc3-12800-8gb-cl9-so-dimm.jpg"));
				repo.save(new Producto("Trust Moda Cargador Tipo C 60W","Trust Moda Cargador Tipo C 60W",54.95,"https://thumb.pccomponentes.com/w-530-530/articles/11/112601/21er3fewrdgg5ertgfbv.jpg"));
				repo.save(new Producto("PcCom Bronze Ultimate MC i5-6400 / 8GB / 1TB / GTX 1060 6GB","PcCom Bronze Ultimate MC i5-6400 / 8GB / 1TB / GTX 1060 6GB",789.0,"https://thumb.pccomponentes.com/w-530-530/articles/12/124186/mc01.jpg"));
				repo.save(new Producto("PcCom Silver i5-7400/ 8GB / 120GB SSD+1TB / GTX 1060 3GB","PcCom Silver i5-7400/ 8GB / 120GB SSD+1TB / GTX 1060 3GB",885.0,"https://thumb.pccomponentes.com/w-530-530/articles/11/113392/silver0.jpg"));
				repo.save(new Producto("MSI CX72 6QD-234XES Intel Core i7-6700HQ/8GB/1TB/940MX/17.3","MSI CX72 6QD-234XES Intel Core i7-6700HQ/8GB/1TB/940MX/17.3",669.0,"https://thumb.pccomponentes.com/w-530-530/articles/11/114386/38.jpg"));
				repo.save(new Producto("Avexir E100 SSD 480GB SATA3","Avexir E100 SSD 480GB SATA3",135.0,"https://thumb.pccomponentes.com/w-530-530/articles/10/104066/1.jpg"));
				repo.save(new Producto("Sony Xperia XA1 32GB 4G Dorado Libre","Sony Xperia XA1 32GB 4G Dorado Libre",259.0,"https://thumb.pccomponentes.com/w-530-530/articles/12/126285/f1.jpg"));
				repo.save(new Producto("GoPro Hero Session V2 Negra","GoPro Hero Session V2 Negra",169.0,"https://thumb.pccomponentes.com/w-530-530/articles/10/107895/a4.jpg"));
				repo.save(new Producto("ZTE Blade V580 4G Gris Libre","ZTE Blade V580 4G Gris Libre",169.0,"https://thumb.pccomponentes.com/w-530-530/articles/12/125528/1.jpg"));
				repo.save(new Producto("Kingston HyperX Savage SSD 240GB SATA3","Kingston HyperX Savage SSD 240GB SATA3",94.95,"https://thumb.pccomponentes.com/w-530-530/articles/8/81401/kingston-hyperx-savage-ssd-120gb-sata3.jpg"));
				repo.save(new Producto("Lenovo Essential V110-15ISK Intel Core i3-6006U/4GB/500GB/15.6","Lenovo Essential V110-15ISK Intel Core i3-6006U/4GB/500GB/15.6",349.0,"https://thumb.pccomponentes.com/w-530-530/articles/11/119214/7.jpg"));
			}
		};
	}
}
