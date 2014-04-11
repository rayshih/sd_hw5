
all:
	javac -cp src src/hw04/Main.java -d bin/

run:
	java -cp bin hw04.Main
