package calculate;


import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalculatorFemale02 extends HttpServlet {



	private static final long serialVersionUID = 1L;
	public CalculatorFemale02() {
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
		String _sit_ups=request.getParameter("sit_ups");
		  String _run_50=request.getParameter("run_50");
		String _run_800=request.getParameter("run_800");
		

		    int i_height = 1;
		    int i_weight = 1;
		    int i_vital_capacity = 0;
		    int i_standing_long_jump = 0;
		    int i_seat_flexion = 0;
		   int i_sit_ups = 0;
		    int i_run_50 = 0;
		    int i_run_800 =0;
		
				
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
						i_sit_ups = Integer.valueOf(_sit_ups).intValue();
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
							i_run_800 = Integer.valueOf(_run_800).intValue();
						} catch (NumberFormatException e) {
							// TODO 自动生成的 catch 块
							e.printStackTrace();
						}		
			
			
			float i=(float) 0.0;
			i=(float) ((float)BMIGrade(i_height,i_weight)*0.15+(float)i_vital_capacityGrade(i_vital_capacity)*0.15+(float)i_run_50Grade(i_run_50)*0.2+(float)i_seat_flexionGrad(i_seat_flexion)*0.1+(float)i_standing_long_jumpGrade(i_standing_long_jump)*0.1+(float)sit_upsGrade(i_sit_ups)*0.1+(float)i_run_800Grade(i_run_800)*0.2);
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
	out.println("仰卧起坐成绩为"+sit_upsGrade(i_sit_ups)+"分");
	out.println("</p>");
	out.println("<p>");
	out.println("800米跑成绩为"+i_run_800Grade(i_run_800)+"分");
	
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
		if (i>=17.2&&i<=23.9) {
			grade=100;
		}
		if (i<17.2) {
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
	if (i_vital_capacity>=3450) {
		grade=100;
	}
	else if (i_vital_capacity>=3400&&i_vital_capacity<3450) {
		grade=95;
	}
	else if (i_vital_capacity>=3350&&i_vital_capacity<3400) {
		grade=90;
	}else if (i_vital_capacity>=3200&&i_vital_capacity<3350) {
		grade=85;
	}else if (i_vital_capacity>=3050&&i_vital_capacity<3200) {
		grade=80;
	}else if (i_vital_capacity>=2950&&i_vital_capacity<3050) {
		grade=78;
	}else if (i_vital_capacity>=2850&&i_vital_capacity<2950) {
		grade=76;
	}else if (i_vital_capacity>=2750&&i_vital_capacity<2850) {
		grade=74;
	}else if (i_vital_capacity>=2650&&i_vital_capacity<2750) {
		grade=72;
	}else if (i_vital_capacity>=2550&&i_vital_capacity<2650) {
		grade=70;
	}else if (i_vital_capacity>=2450&&i_vital_capacity<2550) {
		grade=68;
	}else if (i_vital_capacity>=2350&&i_vital_capacity<2450) {
		grade=66;
	}else if (i_vital_capacity>=2250&&i_vital_capacity<2350) {
		grade=64;
	}else if (i_vital_capacity>=2150&&i_vital_capacity<2250) {
		grade=62;
		
	}else if (i_vital_capacity>=2050&&i_vital_capacity<2150) {
		grade=60;
		
	}else if (i_vital_capacity>=2010&&i_vital_capacity<2050) {
		grade=50;
	}else if (i_vital_capacity>=1970&&i_vital_capacity<2010) {
		grade=40;
	}else if (i_vital_capacity>=1930&&i_vital_capacity<1970) {
		grade=30;
	}else if (i_vital_capacity>=1890&&i_vital_capacity<1930) {
		grade=20;
	}else if (i_vital_capacity>=1850&&i_vital_capacity<1890) {
		grade=10;
	}
	
	else if (i_vital_capacity<1850) {
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
		if (i_run_50<=74&&i_run_50>0) {
			grade=100;
		}
		else if (i_run_50==75) {
			grade=95;
		}
		else if (i_run_50==76) {
			grade=90;
		}
		else if (i_run_50==77||i_run_50==78||i_run_50==79) {
			grade=85;
		}
		else if (i_run_50==80||i_run_50==81||i_run_50==82) {
			grade=80;
		}
		else if (i_run_50==83||i_run_50==84) {
			grade=78;
		}
		else if (i_run_50==85||i_run_50==86) {
			grade=76;
		}	else if (i_run_50==87||i_run_50==88) {
			grade=74;
		}	else if (i_run_50==89||i_run_50==90) {
			grade=72;
		}	else if (i_run_50==91||i_run_50==92) {
			grade=70;
		}	else if (i_run_50==93||i_run_50==94) {
			grade=68;
		}	else if (i_run_50==95||i_run_50==96) {
			grade=66;
		}	else if (i_run_50==97||i_run_50==98) {
			grade=64;
		}	else if (i_run_50==99||i_run_50==100) {
			grade=62;
		}	else if (i_run_50==101||i_run_50==102) {
			grade=60;
		}	else if (i_run_50==103||i_run_50==104) {
			grade=50;
		}	else if (i_run_50==105||i_run_50==106) {
			grade=40;
		}	else if (i_run_50==107||i_run_50==108) {
			grade=30;
		}	else if (i_run_50==109||i_run_50==110) {
			grade=20;
		}	else if (i_run_50==111||i_run_50==112) {
			grade=10;
		}	
	
		
		else if (i_run_50>112) {
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
	if (i_seat_flexion>=26.3) {
		grade=100;
	}else if (i_seat_flexion<26.3&&i_seat_flexion>=24.4) {
		grade =95;
	}else if (i_seat_flexion<24.4&&i_seat_flexion>=22.4) {
		grade =90;
	}else if (i_seat_flexion<22.4&&i_seat_flexion>=21.0) {
		grade =85;
	}else if (i_seat_flexion<21.0&&i_seat_flexion>=19.5) {
		grade =80;
	}else if (i_seat_flexion<19.5&&i_seat_flexion>=18.2) {
		grade =78;
	}else if (i_seat_flexion<18.2&&i_seat_flexion>=16.9) {
		grade =76;
	}else if (i_seat_flexion<16.9&&i_seat_flexion>=15.6) {
		grade =74;
	}else if (i_seat_flexion<15.6&&i_seat_flexion>=14.3) {
		grade =72;
	}else if (i_seat_flexion<14.3&&i_seat_flexion>=13.0) {
		grade =70;
	}else if (i_seat_flexion<13.0&&i_seat_flexion>=11.7) {
		grade =68;
	}else if (i_seat_flexion<11.7&&i_seat_flexion>=10.4) {
		grade =66;
	}else if (i_seat_flexion<10.4&&i_seat_flexion>=9.1) {
		grade =64;
	}else if (i_seat_flexion<9.1&&i_seat_flexion>=7.8) {
		grade =62;
	}else if (i_seat_flexion<7.8&&i_seat_flexion>=6.5) {
		grade =60;
	}else if (i_seat_flexion<6.5&&i_seat_flexion>=5.7) {
		grade =50;
	}else if (i_seat_flexion<5.7&&i_seat_flexion>=4.9) {
		grade =40;
	}else if (i_seat_flexion<4.9&&i_seat_flexion>=4.1) {
		grade =30;
	}else if (i_seat_flexion<4.1&&i_seat_flexion>=3.3) {
		grade =20;
	}else if (i_seat_flexion<3.3&&i_seat_flexion>=2.5) {
		grade =10;
	}
	else {
		grade =0;
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
		if (i_standing_long_jump>=208) {
			grade=100;
		}else if (i_standing_long_jump<208&&i_standing_long_jump>=202) {
			grade =95;
		}else if (i_standing_long_jump<202&&i_standing_long_jump>=196) {
			grade =90;
		}else if (i_standing_long_jump<196&&i_standing_long_jump>=189) {
			grade =85;
		}else if (i_standing_long_jump<189&&i_standing_long_jump>=182) {
			grade =80;
		}else if (i_standing_long_jump<182&&i_standing_long_jump>=179) {
			grade =78;
		}else if (i_standing_long_jump<179&&i_standing_long_jump>=176) {
			grade =76;
		}else if (i_standing_long_jump<176&&i_standing_long_jump>=173) {
			grade =74;
		}else if (i_standing_long_jump<173&&i_standing_long_jump>=170) {
			grade =72;
		}else if (i_standing_long_jump<170&&i_standing_long_jump>=167) {
			grade =70;
		}else if (i_standing_long_jump<167&&i_standing_long_jump>=164) {
			grade =68;
		}else if (i_standing_long_jump<164&&i_standing_long_jump>=161) {
			grade =66;
		}else if (i_standing_long_jump<161&&i_standing_long_jump>=158) {
			grade =64;
		}else if (i_standing_long_jump<158&&i_standing_long_jump>=155) {
			grade =62;
		}else if (i_standing_long_jump<155&&i_standing_long_jump>=152) {
			grade =60;
		}else if (i_standing_long_jump<152&&i_standing_long_jump>=147) {
			grade =50;
		}else if (i_standing_long_jump<147&&i_standing_long_jump>=142) {
			grade =40;
		}else if (i_standing_long_jump<142&&i_standing_long_jump>=137) {
			grade =30;
		}else if (i_standing_long_jump<137&&i_standing_long_jump>=132) {
			grade =20;
		}else if (i_standing_long_jump<132&&i_standing_long_jump>=127) {
			grade =10;
		}
		else {
			grade =0;
		}
		return grade;
	
		
	}
	




	private int sit_upsGrade(int i_sit_ups) {
		// 计算仰卧起坐的成绩
		int grade=0;
		if (i_sit_ups==57) {
			grade=100;
		}else if (i_sit_ups<57&&i_sit_ups>=55) {
			grade =95;
		}else if (i_sit_ups<55&&i_sit_ups>=53) {
			grade =90;
		}else if (i_sit_ups<53&&i_sit_ups>=50) {
			grade =85;
		}else if (i_sit_ups<50&&i_sit_ups>=47) {
			grade =80;
		}else if (i_sit_ups<47&&i_sit_ups>=48) {
			grade =78;
		}else if (i_sit_ups<45&&i_sit_ups>=43) {
			grade =76;
		}else if (i_sit_ups<43&&i_sit_ups>=41) {
			grade =74;
		}else if (i_sit_ups<41&&i_sit_ups>=39) {
			grade =72;
		}else if (i_sit_ups<39&&i_sit_ups>=37) {
			grade =70;
		}else if (i_sit_ups<37&&i_sit_ups>=35) {
			grade =68;
		}else if (i_sit_ups<35&&i_sit_ups>=33) {
			grade =66;
		}else if (i_sit_ups<33&&i_sit_ups>=31) {
			grade =64;
		}else if (i_sit_ups<31&&i_sit_ups>=29) {
			grade =62;
		}else if (i_sit_ups<29&&i_sit_ups>=27) {
			grade =60;
		}else if (i_sit_ups<27&&i_sit_ups>=25) {
			grade =50;
		}else if (i_sit_ups<25&&i_sit_ups>=23) {
			grade =40;
		}else if (i_sit_ups<23&&i_sit_ups>=21) {
			grade =30;
		}else if (i_sit_ups<21&&i_sit_ups>=19) {
			grade =20;
		}else if (i_sit_ups<19&&i_sit_ups>=17) {
			grade =10;
		}
		else {
			grade =0;
		}
		
		//额外的加分
		if (i_sit_ups-57>=6) {
			grade=grade+i_sit_ups-20-57+3;
		}else if (i_sit_ups-57>=4) {
			grade=grade+2;
		}else if (i_sit_ups-57>=2) {
			grade=grade+1;
		}
		return grade;
	}

	private int i_run_800Grade(int i_run_800) {
		// 计算1000米跑的成绩，单位秒
		int grade=0;
		if (i_run_800==196) {
			grade=100;
		}
		else if (i_run_800>196&&i_run_800<=202) {
			grade=95;
		}
		else if (i_run_800>202&&i_run_800<=208) {
			grade=90;
		}
		else if (i_run_800>208&&i_run_800<=216) {
			grade=85;
		}
		else if (i_run_800>216&&i_run_800<=223) {
			grade=80;
		}
		else if (i_run_800>223&&i_run_800<=227) {
			grade=78;
		}
		else if (i_run_800>227&&i_run_800<=232) {
			grade=76;
		}
		else if (i_run_800>232&&i_run_800<=237) {
			grade=74;
		}
		else if (i_run_800>237&&i_run_800<=242) {
			grade=72;
		}
		else if (i_run_800>242&&i_run_800<=247) {
			grade=70;
		}else if (i_run_800>247&&i_run_800<=252) {
			grade=68;
		}else if (i_run_800>252&&i_run_800<=257) {
			grade=66;
		}else if (i_run_800>257&&i_run_800<=262) {
			grade=64;
		}else if (i_run_800>262&&i_run_800<=267) {
			grade=62;
		}else if (i_run_800>267&&i_run_800<=272) {
			grade=60;
		}else if (i_run_800>272&&i_run_800<=282) {
			grade=50;
		}else if (i_run_800>282&&i_run_800<=292) {
			grade=40;
		}else if (i_run_800>292&&i_run_800<=302) {
			grade=30;
		}else if (i_run_800>302&&i_run_800<=312) {
			grade=20;
		}else if (i_run_800>312&&i_run_800<=322) {
			grade=10;
		}
		
		else if (i_run_800>370) {
			grade=0;
		}
		
		//额外的加分
		if (i_run_800<196&&i_run_800>0) {
				
			grade =(int) (grade +(i_run_800-196)*0.2);
			
		}
		return grade;
	}

	
	
	public void init() throws ServletException{}
}
