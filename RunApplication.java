/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;

import java.util.Scanner;

// Interface
interface ICricket {
    String getBatsman();
    String getStadium();
    String getScored();
}

// Abstract class
abstract class Cricket implements ICricket {
    protected String batsmanName;
    protected String stadiumName;
    protected String totalRuns;

    // Constructor
    public Cricket(String batsmanName, String stadiumName, String totalRuns) {
        this.batsmanName = batsmanName;
        this.stadiumName = stadiumName;
        this.totalRuns = totalRuns;
    }

    // Getters
    @Override
    public String getBatsman() {
        return batsmanName;
    }

    @Override
    public String getStadium() {
        return stadiumName;
    }

    @Override
    public String getScored() {
        return totalRuns;
    }

    // Abstract method to be implemented by subclass
    public abstract void printRecord();
}

// Subclass
class CricketRunsScored extends Cricket {

    // Constructor
    public CricketRunsScored(String batsmanName, String stadiumName, String totalRuns) {
        super(batsmanName, stadiumName, totalRuns);
    }

    // Implementation of printRecord
    @Override
    public void printRecord() {
        System.out.println("\nBATSMAN RUNS SCORED REPORT");
        System.out.println("Cricket player: " + getBatsman());
        System.out.println("STADIUM: " + getStadium());
        System.out.println("TOTAL RUNS SCORED: " + getScored());
    }
}

// Main application
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input
        System.out.print("Enter the cricketer's name: ");
        String batsman = scanner.nextLine();

        System.out.print("Enter the stadium name: ");
        String stadium = scanner.nextLine();

        System.out.print("Enter the total runs scored by " + batsman + " at " + stadium + ": ");
        String runs = scanner.nextLine();

        // Create object
        CricketRunsScored record = new CricketRunsScored(batsman, stadium, runs);

        // Print report
        record.printRecord();

        scanner.close();
    }
}

