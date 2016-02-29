import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.util.*;
import java.io.*;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.view.*;

public class MyiReportViewer extends JFrame
{

public MyiReportViewer(String fileName)
{
this(fileName,null);
}

public MyiReportViewer(String fileName,HashMap parameter)
{
super("View Report");
try
{

/* load the required JDBC driver and create the connection
here JDBC-ODBC Bridge Driver is used*/
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "test");

//Way 1
/*JasperDesign jasperDesign = JasperManager.loadXmlDesign(fileName);
JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, con);*/

//Way 2
/*JasperReport jasperReport = JasperCompileManager.compileReport(fileName);
JasperPrint print = JasperFillManager.fillReport(jasperReport, parameter, con);*/

/*Way 3 (Here the parameter file should be in .jasper extension i.e., the compiled report)*/
JasperPrint print = JasperFillManager.fillReport(fileName, parameter, con);

JRViewer viewer=new JRViewer(print);

Container c=getContentPane();
c.add(viewer);
}
catch(ClassNotFoundException cnfe)
{
cnfe.printStackTrace();
}
catch(SQLException sqle)
{
sqle.printStackTrace();
}
catch(JRException jre)
{
jre.printStackTrace();
}

setBounds(10,10,900,600);
setDefaultCloseOperation(DISPOSE_ON_CLOSE);


}

public static void main(String args[])
{
HashMap param=new HashMap();
//param.put("reportParameterName",valueForTheParameter);C:\Users\Kavinda\Desktop\reports
MyiReportViewer viewer=new MyiReportViewer("C:\\Users\\ASUS USER\\Desktop\\Oleada Cab Service\\src\\reports\\report1.jasper",param);
viewer.setVisible(true);
}
}
