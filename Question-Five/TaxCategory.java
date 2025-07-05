

// Base class
class TaxCategory {
    // Method to be overridden
    public double calculateVAT(double amount) {
        return 0; // Default VAT
    }
}

// Subclass for Retailer (18% VAT)
class Retailer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.18;
    }
}

// Subclass for Wholesaler (15% VAT)
class Wholesaler extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.15;
    }
}

// Subclass for Importer (10% VAT)
class Importer extends TaxCategory {
    @Override
    public double calculateVAT(double amount) {
        return amount * 0.10;
    }
}

// Main class to demonstrate runtime polymorphism
public class VATDemo {
    public static void main(String[] args) {
        // Create an array of different taxpayer categories
        TaxCategory[] taxpayers = {
            new Retailer(),
            new Wholesaler(),
            new Importer()
        };

        double[] amounts = {100000, 200000, 300000};

        // Loop through each taxpayer and calculate VAT
        for (int i = 0; i < taxpayers.length; i++) {
            System.out.println("Transaction Amount: " + amounts[i]);
            System.out.println("VAT: " + taxpayers[i].calculateVAT(amounts[i]));
            System.out.println("---------------------------");
        }
    }
}
