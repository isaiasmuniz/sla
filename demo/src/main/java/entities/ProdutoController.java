package entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	public ProdutoRepositorio produtoRepositorio;
	
	@PostMapping
	public @ResponseBody Produto novoPoduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		produtoRepositorio.save(produto);
		return produto;
	}

}
