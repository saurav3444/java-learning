package com.sapient.java;

public class TicToc implements Runnable {

    private static Object object = new Object();
    private String name; 
 
    public TicToc(String name) {
    	
    	this.name = name;
    }
    

    public void run(){
    	
        for(int i=0; i<10; i++){
        	
            synchronized (object) {
            	
                System.out.print(name);
                
                if(name=="Tic")
                	System.out.print("-");
                else
                	System.out.println();
         	
                object.notify();
         
                try {
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
    
    public static void main(String[] args) {
    	
		TicToc tic = new TicToc("Tic");
		Thread ticThread = new Thread(tic); 
		
		TicToc toc = new TicToc("Toc");
		Thread tocThread = new Thread(toc); 
		
		ticThread.start();
		tocThread.start();
		
	}
}