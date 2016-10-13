package app.domain;

import app.util.CsvReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database 
{

    public List<Case> load() throws IOException
    {
        List<Case> cases = new ArrayList<>();
        List<String[]> content = new CsvReader().read("db/winequality-red.csv", true);
        for (String[] tuple : content) 
        {
            Case rbcCase = new Case(
                    Double.valueOf(tuple[0]),
                    Double.valueOf(tuple[1]),
                    Double.valueOf(tuple[2]),
                    Double.valueOf(tuple[3]),
                    Double.valueOf(tuple[4]),
                    Double.valueOf(tuple[5]),
                    Double.valueOf(tuple[6]),
                    Double.valueOf(tuple[7]),
                    Double.valueOf(tuple[8]),
                    Double.valueOf(tuple[9]),
                    Double.valueOf(tuple[10]),
                    Integer.valueOf(tuple[11]));
            cases.add(rbcCase);
        }
        
        return cases;
    }
    
}
