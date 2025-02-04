package com.rodri;

import com.rodri.customer.Customer;
import com.rodri.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//@ComponentScan(basePackages = "com.rodri")
//@EnableAutoConfiguration
//@Configuration
@SpringBootApplication


public class Main {


    public static void main(String[] args) {
//        System.out.println(customers);
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer alex = new Customer("alex", "alex@gmail.com", 21);
            Customer jamila = new Customer("Jamila", "jamila@gmail.com", 19);

            List<Customer> customers = List.of(alex, jamila);

            customerRepository.saveAll(customers);
        };
    }
//    @GetMapping("/greet") // abbreviation of @RequestMapping
//    public GreetResponse greet(
//            @RequestParam(value = "name", required = false) String name) {
//
//        String greetMesssage = name == null || name.isEmpty() ? "Hello" : "Hello " + name;
//
//        GreetResponse greetResponse = new GreetResponse(greetMesssage,
//                List.of("JavaScript", "TypeScript", "Java"),
//                new Person("rodri", 28, 30_000));
//
//        return greetResponse;
//    }


//    class GreetResponse {
//        private final String greet;
//
//        GreetResponse(String greet) {
//            this.greet = greet;
//        }
//
//        public String getGreet() {
//            return greet;
//        }
//
//        @Override
//        public String toString() {
//            return "GreetResponse{" +
//                    "greet='" + greet + '\'' +
//                    '}';
//        }
//
//        @Override
//        public boolean equals(Object o) {
//            if (o == null || getClass() != o.getClass()) return false;
//            GreetResponse that = (GreetResponse) o;
//            return Objects.equals(greet, that.greet);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hashCode(greet);
//        }
//    }

//    record Person(String name, int age, double savings) {
//    }
//
//    record GreetResponse(String greet, List<String> favProgrammingLanguages, Person person) {
//    }


}
