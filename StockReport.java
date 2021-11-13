package com.Bridgelabz.ObjectOrientedPrograms;
import StockModel.Stock;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StockReport {
    Scanner scanner = new Scanner(System.in);
    public void createStockAccount(HashMap<String, HashMap<String, Long>> accountList) {
        System.out.println("Enter a account name: ");
        String accountHolderName = scanner.next();
        if (accountList.containsKey(accountHolderName)) {
            System.out.println("Account exists.");
        } else {

            HashMap<String, Long> accountHolderInfo = new HashMap<String, Long>();     // "accountHolderInfo" contains a particular account holder info

            accountList.put(accountHolderName, new HashMap<String, Long>());
            System.out.println("Account created.");
        }
    }