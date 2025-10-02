# Nome dos executáveis
PROG1 = programa
PROG2 = casos

# Compilador
CC = gcc

# Flags de compilação
CFLAGS = -Wall -g

# Objetos comuns (biblioteca ABB)
ABB_OBJS = abb.o

# Objetos de cada main
MAIN1_OBJS = main.o
MAIN2_OBJS = main_casos.o

# Regra padrão: compilar os dois
all: $(PROG1) $(PROG2)

# Programa 1 (main.c)
$(PROG1): $(MAIN1_OBJS) $(ABB_OBJS)
	$(CC) $(CFLAGS) -o $(PROG1) $(MAIN1_OBJS) $(ABB_OBJS)

# Programa 2 (main_casos.c)
$(PROG2): $(MAIN2_OBJS) $(ABB_OBJS)
	$(CC) $(CFLAGS) -o $(PROG2) $(MAIN2_OBJS) $(ABB_OBJS)

# Compila ABB
abb.o: abb.c abb.h
	$(CC) $(CFLAGS) -c abb.c

# Compila main normal
main.o: main.c abb.h
	$(CC) $(CFLAGS) -c main.c

# Compila main de casos
main_casos.o: main_casos.c abb.h
	$(CC) $(CFLAGS) -c main_casos.c

# Limpeza
clean:
	rm -f *.o $(PROG1) $(PROG2)
