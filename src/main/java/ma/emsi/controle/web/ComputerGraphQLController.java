package ma.emsi.controle.web;

import lombok.AllArgsConstructor;
import ma.emsi.controle.dto.ComputerDTO;
import ma.emsi.controle.model.Computer;
import ma.emsi.controle.repository.ComputerRepository;
import ma.emsi.controle.service.ComputerManager;
import ma.emsi.controle.service.ComputerManagerAction;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;


@AllArgsConstructor
@Controller
public class ComputerGraphQLController {
    private ComputerManager service;

    @QueryMapping
    public List<ComputerDTO> getComputersByProce(@Argument String proce){
        return service.getComputerByProce(proce);
    }

    @QueryMapping
    public ComputerDTO getComputersByPrice(@Argument float price){
        return service.getComputerByPrice(price);
    }

    @MutationMapping
    public Computer getComputersByPrice(@Argument ComputerDTO computerDTO)
    {
        return service.saveComputer(computerDTO);
    }

    @MutationMapping
    public void deleteComputer(@Argument int id){
        service.deleteComputer(id);
    }
}
