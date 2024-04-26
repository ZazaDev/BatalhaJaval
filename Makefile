CC = javac
SRCS = App.java GUI.java

all: compile

compile:
	$(CC) $(SRCS)

clean:
	rm *.class