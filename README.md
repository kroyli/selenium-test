Selenium Test Project / Проект Selenium Test
About the project
This is a simple Java project using Selenium WebDriver.
It opens the Google Chrome browser, loads https://www.google.com, and closes the browser.

Project requirements
Java JDK 11 or higher

Installed Google Chrome browser

ChromeDriver (version must match the installed Chrome)

Maven (if used to build the project)

How to run
Download ChromeDriver from the official site: https://sites.google.com/chromium.org/driver

Place ChromeDriver in the project folder or add it to your system PATH.

Clone the repository:

bash
Kopieren
Bearbeiten
git clone https://github.com/kroyli/selenium-test.git
cd selenium-test
Build the project:

bash
Kopieren
Bearbeiten
mvn clean compile
Run the program:

bash
Kopieren
Bearbeiten
mvn exec:java -Dexec.mainClass="com.example.SeleniumTest"
Or run the SeleniumTest class from your IDE.

What the program does
Opens Google Chrome browser

Loads https://www.google.com

Closes the browser

License
MIT

О проекте
Это простой проект на Java с использованием Selenium WebDriver.
Он открывает браузер Google Chrome, загружает страницу https://www.google.com и закрывает браузер.

Требования
Java JDK 11 или выше

Установленный браузер Google Chrome

ChromeDriver (версия должна соответствовать установленному Chrome)

Maven (если используется для сборки проекта)

Как запустить
Скачайте ChromeDriver с официального сайта: https://sites.google.com/chromium.org/driver

Положите ChromeDriver в папку с проектом или добавьте его в системный PATH.

Клонируйте репозиторий:

bash
Kopieren
Bearbeiten
git clone https://github.com/kroyli/selenium-test.git
cd selenium-test
Соберите проект:

bash
Kopieren
Bearbeiten
mvn clean compile
Запустите программу:

bash
Kopieren
Bearbeiten
mvn exec:java -Dexec.mainClass="com.example.SeleniumTest"
Или запустите класс SeleniumTest из вашей IDE.

Что делает программа
Открывает браузер Google Chrome

Загружает страницу https://www.google.com

Закрывает браузер

Лицензия
MIT
