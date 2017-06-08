package calculate;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorMale01 extends HttpServlet {



	private static final long serialVersionUID = 1L;
	public CalculatorMale01() {
		super();

	}

	public void destroy() {
		super.destroy();

	}
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//复用doPost方法
		this.doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
		//获得ServletContext对象

		String _height=request.getParameter("height");
		String _weight=request.getParameter("weight");
		String _vital_capacity=request.getParameter("vital_capacity");
		String _standing_long_jump=request.getParameter("standing_long_jump");
		String _seat_flexion=request.getParameter("seat_flexion");
		String _pull_up=request.getParameter("pull_up");
		  String _run_50=request.getParameter("run_50");
		String _run_1000=request.getParameter("run_1000");
		

		    int i_height = 1;
		    int i_weight = 1;
		    int i_vital_capacity = 0;
		    int i_standing_long_jump = 0;
		    int i_seat_flexion = 0;
		   int i_pull_up = 0;
		    int i_run_50 = 0;
		    int i_run_1000 =0;
		
				
					try {
						i_height = Integer.valueOf(_height).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
						i_weight = Integer.valueOf(_weight).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
						i_vital_capacity = Integer.valueOf(_vital_capacity).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					try {
						i_standing_long_jump = Integer.valueOf(_standing_long_jump).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
						i_seat_flexion = Integer.valueOf(_seat_flexion).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
						i_pull_up = Integer.valueOf(_pull_up).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
						i_run_50 = Integer.valueOf(_run_50).intValue();
					} catch (NumberFormatException e) {
						e.printStackTrace();
					}
					 try {
							i_run_1000 = Integer.valueOf(_run_1000).intValue();
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}		
			
			
			float i=(float) 0.0;
			i=(float) ((float)BMIGrade(i_height,i_weight)*0.15+(float)i_vital_capacityGrade(i_vital_capacity)*0.15+(float)i_run_50Grade(i_run_50)*0.2+(float)i_seat_flexionGrad(i_seat_flexion)*0.1+(float)i_standing_long_jumpGrade(i_standing_long_jump)*0.1+(float)pull_upGrade(i_pull_up)*0.1+(float)i_run_1000Grade(i_run_1000)*0.2);
//			BMIGrade(i_height,i_weight);//BMI指数
//			i_vital_capacityGrade(i_vital_capacity);//肺活量成绩
//i_run_50Grade(i_run_50);//50米跑成绩
//i_seat_flexionGrad(i_seat_flexion);//坐位体前屈成绩
//i_standing_long_jumpGrade(i_standing_long_jump);//立定跳远成绩
//		pull_upGrade(i_pull_up);//引体向上成绩
//		i_run_1000Grade(i_run_1000);//1000米跑成绩
	response.setContentType("text/html");
	response.setCharacterEncoding("UTF-8");
	PrintWriter out=response.getWriter();
	out.println("<!DOCTYPE HTML PUBLIC  \"-//W3C//DTD  HTML 4.01 Transitional//EN\">");
	out.println("<HTML>");
	out.println("<HEAD><TITLE>最终结果</TITLE><HEAD>");
	out.println("<BODY>");
	out.print("<h2><font color='blue'>");
	out.println("<p>");
	out.println("BMI指数成绩为"+BMIGrade(i_height,i_weight)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("肺活量成绩为"+i_vital_capacityGrade(i_vital_capacity)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("50米跑成绩为"+i_run_50Grade(i_run_50)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("坐位体前屈成绩为"+i_seat_flexionGrad(i_seat_flexion)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("立定跳远成绩为"+i_standing_long_jumpGrade(i_standing_long_jump)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("引体向上成绩为"+pull_upGrade(i_pull_up)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("1000米跑成绩为"+i_run_1000Grade(i_run_1000)+"分");
	
	out.println("</p>");
	out.println("</font></h2>");
	out.print("<h2><font color='red'>");
	out.println("<p>");
	out.println("您体测的综合成绩为"+(int)i+"分");
	out.println("</p>");
	if ((int)i>=50) {
		out.println("<p>");
		out.println("恭喜你，体测合格！！！");
	}else {
		out.println("<p>");
		out.println("别灰心，要加强锻炼哦~");
	}
	out.println("</p>");
	
	out.println("</font></h2>");
	out.println("</BODY>");
	out.println("</HTML>");
	out.flush();
out.close();	
	}
	
	
	
	
		/**
		 *  计算BMI指数的成绩
		 * @param i_height
		 * @param i_weight
		 * @return BMI指数的成绩
		 */
	private int  BMIGrade(int i_height, int i_weight) {
	double i=(double)i_weight/i_height/i_height/0.01/0.01;
		int grade=0;
		if (i>=17.9&&i<=23.9) {
			grade=100;
		}
		if (i<17.9&&i>0) {
			grade=80;
		}
		if (i>23.9&&i<28.0) {	
			grade=80;
		}
		if (i>=28.0) {
			grade=60;
		}
		if(i_height==1&&i_weight==1){
			grade=0;
		}
		return grade;
	}
	/**
	 * 计算肺活量成绩
	 * @param i_vital_capacity
	 * @return 肺活量成绩
	 */
	private int  i_vital_capacityGrade(int i_vital_capacity) {
	int grade=0;
	if (i_vital_capacity>=5040) {
		grade=100;
	}
	else if (i_vital_capacity>=4920&&i_vital_capacity<5040) {
		grade=95;
	}
	else if (i_vital_capacity>=4800&&i_vital_capacity<4920) {
		grade=90;
	}else if (i_vital_capacity>=4550&&i_vital_capacity<4800) {
		grade=85;
	}else if (i_vital_capacity>=4300&&i_vital_capacity<4550) {
		grade=80;
	}else if (i_vital_capacity>=4180&&i_vital_capacity<4300) {
		grade=78;
	}else if (i_vital_capacity>=4060&&i_vital_capacity<4180) {
		grade=76;
	}else if (i_vital_capacity>=3940&&i_vital_capacity<4060) {
		grade=74;
	}else if (i_vital_capacity>=3820&&i_vital_capacity<3940) {
		grade=72;
	}else if (i_vital_capacity>=3700&&i_vital_capacity<3820) {
		grade=70;
	}else if (i_vital_capacity>=3580&&i_vital_capacity<3700) {
		grade=68;
	}else if (i_vital_capacity>=3460&&i_vital_capacity<3580) {
		grade=66;
	}else if (i_vital_capacity>=3340&&i_vital_capacity<3460) {
		grade=64;
	}else if (i_vital_capacity>=3220&&i_vital_capacity<3340) {
		grade=62;
		
	}else if (i_vital_capacity>=3100&&i_vital_capacity<3220) {
		grade=60;
		
	}else if (i_vital_capacity>=2940&&i_vital_capacity<3100) {
		grade=50;
	}else if (i_vital_capacity>=2780&&i_vital_capacity<2940) {
		grade=40;
	}else if (i_vital_capacity>=2620&&i_vital_capacity<2780) {
		grade=30;
	}else if (i_vital_capacity>=2460&&i_vital_capacity<2620) {
		grade=20;
	}else if (i_vital_capacity>=2350&&i_vital_capacity<2460) {
		grade=10;
	}
	
	else if (i_vital_capacity<2350) {
		grade=0;
	}
		
		
		return grade;
	
		
	}
	
	/**
	 * 计算五十米跑的成绩,单位毫秒
	 * @param i_run_50
	 * @return  五十米跑成绩
	 */

	private int  i_run_50Grade(int i_run_50) {
		int grade=0;
		if (i_run_50<=67&&i_run_50>0) {
			grade=100;
		}
		else if (i_run_50==68) {
			grade=95;
		}
		else if (i_run_50==69) {
			grade=90;
		}
		else if (i_run_50==70) {
			grade=85;
		}
		else if (i_run_50==71) {
			grade=80;
		}
		else if (i_run_50==73||i_run_50==72) {
			grade=78;
		}
		else if (i_run_50==75||i_run_50==74) {
			grade=76;
		}	else if (i_run_50==77||i_run_50==76) {
			grade=74;
		}	else if (i_run_50==79||i_run_50==78) {
			grade=72;
		}	else if (i_run_50==81||i_run_50==80) {
			grade=70;
		}	else if (i_run_50==83||i_run_50==82) {
			grade=68;
		}	else if (i_run_50==85||i_run_50==84) {
			grade=66;
		}	else if (i_run_50==87||i_run_50==86) {
			grade=64;
		}	else if (i_run_50==89||i_run_50==88) {
			grade=62;
		}	else if (i_run_50==91||i_run_50==90) {
			grade=60;
		}	else if (i_run_50==93||i_run_50==92) {
			grade=50;
		}	else if (i_run_50==95||i_run_50==94) {
			grade=40;
		}	else if (i_run_50==97||i_run_50==96) {
			grade=30;
		}	else if (i_run_50==99||i_run_50==98) {
			grade=20;
		}	else if (i_run_50==101||i_run_50==100) {
			grade=10;
		}	
	
		
		else if (i_run_50>101) {
			grade=0;
		}
		return grade;
		
	}

	/**
	 * 计算坐位体前屈的成绩
	 * @param i_seat_flexion
	 * @return 坐位体前屈成绩
	 */
	private int  i_seat_flexionGrad(int i_seat_flexion) {
	int grade=0;
	if (i_seat_flexion>=24.9) {
		grade=100;
	}else if (i_seat_flexion<24.9&&i_seat_flexion>=23.1) {
		grade =95;
	}else if (i_seat_flexion<23.1&&i_seat_flexion>=21.3) {
		grade =90;
	}else if (i_seat_flexion<21.3&&i_seat_flexion>=19.5) {
		grade =85;
	}else if (i_seat_flexion<19.5&&i_seat_flexion>=17.7) {
		grade =80;
	}else if (i_seat_flexion<17.7&&i_seat_flexion>=16.3) {
		grade =78;
	}else if (i_seat_flexion<16.3&&i_seat_flexion>=14.9) {
		grade =76;
	}else if (i_seat_flexion<14.9&&i_seat_flexion>=13.5) {
		grade =74;
	}else if (i_seat_flexion<13.5&&i_seat_flexion>=12.1) {
		grade =72;
	}else if (i_seat_flexion<12.1&&i_seat_flexion>=10.7) {
		grade =70;
	}else if (i_seat_flexion<10.7&&i_seat_flexion>=9.3) {
		grade =68;
	}else if (i_seat_flexion<9.3&&i_seat_flexion>=7.9) {
		grade =66;
	}else if (i_seat_flexion<7.9&&i_seat_flexion>=6.5) {
		grade =64;
	}else if (i_seat_flexion<6.5&&i_seat_flexion>=5.1) {
		grade =62;
	}else if (i_seat_flexion<5.1&&i_seat_flexion>=3.7) {
		grade =60;
	}else if (i_seat_flexion<3.7&&i_seat_flexion>=2.7) {
		grade =50;
	}else if (i_seat_flexion<2.7&&i_seat_flexion>=1.7) {
		grade =40;
	}else if (i_seat_flexion<1.7&&i_seat_flexion>=0.7) {
		grade =30;
	}else if (i_seat_flexion<0.7&&i_seat_flexion>0.2) {
		grade =20;
	}else if (i_seat_flexion<=0.2&i_seat_flexion>0) {
		grade =10;
	}

	return grade;
		
	}

	
/**
 *  立定跳远成绩
 * @param i_standing_long_jump
 * @return 立定跳远成绩
 */
	private int  i_standing_long_jumpGrade(int i_standing_long_jump) {
		int grade=0;
		if (i_standing_long_jump>=273) {
			grade=100;
		}else if (i_standing_long_jump<273&&i_standing_long_jump>=268) {
			grade =95;
		}else if (i_standing_long_jump<268&&i_standing_long_jump>=263) {
			grade =90;
		}else if (i_standing_long_jump<263&&i_standing_long_jump>=256) {
			grade =85;
		}else if (i_standing_long_jump<256&&i_standing_long_jump>=248) {
			grade =80;
		}else if (i_standing_long_jump<248&&i_standing_long_jump>=244) {
			grade =78;
		}else if (i_standing_long_jump<244&&i_standing_long_jump>=240) {
			grade =76;
			
		}else if (i_standing_long_jump<240&&i_standing_long_jump>=236) {
			grade =74;
			
		}else if (i_standing_long_jump<236&&i_standing_long_jump>=232) {
			grade =72;
		}else if (i_standing_long_jump<232&&i_standing_long_jump>=228) {
			grade =70;
		}else if (i_standing_long_jump<228&&i_standing_long_jump>=224) {
			grade =68;
		}else if (i_standing_long_jump<224&&i_standing_long_jump>=220) {
			grade =66;
		}else if (i_standing_long_jump<220&&i_standing_long_jump>=216) {
			grade =64;
		}else if (i_standing_long_jump<216&&i_standing_long_jump>=212) {
			grade =62;
		}else if (i_standing_long_jump<212&&i_standing_long_jump>=208) {
			grade =60;
		}else if (i_standing_long_jump<208&&i_standing_long_jump>=203) {
			grade =50;
		}else if (i_standing_long_jump<203&&i_standing_long_jump>=198) {
			grade =40;
		}else if (i_standing_long_jump<198&&i_standing_long_jump>=193) {
			grade =30;
		}else if (i_standing_long_jump<193&&i_standing_long_jump>=188) {
			grade =20;
		}else if (i_standing_long_jump<188&&i_standing_long_jump>=183) {
			grade =10;
		}
		else {
			grade =0;
		}
		return grade;
	
		
	}
	




	private int pull_upGrade(int i_pull_up) {
		// 计算引体向上的成绩
		int grade=0;
		if (i_pull_up==19) {
			grade=100;
		}
		else if (i_pull_up==18) {
			grade=95;
		}
		else if (i_pull_up==17) {
			grade=90;
		}
		else if (i_pull_up==16) {
			grade=85;
		}
		else if (i_pull_up==15) {
			grade=80;
		}
		else if (i_pull_up==14) {
			grade=76;
		}
		else if (i_pull_up==13) {
			grade=72;
		}
		else if (i_pull_up==12) {
			grade=68;
		}
		else if (i_pull_up==11) {
			grade=64;
		}
		else if (i_pull_up==10) {
			grade=60;
		}else if (i_pull_up==9) {
			grade=50;
		}else if (i_pull_up==8) {
			grade=40;
		}else if (i_pull_up==7) {
			grade=30;
		}else if (i_pull_up==6) {
			grade=20;
		}else if (i_pull_up==5) {
			grade=10;
		}else if (i_pull_up<4) {
			grade=0;
		}
		
		//额外的加分
		if (i_pull_up>19) {
			grade=grade+i_pull_up-19;
		}
		return grade;
	}

	private int i_run_1000Grade(int i_run_1000) {
		// 计算1000米跑的成绩，单位秒
		int grade=0;
		if (i_run_1000==197) {
			grade=100;
		}
		else if (i_run_1000>197&&i_run_1000<=202) {
			grade=95;
		}
		else if (i_run_1000>202&&i_run_1000<=207) {
			grade=90;
		}
		else if (i_run_1000>207&&i_run_1000<=214) {
			grade=85;
		}
		else if (i_run_1000>214&&i_run_1000<=222) {
			grade=80;
		}
		else if (i_run_1000>222&&i_run_1000<=227) {
			grade=78;
		}
		else if (i_run_1000>227&&i_run_1000<=232) {
			grade=76;
		}
		else if (i_run_1000>232&&i_run_1000<=237) {
			grade=74;
		}
		else if (i_run_1000>237&&i_run_1000<=242) {
			grade=72;
		}
		else if (i_run_1000>242&&i_run_1000<=247) {
			grade=70;
		}else if (i_run_1000>247&&i_run_1000<=252) {
			grade=68;
		}else if (i_run_1000>252&&i_run_1000<=257) {
			grade=66;
		}else if (i_run_1000>257&&i_run_1000<=262) {
			grade=64;
		}else if (i_run_1000>262&&i_run_1000<=267) {
			grade=62;
		}else if (i_run_1000>267&&i_run_1000<=272) {
			grade=60;
		}else if (i_run_1000>272&&i_run_1000<=292) {
			grade=50;
		}else if (i_run_1000>292&&i_run_1000<=312) {
			grade=40;
		}else if (i_run_1000>312&&i_run_1000<=332) {
			grade=30;
		}else if (i_run_1000>332&&i_run_1000<=352) {
			grade=20;
		}else if (i_run_1000>352&&i_run_1000<=372) {
			grade=10;
		}
		
		else if (i_run_1000>372) {
			grade=0;
		}
		
		//额外的加分,年级不同标准 不同
		i_run_1000=i_run_1000-2;
		if (i_run_1000<195&&i_run_1000>0) {
			if (195-i_run_1000>=35) {
				grade =grade +10;
			}else if (195-i_run_1000>=32) {
				grade =grade +9;
			}else if (195-i_run_1000>=29) {
				grade =grade +8;
			}else if (195-i_run_1000>=26) {
				grade =grade +7;
			}else if (195-i_run_1000>=23) {
				grade =grade +6;
			}else if (195-i_run_1000>=20) {
				grade =grade +5;
			}else if (195-i_run_1000>=16) {
				grade =grade +4;
			}else if (195-i_run_1000>=12) {
				grade =grade +3;
			}else if (195-i_run_1000>=8) {
				grade =grade +2;
			}else if (195-i_run_1000>=4) {
				grade =grade +1;
			}
		}
		return grade;
	}

	
	
	public void init() throws ServletException{}
}
