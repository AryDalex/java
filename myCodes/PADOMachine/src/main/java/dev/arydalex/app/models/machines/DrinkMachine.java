package dev.arydalex.app.models.machines;

import dev.arydalex.app.models.products.HotDrink;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {

    private List<HotDrinkMachine> machines = new ArrayList<>();

    public DrinkMachine() {

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        TeaMachine teaMachine = new TeaMachine();

        machines.add(coffeeMachine);
        machines.add(teaMachine);

    }

    public void prepare() throws IOException {
        System.out.println("Escolha sua Bebida!");
        System.out.println("0. Coffee");
        System.out.println("1. Tea");
        System.out.print("Escolha: ");

        while(true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int valor = Integer.parseInt(reader.readLine());
            System.out.println("Valor informado pelo usuário " + valor);
            if(valor <= machines.size() && valor >= 0) {
                HotDrink hotDrink = this.machines.get(valor).makeDrink();
                System.out.println(hotDrink);
                System.out.println("********** THE END **********");
            } else {
                System.out.println("Opação não disponivel, tente novamente!");
            }
        }
    }

}
