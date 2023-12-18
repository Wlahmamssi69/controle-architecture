package ma.emsi.controle;

import ma.emsi.controle.model.Computer;
import ma.emsi.controle.repository.ComputerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }

    @Bean
    public CommandLineRunner start(ComputerRepository repository){
        return args -> {

            List<Computer> computers=List.of(
                   Computer.builder().proce("proce1").ram("ram2").price(1000.0F).hardDrive("hd1").build() ,
                    Computer.builder().proce("proce2").ram("ram2").price(2000.0F).hardDrive("hd2").build(),
                    Computer.builder().proce("proce2").ram("ram2").price(3000.0F).hardDrive("hd3").build(),
                    Computer.builder().proce("proce2").ram("ram2").price(4000.0F).hardDrive("hd4").build()


            );
            repository.saveAll(computers);

        };
    }

}
