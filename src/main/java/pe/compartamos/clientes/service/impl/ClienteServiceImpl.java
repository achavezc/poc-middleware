package pe.compartamos.clientes.service.impl;


import org.springframework.stereotype.Service;
import pe.compartamos.clientes.model.ClienteDTO;
import pe.compartamos.clientes.service.ClienteService;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {
    private final List<ClienteDTO> clientes = new ArrayList<>();

    @Override
    public List<ClienteDTO> getClientes() {
        return clientes;
    }

    @Override
    public ClienteDTO addCliente(ClienteDTO cliente) {
        clientes.add(cliente);
        return cliente;
    }
}