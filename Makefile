
all:
	javac -cp src src/hw5_1/Main.java -d bin/

run:
	java -cp bin hw5_1.Main
