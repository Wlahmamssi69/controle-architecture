package ma.emsi.controle.repository;

import ma.emsi.controle.dto.ComputerDTO;
import ma.emsi.controle.model.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.List;

public interface ComputerRepository extends JpaRepository<Computer,Integer> {
    List<Computer> findAllByProce(String proce);

    Computer findByPrice(float price);
}
