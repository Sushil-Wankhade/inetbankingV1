/*
 * package com.inetbanking.utilities;
 * 
 * import java.io.File; import java.io.IOException; import
 * java.text.SimpleDateFormat; import java.util.Date;
 * 
 * import org.testng.ITestContext; import org.testng.ITestResult; import
 * org.testng.TestListenerAdapter;
 * 
 * import com.aventstack.extentreports.ExtentReports; import
 * com.aventstack.extentreports.ExtentTest; import
 * com.aventstack.extentreports.Status; import
 * com.aventstack.extentreports.markuputils.ExtentColor; import
 * com.aventstack.extentreports.markuputils.MarkupHelper; import
 * com.aventstack.extentreports.markuputils.ExtentHtmlReporter; //import
 * com.aventstack.extentreports.reporter.ExtentReporter; import
 * com.aventstack.extentreports.reporter.configuration.Theme;
 * 
 * 
 * public class Reporting extends TestListenerAdapter {
 * 
 * public ExtentHtmlReporter htmlReporter; public ExtentReporter extent; public
 * ExtentTest logger;
 * 
 * public void onStar(ITestContext testcontext) { String timeStamp = new
 * SimpleDateFormat("yyyy.mm.dd.HH.mm.ss").format(new Date()); String
 * repName="Test-Report-"+timeStamp+".html"; htmlReporter=new
 * ExtentHtmlReporter(System.getProperty("user.dir")+ "/test-output/"+repName);
 * htmlReporter=lodeXMLConfig(System.getProperty("user.dir")+
 * "/extent-config.xml");
 * 
 * extent=new ExtentReporter();
 * 
 * extent.attachReporter(htmlReporter); extent.setSystemInfo("Host name",
 * "localhost"); extent.setSystemInfo("Environement", "QA");
 * extent.setSystemInfo("user", "pavan");
 * 
 * htmlReporter.config().setDocumentTitle("InetBanking Test Project");
 * htmlReporter.config().setReportName("Functional Test Report");
 * htmlReporter.config().setTestViewChartLocation(ChartLocation.Top);
 * htmlReporter.config().setTheme(Theme.DARK); }
 * 
 * public void onTestSucces(ITestResult tr) {
 * logger=extent.createTest(tr.getName());
 * logger=log(Status.PASS,MarkupHelper.createLabel(tr.getName(),
 * ExtentColor.GREEN)); }
 * 
 * public void onTestFailure(ITestResult tr) {
 * logger=extent.createTest(tr.getName());
 * logger=log(Status.FAIL,MarkupHelper.createLabel(tr.getName(),
 * ExtentColor.RED));
 * 
 * String screenshotPath=System.getProperty("user.dir")+
 * "\\Screenshots\\"+tr.getName()+".png";
 * 
 * File f = new File(screenshotPath);
 * 
 * if(f.exists()) { try { logger.fail("Screenshot is below:"
 * +logger.addScreenCaptureFromPath(screenshotPath)); } catch(IOException e) {
 * e.printStackTrace(); } } }
 * 
 * public void onTestSkipped(ITestResult tr) {
 * logger=extent.createTest(tr.getName());
 * logger=log(Status.SKIP,MarkupHelper.createLabel(tr.getName(),
 * ExtentColor.ORANGE)); }
 * 
 * public void onFinish(ITestContext testContext) { extent.flush(); } }
 */