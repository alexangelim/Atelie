package Atelie.controller.cliente;

import Atelie.model.vo.ClienteVO;
import Atelie.service.cliente.ClienteService;

public class ClienteController {
    
    public void salvar(ClienteVO oCliente) {
        
        ClienteService oClienteService = new ClienteService();
        
        oClienteService.salvar(oCliente);
    
    }
    
}
