

public class Bank {

    String bankName;
    String branchName;
    String location;
    String country;
    String region;
    String ifscCode;
    String customerId;
    String customerName;
    String customerAddress;
    String customerPhone;
    String customerEmail;
    String accountType;
    String accountStatus;
    String openingDate;
    String nomineeName;
    String panNumber;
    String currencyType;
    String transactionId;

    int bankId;

    double balance;
    double minimumBalance;
    double interestRate;
    double loanAmount;
    double creditLimit;

    boolean creditType;
    boolean colourBlack;

    // Constructor
    public Bank(
            String bankName,
            String branchName,
            String location,
            String country,
            String region,
            String ifscCode,
            String customerId,
            String customerName,
            String customerAddress,
            String customerPhone,
            String customerEmail,
            String accountType,
            String accountStatus,
            String openingDate,
            String nomineeName,
            String panNumber,
            String currencyType,
            String transactionId,
            int bankId,
            double balance,
            double minimumBalance,
            double interestRate,
            double loanAmount,
            double creditLimit,
            boolean creditType,
            boolean colourBlack
    ) {

        this.bankName = bankName;
        this.branchName = branchName;
        this.location = location;
        this.country = country;
        this.region = region;
        this.ifscCode = ifscCode;
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.accountType = accountType;
        this.accountStatus = accountStatus;
        this.openingDate = openingDate;
        this.nomineeName = nomineeName;
        this.panNumber = panNumber;
        this.currencyType = currencyType;
        this.transactionId = transactionId;

        this.bankId = bankId;

        this.balance = balance;
        this.minimumBalance = minimumBalance;
        this.interestRate = interestRate;
        this.loanAmount = loanAmount;
        this.creditLimit = creditLimit;

        this.creditType = creditType;
        this.colourBlack = colourBlack;
    }
}