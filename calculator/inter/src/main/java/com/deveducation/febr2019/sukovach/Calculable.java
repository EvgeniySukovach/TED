package com.deveducation.febr2019.sukovach;

public interface  Calculable {

   double addition(double a, double b);

   double subtraction(double a, double b);

   double multiplication(double a, double b);

   double division(double a, double b) throws ArithmeticException;

   double sqrt(double a) throws ArithmeticException;

   double reverse(double a);

   //double deleteLastDigit(double a);
   String deleteLastDigit(double a);

}

