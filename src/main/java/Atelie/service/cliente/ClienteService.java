package Atelie.service.cliente;

import Atelie.dao.cliente.ClienteDAO;
import Atelie.model.vo.ClienteVO;

public class ClienteService {
    
    private final ClienteDAO oClienteDAO = new ClienteDAO();
    
    public void salvar (ClienteVO oCliente) {
        
        oClienteDAO.salvar(oCliente);
    }
    
}
