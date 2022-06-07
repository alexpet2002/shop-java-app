/*
    Names: ALEKSANDRA PETUKHOVA, AIKATERINI VANTARAKI
    Student Numbers: 3210229, 3210020
    Team number: 011

*/

import java.util.*;
import java.io.*;

class CreateFileProducts {
	
	public ArrayList <Sale> products = new ArrayList<Sale>();
	
	public void CreateList () {
		
			System.out.println(" >>>>>>> Create Objects (Sales) ...");
			Sale sale1 = new Sale("2001", "Monitor", "Model", "Name", "Phone", "Sale_Date");
            
            System.out.println(" >>>>>>> Add Objects (Sales) to ARRAYLIST...");

            
			
	}
	
	public void CreateFile () {
		
		System.out.println(" >>>>>>> Write data from ARRAYLIST to FILE...");
		
		FileWriter writer = null;

		try	{
			writer = new FileWriter(new File("products.txt"));
			
			writer.write(" ITEM_LIST\n {\n");
			for (Product product:products)

				if (product instanceof Motherboard) {
					writer.write ("\tITEM"+"\n\t"+"{"+"\n"+"\t\t"+"ITEM_TYPE Motherboard "+"\n"+"\t\t"+"Model Name "+ product.getModelName()
                                    + "\n\t"+"\t"+"MODEL_YEAR "+ product.getModelYear()
                                    + "\n\t"+"\t"+"MANUFACTURER "	+ product.getModelManufacturer()
                                    + "\n\t"+"\t"+"PRICE "	+ product.getModelPrice()
                                    + "\n\t"+"\t"+"PROCESSOR_TYPE " + ((Motherboard)product).getProcessorType()
                                    + "\n\t"+"\t"+"MEMORY_TYPE " + ((Motherboard)product).getMemoryType()
                                    + "\n\t"+"\t"+"NUMBER_OF_SATA_TYPE " + ((Motherboard)product).getNumOfPortsSataType()
                                    + "\n\t"+"}"+"\n");
				}//Motherboard
				else if (product instanceof Cpu) {
                    writer.write ("\tITEM"+"\n\t"+"{"+"\n"+"\t\t"+"Product Cpu "+"\n"+"\t\t"+"Model Name "+ product.getModelName()
                                    + "\n\t"+"\t"+"MODEL_YEAR "+ product.getModelYear()
                                    + "\n\t"+"\t"+"MANUFACTURER "	+ product.getModelManufacturer()
                                    + "\n\t"+"\t"+"PRICE "	+ product.getModelPrice()
                                    + "\n\t"+"\t"+"CPU_SPEED " + ((Cpu)product).getCpuSpeed()
                                    + "\n\t"+"\t"+"NUMBER_OF_CORES " + ((Cpu)product).getNumOfCores()
                                    + "\n\t"+"\t"+"CPU_GRAPHICS " + ((Cpu)product).isCpuGraphics()
                                    + "\n\t"+"}"+"\n");


				}//Cpu
				writer.write(" }");
				writer.close();
				
			}//try
			
			catch (IOException e) {
				System.err.println("Error writing file.");
			}
	}
	
	public void PrintFile(){
		
		try{
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("products.txt")));
			String line = reader.readLine();
			while (line!=null){
				System.out.println(line);
				line = reader.readLine();
			}//dvd
			reader.close();
				
		}//try
			
		catch (IOException e) {
			System.err.println("Error writing file.");
		}	
	} // PrintFile			
				
	
	public static void main(String[] args) {
		CreateFileProducts app = new CreateFileProducts();
		app.CreateList();
        app.CreateFile();
		app.PrintFile();
	}//main
	
}



