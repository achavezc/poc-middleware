package pe.compartamos.clientes.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import pe.compartamos.clientes.model.ClienteDTO;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@Tag(name = "Clientes", description = "API para gestión de clientes")
@RestController
@RequestMapping("/api/clientes")
public class ClienteController {
    private final List<ClienteDTO> clientes = new ArrayList<>();

    @Operation(summary = "Obtener todos los clientes", description = "Devuelve una lista de clientes registrados.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Lista de clientes obtenida exitosamente"),
        @ApiResponse(responseCode = "500", description = "Error interno del servidor")
    })
    @GetMapping
    public List<ClienteDTO> getClientes() {
        return clientes;
    }

    @Operation(summary = "Agregar un nuevo cliente", description = "Añade un cliente con ID, nombre y correo electrónico.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Cliente creado exitosamente"),
        @ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    @PostMapping
    public ClienteDTO addCliente(@RequestBody ClienteDTO cliente) {
        clientes.add(cliente);
        return cliente;
    }
}
