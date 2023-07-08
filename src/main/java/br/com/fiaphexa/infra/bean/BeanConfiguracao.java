package br.com.fiaphexa.infra.bean;

import br.com.fiaphexa.aplicacao.usecases.cliente.CadastraClienteUseCase;
import br.com.fiaphexa.dominio.portas.entrada.clientes.CadastraClientePortaEntrada;
import br.com.fiaphexa.dominio.portas.entrada.produtos.*;
import br.com.fiaphexa.dominio.portas.saida.cliente.ClienteRepositoryPortaSaida;
import br.com.fiaphexa.dominio.portas.saida.produto.ProdutoRepositoryPortaSaida;
import br.com.fiaphexa.aplicacao.usecases.produto.AtualizaProdutoUseCase;
import br.com.fiaphexa.aplicacao.usecases.produto.CadastrarProdutoUseCase;
import br.com.fiaphexa.aplicacao.usecases.produto.ProcuraProdutoPorCategoriaUseCase;
import br.com.fiaphexa.aplicacao.usecases.produto.RemoveProdutoUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguracao {

    @Bean
    CadastraProdutoPortaEntrada cadastraProdutoPortaEntrada(ProdutoRepositoryPortaSaida produtoRepositoryPort){
        return new CadastrarProdutoUseCase(produtoRepositoryPort);
    }

    @Bean
    AtualizaProdutoPortaEntrada atualizaProdutoPortaEntrada(ProdutoRepositoryPortaSaida produtoRepositoryPort){
        return new AtualizaProdutoUseCase(produtoRepositoryPort);
    }

    @Bean
    ProcuraProdutoPorCategoriaPortaEntrada procuraProdutoPorCategoriaPortaEntrada(ProdutoRepositoryPortaSaida produtoRepositoryPort){
        return new ProcuraProdutoPorCategoriaUseCase(produtoRepositoryPort);
    }

    @Bean
    RemoveProdutoPortaEntrada removeProdutoPortaEntrada(ProdutoRepositoryPortaSaida produtoRepositoryPort){
        return new RemoveProdutoUseCase(produtoRepositoryPort);
    }

    @Bean
    CadastraClientePortaEntrada cadastraClientePortaEntrada(ClienteRepositoryPortaSaida clienteRepositoryPortaSaida){
        return new CadastraClienteUseCase(clienteRepositoryPortaSaida);
    }

}
