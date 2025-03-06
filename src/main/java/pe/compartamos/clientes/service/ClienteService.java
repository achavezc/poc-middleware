package pe.compartamos.clientes.service;

import pe.compartamos.clientes.model.ClienteDTO;
import java.util.List;

public interface ClienteService {
    List<ClienteDTO> getClientes();
    ClienteDTO addCliente(ClienteDTO cliente);
}
