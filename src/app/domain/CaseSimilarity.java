package app.domain;

public class CaseSimilarity 
{

    private Case similarCase;
    private double similarity;

    public CaseSimilarity(Case similarCase, double similarity) 
    {
        this.similarCase = similarCase;
        this.similarity = similarity;
    }

    public Case getSimilarCase() 
    {
        return similarCase;
    }

    public void setSimilarCase(Case similarCase) 
    {
        this.similarCase = similarCase;
    }

    public double getSimilarity() 
    {
        return similarity;
    }

    public void setSimilarity(double similarity) 
    {
        this.similarity = similarity;
    }
    
}