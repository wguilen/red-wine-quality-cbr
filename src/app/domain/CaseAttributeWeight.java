package app.domain;

public class CaseAttributeWeight 
{

    private double fixedAcidity;
    private double volatileAcidity;
    private double citricAcid;
    private double residualSugar;
    private double chlorides;
    private double freeSulfurDioxide;
    private double totalSulfurDioxide;
    private double density;
    private double ph;
    private double sulphates;
    private double alcohol;

    public double getFixedAcidity() 
    {
        return fixedAcidity;
    }

    public void setFixedAcidity(double fixedAcidity) 
    {
        this.fixedAcidity = fixedAcidity;
    }

    public double getVolatileAcidity() 
    {
        return volatileAcidity;
    }

    public void setVolatileAcidity(double volatileAcidity) 
    {
        this.volatileAcidity = volatileAcidity;
    }

    public double getCitricAcid() 
    {
        return citricAcid;
    }

    public void setCitricAcid(double citricAcid) 
    {
        this.citricAcid = citricAcid;
    }

    public double getResidualSugar() 
    {
        return residualSugar;
    }

    public void setResidualSugar(double residualSugar) 
    {
        this.residualSugar = residualSugar;
    }

    public double getChlorides() 
    {
        return chlorides;
    }

    public void setChlorides(double chlorides) 
    {
        this.chlorides = chlorides;
    }

    public double getFreeSulfurDioxide() 
    {
        return freeSulfurDioxide;
    }

    public void setFreeSulfurDioxide(double freeSulfurDioxide) 
    {
        this.freeSulfurDioxide = freeSulfurDioxide;
    }

    public double getTotalSulfurDioxide() 
    {
        return totalSulfurDioxide;
    }

    public void setTotalSulfurDioxide(double totalSulfurDioxide) 
    {
        this.totalSulfurDioxide = totalSulfurDioxide;
    }

    public double getDensity() 
    {
        return density;
    }

    public void setDensity(double density) 
    {
        this.density = density;
    }

    public double getPh() 
    {
        return ph;
    }

    public void setPh(double ph) 
    {
        this.ph = ph;
    }

    public double getSulphates() 
    {
        return sulphates;
    }

    public void setSulphates(double sulphates) 
    {
        this.sulphates = sulphates;
    }

    public double getAlcohol() 
    {
        return alcohol;
    }

    public void setAlcohol(double alcohol) 
    {
        this.alcohol = alcohol;
    }
    
    public double getTotal()
    {
        return getAlcohol() + getChlorides() + getCitricAcid() + getDensity() + getFixedAcidity() +
                getFreeSulfurDioxide() + getPh() + getResidualSugar() + getSulphates() + getTotalSulfurDioxide() +
                getVolatileAcidity();
    }
    
}
