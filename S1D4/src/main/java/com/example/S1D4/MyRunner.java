package com.example.S1D4;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        //crea un contesto di applicazione basato sulla configurazione definita nella classe S1D1Application
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(S1D4Application.class);
        try {
//            Menu m = (Menu) ctx.getBean("menu"); //  recupera il bean "menu" dal contesto Spring e lo stampa
//            m.printMenu();
//
//            Table t1 = (Table) ctx.getBean("Tavolo1");
//
//            Order o1 = new Order(4, t1);

            // aggiunbge agli ordini
//            o1.addItem(ctx.getBean("pizza_margherita", Pizza.class));
//            o1.addItem(ctx.getBean("hawaiian_pizza", Pizza.class));
//            o1.addItem(ctx.getBean("salami_pizza_xl", Pizza.class));
//            o1.addItem(ctx.getBean("lemonade", Drink.class));
//            o1.addItem(ctx.getBean("lemonade", Drink.class));
//            o1.addItem(ctx.getBean("wine", Drink.class));
//
//            System.out.println("DETTAGLI TAVOLO 1:");
//            o1.print();
//
//            System.out.println("CONTO TAVOLO 1");
//            System.out.println(o1.getTotal());
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        } finally {
            ctx.close();
        }
    }
}
