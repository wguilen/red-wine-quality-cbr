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
        double nearestNeighboorCalc = 0.0;
        nearestNeighboorCalc += weight.getFixedAcidity() * calculateAttributeSimilarity(baseCase.getFixedAcidity(), newCase.getFixedAcidity(), 4.6, 15.9);
        nearestNeighboorCalc += weight.getVolatileAcidity() * calculateAttributeSimilarity(baseCase.getVolatileAcidity(), newCase.getVolatileAcidity(), 0.12, 1.58);
        nearestNeighboorCalc += weight.getCitricAcid() * calculateAttributeSimilarity(baseCase.getCitricAcid(), newCase.getCitricAcid(), 0.0, 1.0);
        nearestNeighboorCalc += weight.getResidualSugar() * calculateAttributeSimilarity(baseCase.getResidualSugar(), newCase.getResidualSugar(), 0.9, 13.9);
        nearestNeighboorCalc += weight.getChlorides() * calculateAttributeSimilarity(baseCase.getChlorides(), newCase.getChlorides(), 0.012, 0.611);
        nearestNeighboorCalc += weight.getFreeSulfurDioxide() * calculateAttributeSimilarity(baseCase.getFreeSulfurDioxide(), newCase.getFreeSulfurDioxide(), 1.0, 72.0);
        nearestNeighboorCalc += weight.getTotalSulfurDioxide() * calculateAttributeSimilarity(baseCase.getTotalSulfurDioxide(), newCase.getTotalSulfurDioxide(), 6.0, 289.0);
        nearestNeighboorCalc += weight.getDensity() * calculateAttributeSimilarity(baseCase.getDensity(), newCase.getDensity(), 0.99, 1.0);
        nearestNeighboorCalc += weight.getPh() * calculateAttributeSimilarity(baseCase.getPh(), newCase.getPh(), 2.74, 4.01);
        nearestNeighboorCalc += weight.getSulphates() * calculateAttributeSimilarity(baseCase.getSulphates(), newCase.getSulphates(), 0.33, 2.0);
        nearestNeighboorCalc += weight.getAlcohol() * calculateAttributeSimilarity(baseCase.getAlcohol(), newCase.getAlcohol(), 8.4, 14.9);
        
        return new CaseSimilarity(baseCase, nearestNeighboorCalc / weight.getTotal());
    }
    
    private double calculateAttributeSimilarity(double baseCaseAttributeValue, double newCaseAttributeValue, 
            double minValue, double maxValue)
    {
        return 1.0 - Math.abs(baseCaseAttributeValue - newCaseAttributeValue) / (maxValue - minValue);
    }
    
}
