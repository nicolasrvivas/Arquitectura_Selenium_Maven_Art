set projectLocation=C:\Temp\eclipse-workspace\Arquitectura_Selenium_Maven_Art
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
echo %classpath%
java org.testng.TestNG %projectLocation%\testng_Caso_Login_QANova.xml
pause