package com.example.fisei;

public class Utilidades {

    public static  long multiplicar(int x,int y){
        return x*y;
    }
    public static long restar(int x,int y){
        return x-y;
    }
    public static long sumar(int x,int y){
        return x+y;
    }
    public static long factorial(int numero){
        long f=1;
        for(int i=1;i<=numero;i++){
            f*=i;
        }
        return  f;
    }

    public static long potencia(int base, int exponente){
        long p=1;
        for(int i=1;i<=exponente;i++){
            p*=base;
        }
        return p;
    }
}
