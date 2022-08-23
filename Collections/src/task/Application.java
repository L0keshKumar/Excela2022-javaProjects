package task;

import java.math.BigInteger;
import java.util.*;
import java.util.Map.Entry;

import Collectiontask.Doctor;
import Collectiontask.Patient;
import task.service.Appointment;

public class Application {

	public static void main(String[] args) {
		
		//List 
		//ListPractice();
		
		//Set
		//SetPractice();
		
		//Map
		MapPractice();
		
		
	}
	
	
	
	
	
	
	
	
	private static void MapPractice() {
		
		//HashMap can have one Null Key and many Null values
		Map<Integer, String> mMaps=new HashMap<Integer, String>();
		
		//TreeMap cannot contain Null Key but can have null value
		Map<Integer, String> tMaps=new TreeMap<>();
		mMaps.put(101, "loki");
		mMaps.put(102, "yovel");
		mMaps.put(103, "rk");
		mMaps.put(104, "korada");
		mMaps.put(null, "lochan");
		
		tMaps.put(103,null);
		tMaps.put(102, "yovel");
		tMaps.put(101, "rk");
		tMaps.put(104, null);
		tMaps.put(104, "lochan");
		
		System.out.println("Map: "+mMaps);
		System.out.println("Tree: "+tMaps);
		
		//this is used to sort by value in the map
		Comparator<Integer> valueComparator = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer k1, Integer k2)
            {
  
                int comp = mMaps.get(k1).compareTo(mMaps.get(k2));
  
                if (comp == 0)
                     return 1;
  
                else
                     return comp;
            }

			
        };
  
        // SortedMap created using the comparator
        Map<Integer, String> sorted = new TreeMap<Integer, String>(valueComparator);
  
        sorted.putAll(mMaps);
        //end of sort map
        
        
		//this method cannot used for map
		//mMaps.forEach(System.out::println);

		for (Entry<Integer, String> iterable_element : sorted.entrySet()) {
			System.out.println("Key: "+iterable_element.getKey());
			System.out.println("Value: "+iterable_element.getValue());
			
		}
	}








	private static void SetPractice() {
		
		//Set cannot be sorted but we can convert it to treeSet or List
		Set<BigInteger> Sets=new HashSet<BigInteger>();
		
		//it is a sorted set by default
		Set<BigInteger> tSets=new TreeSet<BigInteger>();
		
		Sets.add(new BigInteger("400"));
		Sets.add(new BigInteger("50"));
		Sets.add(new BigInteger("2"));
		Sets.add(new BigInteger("1"));
		Sets.add(new BigInteger("30"));
		Sets.add(new BigInteger("1"));
		
		tSets.add(new BigInteger("400"));
		tSets.add(new BigInteger("50"));
		tSets.add(new BigInteger("2"));
		tSets.add(new BigInteger("1"));
		tSets.add(new BigInteger("30"));
		tSets.add(new BigInteger("30"));
	
		//prints in random ordering (Heterogeneous)
		System.out.println("HashSet :"+Sets);
//		for (BigInteger eachInteger : Sets) {
//			System.out.println("FE="+eachInteger);
//		}
//		Sets.forEach(System.out::println);
		
		//sorted set
		System.out.println("TreeSet :"+tSets);
		
		
		//by using this we can sort the Set by default
		SortedSet<BigInteger> sSets=new TreeSet<BigInteger>();
//		sSets.add(new BigInteger("40"));
//		sSets.add(new BigInteger("05"));
//		sSets.add(new BigInteger("2"));
//		sSets.add(new BigInteger("1"));
//		sSets.add(new BigInteger("300"));
		sSets.addAll(Sets);
		System.out.println("Sorted Set: "+sSets);
		
		
		Set linkedHashSet=new LinkedHashSet<>();
		//linkedHashSet.addAll(Sets);
		linkedHashSet.add("loki");
		linkedHashSet.add(new BigInteger("123456"));
		linkedHashSet.add(23);
		System.out.println("Linked Hash Set: "+linkedHashSet);
		
		
		Set summaSet=new HashSet<>();
		summaSet.addAll(linkedHashSet);
		System.out.println("Summa set: "+summaSet);
	}








	public static void ListPractice() {
		
		List<String>mahaList=new ArrayList<>();
		mahaList.add("MahaLakshmi");
		mahaList.add("1Vishnu");
		mahaList.add("loki");
		mahaList.add("Laksa");
		
		//syso
		System.out.println("List in syso"+mahaList);
		
		//for list 
		for (String eachItem : mahaList) {
			System.out.println(eachItem);
		}
		
		//method reference
		mahaList.forEach(System.out::println);
		
		//basic sort used for only single value
		Collections.sort(mahaList);
		
		mahaList.forEach(System.out::println);
		
		//if we not use generic we can add any type
		List summaList=new ArrayList<>();
		summaList.add("maven");
		summaList.add(new BigInteger("1234567"));
		summaList.add(23);
		
		System.out.println("SummaList: "+summaList);
		
	}
}



















//		// TODO Auto-generated method stub
//		Patient patientOne=new Patient(101, "loki", "villivakkam", 85672345);
//		Patient patientTwo=new Patient(102, "rahul", "redhills", 85345345);
//		Patient patientThree=new Patient(103, "lochan", "nellor", 84562345);
//		
//		Set<Patient> patientList=new  HashSet<>();
//		patientList.add(patientOne);
//		patientList.add(patientTwo);
//		patientList.add(patientThree);
//		
//		Set<Patient> patientList2=new  HashSet<>();
//		patientList2.add(patientTwo);
//
//
//		Doctor docterOne=new Doctor(101, "lokesh", "HeartPatient", patientList);
//		Doctor docterTwo=new Doctor(102, "Rahul", "ENT", patientList);
//
////		for(Patient eachPatient:docterOne.getPatientList()) {
////			System.out.println(eachPatient);
////		}
//		
//		HashMap<Doctor,Set<Patient>>doctorList=new HashMap<Doctor,Set<Patient>>();
//		doctorList.put(docterOne,patientList);
//		doctorList.put(docterTwo, patientList2);
//		
//		Appointment appointment=new Appointment(doctorList);
//		
//		System.out.println(appointment.getPatients(docterOne));
//		System.out.println(appointment.getPatients(docterTwo));		

