CC = gcc
CFLAGS = -Wall -Wextra -std=c11 -g
OBJS = arvvar.o
TARGET = main

all: $(TARGET)

$(TARGET): $(OBJS) main.o
	$(CC) $(CFLAGS) -o $(TARGET) main.o $(OBJS)

arvvar.o: arvvar.c arvvar.h
	$(CC) $(CFLAGS) -c arvvar.c

main.o: main.c arvvar.h
	$(CC) $(CFLAGS) -c main.c

clean:
	rm -f *.o $(TARGET)

.PHONY: all clean
