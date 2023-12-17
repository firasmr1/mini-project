package mini;

import java.util.ArrayList;

public class Teacher extends Person{
	ArrayList<Float> ModulesResp =new ArrayList<Float>();
	ArrayList<Float> Sections =new ArrayList<Float>();
	public Teacher(ArrayList<Float> Sections ,ArrayList<Float> ModulesResp ,int password, String name, String fullname, int id) {
		super(password, name, fullname, id);
		this.ModulesResp=ModulesResp;
	}
	public void DisplayInfo() {
		super.DisplayInfo();
		System.out.println("Programs responsible for it : ");
		for(int i=0;i<ModulesResp.size();i++) {
			System.out.println("Programe : "+ModulesResp.get(i));
			System.out.println("The Section is : "+Sections.get(i));	
			System.out.println();
			}		
		}

ListsClass Lists = new ListsClass();
	
	public void setGrades() {
		boolean Run = true;
		for(Student s: Lists.studentsList) {
			for(Module m : s.studentModule) {
				if(m.Prof==this.getName()) {
					Scanner S = new Scanner(System.in);
					while(Run) {
						System.out.println(s.getName()+" "+s.getPromotion() +" "+s.getSection()+" "+s.getGroupe());
						System.out.println("1__TD");
						System.out.println("2__TP");
						System.out.println("3__Exit");
					System.out.print("Enter your choice: ");
					int i = S.nextInt();
					switch(i) {
					case 1:
						m.TD.setTPAverrage(i);
						break;
						
					case 2:
						m.TP.setTPAverrage(i);
						break;
						
					case 3:
						Run=false;
					}
					}
				}
			}
		}
	}
	
}
