
	public class TestGit {
		private int testId = 1;
		static  int testCount = 0;
		private String testDesc = "";

		
		public TestGit() {
			testCount++;
		}
		
		public int getTestId() {
			return testId;
		}

		public void setTestId(int testId) {
			this.testId = testId;
		}

		public String getTestDesc() {
			return testDesc;
		}

		public void setTestDesc(String testDesc) {
			this.testDesc = testDesc;
		}
		
		public int testResult() {
			int result = 0;
			result = result + testCount;
			return result;
		}

		public static void main(String[] args) {
			
			TestGit[] aTest = new TestGit[5];
			
			for (int i=0; i < aTest.length; i++) {
				aTest[i] = new TestGit();
				aTest[i].setTestId(i);
				aTest[i].setTestDesc("Testing " + TestGit.testCount + "th Test");
				System.out.println("Test " + aTest[i].getTestId() + " is " + aTest[i].getTestDesc());
				System.out.println("Test Result is: " + aTest[i].testResult());
			}
		}

	}
