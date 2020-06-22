package spring.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewLecExam;
import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;
import spring.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Exam exam = new NewLecExam();
//		ExamConsole console = new GridExamConsole(exam);
//		console.setExam(exam);
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		
		// ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
	}

}
