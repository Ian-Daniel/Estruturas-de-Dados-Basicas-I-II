# Nome do executável
EXEC = programa

# Compilador
CC = gcc

# Opções de compilação
CFLAGS = -Wall -Wextra -std=c99

# Arquivos fonte e objetos
SRC = main.c trie.c
OBJ = $(SRC:.c=.o)

# Regra padrão
all: $(EXEC)

# Como compilar o executável
$(EXEC): $(OBJ)
	$(CC) $(CFLAGS) -o $@ $^

# Como compilar arquivos .o
%.o: %.c
	$(CC) $(CFLAGS) -c $<

# Executar o programa
run: all
	./$(EXEC)

# Limpar arquivos compilados
clean:
	rm -f $(OBJ) $(EXEC)

# Evita que targets com o mesmo nome que arquivos causem problemas
.PHONY: all run clean