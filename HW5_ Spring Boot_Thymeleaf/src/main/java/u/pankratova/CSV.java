package u.pankratova;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import u.pankratova.model.Person;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CSV {
    private static final String file = "./file.csv";

    public static void saveRecord(String[] information) {

        try {
            FileWriter fileWriter = new FileWriter(file, true);
            CSVWriter writer = new CSVWriter(fileWriter);
            writer.writeNext(information);

            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person findRecord(Person person) {
        try (CSVReader reader = new CSVReader(new FileReader(file))) {
            String[] nextLine;
            while ((nextLine = reader.readNext()) != null) {
                if (person.getSurname().equalsIgnoreCase(nextLine[0])) {
                    if (person.getName().equalsIgnoreCase(nextLine[1])) {
                        person.setPatronymic(nextLine[2]);
                        person.setAge(Integer.parseInt(nextLine[3]));
                        person.setSalary(Long.parseLong(nextLine[4]));
                        person.setEmail(nextLine[5]);
                        person.setJob(nextLine[6]);
                        return person;
                    }
                }
            }
        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
        return null;
    }
}