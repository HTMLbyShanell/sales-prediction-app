/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salesprediction;

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
 * 
 */
public class SalesPrediction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        sales s = new sales();
        s.assignmentInfo();
        s.salesInfo();
        s.totalSalesGenerated();
    }   
}
