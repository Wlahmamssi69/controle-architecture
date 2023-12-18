package ma.emsi.controle.service;

import ma.emsi.controle.dto.ComputerDTO;
import ma.emsi.controle.model.Computer;

import java.util.List;

public interface ComputerManager {

    public List<ComputerDTO> getComputerByProce(String proce);
    public ComputerDTO getComputerByPrice(float proce);
    public Computer saveComputer(ComputerDTO computer);
    public void deleteComputer(int id);
}
