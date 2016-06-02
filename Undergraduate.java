public class Undergraduate extends Student {
	public Undergraduate(String name, int age, String major) {
		super();
		}
	public int getAge() {
		return 21;
		}
	public String getMajor() {
		return "Whatever, I'm pre-medicine, brah...";
		}
	public static void main(String[] args) {
		Undergraduate Kevin = new Undergraduate("kevin", 18, "Anthropology");
		System.out.println(Kevin.getAge());
		System.out.println(Kevin.getMajor());
		}			
	}
