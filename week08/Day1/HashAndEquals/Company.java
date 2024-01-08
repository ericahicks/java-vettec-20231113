package Day1.HashAndEquals;

/*
 * What is a Hash?
 * 
 * We calculate the hash to determine what bucket number the data should go into 
 * Ideally, this is a unique number and we can keep the data in smaller parts
 * 
 * Think of the hash as a "bucket" containing all the values with that hash
 * 
 * Hash should be deterministic
 * Based on the values that it's provided, should get back the exact same hash if values are the same
 * 
 * If values are differnt, should return different hashcodes
 * 
 * Bad hashing can lead to many collisions which will affect your programs performance
 * 
 * Mulitple "collisions" will result in many elements located in the same bucket, which make our read times much slower
 * Additionally, our data is all in one spot, which can be potentially bad
 * 
 * When you override hashcode you should ALWAYS override the equals() too, and vice versa
 * The reason is because we need the ability to determine if our object is in that "bucket"
 * 
 * hashCode() and equals() contract
 *  - if two bjects
 * 
 */


public class Company {
    private String name;
    private int numWorkers;
    private String taxId;

    public Company() { }

    public Company(String name, int numWorkers, String taxId) {
        this.name = name;
        this.numWorkers = numWorkers;
        this.taxId = taxId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumWorkers() {
        return numWorkers;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    @Override
    public String toString() {
        return "Company [name=" + name + ", numWorkers=" + numWorkers + ", taxId=" + taxId + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + numWorkers;
        result = prime * result + ((taxId == null) ? 0 : taxId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Company other = (Company) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (numWorkers != other.numWorkers)
            return false;
        if (taxId == null) {
            if (other.taxId != null)
                return false;
        } else if (!taxId.equals(other.taxId))
            return false;
        return true;
    }

    

    
}
