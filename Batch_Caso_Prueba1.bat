set projectLocation=C:\Temp\eclipse-workspace\Arquitectura_Selenium_Maven_Art
cd %projectLocation%
mvn -Dtest=Caso_Login_QANova2_test test > list_Caso_Prueba1.txt
type list_Caso_Prueba1.txt
paused