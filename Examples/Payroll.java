// Class10/16/2025

import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll
{
    public static void main(String[] args)
    {
        // Constants for pay rules
        final int MAX_WORK_DAYS = 5;
        final int FTE_REGULAR_WEEK = 40;
        final int PTE_MAX_WEEK = 20;
        final double OT_MULTIPLIER = 1.5;
        final double HOLIDAY_MULTIPLIER = 2.0;
        final double PTE_RATE_FACTOR = 0.5;

        // Constants for minimum wages (as per prompt)
        final double NJ_MIN_WAGE = 15.49;
        final double FTE_MIN_RATE = 30.98;

        // Variables for rates
        double fteRate;         // Standard FTE rate (input)
        double pteRate;         // Standard PTE rate
        double otRate;          // Overtime rate
        double holidayFteRate;  // Holiday FTE rate
        double holidayPteRate;  // Holiday PTE rate

        // Variables for hours and pay
        double totalHoursWorked = 0.0;
        double totalRegularHours = 0.0;
        double totalHolidayHours = 0.0;
        double regularPay = 0.0;
        double overtimePay = 0.0;
        double holidayPay = 0.0;
        double totalGrossPay = 0.0;

        // Employee status and holiday count
        String employeeType;    // "FTE" or "PTE"
        int numHolidays;

        Scanner keyboard = new Scanner(System.in);
        DecimalFormat currency = new DecimalFormat("$#,##0.00");

        // --- 1. Get Employee and Holiday Information ---

        System.out.print("Are you entering hours for a Part-Time Employee (PTE) or a Full-Time Employee (FTE)? (Enter PTE/FTE): ");
        employeeType = keyboard.next().toUpperCase();

        System.out.print("How many days in the week were Holidays (0-5)? ");
        numHolidays = keyboard.nextInt();
        if (numHolidays < 0 || numHolidays > MAX_WORK_DAYS) {
            System.out.println("Invalid number of holidays. Assuming 0.");
            numHolidays = 0;
        }

        // --- 2. Get and Validate Standard FTE Rate ---

        System.out.print("Keyboard input the standard FTE rate per hour: ");
        fteRate = keyboard.nextDouble();

        // Enforce FTE minimum wage
        if (fteRate < FTE_MIN_RATE) {
            System.out.println("Warning: Standard FTE rate is below the minimum " + currency.format(FTE_MIN_RATE) + ". Using minimum rate.");
            fteRate = FTE_MIN_RATE;
        }

        // --- 3. Calculate All Rates ---

        holidayFteRate = fteRate * HOLIDAY_MULTIPLIER;       // Holiday FTE rate is double standard fte_rate.
        pteRate = fteRate * PTE_RATE_FACTOR;                 // PTE rate is half the FTE rate.
        holidayPteRate = holidayFteRate * PTE_RATE_FACTOR;   // Holiday pte_rate is half the Holiday fte_rate.
        otRate = fteRate * OT_MULTIPLIER;                    // OT rate is 1.5 * fte_rate.
        
        // Enforce PTE minimum wage (NJ MIN_WAGE)
        if (pteRate < NJ_MIN_WAGE) {
            System.out.println("Warning: Standard PTE rate is below the NJ minimum wage " + currency.format(NJ_MIN_WAGE) + ". Using NJ minimum rate.");
            pteRate = NJ_MIN_WAGE;
            // Recalculate holiday PTE based on the enforced standard PTE rate logic
            // The prompt logic is: Holiday FTE is 2x standard FTE. Holiday PTE is 0.5x Holiday FTE.
            // If we enforce the PTE minimum, let's stick to the prompt's explicit calculation for holiday rates from the *calculated* FTE rates.
        }

        System.out.println("\n--- Calculated Rates ---");
        System.out.println("Standard FTE Rate: " + currency.format(fteRate));
        System.out.println("Standard PTE Rate: " + currency.format(pteRate));
        System.out.println("Overtime Rate (FTE): " + currency.format(otRate));
        System.out.println("Holiday FTE Rate: " + currency.format(holidayFteRate));
        System.out.println("Holiday PTE Rate: " + currency.format(holidayPteRate));
        System.out.println("------------------------\n");

        // --- 4. Input Daily Hours (Non-Looping for up to 5 days) ---

        // The user must enter the day type and hours sequentially for up to 5 days.
        System.out.println("--- Entering Daily Hours (up to 5 days) ---");

        // Day 1
        System.out.print("Day 1 - Is this a Regular day or Holiday day? (Enter Regular/Holiday): ");
        String day1Type = keyboard.next();
        System.out.print("Day 1 - How many hours were worked? ");
        double day1Hours = keyboard.nextDouble();
        
        // Accumulate hours and pay for Day 1
        if (day1Type.equalsIgnoreCase("Holiday")) {
            totalHolidayHours += day1Hours;
        } else {
            totalRegularHours += day1Hours;
        }
        totalHoursWorked += day1Hours;

        // Day 2
        System.out.print("Day 2 - Is this a Regular day or Holiday day? (Enter Regular/Holiday): ");
        String day2Type = keyboard.next();
        System.out.print("Day 2 - How many hours were worked? ");
        double day2Hours = keyboard.nextDouble();
        
        // Accumulate hours and pay for Day 2
        if (day2Type.equalsIgnoreCase("Holiday")) {
            totalHolidayHours += day2Hours;
        } else {
            totalRegularHours += day2Hours;
        }
        totalHoursWorked += day2Hours;

        // Day 3
        System.out.print("Day 3 - Is this a Regular day or Holiday day? (Enter Regular/Holiday): ");
        String day3Type = keyboard.next();
        System.out.print("Day 3 - How many hours were worked? ");
        double day3Hours = keyboard.nextDouble();
        
        // Accumulate hours and pay for Day 3
        if (day3Type.equalsIgnoreCase("Holiday")) {
            totalHolidayHours += day3Hours;
        } else {
            totalRegularHours += day3Hours;
        }
        totalHoursWorked += day3Hours;

        // Day 4
        System.out.print("Day 4 - Is this a Regular day or Holiday day? (Enter Regular/Holiday): ");
        String day4Type = keyboard.next();
        System.out.print("Day 4 - How many hours were worked? ");
        double day4Hours = keyboard.nextDouble();
        
        // Accumulate hours and pay for Day 4
        if (day4Type.equalsIgnoreCase("Holiday")) {
            totalHolidayHours += day4Hours;
        } else {
            totalRegularHours += day4Hours;
        }
        totalHoursWorked += day4Hours;

        // Day 5
        System.out.print("Day 5 - Is this a Regular day or Holiday day? (Enter Regular/Holiday): ");
        String day5Type = keyboard.next();
        System.out.print("Day 5 - How many hours were worked? ");
        double day5Hours = keyboard.nextDouble();
        
        // Accumulate hours and pay for Day 5
        if (day5Type.equalsIgnoreCase("Holiday")) {
            totalHolidayHours += day5Hours;
        } else {
            totalRegularHours += day5Hours;
        }
        totalHoursWorked += day5Hours;
        
        System.out.println("\nTotal hours worked: " + totalHoursWorked + " (Regular: " + totalRegularHours + ", Holiday: " + totalHolidayHours + ")");
        
        // --- 5. Calculate Gross Pay Based on Employee Type ---

        if (employeeType.equals("FTE")) {
            // FTE Pay Calculation
            
            // 1. Calculate Holiday Pay (at Holiday FTE Rate)
            holidayPay = totalHolidayHours * holidayFteRate;
            
            // Remaining regular hours for standard/OT calculation
            double hoursForStandardOT = totalRegularHours;
            
            if (hoursForStandardOT > FTE_REGULAR_WEEK) {
                // Overtime calculation
                regularPay = FTE_REGULAR_WEEK * fteRate;
                overtimePay = (hoursForStandardOT - FTE_REGULAR_WEEK) * otRate;
            } else {
                // Standard pay calculation (32 <= Hours worked <= 40 fte_rate for all hours worked)
                // Note: The prompt implies a minimum 32 hours requirement, but for pay calculation, we pay for hours worked.
                regularPay = hoursForStandardOT * fteRate;
                overtimePay = 0.0;
            }
            
            // Total Gross Pay
            totalGrossPay = regularPay + overtimePay + holidayPay;

        } else if (employeeType.equals("PTE")) {
            // PTE Pay Calculation
            
            // 1. Check maximum hours (Standard PTE_WEEK has maximum 20 hours. Hence, no OT for PTE.)
            if (totalHoursWorked > PTE_MAX_WEEK) {
                // This scenario means the employee exceeded 20 hours, but the spec says "no OT for PTE"
                // and "PTE can work at most 20 hours per week." We will only pay for the first 20 hours.
                System.out.println("Warning: Part-Time Employee worked over the maximum 20 hours. Pay is calculated only up to 20 hours.");
            }

            // 2. Calculate Holiday Pay (at Holiday PTE Rate)
            holidayPay = totalHolidayHours * holidayPteRate;
            
            // 3. Calculate Regular Pay (at Standard PTE Rate)
            // Limit total hours for standard/regular calculation to PTE_MAX_WEEK (20)
            double hoursForRegularPay = Math.min(totalRegularHours, PTE_MAX_WEEK - totalHolidayHours);
            
            if (hoursForRegularPay < 0) hoursForRegularPay = 0; // Prevent negative hours if holiday hours > 20
            
            regularPay = hoursForRegularPay * pteRate;
            overtimePay = 0.0; // No overtime for PTE

            // Total Gross Pay
            totalGrossPay = regularPay + holidayPay;

        } else {
            System.out.println("Invalid employee type entered. Cannot calculate pay.");
            return;
        }

        // --- 6. Display Final Results ---

        System.out.println("\n=============================================");
        System.out.println("Employee is " + employeeType + " this week had worked " +
                           totalHoursWorked + " hours.");
        System.out.println("Gross regular pay is " + currency.format(regularPay) +
                           ", gross overtime pay is " + currency.format(overtimePay) +
                           ", gross holiday pay is " + currency.format(holidayPay) +
                           ", gross total pay is " + currency.format(totalGrossPay) + ".");
        System.out.println("=============================================");
    }
}