package java_personal;


public class CompanyTest {


		 
//		public boolean isNumber(String test) {
//			 boolean flag = true;
//			 
//			 //코드
//
//			 return flag;
//			}
		public boolean isNumber(String test) {
			boolean flag = true;
			if (test == null || "".equals(test)) {
				return false;
			}

			int size = test.length();
			int st_no = 0;

			if (test.charAt(0) == 45) {
				st_no = 1;
			}

			for (int i = st_no; i < size; ++i) {
				if (!(48 <= ((int) test.charAt(i)) && 57 >= ((int) test.charAt(i)))) {
					flag = false;
					break;
				}
			}
			
			return flag;
		}
		  
		 
		
		
}//class end
