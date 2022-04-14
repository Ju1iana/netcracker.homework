package u.pankratova;

import com.opencsv.*;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        // FileReader file = new FileReader("src/main/resources/demo.csv");

        // 1)
        String csvFile = "src/main/resources/demo.csv";
        BufferedReader br = null;
        String line = "";
        String splitBy = ",";

        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] names = line.split(splitBy);

                /* all our columns: id, name, age, passport, country */
                System.out.println("ID:" + names[0]+ " [name = " + names[1] + ", passport = " + names[3] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                br.close();
            }
        }


       /* 2)
       try (CSVReader csvReader = new CSVReader(file)){
            String[] values = null;
            while ((values = csvReader.readNext()) != null){
                System.out.println(Arrays.asList(values));
            }
        }*/


        /* 3)
        FileReader file = new FileReader("src/main/resources/example.csv");
        List<Person> beans = new CsvToBeanBuilder<Person>(file)
                .withType(Person.class)
                .build()
                .parse();

        for (Person p : beans){
            System.out.println(p.getTitle() + " " + p.getName() + ", " + p.getAge());
        }*/

    }
}


/* test
* 1)
* ID:1 [name = Jon, passport = 78 90 8765
* ID:2 [name = Nina, passport = 34 65 1234
* ID:3 [name = Kim, passport = 90 07 6729
* ID:4 [name = Lolita, passport = 67 98 0020
* ID:5 [name = Masha, passport = 41 94 9825
* ID:6 [name = Ben, passport = 68 00 7628
*
*
* 2)
* [1, Jon, 12, 78 90 8765, Brazil]
* [2, Nina, 20, 34 65 1234, Russian]
* [3, Kim, 35, 90 07 6729, Iceland]
* [4, Lolita, 14, 67 98 0020, Russian]
* [5, Masha, 8, 41 94 9825, Cuba]
* [6, Ben, 44, 68 00 7628, Canada]
*
*
* 3)
* Mr. John Doe, 45
* Mrs. Jane Doe, 47
* Jil1ana Pankratova, 19
* Dr. Max "Fury" Smith, 67
* Coach Ted Lasso, 48
*
* */
