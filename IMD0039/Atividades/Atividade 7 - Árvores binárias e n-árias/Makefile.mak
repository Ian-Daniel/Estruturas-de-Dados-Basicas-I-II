# Nome do compilador
CC = gcc

# Flags de compilação
CFLAGS = -Wall -Wextra -std=c99

# Arquivos do projeto
OBJ = main.o arvore.o

# Nome do executável final
EXEC = arvore

# Regra padrão
all: $(EXEC)

# Como gerar o executável
$(EXEC): $(OBJ)
	$(CC) $(CFLAGS) -o $(EXEC) $(OBJ)

# Como compilar cada .c em .o
main.o: main.c arvore.h
	$(CC) $(CFLAGS) -c main.c

arvore.o: arvore.c arvore.h
	$(CC) $(CFLAGS) -c arvore.c

# Limpeza dos arquivos compilados
clean:
	rm -f $(OBJ) $(EXEC)
