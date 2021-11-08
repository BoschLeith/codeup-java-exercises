public class ExceptionsLecture {
	public static void main(String[] args) {

		// Try-Catch Exception
//		System.out.println("hello world");
//		try{
//			throw new Exception("Something bad happened");
//		} catch (Exception e){
//			e.printStackTrace();
//		}

		// Try-Catch ArithmeticException
//		try{
//			System.out.println("Divide by zero");
//			int result = 1/0;
//			System.out.println("It worked" + result);
//		} catch (ArithmeticException e){
//			e.printStackTrace();
//		}

		// Try-Catch NullPointerException/RuntimeException/Exception + finally
//		try {
//// throw new Exception("Exception error");
//// throw new RuntimeException("Runtime Exception error");
//			String nullString = null;
//			System.out.println(nullString.toLowerCase());
//		} catch (NullPointerException e) {
//			System.out.println("NullPointerException");
//			e.printStackTrace();
//			e.getMessage();
//		} catch (RuntimeException e) {
//			System.out.println("RuntimeException");
//			e.printStackTrace();
//			e.getMessage();
//		} catch (Exception e) {
//			System.out.println("Exception");
//			e.printStackTrace();
//			e.getMessage();
//		} finally {
//			System.out.println("This will always run");
//		}

		// Try-Catch ArrayIndexOutOfBoundsException
//		try{
//			String [] days = {"Monday", "Tuesday"};
//			System.out.println(days[2]);
//		} catch (ArrayIndexOutOfBoundsException e){
//			System.out.println("ArrayIndexOutOfBoundsException");
//			e.printStackTrace();
//			e.getMessage();
//		} catch (Exception e){
//			e.printStackTrace();
//		}
	}
}
