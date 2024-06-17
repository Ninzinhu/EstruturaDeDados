package Proxy.Resolução;

import DesignPatternsEmJava.Builder.Pessoa;
import Proxy.PessoaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy extends PessoaRepository {


    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = new HashMap<>();

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando chamada do metodo save....");
        super.save(pessoa);
        log.info("Finalizando chamada do metodo save......");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando chamada do metodo FindById.....");
        long inicio = System.currentTimeMillis();

        Pessoa pessoa = null;

        if (Objects.nonNull(cache.get(id))) {
            log.info("Cache inicializado.....");
            pessoa = cache.get(id);

        } else {
            log.info("Esta pegando a classe do PessoaRepository.....");
             pessoa = super.findById(id);
            cache.put(id, pessoa);
        }


        log.info("Finalizando chamada do metodo FindById.....");
        long fim = System.currentTimeMillis();

        log.info("Tempo gasto na chamada....." + (fim - inicio));
        return pessoa;
    }

}
