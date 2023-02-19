package testpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//import org.apache.poi.util.SystemOutLogger;

public class Collections {

	public static void main(String[] args) {
		

		System.out.println("=================================Individual Variables==========================");
		
		String employeeName1 = "Lakshmi";
		int empId1 = 1;
		
		System.out.println(employeeName1 +"  "+empId1);
		
		String employeeName2 = "Sunil";
		int empId2 = 2;
		
		String employeeName3 = "Anjali";
		int empId3 = 3;
		
		
		System.out.println("=================================Arrays==========================");
		
		String [] employeeNames = new String [3];
		employeeNames[0] = "Lakshmi";
		employeeNames[1] = "Sunil";
		employeeNames[2] = "Anjali";
		
		int [] employeeIds = new int [3];
		employeeIds[0] = 1;
		employeeIds[1] = 2;
		employeeIds[2] = 3;
		
		// int [] employeeIds2 = {1,2,3};

		System.out.println(employeeNames[0] +"  "+employeeIds[0]);
		System.out.println("Length : "+employeeIds.length);

		System.out.println("=================================Collections==========================");
		//List , Set and Map		
		
		
		//List - ArrayList, LinkedList ==> size is not fixed
		//ArrayList ==> Insertion Order , Allow Duplicates
		
		System.out.println("=================================List - ArrayList==========================");
		List<String> employeeNamesList = new ArrayList<String>();
		employeeNamesList.add("Lakshmi");
		employeeNamesList.add("Sunil");
		employeeNamesList.add("Anjali");
		employeeNamesList.add("Siddartha");
		

		employeeNamesList.add("Lakshmi");
		employeeNamesList.add(2,"ABC");
		employeeNamesList.remove(2);
		
		System.out.println(employeeNamesList);
		System.out.println("Size : "+employeeNamesList.size());

		List<Integer> employeeidsList = new ArrayList<Integer>();
		employeeidsList.add(1);
		employeeidsList.add(2);
		employeeidsList.add(3);
		employeeidsList.add(4);
		employeeidsList.add(1);
		System.out.println(employeeidsList);
		
		//LinkedList ==> Insertion Order , Allow Duplicates
		
		System.out.println("=================================List - LinkedList==========================");
		List<String> employeeNamesLinkList = new LinkedList<String>();
		employeeNamesLinkList.add("Lakshmi");
		employeeNamesLinkList.add("Sunil");
		employeeNamesLinkList.add("Anjali");
		employeeNamesLinkList.add("Siddartha");
		employeeNamesLinkList.add("Lakshmi");
		
		System.out.println(employeeNamesLinkList);
		System.out.println("Size : "+employeeNamesLinkList.size());

		List<Integer> employeeIdsLinkList = new LinkedList<Integer>();
		employeeIdsLinkList.add(1);
		employeeIdsLinkList.add(2);
		employeeIdsLinkList.add(3);
		employeeIdsLinkList.add(4);
		employeeIdsLinkList.add(1);
		System.out.println(employeeIdsLinkList);

		// Set - HashSet, LinkedHashSet ,TreeSet ==> Not Allow Duplicate Values
		// HashSet ==> If it's a string it is going to store it in random order, if it's a number then follow ascending order

		System.out.println("=================================Set - HashSet==========================");
		Set<String> employeeNamesSet = new HashSet<String>();
		employeeNamesSet.add("Lakshmi");
		employeeNamesSet.add("Sunil");
		employeeNamesSet.add("Aadhi");
		employeeNamesSet.add("Anjali");
		employeeNamesSet.add("Siddartha");
		employeeNamesSet.add("Lakshmi");

		System.out.println(employeeNamesSet);
		System.out.println("Size : " + employeeNamesSet.size());

		Set<Integer> employeeidsSet = new HashSet<Integer>();
		employeeidsSet.add(1);
		employeeidsSet.add(2);
		employeeidsSet.add(5);
		employeeidsSet.add(3);
		employeeidsSet.add(4);
		employeeidsSet.add(1);
		System.out.println(employeeidsSet);
		
		// LinkedHashSet ==> Insertion order		

		System.out.println("=================================Set - LinkedHashSet==========================");
		Set<String> employeeNamesLinkSet = new LinkedHashSet<String>();
		employeeNamesLinkSet.add("Lakshmi");
		employeeNamesLinkSet.add("Sunil");
		employeeNamesLinkSet.add("Aadhi");
		employeeNamesLinkSet.add("Anjali");
		employeeNamesLinkSet.add("Siddartha");
		employeeNamesLinkSet.add("Lakshmi");

		System.out.println(employeeNamesLinkSet);
		System.out.println("Size : " + employeeNamesLinkSet.size());

		Set<Integer> employeeidsLinkSet = new LinkedHashSet<Integer>();
		employeeidsLinkSet.add(1);
		employeeidsLinkSet.add(2);
		employeeidsLinkSet.add(5);
		employeeidsLinkSet.add(3);
		employeeidsLinkSet.add(4);
		employeeidsLinkSet.add(1);
		System.out.println(employeeidsLinkSet);

		// TreeSet ==> Aphabetical Order for Text , Ascending order for numeric values
		
		System.out.println("=================================Set - TreeSet==========================");
		Set<String> employeeNamesTreeSet = new TreeSet<String>();
		employeeNamesTreeSet.add("Lakshmi");
		employeeNamesTreeSet.add("Sunil");
		employeeNamesTreeSet.add("Aadhi");
		employeeNamesTreeSet.add("Anjali");
		employeeNamesTreeSet.add("Siddartha");
		employeeNamesTreeSet.add("Lakshmi");

		System.out.println(employeeNamesTreeSet);
		System.out.println("Size : " + employeeNamesTreeSet.size());

		Set<Integer> employeeidsTreeSet = new TreeSet<Integer>();
		employeeidsTreeSet.add(1);
		employeeidsTreeSet.add(2);
		employeeidsTreeSet.add(5);
		employeeidsTreeSet.add(3);
		employeeidsTreeSet.add(4);
		employeeidsTreeSet.add(1);
		System.out.println(employeeidsTreeSet);
		
		// Map ==> HashMap, LinkedHashMap, TreeMap and HashTable
		//HashMap ==> Random Order of Keys , Duplicate Values are allowed but duplicate Keys are not allowed
		//Null keys are allowed and null values also allowed
		System.out.println("=================================Map - HashMap==========================");
		Map<String,Integer> employeeDetails = new HashMap<String,Integer>();
		employeeDetails.put("Lakshmi",1);
		employeeDetails.put("Sunil",2);
		employeeDetails.put("Aadhi",5);
		employeeDetails.put("Anjali",3);
		employeeDetails.put("Siddartha",3);
		employeeDetails.put("Lakshmi",6);
		employeeDetails.put("Suresh",null);
		employeeDetails.put(null,1000);

		System.out.println(employeeDetails);
		System.out.println("Size : " + employeeDetails.size());
		
		// LinkedHashMap ==> Insertion Order of Keys , Duplicate Values are allowed 
		// but duplicate Keys are not allowed
		// Null keys are allowed and null values also allowed
		System.out.println("=================================Map - LinkedHashMap==========================");
		Map<String, Integer> employeeDetailsLink = new LinkedHashMap<String, Integer>();
		employeeDetailsLink.put("Lakshmi", 1);
		employeeDetailsLink.put("Sunil", 2);
		employeeDetailsLink.put("Aadhi", 5);
		employeeDetailsLink.put("Anjali", 3);
		employeeDetailsLink.put("Siddartha", 3);
		employeeDetailsLink.put("Lakshmi", 6);
		employeeDetailsLink.put("Suresh", null);
		employeeDetailsLink.put(null, 1000);

		System.out.println(employeeDetailsLink);
		System.out.println("Size : " + employeeDetailsLink.size());
		
		// TreeMap ==> Alphabetical Order/Ascending of Keys , Duplicate Values are allowed 
		// but duplicate Keys are not allowed
		// Null keys are not allowed but null values are allowed
		System.out.println("=================================Map - TreeMap==========================");
		Map<String, Integer> employeeDetailsTree = new TreeMap<String, Integer>();
		employeeDetailsTree.put("Lakshmi", 1);
		employeeDetailsTree.put("Sunil", 2);
		employeeDetailsTree.put("Aadhi", 5);
		employeeDetailsTree.put("Anjali", 3);
		employeeDetailsTree.put("Siddartha", 3);
		employeeDetailsTree.put("Lakshmi", 6);
		employeeDetailsTree.put("Suresh", null);
//		employeeDetailsTree.put(null, 1000);

		System.out.println(employeeDetailsTree);
		System.out.println("Size : " + employeeDetailsTree.size());
		
		// HashTable ==> Random Order of Keys , Duplicate Values are allowed 
		// but duplicate Keys are not allowed
		// Both null keys and null values are not allowed
		System.out.println("=================================Map - HashTable==========================");
		Map<String, Integer> employeeDetailsTable = new Hashtable<String, Integer>();
		employeeDetailsTable.put("Lakshmi", 1);
		employeeDetailsTable.put("Sunil", 2);
		employeeDetailsTable.put("Aadhi", 5);
		employeeDetailsTable.put("Anjali", 3);
		employeeDetailsTable.put("Siddartha", 3);
		employeeDetailsTable.put("Lakshmi", 6);
//		employeeDetailsTable.put("Suresh", null);
//		employeeDetailsTable.put(null, 1000);

		System.out.println(employeeDetailsTable);
		System.out.println("Size : " + employeeDetailsTable.size());
	}

}
