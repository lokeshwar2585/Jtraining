import java.util.Scanner;

class Qa extends Qb{
		static Scanner s=new Scanner(System.in);
		static void q1(){
			System.out.println("1) What is 1+1 ?\n");
			System.out.print("a : 0 \t\t");
			System.out.println("b : 1");
			System.out.print("c : 3 \t\t");
			System.out.println("d : 2");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0 ||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "d":
				q2();
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				a++;
				qa1();
				break;
			case "ff":
				f++;
				qf1();
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q1();
			}
			
		}
		static void q2(){
			p++;
			System.out.println("2) what is 2*3 ? \n");
			System.out.print("a : 4 \t\t");
			System.out.println("b : 6");
			System.out.print("c : 5 \t\t");
			System.out.println("d : 8");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0 ||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "b":
				q3();
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa2();
				}
				else {
					System.out.println("Lifeline not available");
					q2();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf2();
				}
				else {
					System.out.println("Lifeline not available");
					q2();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q2();
			}
		}
		static void q3(){
			p++;
			System.out.println("3) What is 50/25 ? \n");
			System.out.print("a : 0 \t\t");
			System.out.println("b : 1");
			System.out.print("c : 2 \t\t");
			System.out.println("d : 3");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0 || sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "c":
				q4();
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa3();
				}
				else {
					System.out.println("Lifeline not available");
					q3();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf3();
				}
				else {
					System.out.println("Lifeline not available");
					q3();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q3();
			}
		}
		static void q4(){
			p++;
			System.out.println("4) What is sin(30) ? \n");
			System.out.print("a : 1 \t\t");
			System.out.println("b : 1/2");
			System.out.print("c : 1/4 \t");
			System.out.println("d : 2");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0 || sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "b":
				q5();
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa4();
				}
				else {
					System.out.println("Lifeline not available");
					q4();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf4();
				}
				else {
					System.out.println("Lifeline not available");
					q4();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q4();
			}
		}
		static void q5(){
			p++;
			System.out.println("5) What is cos(90) ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("c : -1");
			System.out.println("d : 2");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0 ||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "a":
				q6();
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa5();
				}
				else {
					System.out.println("Lifeline not available");
					q5();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf5();
				}
				else {
					System.out.println("Lifeline not available");
					q5();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q5();
			}
		}
		static void q6(){
			p++;
			System.out.println("6) What is 1-1 ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("c : 3");
			System.out.println("d : 2");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "a":
				q7();
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa6();
				}
				else {
					System.out.println("Lifeline not available");
					q6();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf6();
				}
				else {
					System.out.println("Lifeline not available");
					q6();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q6();
			}
		}
		static void q7(){
			p++;
			System.out.println("7) what is 2**3 ?");
			System.out.println("a : 2");
			System.out.println("b : 4");
			System.out.println("c : 6");
			System.out.println("d : 8");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "d":
				q8();
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa7();
				}
				else {
					System.out.println("Lifeline not available");
					q7();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf7();
				}
				else {
					System.out.println("Lifeline not available");
					q7();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q7();
			}
		}
		static void q8(){
			p++;
			System.out.println("8) What is 5-5 ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("c : 2");
			System.out.println("d : 3");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "a":
				q9();
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa8();
				}
				else {
					System.out.println("Lifeline not available");
					q8();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf8();
				}
				else {
					System.out.println("Lifeline not available");
					q8();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q8();
			}
		}
		static void q9(){
			p++;
			System.out.println("9) What is sin(90) ?");
			System.out.println("a : 1");
			System.out.println("b : 2");
			System.out.println("c : 3");
			System.out.println("d : 4");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "a":
				q10();
				break;
			case "b":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa9();
				}
				else {
					System.out.println("Lifeline not available");
					q9();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf9();
				}
				else {
					System.out.println("Lifeline not available");
					q9();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q9();
			}
		}
		static void q10(){
			p++;
			System.out.println("10) What is 3-2 ?");
			System.out.println("a : 0");
			System.out.println("b : 1");
			System.out.println("c : -1");
			System.out.println("d : 2");
			System.out.println("\ne -- Exit");
			if(f==0 || a==0||sw==0) {
				System.out.println("\n          Lifelines:");
				if(f==0) {
					System.out.println("          ff -- 50/50");
				}
				if(a==0) {
					System.out.println("          ap -- Audience Poll");
				}
				if(sw==0) {
					System.out.println("          s -- Swap a Question");
				}
			}
			System.out.println("\nEnter your option:");
			String c=s.next();
			switch(c) {
			case "b":
				p++;
				System.out.println("  **** YOU WIN ****");
				System.out.println("You scored "+p+" points");
				break;
			case "a":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "c":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "d":
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
				break;
			case "ap":
				if(a==0) {
					a++;
					qa10();
				}
				else {
					System.out.println("Lifeline not available");
					q10();
				}
				break;
			case "ff":
				if(f==0) {
					f++;
					qf10();
				}
				else {
					System.out.println("Lifeline not available");
					q10();
				}
				break;
			case "e":
				System.out.println("You scored "+p+" points");
				System.exit(0);
			case "s":
				if(sw==0) {
					sw++;
					boolean t=qs();
					if(t==true) {
						q5();
					}
					else {
						System.out.println("You lose !!");
						System.out.println("You scored "+p+" points");
					}
				}
				else {
					System.out.println("Lifeline not available");
				}
				break;
			default:
				System.out.println(" Enter valid input ");
				q10();
		}
	}
}

