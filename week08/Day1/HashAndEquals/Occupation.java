package Day1.HashAndEquals;

import java.util.Objects;

public class Occupation {
    
    private String jobTitle;
    private Company company;
    private long salary;

    public Occupation() { }

    public Occupation(String jobTitle, Company company, long salary) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Occupation [jobTitle=" + jobTitle + ", company=" + company + ", salary=" + salary + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobTitle, company, salary);
    }

    @Override
    public boolean equals(Object obj) {
        //check if two objects have the exact same place in memory, therefore they MUST have the same data 
        if (this == obj)
            return true;
        //if the other object is null, then they can't be equal, "this" must not be null
        //otherwise a NullPointerException would be thrown
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Occupation other = (Occupation) obj; //cast to Occupation data type because of the above if check
        //will return true if all of the fields in the class are equal, if not, return false
        return Objects.equals(company, other.company) && Objects.equals(jobTitle, other.jobTitle) && salary == other.salary;


        // if (jobTitle == null) {
        //     if (other.jobTitle != null)
        //         return false;
        // } else if (!jobTitle.equals(other.jobTitle))
        //     return false;
        // if (company == null) {
        //     if (other.company != null)
        //         return false;
        // } else if (!company.equals(other.company))
        //     return false;
        // if (salary != other.salary)
        //     return false;
        // return true;
    }
  
}
