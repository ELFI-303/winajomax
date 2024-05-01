package com.wina.jo.max.demo.repository;

import com.wina.jo.max.demo.Entity.Customer;
import com.wina.jo.max.demo.Entity.GambleEvent;
import com.wina.jo.max.demo.Entity.OlympicEvent;
import jakarta.annotation.PostConstruct;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import static java.lang.Long.parseLong;

@Component
public class DatabaseInitiator {

        @Autowired
        private GambleEventRepository gambleEventRepository;
        @Autowired
        private OlympicEventRepository olympicEventRepository;
        @Autowired
        private CustomerRepository customerRepository;

        @PostConstruct
        private void postConstruct() {
            OlympicEvent olympic1 = new OlympicEvent(
                    1,
                    "tir à l'arc",
                    "2024-07-13T10:00:00",
                    "Stade de france",
                    "{\"France\": \"Didier des champs,Philippe Etchebest,Pascal LGF\",\"Suisse\":\"Charle Suisse,Arthur Oclock,JCVD\",\"Espagne\":\"Manuel El Toro,Carlos Flamenco,Javier Navarro\",\"Allemagne\":\"Fritz Müller,Hans Schmidt,Lena Wagner\"}",
                    "Suisse",
                    "{\"France\":\"0.73\",\"Suisse\":\"2.31\",\"Espagne\":\"1.95\",\"Allemagne\":\"3.42\"}");
            olympicEventRepository.save(olympic1);
            OlympicEvent olympic2 = new OlympicEvent(
                    2,
                    "natation",
                    "2024-08-01T09:00:00",
                    "Piscine olympique",
                    "{\"États-Unis\":\"Michael Phelps,Katie Ledecky,Ryan Lochte\",\"Australie\":\"Ian Thorpe,Grant Hackett,Libby Trickett\"}",
                    "Australie",
                    "{\"États-Unis\":\"1.62\",\"Australie\":\"2.85\"}");
            olympicEventRepository.save(olympic2);
            OlympicEvent olympic3 = new OlympicEvent(
                    3,
                    "athlétisme - 100 mètres",
                    "2024-08-05T15:30:00",
                    "Stade olympique",
                    "{\"Jamaïque\":\"Usain Bolt,Shelly-Ann Fraser-Pryce,Asafa Powell\",\"États-Unis\":\"Justin Gatlin,Allyson Felix,Trayvon Bromell\"}",
                    "Jamaïque",
                    "{\"Jamaïque\":\"1.92\",\"États-Unis\":\"2.18\"}");
            olympicEventRepository.save(olympic3);
            OlympicEvent olympic4 = new OlympicEvent(
                    4,
                    "basketball",
                    "2024-07-30T14:00:00",
                    "Palais omnisports",
                    "{\"États-Unis\":\"LeBron James,Kevin Durant,Stephen Curry\",\"Espagne\":\"Pau Gasol,Marc Gasol,Ricky Rubio\",\"Australie\":\"Ben Simmons,Patty Mills,Joe Ingles\",\"France\":\"Rudy Gobert,Evan Fournier,Nando De Colo\"}",
                    "États-Unis",
                    "{\"États-Unis\":\"1.28\",\"Espagne\":\"3.95\",\"Australie\":\"4.71\",\"France\":\"6.12\"}");
            olympicEventRepository.save(olympic4);
            OlympicEvent olympic5 = new OlympicEvent(
                    5,
                    "gymnastique artistique",
                    "2024-07-28T11:30:00",
                    "Gymnase olympique",
                    "{\"Russie\":\"Nikolai Andrianov,Svetlana Khorkina,Viktor Chukarin\",\"Chine\":\"Shawn Johnson,Li Ning,Simone Biles\",\"Japon\":\"Kohei Uchimura,Nadia Comăneci,Kōhei Uchimura\",\"Brésil\":\"Arthur Zanetti,Arthur Nory,Rebeca Andrade\"}",
                    "Chine",
                    "{\"Russie\":\"2.86\",\"Chine\":\"1.97\",\"Japon\":\"3.21\",\"Brésil\":\"5.04\"}");
            olympicEventRepository.save(olympic5);
            OlympicEvent olympic6 = new OlympicEvent(
                    6,
                    "escrime - épée",
                    "2024-08-03T16:45:00",
                    "Centre d'escrime",
                    "{\"Italie\":\"Valentina Vezzali,Edoardo Mangiarotti,Andrea Cassarà\",\"Corée du Sud\":\"Park Sang-young,Choi In-jeong,Sung Ki-hyun\",\"Hongrie\":\"Emese Szász,Géza Imre,Aron Szilagyi\",\"Égypte\":\"Mohamed Amer,Aya Medany,Eman El-Gammal\"}",
                    "Italie",
                    "{\"Italie\":\"2.14\",\"Corée du Sud\":\"2.65\",\"Hongrie\":\"4.02\",\"Égypte\":\"5.77\"}");
            olympicEventRepository.save(olympic6);
            OlympicEvent olympic7 = new OlympicEvent(
                    7,
                    "haltérophilie",
                    "2024-08-02T13:15:00",
                    "Salle d'haltérophilie",
                    "{\"Chine\":\"Zhang Guozheng,Liao Hui,Kuo Hsing-chun\",\"Iran\":\"Behdad Salimi,Kianoush Rostami,Sohrab Moradi\",\"Égypte\":\"Mohamed Ihab,Khalil Mahmoud,Sara Ahmed\",\"Canada\":\"Christine Girard,Karine Sergerie,Tonya Verbeek\"}",
                    "Chine",
                    "{\"Chine\":\"1.85\",\"Iran\":\"3.12\",\"Égypte\":\"4.57\",\"Canada\":\"6.28\"}");
            olympicEventRepository.save(olympic7);
            OlympicEvent olympic8 = new OlympicEvent(
                    8,
                    "volleyball de plage",
                    "2024-07-14T09:30:00",
                    "Plage de Paris",
                    "{\"Brésil\":\"Alison Cerutti,Emmanuel Rego,Talita Antunes\",\"États-Unis\":\"Phil Dalhausser,Kerri Walsh Jennings, Misty May-Treanor\",\"Australie\":\"Natalie Cook,Kerri Pottharst\",\"Pays-Bas\":\"Alexander Brouwer,Robert Meeuwsen,Marleen van Iersel\"}",
                    "Brésil",
                    "{\"Brésil\":\"2.05\",\"États-Unis\":\"2.75\",\"Australie\":\"3.91\",\"Pays-Bas\":\"5.26\"}");
            olympicEventRepository.save(olympic8);
            OlympicEvent olympic9 = new OlympicEvent(
                    9,
                    "tennis de table",
                    "2024-07-20T16:00:00",
                    "Centre de tennis de table",
                    "{\"Chine\":\"Ma Long,Ding Ning,Zhang Jike\",\"Japon\":\"Jun Mizutani,Mima Ito,Tomokazu Harimoto\",\"Allemagne\":\"Timo Boll,Dimitrij Ovtcharov,Han Ying\",\"Corée du Sud\":\"Ryu Seung-min,Kim Kyung-ah\"}",
                    "Chine",
                    "{\"Chine\":\"1.62\",\"Japon\":\"2.45\",\"Allemagne\":\"4.13\",\"Corée du Sud\":\"5.82\"}");
            String olympic1Data = "{\"dateTime\":\"2024-07-13T10:00:00\",\"result\":\"Suisse\",\"eventId\":1,\"cote\":\"{\\\"France\\\":\\\"0.73\\\",\\\"Suisse\\\":\\\"2.31\\\",\\\"Espagne\\\":\\\"1.95\\\",\\\"Allemagne\\\":\\\"3.42\\\"}\",\"discipline\":\"tir à l'arc\",\"lieu\":\"Stade de france\",\"participants\":\"{\\\"France\\\": \\\"Didier des champs,Philippe Etchebest,Pascal LGF\\\",\\\"Suisse\\\":\\\"Charle Suisse,Arthur Oclock,JCVD\\\",\\\"Espagne\\\":\\\"Manuel El Toro,Carlos Flamenco,Javier Navarro\\\",\\\"Allemagne\\\":\\\"Fritz Müller,Hans Schmidt,Lena Wagner\\\"}\"}";

            String olympic2Data = "{\"dateTime\":\"2024-08-01T09:00:00\",\"result\":\"Australie\",\"eventId\":2,\"cote\":\"{\\\"États-Unis\\\":\\\"1.62\\\",\\\"Australie\\\":\\\"2.85\\\"}\",\"discipline\":\"natation\",\"lieu\":\"Piscine olympique\",\"participants\":\"{\\\"États-Unis\\\":\\\"Michael Phelps,Katie Ledecky,Ryan Lochte\\\",\\\"Australie\\\":\\\"Ian Thorpe,Grant Hackett,Libby Trickett\\\"}\"}";

            String olympic3Data = "{\"dateTime\":\"2024-08-05T15:30:00\",\"result\":\"Jamaïque\",\"eventId\":3,\"cote\":\"{\\\"Jamaïque\\\":\\\"1.92\\\",\\\"États-Unis\\\":\\\"2.18\\\"}\",\"discipline\":\"athlétisme - 100 mètres\",\"lieu\":\"Stade olympique\",\"participants\":\"{\\\"Jamaïque\\\":\\\"Usain Bolt,Shelly-Ann Fraser-Pryce,Asafa Powell\\\",\\\"États-Unis\\\":\\\"Justin Gatlin,Allyson Felix,Trayvon Bromell\\\"}\"}";

            String olympic4Data = "{\"dateTime\":\"2024-07-30T14:00:00\",\"result\":\"États-Unis\",\"eventId\":4,\"cote\":\"{\\\"États-Unis\\\":\\\"1.28\\\",\\\"Espagne\\\":\\\"3.95\\\",\\\"Australie\\\":\\\"4.71\\\",\\\"France\\\":\\\"6.12\\\"}\",\"discipline\":\"basketball\",\"lieu\":\"Palais omnisports\",\"participants\":\"{\\\"États-Unis\\\":\\\"LeBron James,Kevin Durant,Stephen Curry\\\",\\\"Espagne\\\":\\\"Pau Gasol,Marc Gasol,Ricky Rubio\\\",\\\"Australie\\\":\\\"Ben Simmons,Patty Mills,Joe Ingles\\\",\\\"France\\\":\\\"Rudy Gobert,Evan Fournier,Nando De Colo\\\"}\"}";

            String olympic5Data = "{\"dateTime\":\"2024-07-28T11:30:00\",\"result\":\"Chine\",\"eventId\":5,\"cote\":\"{\\\"Russie\\\":\\\"2.86\\\",\\\"Chine\\\":\\\"1.97\\\",\\\"Japon\\\":\\\"3.21\\\",\\\"Brésil\\\":\\\"5.04\\\"}\",\"discipline\":\"gymnastique artistique\",\"lieu\":\"Gymnase olympique\",\"participants\":\"{\\\"Russie\\\":\\\"Nikolai Andrianov,Svetlana Khorkina,Viktor Chukarin\\\",\\\"Chine\\\":\\\"Shawn Johnson,Li Ning,Simone Biles\\\",\\\"Japon\\\":\\\"Kohei Uchimura,Nadia Comăneci,Kōhei Uchimura\\\",\\\"Brésil\\\":\\\"Arthur Zanetti,Arthur Nory,Rebeca Andrade\\\"}\"}";


            olympicEventRepository.save(olympic9);
            GambleEvent gamble1 = new GambleEvent(parseLong("1"), parseLong("1"), olympic1Data, 250.00,"France");
            gambleEventRepository.save(gamble1);
            GambleEvent gamble2 = new GambleEvent(parseLong("2"), parseLong("3"), olympic4Data, 100.50,"France");
            gambleEventRepository.save(gamble2);
            GambleEvent gamble3 = new GambleEvent(parseLong("3"), parseLong("2"), olympic2Data, 500.25,"Australie");
            gambleEventRepository.save(gamble3);
            GambleEvent gamble4 = new GambleEvent(parseLong("4"), parseLong("4"), olympic3Data, 50.75,"Jamaïque");
            gambleEventRepository.save(gamble4);
            GambleEvent gamble5 = new GambleEvent(parseLong("5"), parseLong("5"), olympic5Data, 1000.00,"Brésil");
            gambleEventRepository.save(gamble5);
            GambleEvent gamble6 = new GambleEvent(parseLong("6"), parseLong("1"), olympic3Data, 75.25,"Jamaïque");
            gambleEventRepository.save(gamble6);
            GambleEvent gamble7 = new GambleEvent(parseLong("7"), parseLong("2"), olympic5Data, 300.50,"Brésil");
            gambleEventRepository.save(gamble7);
            GambleEvent gamble8 = new GambleEvent(parseLong("8"), parseLong("3"), olympic1Data, 150.75,"France");
            gambleEventRepository.save(gamble8);
            GambleEvent gamble9 = new GambleEvent(parseLong("9"), parseLong("4"), olympic4Data, 200.00,"France");
            gambleEventRepository.save(gamble9);
            GambleEvent gamble10 = new GambleEvent(parseLong("10"), parseLong("5"), olympic2Data, 500.00,"Australie");
            gambleEventRepository.save(gamble10);
            GambleEvent gamble11 = new GambleEvent(parseLong("11"), parseLong("1"), olympic2Data, 90.00,"Australie");
            gambleEventRepository.save(gamble11);
            GambleEvent gamble12 = new GambleEvent(parseLong("12"), parseLong("2"), olympic3Data, 600.00,"Jamaïque");
            gambleEventRepository.save(gamble12);
            GambleEvent gamble13 = new GambleEvent(parseLong("13"), parseLong("3"), olympic4Data, 300.00,"France");
            gambleEventRepository.save(gamble13);
            GambleEvent gamble14 = new GambleEvent(parseLong("14"), parseLong("4"), olympic1Data, 75.00,"France");
            gambleEventRepository.save(gamble14);
            GambleEvent gamble15 = new GambleEvent(parseLong("15"), parseLong("5"), olympic5Data, 1500.00,"France");
            gambleEventRepository.save(gamble15);
            GambleEvent gamble16 = new GambleEvent(parseLong("16"), parseLong("1"), olympic4Data, 175.50,"France");
            gambleEventRepository.save(gamble16);
            GambleEvent gamble17 = new GambleEvent(parseLong("17"), parseLong("2"), olympic1Data, 800.00,"France");
            gambleEventRepository.save(gamble17);
            GambleEvent gamble18 = new GambleEvent(parseLong("18"), parseLong("3"), olympic3Data, 250.00,"Jamaïque");
            gambleEventRepository.save(gamble18);
            GambleEvent gamble19 = new GambleEvent(parseLong("19"), parseLong("4"), olympic5Data, 100.00,"Brésil");
            gambleEventRepository.save(gamble19);
            GambleEvent gamble20 = new GambleEvent(parseLong("20"), parseLong("5"), olympic2Data, 1000.00,"Australie");
            gambleEventRepository.save(gamble20);
            Customer customer1 = new Customer(parseLong("1"),"Jean","jean@jean.com",1500.00,"jeanbg","MALE","USER");
            customerRepository.save(customer1);
            Customer customer2 = new Customer(parseLong("2"), "Maximus", "max@gladiator.com", 3500.00, "gladiator83", "MALE", "USER");
            customerRepository.save(customer2);
            Customer customer3 = new Customer(parseLong("3"), "Aurora", "aurora@enchanted.com", 1800.00, "aurora123", "FEMALE", "USER");
            customerRepository.save(customer3);
            Customer customer4 = new Customer(parseLong("4"), "Neo", "neo@matrix.com", 5000.00, "theneo", "MALE", "USER");
            customerRepository.save(customer4);
            Customer customer5 = new Customer(parseLong("5"), "Zephyr", "zephyr@windmail.com", 2100.00, "zephyrsky", "MALE", "USER");
            customerRepository.save(customer5);
        }
}