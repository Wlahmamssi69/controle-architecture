package ma.emsi.controle.mapper;

import ma.emsi.controle.dto.ComputerDTO;
import ma.emsi.controle.model.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper computerMapper=new ModelMapper();

    public ComputerDTO fromComputer(Computer computer){
        return computerMapper.map(computer,ComputerDTO.class);
    }

    public Computer toComputer(ComputerDTO computerDTO){
        return computerMapper.map(computerDTO,Computer.class);
    }


}
