package app.domain;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WineQualityCbr 
{

    private List<Case> baseCases;
    
    public WineQualityCbr() 
    {
        baseCases = null;
    }
   
    public void loadBaseCases() throws IOException
    {
        if (null == baseCases)
        {
            baseCases = new Database().load();
        }
    }
    
    public List<CaseSimilarity> process(Case newCase, CaseAttributeWeight weight) throws IOException
    {        
        loadBaseCases();
        
        List<CaseSimilarity> similarCases = new ArrayList<>();
        baseCases.stream().forEach((baseCase) ->
        {
            similarCases.add(calculateCaseSimilaty(newCase, baseCase, weight));
        });
        
        Collections.sort(similarCases, (c1, c2) ->
        {
            return c1.getSimilarity() > c2.getSimilarity() ? -1 : 1;
        });
        
        return similarCases;
    }
    
    private CaseSimilarity calculateCaseSimilaty(Case newCase, Case baseCase, CaseAttributeWeight weight)
    {
        double calc = 0.0;
        calc += weight.getFixedAcidity() * calculateAttributeSimilarity(newCase.getFixedAcidity(), baseCase.getFixedAcidity(), 4.6, 15.9);
        calc += weight.getVolatileAcidity() * calculateAttributeSimilarity(newCase.getVolatileAcidity(), baseCase.getVolatileAcidity(), 0.12, 1.58);
        calc += weight.getCitricAcid() * calculateAttributeSimilarity(newCase.getCitricAcid(), baseCase.getCitricAcid(), 0.0, 1.0);
        calc += weight.getResidualSugar() * calculateAttributeSimilarity(newCase.getResidualSugar(), baseCase.getResidualSugar(), 0.9, 13.9);
        calc += weight.getChlorides() * calculateAttributeSimilarity(newCase.getChlorides(), baseCase.getChlorides(), 0.012, 0.611);
        calc += weight.getFreeSulfurDioxide() * calculateAttributeSimilarity(newCase.getFreeSulfurDioxide(), baseCase.getFreeSulfurDioxide(), 1.0, 72.0);
        calc += weight.getTotalSulfurDioxide() * calculateAttributeSimilarity(newCase.getTotalSulfurDioxide(), baseCase.getTotalSulfurDioxide(), 6.0, 289.0);
        calc += weight.getDensity() * calculateAttributeSimilarity(newCase.getDensity(), baseCase.getDensity(), 0.99, 1.0);
        calc += weight.getPh() * calculateAttributeSimilarity(newCase.getPh(), baseCase.getPh(), 2.74, 4.01);
        calc += weight.getSulphates() * calculateAttributeSimilarity(newCase.getSulphates(), baseCase.getSulphates(), 0.33, 2.0);
        calc += weight.getAlcohol() * calculateAttributeSimilarity(newCase.getAlcohol(), baseCase.getAlcohol(), 8.4, 14.9);

        return new CaseSimilarity(baseCase, calc / weight.getTotal());
    }
    
    private double calculateAttributeSimilarity(double newCaseAttributeValue,
                double baseCaseAttributeValue, double maxValue, double minValue)
    {
        return 1.0 - Math.abs(baseCaseAttributeValue - newCaseAttributeValue) / (maxValue - minValue);
    }
    
}