class Qb extends Qc{
	static Scanner s=new Scanner(System.in);
	static void qa1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("a : 0 -- 25%");
		System.out.println("b : 1 -- 20%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 2 -- 40%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qa.q2();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			boolean t=Qd.qfa1();
			if(t) {
				p++;
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean h=qs();
			if(h==true) {
				Qa.q2();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa1();
		}
		
	}
	static void qa2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4 -- 20%");
		System.out.println("b : 6 -- 50%");
		System.out.println("c : 5 -- 20%");
		System.out.println("d : 8 -- 10%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qa.q3();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa2();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q3();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa2();
		}
	}
	static void qa3(){
		System.out.println("3) what is 50/25 ?");
		System.out.println("a : 0 -- 20%");
		System.out.println("b : 1 -- 30%");
		System.out.println("c : 2 -- 40%");
		System.out.println("d : 3 -- 10%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "c":
			Qa.q4();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa3();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q4();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa3();
		}
	}
	static void qa4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("a : 1   -- 30%");
		System.out.println("b : 1/2 -- 50%");
		System.out.println("c : 1/4 -- 10%");
		System.out.println("d : 2   -- 10%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qa.q5();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa4();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q5();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa4();
		}
	}
	static void qa5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0  -- 40%");
		System.out.println("b : 1  -- 20%");
		System.out.println("c : -1 -- 25%");
		System.out.println("d : 2  -- 15%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q6();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa5();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q6();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa5();
		}
	}
	static void qa6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0 -- 50%");
		System.out.println("b : 1 -- 20%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 2 -- 15%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q7();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa6();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q7();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa6();
		}
	}
	static void qa7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2 -- 22%");
		System.out.println("b : 4 -- 20%");
		System.out.println("c : 6 -- 48%");
		System.out.println("d : 8 -- 10%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qa.q8();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa7();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q8();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa7();
		}
	}
	static void qa8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0 -- 60%");
		System.out.println("b : 1 -- 25%");
		System.out.println("c : 2 -- 10%");
		System.out.println("d : 3 -- 5%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q9();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa8();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q9();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa8();
		}
	}
	static void qa9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1 -- 35%");
		System.out.println("b : 2 -- 30%");
		System.out.println("c : 3 -- 15%");
		System.out.println("d : 4 -- 20%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q10();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;
			Qd.qfa9();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q10();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qa9();
		}
	}
	static void qa10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("a : 0  -- 20%");
		System.out.println("b : 1  -- 40%");
		System.out.println("c : -1 -- 30%");
		System.out.println("d : 2  -- 10%");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			p++;
			System.out.println("  **** YOU WIN ****");
			System.out.println("You scored "+p+" points");
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			f++;	
			Qd.qfa10();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				p++;
				System.out.println("  **** YOU WIN ****");
				System.out.println("You scored "+p+" points");
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qa10();
		}
	}
}

