CC = javac
SRCS = App.java GUI.java Player.java AI.java Engine.java

all: compile

compile:
	$(CC) $(SRCS)

clean:
	rm *.class