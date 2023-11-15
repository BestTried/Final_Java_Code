package coding_practice_with34_Batch;


	public class CodingPracticeFinalReview {

		@Test
		public void SwapWithOutThardVariable() {
			int x = 100;
			int y = 200;
			// Swapping in steps
			x = x + y; // x = 100 + 200 = 300
			y = x - y; // y = 300 - 200 = 100
			x = x - y; // x = 300 - 100 = 200
			// Verify swapped values
			System.out.println("x = " + x + " and y = " + y);
		}

		@Test
		public static void breakStatement() {
			for (int i = 0; i < 10000; i++) {
				if (i == 4) {
					break;
				}
				System.out.println(i);
			}
		}

		@Test
		public static void continueStatement() {
			for (int i = 0; i < 10; i++) {
				if (i == 4) {
					continue;
				}
				System.out.println(i);
			}
		}

		@Test
		public void EvenOrOddNumber() {
			// How you find out even number & odd number
			for (int i = 0; i <= 100; i++) {
				if (i % 2 == 0) { // Remainder or mod

					System.out.println("Even number::" + i);
				} else {
					System.out.println("Odd number::" + i);

				}
			}
		}

		@Test
		public void MargeArray() {
			String a[] = { "A", "E", "I" };
			String b[] = { "O", "U" };
			List<String> list = new ArrayList<>(Arrays.asList(a));
			list.addAll(Arrays.asList(b));
			Object[] c = list.toArray();
			System.out.println(Arrays.toString(c));
		}

		@Test
		public void MargeArrayTwo() {
			Integer a[] = { 1, 2, 3, 4 };
			Integer b[] = { 5, 6, 7 };
			List<Integer> list = new ArrayList<>(Arrays.asList(a));
			list.addAll(Arrays.asList(b));
			Object[] c = list.toArray();
			System.out.println(Arrays.toString(c));
		}

		public static void PalindromeNum() {
			String str = "radar", reverseStr = "";
			int strLength = str.length();
			for (int i = (strLength - 1); i >= 0; --i) {
				reverseStr = reverseStr + str.charAt(i);
			}
			if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
				System.out.println(str + " is a Palindrome String.");
			} else {
				System.out.println(str + " is not a Palindrome String.");
			}
		}
	    @Test
		public static void removeSpecialChar() {
			String str = "I/o:8%$#7d$098g&()_+h%l@";
			str = str.replaceAll("[^A-Za-z]", "");
			System.out.println("After remove all the special characters : " + str);

			char[] nm = str.toCharArray();
			for (int i = (nm.length) - 1; i >= 0; i--) {
				System.out.print(nm[i]);
			}
			System.out.println(" ");
		}

		@Test
		public static void ReverseStringOne() {
			// Create an array of integers
			Integer arr[] = { 10, 20, 30, 40, 50 };
			System.out.println("Original Array : " + Arrays.toString(arr));
			Collections.reverse(Arrays.asList(arr));
			System.out.println("Modified Array : " + Arrays.toString(arr));
		}

		@Test
		public static void ReverseStringTwo() {
			String name = "Haq";
			char[] nm = name.toCharArray();
			for (int i = (nm.length) - 1; i >= 0; i--) {
				System.out.print(nm[i]);
			}
		}

		@Test
		public static void secoundNum() {
			int array[] = { 10, 20, 25, 63, 96, 57 };
			int size = array.length;
			Arrays.sort(array);
			System.out.println("sorted Array ::" + Arrays.toString(array));
			int res = array[size - 2];
			System.out.println("2nd largest element is ::" + res);
		}

		@Test
		public static void splitTheSentence() {
			String Str = new String("Welcome-to-String-Tutorial.");
			System.out.println("Return Value :");
			for (String retval : Str.split("-")) {
				System.out.println(retval);
			}
		}

		@Test
		public static void findDuplicate() {
			int[] a = { 1, 1, 2, 3, 2 };
			for (int i = 0; i < a.length; i++) {
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						System.out.println("dup => " + a[i]);

					}
				}
			}

		}

		// How to remove duplicate values
		public void removeDuplicate() {
			List<Integer> remove = Arrays.asList(100, 200, 200, 300, 500, 700, 800);
			List<Integer> duplicate = remove.stream().distinct().collect(Collectors.toList());
			System.out.println("Only unic values : " + duplicate);

		}

		public void findDuplicateString() {
			String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };
			Set<String> store = new HashSet<>();
			for (String name : names) {
				if (store.add(name) == false) {
					System.out.println("found a duplicate element in array : " + name);
				}
			}
		}

		public static void getMaxValue() {
			// 2nd way
			List<Integer> num = Arrays.asList(100, 200, 300, 500, 700, 800);
			int max = Collections.max(num);
			System.out.println("Maximum value : " + max);

			int min = Collections.min(num);
			System.out.println("Minimum value : " + min);
		}

		public static void sortTheData() {
			ArrayList<String> values = new ArrayList<String>();
			values.add("Rokeya");
			values.add("Sazzad");
			values.add("Asif");
			values.add("Qasim");
			values.add("Fahima");

			// How to know there is data which one you needed?
			if (values.contains("Sazzad")) {
				System.out.println("Sazzad is present");
			} else {
				System.out.println("Sazzad not present");
			}

			Collections.sort(values);
			// System.out.println("after sort data");

			for (String data : values) {
				System.out.println("after sort the data : " + data);
			}
		}

		@Test
		public static void findDuplicate1() {
			String input = "iabccdeffghhijkkkl";
			for (int i = 0; i < input.length(); i++) {
				for (int j = i + 1; j < input.length(); j++) {
					if (input.charAt(i) == input.charAt(j)) {
						System.out.println("Duplicate is: " + input.charAt(i));
					}
				}
			}
		}

		@Test
		public static void findprimeNum() {
			int num = 13;
			for (int i = 2; i < num / 2; i++) {
				if (num % i == 0) {
					System.out.println(" Not prime number ::" + num);
					break;
				} else {
					System.out.println("This is a prime number ::" + num);
					break;
				}
			}
		}

		@Test
		public void OccurenceOfCharInString() {
			String str = "%HelloWorld%";
			// Creating a HashMap containing char
			// as a key and occurrences as a value
			HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();
			// Converting given string to char array
			char[] strArray = str.toCharArray();
			// checking each char of strArray
			for (char c : strArray) {
				if (charCountMap.containsKey(c)) {
					// If char is present in charCountMap,
					// incrementing it's count by 1
					charCountMap.put(c, charCountMap.get(c));
				} else {
					// If char is not present in charCountMap,
					// putting this char to charCountMap with 1 as it's value
					charCountMap.put(c, 1);
				}
			}
			// Printing the charCountMap
			for (Entry<Character, Integer> entry : charCountMap.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}

		@Test
		public static void FindingVowels() {
			String str = new String("Hi Welcome to smart tech");
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					System.out.println("Given string Vowels " + str.charAt(i));
					// System.out.println("Given string contains " + str.charAt(i) + " at the index
					// " + i);

				}
			}
		}

		@Test
		public void Fibonacciseries() {
			// In fibonacci series, next number is the sum of previous
			// two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
			// The first two numbers of fibonacci series are 0 and 1.
			// There are two ways to write the fibonacci series program in java:
			// Fibonacci Series without using recursion.
			int n = 10, firstTerm = 0, secondTerm = 1;
			System.out.println("Fibonacci Series till " + n + " terms:");
			for (int i = 1; i <= n; ++i) {
				System.out.print(firstTerm + ", ");
				// compute the next term
				int nextTerm = firstTerm + secondTerm;
				firstTerm = secondTerm;
				secondTerm = nextTerm;
			}
		}
	}