class Qc extends Qd{
	static int p=0;
	static int a=0;
	static int f=0;
	static Scanner s=new Scanner(System.in);
	static void qf1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("c : 3");
		System.out.println("d : 2");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qa.q2();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa1();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q2();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf1();
		}
		
	}
	static void qf2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4");
		System.out.println("b : 6");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qa.q3();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q3();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "ap":
			a++;
			Qd.qfa2();
		default:
			System.out.println(" Enter valid input ");
			qf2();
		}
	}
	static void qf3(){
		System.out.println("3) What is 50/25 ?");
		System.out.println("c : 2");
		System.out.println("d : 3");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "c":
			Qa.q4();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa3();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q4();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf3();
		}
	}
	static void qf4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("b : 1/2");
		System.out.println("c : 1/4");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qa.q5();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa4();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q5();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf4();
		}
	}
	static void qf5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q6();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa5();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q6();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf5();
		}
	}
	static void qf6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0");
		System.out.println("d : 2");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q7();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa6();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q7();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf6();
		}
	}
	static void qf7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2");
		System.out.println("d : 8");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qa.q8();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa7();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean q=qs();
			if(q==true) {
				Qa.q8();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf7();
		}
	}
	static void qf8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0");
		System.out.println("b : 1");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q9();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa8();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q9();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf8();
		}
	}
	static void qf9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1");
		System.out.println("b : 2");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qa.q10();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa9();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q10();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf9();
		}
	}
	static void qf10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("b : 1");
		System.out.println("d : 2");
		System.out.println("\ne -- Exit");
		if(f==0 || a==0 || sw==0) {
			System.out.println("\n          Lifelines:");
			if(f==0) {
				System.out.println("          ff -- 50/50");
			}
			if(a==0) {
				System.out.println("          ap -- Audience Poll");
			}
			if(sw==0) {
				System.out.println("          s -- Swap a Question");
			}
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			System.out.println("  **** YOU WIN ****");
			System.out.println("You scored "+p+" points");
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ap":
			a++;
			Qd.qfa10();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				System.out.println(" **** YOU WIN ****");
				System.out.println("You have scored "+p+" points");
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qf10();
		}
	}
}

class Qd extends Qs{
	static Scanner s=new Scanner(System.in);
	static boolean qfa1(){
		System.out.println("1) What is 1+1 ?");
		System.out.println("c : 3 -- 35%");
		System.out.println("d : 2 -- 65%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qa.q2();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa1();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa1();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q2();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		
		default:
			System.out.println(" Enter valid input ");
			qfa1();
		}
		return true;
	}
	static void qfa2(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("a : 4 -- 30%");
		System.out.println("b : 6 -- 70%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qs.p++;
			Qa.q3();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa2();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa2();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q3();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa2();
		}
	}
	static void qfa3(){
		System.out.println("2) what is 2*3 ?");
		System.out.println("c : 2 -- 74%");
		System.out.println("d : 3 -- 26%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "c":
			Qs.p++;
			Qa.q4();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa3();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa3();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q4();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qfa3();
		}
	}
	static void qfa4(){
		System.out.println("4) What is sin(30) ?");
		System.out.println("b : 1/2 -- 55%");
		System.out.println("c : 1/4 -- 45%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qs.p++;
			Qa.q5();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa4();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa4();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q5();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa4();
		}
	}
	static void qfa5(){
		System.out.println("5) What is cos(90) ?");
		System.out.println("a : 0 -- 60%");
		System.out.println("b : 1 -- 40%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qs.p++;
			Qa.q6();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa7();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa7();
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q6();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		default:
			System.out.println(" Enter valid input ");
			qfa5();
		}
	}
	static void qfa6(){
		System.out.println("6) What is 1-1 ?");
		System.out.println("a : 0 -- 80%");
		System.out.println("d : 2 -- 20%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qs.p++;
			Qa.q7();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa6();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa6();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q7();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa6();
		}
	}
	static void qfa7(){
		System.out.println("7) what is 2**3 ?");
		System.out.println("a : 2 -- 40%");
		System.out.println("d : 8 -- 60%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "d":
			Qs.p++;
			Qa.q8();
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa7();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa7();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q8();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa7();
		}
	}
	static void qfa8(){
		System.out.println("8) What is 5-5 ?");
		System.out.println("a : 0 -- 87%");
		System.out.println("b : 1 -- 13%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qs.p++;
			Qa.q9();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa8();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa8();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q9();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa8();
		}
	}
	static void qfa9(){
		System.out.println("9) What is sin(90) ?");
		System.out.println("a : 1 -- 65%");
		System.out.println("b : 2 -- 35%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "a":
			Qs.p++;
			Qa.q10();
			break;
		case "b":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa9();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa9();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				Qa.q10();
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa9();
		}
	}
	static void qfa10(){
		System.out.println("10) What is 3-2 ?");
		System.out.println("b : 1 -- 80%");
		System.out.println("d : 2 -- 20%");
		System.out.println("\ne -- Exit");
		if(Qs.sw==0) {
			System.out.println("\n          Lifelines:");
			System.out.println("          s -- Swap a Question");
		}
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			Qs.p++;
			System.out.println("  **** YOU WIN ****");
			System.out.println("You scored "+p+" points");
			break;
		case "a":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "c":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "d":
			System.out.println("You lose !!");
			System.out.println("You scored "+p+" points");
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qfa10();
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qfa10();
			break;
		case "s":
			sw++;
			boolean t=qs();
			if(t==true) {
				System.out.println(" ****YOU WIN****");
				System.out.println("You scored "+p+" points");
				break;
			}
			else {
				System.out.println("You lose !!");
				System.out.println("You scored "+p+" points");
			}
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		default:
			System.out.println(" Enter valid input ");
			qfa10();
		}
	}
}

