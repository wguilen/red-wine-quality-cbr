package app.domain;

public class Case 
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
    private int quality;
    
    public Case() {}
    
    public Case(double fixedAcidity, double volatileAcidity, double citricAcid, double residualSugar, 
            double chlorides, double freeSulfurDioxide, double totalSulfurDioxide, double density, double ph, double sulphates, double alcohol, int quality) 
    {
        setFixedAcidity(fixedAcidity);
        setVolatileAcidity(volatileAcidity);
        setCitricAcid(citricAcid);
        setResidualSugar(residualSugar);
        setChlorides(chlorides);
        setFreeSulfurDioxide(freeSulfurDioxide);
        setTotalSulfurDioxide(totalSulfurDioxide);
        setDensity(density);
        setPh(ph);
        setSulphates(sulphates);
        setAlcohol(alcohol);
        setQuality(quality);
    }
    
    public double getFixedAcidity() 
    {
        return fixedAcidity;
    }

    public void setFixedAcidity(double fixedAcidity)
    {
        if (fixedAcidity >= 4.6 && fixedAcidity <= 15.9)
        {
            this.fixedAcidity = fixedAcidity;
        }
    }

    public double getVolatileAcidity() 
    {
        return volatileAcidity;
    }

    public void setVolatileAcidity(double volatileAcidity) 
    {
        if (volatileAcidity >= 0.12 && volatileAcidity <= 1.58)
        {
            this.volatileAcidity = volatileAcidity;
        }
    }

    public double getCitricAcid() 
    {
        return citricAcid;
    }

    public void setCitricAcid(double citricAcid) 
    {
        if (citricAcid >= 0 && citricAcid <= 1)
        {
            this.citricAcid = citricAcid;
        }
    }

    public double getResidualSugar() 
    {
        return residualSugar;
    }

    public void setResidualSugar(double residualSugar) 
    {
        if (residualSugar >= 0.9 && residualSugar <= 13.9)
        {
            this.residualSugar = residualSugar;
        }
    }

    public double getChlorides()
    {
        return chlorides;
    }

    public void setChlorides(double chlorides)
    {
        if (chlorides >= 0.012 && chlorides <= 0.611)
        {
            this.chlorides = chlorides;
        }
    }

    public double getFreeSulfurDioxide() 
    {
        return freeSulfurDioxide;
    }

    public void setFreeSulfurDioxide(double freeSulfurDioxide)
    {
        if (freeSulfurDioxide >= 1 && freeSulfurDioxide <= 72)
        {
            this.freeSulfurDioxide = freeSulfurDioxide;
        }
    }

    public double getTotalSulfurDioxide() 
    {
        return totalSulfurDioxide;
    }

    public void setTotalSulfurDioxide(double totalSulfurDioxide)
    {
        if (totalSulfurDioxide >= 6 && totalSulfurDioxide <= 289)
        {
            this.totalSulfurDioxide = totalSulfurDioxide;
        }
    }

    public double getDensity()
    {
        return density;
    }

    public void setDensity(double density) 
    {
        if (density >= 0.99 && density <= 1)
        {
            this.density = density;
        }
    }

    public double getPh() 
    {
        return ph;
    }

    public void setPh(double ph) 
    {
        if (ph >= 2.74 && ph <= 4.01)
        {
            this.ph = ph;
        }
    }

    public double getSulphates() 
    {
        return sulphates;
    }

    public void setSulphates(double sulphates)
    {
        if (sulphates >= 0.33 && sulphates <= 2)
        {
            this.sulphates = sulphates;
        }
    }

    public double getAlcohol() 
    {
        return alcohol;
    }

    public void setAlcohol(double alcohol)
    {
        if (alcohol >= 8.4 && alcohol <= 14.9)
        {
            this.alcohol = alcohol;
        }
    }

    public int getQuality() 
    {
        return quality;
    }

    public void setQuality(int quality) 
    {
        if (quality >= 3 && quality <= 8)
        {
            this.quality = quality;
        }
    }
    
}