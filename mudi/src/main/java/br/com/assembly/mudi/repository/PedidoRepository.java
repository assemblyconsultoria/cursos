package br.com.assembly.mudi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import br.com.assembly.mudi.model.Pedido;
import br.com.assembly.mudi.model.StatusPedido;

@Component
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

    List<Pedido> findByStatus(StatusPedido status);

}
