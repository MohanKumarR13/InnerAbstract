package InnerAbstract;

public class RunnerAbstract {
   public static void main(String[] args) {
	   ParentAbstract obj=new ParentAbstract() {

		@Override
		public void salary() {
			System.out.println("Salary");
			
		}
	};
	obj.education();
	obj.work();
	obj.salary();
}
}