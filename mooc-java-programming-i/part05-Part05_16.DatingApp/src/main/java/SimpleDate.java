
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(day, month, year);
        newDate.advance(days);
        return newDate;
    }
    
    public void advance() {
        this.advance(1);
    }
    
    public void advance(int howManyDays) {
        int total = this.day + howManyDays;
        
        if (total > 30) {
            this.day = 0;

            if (this.month + 1 > 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
            
            this.advance(total - 30);
            
        } else {
            this.day += howManyDays;
        }   
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                 this.day < compared.day) {
            return true;
        }

        return false;
    }

}
