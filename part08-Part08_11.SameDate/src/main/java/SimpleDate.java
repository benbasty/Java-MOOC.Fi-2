
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }

        if (this.year == other.year
                && this.month < other.month) {
            return true;
        }

        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }
    
    @Override
    public boolean equals(Object object){
        if(this == object){ //if variables are located in the same place=>same
            return true;
        }
        if(!(object instanceof SimpleDate)){ //if object is not a type of SimpleDate=>not same
            return false;
        }
        
        SimpleDate simpleDate = (SimpleDate) object; //convert object to a SimpleDate object
        
        //if instance variables of the objects are the same, => same objects
        if (this.day == simpleDate.day &&
            this.month == simpleDate.month &&
            this.year == simpleDate.year) {
            return true;
        }
        return false;
    }

}
