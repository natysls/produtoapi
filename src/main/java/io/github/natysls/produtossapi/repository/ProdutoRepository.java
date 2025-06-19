package io.github.natysls.produtossapi.repository;

import io.github.natysls.produtossapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
