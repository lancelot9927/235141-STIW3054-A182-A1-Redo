import java.util.*;

public class Main {
	public static void main(String[] args) {

		
		
		cal();
	}		
		public static void cal(){
			Scanner scan = new Scanner(System.in);
			IntTable1 inttable1= new IntTable1();
			inttable1.setTable1(new Dotable1());
			IntTable2 inttable2= new IntTable2();
			inttable2.setTable2(new Dotable2());
			IntUUCP intUUCP = new IntUUCP();
			intUUCP.setcalUUCP(new calUUCP());
			IntTable3 inttable3= new IntTable3();
			inttable3.setTable3(new Dotable3());
			IntTCF intTCF = new IntTCF();
			intTCF.setcalTCF(new calTCF());
			IntSzUC intSzUC = new IntSzUC();
			intSzUC.setcalSzUC(new calSzUC());
			IntTable4 inttable4= new IntTable4();
			inttable4.setTable4(new Dotable4());
			IntEF intEF = new IntEF();
			intEF.setcalEF(new calEF());
			IntUCP intUCP = new IntUCP();
			intUCP.setcalUCP(new calUCP());
			IntER intER = new IntER();
			intER.setcalER(new calER());
			IntManhours intManhours = new IntManhours();
			intManhours.setcalManhours(new calManhours());
			Intadjusted intadjusted = new Intadjusted();
			intadjusted.setcaladjusted(new caladjusted());
		try{
		System.out.println("       Table 1. Weighting Actors for Complexity ");
        System.out.print("Please Enter Simple(Defined API) Qnty : ");
        int Table1Simple = scan.nextInt();
        System.out.print("Please Enter Average(Interactive or Protocol driven interface) Qnty : ");
        int Table1Average = scan.nextInt();
        System.out.print("Please Enter Complex(Graphical User Interface)  Qnty : ");
        int Table1Complex = scan.nextInt();
        System.out.println("Simple Sub total is : "+ Table1Simple*1 );
        System.out.println("Average Sub total is : " +Table1Average*2);
        System.out.println("Complex Sub total is : "+Table1Complex*3);       
		double WA = inttable1.step1(Table1Simple,Table1Average,Table1Complex);
		System.out.println("Total Actor Points is :"+WA);
		
		
		
		System.out.println("*********************************************************");
		System.out.println("       Table 2. Weighting Use Cases for Complexity  ");
        System.out.print("Please Enter Simple(3 or fewer transactions ) Qnty : ");
        int Table2Simple = scan.nextInt();
        System.out.print("Please Enter Average(4 to 7 transactions)  Qnty : ");
        int Table2Average = scan.nextInt();
        System.out.print("Please Enter Complex(Greater than 7 transactions) Qnty : ");
        int Table2Complex = scan.nextInt();
        System.out.println("Simple Sub total is : "+ Table2Simple*5 );
        System.out.println("Average Sub total is : " +Table2Average*10);
        System.out.println("Complex Sub total is : "+ Table2Complex*15);
        double TUC = inttable2.step2(Table2Simple,Table2Average,Table2Complex);
        System.out.println("\nTotal Use Cases  : "+ TUC);

        
        double UUCP = intUUCP.calcuUUCP(WA, TUC);
        
        System.out.println("UUCP is :"+UUCP);
        
        System.out.println("*********************************************************");

        System.out.println("       Table 3. Weighting Technical Factors  ");
        
        System.out.print("Please Enter Project Rating for 'Must have a distributed solution' : ");
        int T1 = scan.nextInt();
        System.out.println("This Sub total is :"+T1*2);
        
        System.out.print("\nPlease Enter Project Rating for 'Must respond to specific performance objectives ' : ");
        int T2 = scan.nextInt();
        System.out.println("This Sub total is :"+T2*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must meet end-user efficiency desires' : ");
        int T3 = scan.nextInt();
        System.out.println("This Sub total is :"+T3*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Complex internal processing' : ");
        int T4 = scan.nextInt();
        System.out.println("This Sub total is :"+T4*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Code must be reusabl' : ");
        int T5 = scan.nextInt();
        System.out.println("This Sub total is :"+T5*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to instal' : ");
        int T6 = scan.nextInt();
        System.out.println("This Sub total is :"+T6*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to use ' : ");
        int T7 = scan.nextInt();
        System.out.println("This Sub total is :"+T7*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Must be portable ' : ");
        int T8 = scan.nextInt();
        System.out.println("This Sub total is :"+T8*2);
        
        System.out.print("\nPlease Enter Project Rating for 'Must be easy to change ' : ");
        int T9 = scan.nextInt();
        System.out.println("This Sub total is :"+T9*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must allow concurrent user ' : ");
        int T10 = scan.nextInt();
        System.out.println("This Sub total is :"+T10*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Includes special security feature ' : ");
        int T11 = scan.nextInt();
        System.out.println("This Sub total is :"+T11*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Must provide direct access for 3rd partie ' : ");
        int T12 = scan.nextInt();
        System.out.println("This Sub total is :"+T12*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Requires special user training facilitie' : ");
        int T13 = scan.nextInt();
        System.out.println("This Sub total is :"+T13*1);
        
        double TFactor = inttable3.step3(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13);
        System.out.println("\nTotal TFactor is :"+TFactor);
        
        double TCF = intTCF.calcuTCF(TFactor);
        System.out.println("Total TFC is "+TCF);
        
        double SzUC = intSzUC.calcuSzUC(UUCP,TCF);
        System.out.println("Total SzUC is "+SzUC);
        
        int count = 0;
        System.out.println("*********************************************************");
        System.out.println("       Table 4. Weighting Experience Factors   ");
        
        System.out.print("\nPlease Enter Project Rating for 'Familiar with FPT software proces' : ");
        int E1 = scan.nextInt();
        if (E1<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E1*1);
        
        System.out.print("\nPlease Enter Project Rating for 'Application experience  ' : ");
        int E2 = scan.nextInt();
        if (E2<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E2*0.5);
        
        System.out.print("\nPlease Enter Project Rating for 'Paradigm experience (OO)  ' : ");
        int E3 = scan.nextInt();
        if (E3<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E3*1);
         
        System.out.print("\nPlease Enter Project Rating for 'Lead analyst capabilit  ' : ");
        int E4 = scan.nextInt();
        if (E4<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E4*0.5);
         
        System.out.print("\nPlease Enter Project Rating for 'Motivation ' : ");
        int E5 = scan.nextInt();
        if (E5<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E5*0);
         
        System.out.print("\nPlease Enter Project Rating for 'Stable Requirements ' : ");
        int E6 = scan.nextInt();
        if (E6<3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E6*2);
         
        System.out.print("\nPlease Enter Project Rating for 'Part-time workers  ' : ");
        int E7 = scan.nextInt();
        if (E7>=3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E7*-1);
         
        System.out.print("\nPlease Enter Project Rating for 'Difficulty of programming language ' : ");
        int E8 = scan.nextInt();
        if (E8>=3) {
            count ++;
        }
        System.out.println("This Sub total is :"+E8*-1);
        
        double  EFactor = inttable4.step4(E1,E2,E3,E4,E5,E6,E7,E8);
        System.out.println("Total EFactor + "+EFactor);
        
        double EF = intEF.calcuEF(EFactor);
        System.out.println("EF is :"+EF);
        
        double UCP = intUCP.calcuUCP(EF, SzUC);
        System.out.println("UCP is :"+UCP);
        
        double ER = intER.calcuER(count);
        System.out.println("ER is :"+ER);
        
        double manhours = intManhours.calcumanhours(ER,UCP);
        System.out.println("Total man-hours is :"+manhours);
          
        System.out.println("*********************************************************");
        System.out.print("Please enter the risk (X%) :");
        double risk = scan.nextDouble();
        
        double adjusted = intadjusted.calcuadjusted(risk, manhours);
        System.out.print("adjusted man*hours is :");
        System.out.println(String.format("%.2f", adjusted));
	}catch(Exception e){
	    System.out.println("Wrong input\n");
	    cal();
	}
	}
	}

