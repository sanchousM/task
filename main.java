package groupid;

import java.io.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import com.opencsv.CSVReader;

public class main {
    private final List<person> list;
    public main() {
        list=new ArrayList<>();
    }
    public static void main(String[] args) throws IOException {
        String csvFilePath = "foreign_names.csv";
        Character separator = ';';
        int nextDivisionId = 1;
        Map<String, division> divisionaIds = new HashMap<>();
        main staff = new main();
        try (InputStream in = main.class.getClassLoader().getResourceAsStream(csvFilePath);
             CSVReader reader = in == null ? null : new CSVReader(new InputStreamReader(in), separator)) {
            if (reader == null) {
                throw new FileNotFoundException(csvFilePath);
            }
            String[] nextLine;
            nextLine = reader.readNext();
            while ((nextLine = reader.readNext()) != null) {
                if (!divisionaIds.containsKey(nextLine[4])) {
                    division div= new division(nextLine[4],nextDivisionId);
                    divisionaIds.put(nextLine[4], div);
                    nextDivisionId++;
                }
                person p = new person(nextLine, divisionaIds.get(nextLine[4]));
                staff.list.add(p);
            }
        }
        for (int i = 0; i < staff.list.size(); i++) {
            System.out.println(staff.list.get(i).toString());
        }
    }
}