class Qs{
	public static int p=0;
	public static int a=0;
	public static int f=0;
	public static int sw=0;
	public static boolean qs() {
		Scanner s=new Scanner(System.in);
		int d=0;;
		System.out.println("Q) what is 4-4 ? \n");
		System.out.print("a : 4 \t\t");
		System.out.println("b : 0");
		System.out.print("c : 1 \t\t");
		System.out.println("d : 3");
		System.out.println("\ne -- Exit");
		System.out.println("\nEnter your option:");
		String c=s.next();
		switch(c) {
		case "b":
			p++;
			d=1;
			break;
		case "a":
			d=0;
			break;
		case "c":
			d=0;
			break;
		case "d":
			d=0;
			break;
		case "ap":
			System.out.println("Lifeline not available");
			qs();
			break;
		case "ff":
			System.out.println("Lifeline not available");
			qs();
			break;
		case "e":
			System.out.println("You scored "+p+" points");
			System.exit(0);
		case "s":
			System.out.println("Lifeline not available");
			qs();
		default:
			System.out.println(" Enter valid input ");
			qs();
		}
		if(d==0) {
			return false;
		}
		else {
			return true;
		}
	}
}

class Qdata extends Qa{
	String name;
	int age;
	void setname(String name){
		this.name=name;
	}
	void setage(int age){
		this.age=age;
	}
	void getdet() {
		System.out.println("\n*******************************************\n");
		System.out.println("          THANK YOU FOR PARTICIPATING \n");
		System.out.println("                QUIZ ENDED \n");
		System.out.println("           Name          : "+this.name);
		System.out.println("           Age           : "+this.age);
		System.out.println("           Right Answers : "+p);
		System.out.println("           Wrong Answers : "+(10-p));
		System.out.println("           Score         : "+(p*10)+"/100");
		System.out.println("\n*******************************************\n");
	}
}

public class Quizz {
	public static void main(String[] args) {
		Qa q=new Qa();
		Qdata d=new Qdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("\n************* WELCOME TO THE QUIZ **************\n");
		System.out.println("Enter your name: ");
		String name=sc.next();
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		System.out.println("\nRules :\n \n# There 10 questions in the quiz\n# Every Question gives a score of 10 \n# Enter only valid inputs i.e a, b, c, d, ff, ap, s\n# You are geiven three Lifelines\n   1. ff -- 50/50\n   2. ap -- Audience Poll\n   3. s -- Swap a question\n# You can only use each Lifeline atmost once.");
		System.out.println();
		d.setname(name);
		d.setage(age);
		q.q1();
		d.getdet();
	}
}
