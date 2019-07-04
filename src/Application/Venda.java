package Application;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import Domain.Produto;
import Domain.Pedido;
import Repositories.ProdutoRepository;
import Repositories.PedidoRepository;

@SpringBootApplication
public class Venda implements CommandLineRunner {

	@Autowired
	private PedidoRepository PedidoRepository;

	@Autowired
	private ProdutoRepository ProdutoRepository;

	public static void main(String[] args) {
		SpringApplication.run(Venda.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		ProdutoRepository.saveAll(Arrays.asList(p1,p2,p3));
		
		Pedido pe1 = new Pedido(null, p1, 1, 2000.00, 1000.00, 7);
		
	}	
}
