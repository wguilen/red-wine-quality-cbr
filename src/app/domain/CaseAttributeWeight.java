package app.domain;

import app.util.NumberUtil;

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
        this.fixedAcidity = NumberUtil.toDouble(fixedAcidity, 2);
    }

    public double getVolatileAcidity() 
    {
        return volatileAcidity;
    }

    public void setVolatileAcidity(double volatileAcidity) 
    {
        this.volatileAcidity = NumberUtil.toDouble(volatileAcidity, 2);
    }

    public double getCitricAcid() 
    {
        return citricAcid;
    }

    public void setCitricAcid(double citricAcid) 
    {
        this.citricAcid = NumberUtil.toDouble(citricAcid, 2);
    }

    public double getResidualSugar() 
    {
        return residualSugar;
    }

    public void setResidualSugar(double residualSugar) 
    {
        this.residualSugar = NumberUtil.toDouble(residualSugar, 2);
    }

    public double getChlorides() 
    {
        return chlorides;
    }

    public void setChlorides(double chlorides) 
    {
        this.chlorides = NumberUtil.toDouble(chlorides, 2);
    }

    public double getFreeSulfurDioxide() 
    {
        return freeSulfurDioxide;
    }

    public void setFreeSulfurDioxide(double freeSulfurDioxide) 
    {
        this.freeSulfurDioxide = NumberUtil.toDouble(freeSulfurDioxide, 2);
    }

    public double getTotalSulfurDioxide() 
    {
        return totalSulfurDioxide;
    }

    public void setTotalSulfurDioxide(double totalSulfurDioxide) 
    {
        this.totalSulfurDioxide = NumberUtil.toDouble(totalSulfurDioxide, 2);
    }

    public double getDensity() 
    {
        return density;
    }

    public void setDensity(double density) 
    {
        this.density = NumberUtil.toDouble(density, 2);
    }

    public double getPh() 
    {
        return ph;
    }

    public void setPh(double ph) 
    {
        this.ph = NumberUtil.toDouble(ph, 2);
    }

    public double getSulphates() 
    {
        return sulphates;
    }

    public void setSulphates(double sulphates) 
    {
        this.sulphates = NumberUtil.toDouble(sulphates, 2);
    }

    public double getAlcohol() 
    {
        return alcohol;
    }

    public void setAlcohol(double alcohol) 
    {
        this.alcohol = NumberUtil.toDouble(alcohol, 2);
    }
    
    public double getTotal()
    {
        return getAlcohol() + getChlorides() + getCitricAcid() + getDensity() + getFixedAcidity() +
                getFreeSulfurDioxide() + getPh() + getResidualSugar() + getSulphates() + getTotalSulfurDioxide() +
                getVolatileAcidity();
    }

    @Override
    public String toString() 
    {
        return "CaseAttributeWeight{" + "fixedAcidity=" + fixedAcidity + ", volatileAcidity=" + volatileAcidity + ", citricAcid=" + citricAcid + ", residualSugar=" 
                    + residualSugar + ", chlorides=" + chlorides + ", freeSulfurDioxide=" + freeSulfurDioxide + ", totalSulfurDioxide=" + totalSulfurDioxide + ", density=" 
                    + density + ", ph=" + ph + ", sulphates=" + sulphates + ", alcohol=" + alcohol + '}';
    }
    
}
