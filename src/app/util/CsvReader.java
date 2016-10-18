package app.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CsvReader 
{
    
    public List<String[]> read(String filename, boolean ignoreHeader) throws IOException
    {
        boolean headerIgnored = false;
        List<String[]> content = new ArrayList<>();
        
        String line = "";
        BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream("/app/domain/db/winequality-red.csv")));
        while (null != (line = br.readLine()))
        {
            if (!headerIgnored && ignoreHeader)
            {
                headerIgnored = true;
                continue;
            }
            
            content.add(line.split(";"));
        }
        
        return content;
    }
    
}
