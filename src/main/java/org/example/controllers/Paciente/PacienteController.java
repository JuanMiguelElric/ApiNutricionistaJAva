package org.example.controllers.Paciente;

import org.example.models.Paciente;
import org.example.models.endereco.Endereco;

import java.util.Scanner;

public class PacienteController {

    public void createPaciente(){
        Paciente paciente = new Paciente();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira aqui o nome do paciente");
        String inf = scanner.nextLine();
        System.out.printf("Agora informe aqui o dia que ele nasceu");
        String date = scanner.nextLine();
        paciente.set_Paciente(inf, date);
        System.out.println(paciente.getPaciente());

        System.out.printf("você deseja adicionar um endereco a esse paciente ? \n se sim digite:\n 1=>Sim\n 2=>Não");

        Integer escolha = scanner.nextInt();

        if(escolha == 1){
            System.out.printf("okay digite aqui a sua rua");
            String rua = scanner.nextLine();
            System.out.printf("Dgite aqui a cidade da rua");
            String cidade = scanner.nextLine();
            System.out.printf("Digite aqui o seu estado:");
            String estado = scanner.nextLine();
            System.out.printf("Informe também o seu cep");
            String cep = scanner.nextLine();

            Endereco endereco = new Endereco(rua,cidade,estado,cep);
            System.out.println(endereco);

        }else {

            System.out.printf("Paciente registrado com sucesso");

        }
    }
}
