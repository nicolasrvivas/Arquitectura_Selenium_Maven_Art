set projectLocation=C:\Temp\eclipse-workspace\Arquitectura_Selenium_Maven_Art
cd %projectLocation%
set classpath=%projectLocation%\target\test-classes;%projectLocation%\target\classes;%projectLocation%\lib\*
echo %classpath%
java org.testng.TestNG %projectLocation%\testng_Caso_4.xml
pause