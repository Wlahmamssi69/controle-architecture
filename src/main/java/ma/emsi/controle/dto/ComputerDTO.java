package ma.emsi.controle.dto;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ComputerDTO {


    private String proce;
    private String ram;
    private String hardDrive;
    private float price;
}
