/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesprediction;

import java.text.DecimalFormat;

/**
 *
  * @author Shanell A Spann
 * Course: IT-DEV 140  Programming with JAVA
 * Assignment 2
 * Date:  09/26/2020
 * 
 * Description:  This assignment is to complete programming challenges in the
 * Chapter #2 book of "Starting with JAVA, From Control Structures through Objects".
 * ISBN-13 # 978-0-13-480221-3. This program is Programming Challenge # 5: 
 * Sales Prediction. We are to calculate 62% of total sales. A company has earned 
 * a total $4.6 million in sales.
 */
public class sales {
    double annualSales = 4600000.00;
    double percent = 0.62;
    double salesGenerated;
    DecimalFormat df = new DecimalFormat("0,000,000.00"); 
    // the above line will add commas & double decimals to my numbers. 
    
    public void assignmentInfo()
    {
       System.out.println("\t ♥ Chapter 2 - Programming Challenge #5: Sales Prediction ♥ \n");
    }
    
    public void salesInfo()
    {
        System.out.println("Company Sales = $4.6 million dollars");
        System.out.println("The East Coast division is predicted to generate 62% of sales.");   
    }
    
    public void totalSalesGenerated()
    {
        salesGenerated = annualSales * percent;
        System.out.println("Total East Coast Sales = $" + df.format(salesGenerated));
    }   
}
