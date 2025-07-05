import java.util.Scanner;

public class TransactionRecord {

    //  Private fields for encapsulation
    private String buyerTIN;
    private String sellerTIN;
    private double invoiceAmount;
    private String timestamp;

    //  Constructor
    public TransactionRecord(String buyerTIN, String sellerTIN, double invoiceAmount, String timestamp) {
        this.buyerTIN = buyerTIN;
        this.sellerTIN = sellerTIN;
        this.invoiceAmount = invoiceAmount;
        this.timestamp = timestamp;
    }

    //  Getter and Setter methods

    public String getBuyerTIN() {
        return buyerTIN;
    }

    public void setBuyerTIN(String buyerTIN) {
        this.buyerTIN = buyerTIN;
    }

    public String getSellerTIN() {
        return sellerTIN;
    }

    public void setSellerTIN(String sellerTIN) {
        this.sellerTIN = sellerTIN;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        if (invoiceAmount >= 0) {
            this.invoiceAmount = invoiceAmount;
        } else {
            System.out.println("Invalid amount. Must be non-negative.");
        }
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    //  Main method for testing
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //  Input transaction data
        System.out.print("Enter Buyer TIN: ");
        String buyerTIN = scanner.nextLine();

        System.out.print("Enter Seller TIN: ");
        String sellerTIN = scanner.nextLine();

        System.out.print("Enter Invoice Amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Timestamp (e.g. 2025-07-05T14:30:00): ");
        String timestamp = scanner.nextLine();

        //  Create transaction object
        TransactionRecord record = new TransactionRecord(buyerTIN, sellerTIN, amount, timestamp);

        //  Output results
        System.out.println("\n Transaction Summary:");
        System.out.println("Buyer TIN: " + record.getBuyerTIN());
        System.out.println("Seller TIN: " + record.getSellerTIN());
        System.out.println("Amount: UGX " + record.getInvoiceAmount());
        System.out.println("Timestamp: " + record.getTimestamp());

        scanner.close();
    }
}
