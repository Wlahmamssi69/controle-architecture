package ma.emsi.controle.service;

import lombok.AllArgsConstructor;
import ma.emsi.controle.dto.ComputerDTO;
import ma.emsi.controle.mapper.ComputerMapper;
import ma.emsi.controle.model.Computer;
import ma.emsi.controle.repository.ComputerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ComputerManagerAction implements ComputerManager{

    private ComputerRepository repository;
    private ComputerMapper mapper;

    @Override
    public List<ComputerDTO> getComputerByProce(String proce) {
        return repository.findAllByProce(proce).stream().map(mapper::fromComputer).collect(Collectors.toList());
    }




    @Override
    public ComputerDTO getComputerByPrice(float price) {
        Computer computer = repository.findByPrice(price);
        return mapper.fromComputer(computer);
    }

    @Override
    public Computer saveComputer(ComputerDTO computerDTO) {
        Computer computer = mapper.toComputer(computerDTO);
        return repository.save(computer);
    }

    @Override
    public void deleteComputer(int id) {
     repository.deleteById(id);
    }
}
