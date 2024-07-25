public class AnimalNames{
 public static void main(String[] args){
	 System.out.println("AnimalName class starts");
	 
	 String[] animals= {"Elephant","Tiger","Giraffe","Dolphin","Kangaroo",
	 "Panda","Lion","Penguin","Eagle","Shark","Hippopotamus","Zebra","Koala","Cheetah","Gorilla","Octopus","Crocodile","Flamingo","Rhinoceros","Whale"};
	 
	 int totalNo = animals.length;
	 System.out.println("Total Length of index= "+totalNo );
	 
	 for(int i=0;  i < totalNo; i++){
		 String animalname= animals[i];
		 System.out.println("Animals are="+animalname);
	 }
 }
}



