package calculate;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorMale02 extends HttpServlet {



	private static final long serialVersionUID = 1L;
	public CalculatorMale02() {
		super();

	}

	// TODO 自动生成的构造函数存根
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
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
						i_weight = Integer.valueOf(_weight).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
						i_vital_capacity = Integer.valueOf(_vital_capacity).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					try {
						i_standing_long_jump = Integer.valueOf(_standing_long_jump).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
						i_seat_flexion = Integer.valueOf(_seat_flexion).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
						i_pull_up = Integer.valueOf(_pull_up).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
						i_run_50 = Integer.valueOf(_run_50).intValue();
					} catch (NumberFormatException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					 try {
							i_run_1000 = Integer.valueOf(_run_1000).intValue();
						} catch (NumberFormatException e) {
							// TODO 自动生成的 catch 块
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
	if (i_vital_capacity>=5140) {
		grade=100;
	}
	else if (i_vital_capacity>=5020&&i_vital_capacity<5140) {
		grade=95;
	}
	else if (i_vital_capacity>=4900&&i_vital_capacity<5020) {
		grade=90;
	}else if (i_vital_capacity>=4650&&i_vital_capacity<4900) {
		grade=85;
	}else if (i_vital_capacity>=4400&&i_vital_capacity<4650) {
		grade=80;
	}else if (i_vital_capacity>=4280&&i_vital_capacity<4400) {
		grade=78;
	}else if (i_vital_capacity>=4160&&i_vital_capacity<4280) {
		grade=76;
	}else if (i_vital_capacity>=4040&&i_vital_capacity<4160) {
		grade=74;
	}else if (i_vital_capacity>=3920&&i_vital_capacity<4040) {
		grade=72;
	}else if (i_vital_capacity>=3800&&i_vital_capacity<3920) {
		grade=70;
	}else if (i_vital_capacity>=3680&&i_vital_capacity<3800) {
		grade=68;
	}else if (i_vital_capacity>=3560&&i_vital_capacity<3680) {
		grade=66;
	}else if (i_vital_capacity>=3440&&i_vital_capacity<3560) {
		grade=64;
	}else if (i_vital_capacity>=3320&&i_vital_capacity<3440) {
		grade=62;
		
	}else if (i_vital_capacity>=3200&&i_vital_capacity<3320) {
		grade=60;
		
	}else if (i_vital_capacity>=3030&&i_vital_capacity<3200) {
		grade=50;
	}else if (i_vital_capacity>=2860&&i_vital_capacity<3030) {
		grade=40;
	}else if (i_vital_capacity>=2690&&i_vital_capacity<2860) {
		grade=30;
	}else if (i_vital_capacity>=2520&&i_vital_capacity<2690) {
		grade=20;
	}else if (i_vital_capacity>=2350&&i_vital_capacity<2520) {
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
		if (i_run_50<=66&&i_run_50>0) {
			grade=100;
		}
		else if (i_run_50==67) {
			grade=95;
		}
		else if (i_run_50==68) {
			grade=90;
		}
		else if (i_run_50==69) {
			grade=85;
		}
		else if (i_run_50==70) {
			grade=80;
		}
		else if (i_run_50==71||i_run_50==72) {
			grade=78;
		}
		else if (i_run_50==73||i_run_50==74) {
			grade=76;
		}	else if (i_run_50==75||i_run_50==76) {
			grade=74;
		}	else if (i_run_50==77||i_run_50==78) {
			grade=72;
		}	else if (i_run_50==79||i_run_50==80) {
			grade=70;
		}	else if (i_run_50==81||i_run_50==82) {
			grade=68;
		}	else if (i_run_50==83||i_run_50==84) {
			grade=66;
		}	else if (i_run_50==85||i_run_50==86) {
			grade=64;
		}	else if (i_run_50==87||i_run_50==88) {
			grade=62;
		}	else if (i_run_50==89||i_run_50==90) {
			grade=60;
		}	else if (i_run_50==91||i_run_50==92) {
			grade=50;
		}	else if (i_run_50==93||i_run_50==94) {
			grade=40;
		}	else if (i_run_50==95||i_run_50==96) {
			grade=30;
		}	else if (i_run_50==97||i_run_50==98) {
			grade=20;
		}	else if (i_run_50==99||i_run_50==100) {
			grade=10;
		}	
	
		
		else if (i_run_50>100) {
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
	if (i_seat_flexion>=25.1) {
		grade=100;
	}else if (i_seat_flexion<25.1&&i_seat_flexion>=23.3) {
		grade =95;
	}else if (i_seat_flexion<23.3&&i_seat_flexion>=21.5) {
		grade =90;
	}else if (i_seat_flexion<21.5&&i_seat_flexion>=19.9) {
		grade =85;
	}else if (i_seat_flexion<19.9&&i_seat_flexion>=18.2) {
		grade =80;
	}else if (i_seat_flexion<18.2&&i_seat_flexion>=16.8) {
		grade =78;
	}else if (i_seat_flexion<16.8&&i_seat_flexion>=15.4) {
		grade =76;
	}else if (i_seat_flexion<15.4&&i_seat_flexion>=14.0) {
		grade =74;
	}else if (i_seat_flexion<14.0&&i_seat_flexion>=12.6) {
		grade =72;
	}else if (i_seat_flexion<12.6&&i_seat_flexion>=11.2) {
		grade =70;
	}else if (i_seat_flexion<11.2&&i_seat_flexion>=9.8) {
		grade =68;
	}else if (i_seat_flexion<9.8&&i_seat_flexion>=8.4) {
		grade =66;
	}else if (i_seat_flexion<8.4&&i_seat_flexion>=7.0) {
		grade =64;
	}else if (i_seat_flexion<7.0&&i_seat_flexion>=5.6) {
		grade =62;
	}else if (i_seat_flexion<5.6&&i_seat_flexion>=4.2) {
		grade =60;
	}else if (i_seat_flexion<4.2&&i_seat_flexion>=3.2) {
		grade =50;
	}else if (i_seat_flexion<3.2&&i_seat_flexion>=2.2) {
		grade =40;
	}else if (i_seat_flexion<2.2&&i_seat_flexion>=1.2) {
		grade =30;
	}else if (i_seat_flexion<1.2&&i_seat_flexion>=0.2) {
		grade =20;
	}else if (i_seat_flexion<0.2&&i_seat_flexion>0) {
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
		if (i_standing_long_jump>=275) {
			grade=100;
		}else if (i_standing_long_jump<275&&i_standing_long_jump>=270) {
			grade =95;
		}else if (i_standing_long_jump<270&&i_standing_long_jump>=265) {
			grade =90;
		}else if (i_standing_long_jump<265&&i_standing_long_jump>=258) {
			grade =85;
		}else if (i_standing_long_jump<258&&i_standing_long_jump>=250) {
			grade =80;
		}else if (i_standing_long_jump<250&&i_standing_long_jump>=246) {
			grade =78;
		}else if (i_standing_long_jump<246&&i_standing_long_jump>=242) {
			grade =76;
			
		}else if (i_standing_long_jump<242&&i_standing_long_jump>=238) {
			grade =74;
			
		}else if (i_standing_long_jump<238&&i_standing_long_jump>=234) {
			grade =72;
		}else if (i_standing_long_jump<234&&i_standing_long_jump>=230) {
			grade =70;
		}else if (i_standing_long_jump<230&&i_standing_long_jump>=226) {
			grade =68;
		}else if (i_standing_long_jump<226&&i_standing_long_jump>=222) {
			grade =66;
		}else if (i_standing_long_jump<222&&i_standing_long_jump>=218) {
			grade =64;
		}else if (i_standing_long_jump<218&&i_standing_long_jump>=214) {
			grade =62;
		}else if (i_standing_long_jump<214&&i_standing_long_jump>=210) {
			grade =60;
		}else if (i_standing_long_jump<210&&i_standing_long_jump>=205) {
			grade =50;
		}else if (i_standing_long_jump<205&&i_standing_long_jump>=200) {
			grade =40;
		}else if (i_standing_long_jump<200&&i_standing_long_jump>=195) {
			grade =30;
		}else if (i_standing_long_jump<195&&i_standing_long_jump>=190) {
			grade =20;
		}else if (i_standing_long_jump<190&&i_standing_long_jump>=185) {
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
		if (i_pull_up==20) {
			grade=100;
		}
		else if (i_pull_up==19) {
			grade=95;
		}
		else if (i_pull_up==18) {
			grade=90;
		}
		else if (i_pull_up==17) {
			grade=85;
		}
		else if (i_pull_up==16) {
			grade=80;
		}
		else if (i_pull_up==15) {
			grade=76;
		}
		else if (i_pull_up==14) {
			grade=72;
		}
		else if (i_pull_up==13) {
			grade=68;
		}
		else if (i_pull_up==12) {
			grade=64;
		}
		else if (i_pull_up==11) {
			grade=60;
		}else if (i_pull_up==10) {
			grade=50;
		}else if (i_pull_up==9) {
			grade=40;
		}else if (i_pull_up==8) {
			grade=30;
		}else if (i_pull_up==7) {
			grade=20;
		}else if (i_pull_up==6) {
			grade=10;
		}else if (i_pull_up<6) {
			grade=0;
		}
		
		//额外的加分
		if (i_pull_up>20) {
			grade=grade+i_pull_up-20;
		}
		return grade;
	}

	private int i_run_1000Grade(int i_run_1000) {
		// 计算1000米跑的成绩，单位秒
		int grade=0;
		if (i_run_1000==195) {
			grade=100;
		}
		else if (i_run_1000>195&&i_run_1000<=200) {
			grade=95;
		}
		else if (i_run_1000>200&&i_run_1000<=205) {
			grade=90;
		}
		else if (i_run_1000>205&&i_run_1000<=212) {
			grade=85;
		}
		else if (i_run_1000>212&&i_run_1000<=220) {
			grade=80;
		}
		else if (i_run_1000>220&&i_run_1000<=225) {
			grade=78;
		}
		else if (i_run_1000>225&&i_run_1000<=230) {
			grade=76;
		}
		else if (i_run_1000>230&&i_run_1000<=235) {
			grade=74;
		}
		else if (i_run_1000>235&&i_run_1000<=240) {
			grade=72;
		}
		else if (i_run_1000>240&&i_run_1000<=245) {
			grade=70;
		}else if (i_run_1000>244&&i_run_1000<=250) {
			grade=68;
		}else if (i_run_1000>250&&i_run_1000<=255) {
			grade=66;
		}else if (i_run_1000>255&&i_run_1000<=260) {
			grade=64;
		}else if (i_run_1000>260&&i_run_1000<=265) {
			grade=62;
		}else if (i_run_1000>265&&i_run_1000<=270) {
			grade=60;
		}else if (i_run_1000>270&&i_run_1000<=290) {
			grade=50;
		}else if (i_run_1000>290&&i_run_1000<=310) {
			grade=40;
		}else if (i_run_1000>310&&i_run_1000<=330) {
			grade=30;
		}else if (i_run_1000>330&&i_run_1000<=350) {
			grade=20;
		}else if (i_run_1000>350&&i_run_1000<=370) {
			grade=10;
		}
		
		else if (i_run_1000>370) {
			grade=0;
		}
		
		//额外的加分
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
