package org.example;

import org.example.models.Paciente;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente();
        paciente.setId();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira aqui o nome do paciente");
        String inf = scanner.nextLine();
        System.out.printf("Agora informe aqui o dia que ele nasceu");
        String date = scanner.nextLine();
        paciente.set_Paciente(inf, date);
        System.out.println(paciente.getPaciente());

    }
}