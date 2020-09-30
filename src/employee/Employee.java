package employee;

public class Employee {
  
    private String Employee_Name;
    private int Type;
    private double Rate;
    private int Hours;
    
    public Employee() {
        Employee_Name = "";
        Type = 0;
        Rate = 0;
        Hours = 0;
    }
    public String getTypeRules() {
        return "1 or 2";
    }
    
    public String getNameRules() {
        return "non-blank";
    }
    
    public String getHourRules() {
        return "between 1 and 60";
    }
    
    public String getRateRules() {
        return "between 6.75 and 30.50";
    }
    
    public boolean setType(int type) {
        boolean typeOK = type == 1 || type == 2;
        if(typeOK) {
            Type = type;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setName(String nm) {
        boolean nameOK = nm.length() > 0 && !(nm.equals(""));
        if(nameOK) {
            Employee_Name = nm;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setRate(double rt) {
        boolean rateOK = rt >= 6.75 && rt<= 30.50;
        
        if(rateOK) {
            Rate = rt;
            return true;
        }else{
            return false;
        }
    }
    
    public boolean setHours(int h) {
        boolean hoursOK = h >= 1 && h <= 60;
        if(hoursOK) {
            Hours = h;
            return hoursOK;
        }else{
            return false;
        }
    }
    
    public String getName() {
        return Employee_Name;
    }
    
    public double getPay() {
        boolean overtime = Type == 1 && Hours > 40;
        double pay;
        if(overtime) {
            pay = (Hours-40) * (Rate * 2) + 40 * Rate;
        }else{
            pay = Hours * Rate;
        }
        return pay;
    }
}
