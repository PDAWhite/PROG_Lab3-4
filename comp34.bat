dir /s /B \*.java > */sources.txt
javac -classpath . @sources.txt
jar -cmf MANIFEST.mf Lab34.jar *.class
pause