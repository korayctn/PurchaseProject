/*
    Codded by Koray Çetin for a homework requested by MIS131 instructors

*/

package com.company;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        // variables

        String nameofProduct;
        double priceofProduct = 0;
        int  numberofProduct;
        int promotionType;
        int isLuxury;



        double totalPaymentFirst = 0; // without discounts and before VAT
        double totalDiscountFirst = 0; // before VAT
        double totalDiscountPro1 = 0;
        double totalDiscountPro2 = 0;
        double totalNetNoVAT = 0;  // after discounts
        double totalVAT = 0; // after discounts
        double totalNormalVAT = 0;
        double totalLuxuryVAT = 0;
        double overallTotal = 0;



        // calculation and input part

        System.out.println("Please enter the values line by line as follows:\nname - price - number of purchases - promotion type ( 0 for no promotion 1 or 2 for promotion ) - luxury or not ( 1 for luxury 0 for normal) \nEach item should be seperated by spaces.\nEnter negative value for price to quit program.");

        while (priceofProduct >= 0){

            // getting inputs from the user
            System.out.print("New purchase :");
            nameofProduct = input.next();
            priceofProduct = input.nextDouble();
            numberofProduct = input.nextInt();
            promotionType = input.nextInt();
            isLuxury = input.nextInt();

            double tpriceofProduct = (priceofProduct * numberofProduct);
            double tdiscountofProduct;
            double tvatofProduct;

            // wrong input conditions
            if (priceofProduct < 0){
                System.out.println("Program is closing.");
            }
            else{

                if (!(numberofProduct >= 1)){
                    System.out.println("Number of purchase must be equal to or greater than 1 ");
                }
                else{
                    if( !(promotionType <= 2 && promotionType >= 0)){
                        System.out.println("Promotion type must be 0 , 1 or 2.");
                    }
                    else{
                        if(!(isLuxury == 0 || isLuxury == 1)){
                            System.out.println("Luxury type must be 0 or 1.");
                        }

                        // main calculation (correct input condition)
                        else{
                            totalPaymentFirst += tpriceofProduct ; // total payment without discounts and VAT
                            if (promotionType == 0) {

                                totalNetNoVAT += tpriceofProduct;

                                if (isLuxury == 0){ //normal good VAT

                                    tvatofProduct = tpriceofProduct * 0.08 ;

                                    totalNormalVAT += tvatofProduct;

                                    totalVAT += tvatofProduct;

                                    tpriceofProduct = tpriceofProduct * 1.08;

                                    overallTotal += tpriceofProduct;
                                }

                                else if (isLuxury == 1){ // luxury good VAT

                                    tvatofProduct = tpriceofProduct * 0.18 ;

                                    totalLuxuryVAT+= tvatofProduct;

                                    totalVAT += tvatofProduct;

                                    tpriceofProduct = tpriceofProduct * 1.18;

                                    overallTotal += tpriceofProduct;

                                }

                            }
                            else if ( promotionType == 1 ){

                                if ( tpriceofProduct > 40){

                                    tdiscountofProduct = (tpriceofProduct - 40) * 0.05; // one product discount

                                    totalDiscountFirst += tdiscountofProduct;

                                    totalDiscountPro1 += tdiscountofProduct;

                                    tpriceofProduct = tpriceofProduct - tdiscountofProduct;

                                    totalNetNoVAT += tpriceofProduct;

                                    if (isLuxury == 0){ //normal good VAT

                                        tvatofProduct = tpriceofProduct * 0.08 ;

                                        totalNormalVAT += tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.08;

                                        overallTotal += tpriceofProduct;
                                    }

                                    else if (isLuxury == 1){ // luxury good VAT

                                        tvatofProduct = tpriceofProduct * 0.18 ;

                                        totalLuxuryVAT+= tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.18;

                                        overallTotal += tpriceofProduct;

                                    }
                                }


                                else { // price is less than 40 condition

                                    totalNetNoVAT += tpriceofProduct;

                                    if (isLuxury == 0){ //normal good VAT

                                        tvatofProduct = tpriceofProduct * 0.08 ;

                                        totalNormalVAT += tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.08;

                                        overallTotal += tpriceofProduct;
                                    }

                                    else if (isLuxury == 1){ // luxury good VAT

                                        tvatofProduct = tpriceofProduct * 0.18 ;

                                        totalLuxuryVAT+= tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.18;

                                        overallTotal += tpriceofProduct;

                                    }
                                }

                            }



                            else if ( promotionType == 2){

                                if (numberofProduct >= 2 ){


                                    tdiscountofProduct = numberofProduct / 2 * priceofProduct / 2 ; // one product discount

                                    totalDiscountFirst += tdiscountofProduct;

                                    totalDiscountPro2 += tdiscountofProduct;

                                    tpriceofProduct = tpriceofProduct - tdiscountofProduct;

                                    totalNetNoVAT += tpriceofProduct;

                                    if (isLuxury == 0){ //normal good VAT

                                        tvatofProduct = tpriceofProduct * 0.08 ;

                                        totalNormalVAT += tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.08;

                                        overallTotal += tpriceofProduct;
                                    }

                                    else if (isLuxury == 1){ // luxury good VAT

                                        tvatofProduct = tpriceofProduct * 0.18 ;

                                        totalLuxuryVAT+= tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.18;

                                        overallTotal += tpriceofProduct;

                                    }
                                }
                                else{
                                    totalNetNoVAT += tpriceofProduct;

                                    if (isLuxury == 0){ //normal good VAT

                                        tvatofProduct = tpriceofProduct * 0.08 ;

                                        totalNormalVAT += tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.08;

                                        overallTotal += tpriceofProduct;
                                    }

                                    else if (isLuxury == 1){ // luxury good VAT

                                        tvatofProduct = tpriceofProduct * 0.18 ;

                                        totalLuxuryVAT+= tvatofProduct;

                                        totalVAT += tvatofProduct;

                                        tpriceofProduct = tpriceofProduct * 1.18;

                                        overallTotal += tpriceofProduct;

                                    }
                                }

                            }
                        }
                    }
                }
            }

        }
        System.out.println("Total payment without discounts and before VAT : "+ totalPaymentFirst);
        System.out.println("Total discount made (before VAT is computed) : "+ totalDiscountFirst);
        System.out.println("Total discount made for promotion type 1 : " + totalDiscountPro1);
        System.out.println("Total discount made for promotion type 2  : "+ totalDiscountPro2);
        System.out.println("Total net payments after discounts without VAT : "+ totalNetNoVAT);
        System.out.println("Total value added tax paid : "+ totalVAT);
        System.out.println("Total VAT paid for normal items : "+ totalNormalVAT);
        System.out.println("Total VAT paid for luxury items : "+ totalLuxuryVAT);
        System.out.println("Total payment including VAT : "+ overallTotal);

    }

}
