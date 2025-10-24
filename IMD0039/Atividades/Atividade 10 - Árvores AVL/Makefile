# Nome do compilador e flags
CC = gcc
CFLAGS = -Wall -std=c99

# Diretórios de origem e saída
SRC_DIR = /mnt/data
OBJ_DIR = obj

# Arquivos fonte
SOURCES = $(SRC_DIR)/main.c $(SRC_DIR)/avl.c

# Arquivos objetos
OBJECTS = $(SOURCES:.c=.o)

# Nome do executável
EXEC = programa

# Regra padrão para compilar o programa
all: $(EXEC)

# Como compilar o programa
$(EXEC): $(OBJECTS)
	$(CC) $(OBJECTS) -o $(EXEC)

# Como compilar os arquivos .c para .o
$(OBJ_DIR)/%.o: $(SRC_DIR)/%.c
	$(CC) $(CFLAGS) -c $< -o $@

# Limpar arquivos gerados
clean:
	rm -f $(EXEC) $(OBJECTS)

# Forçar as regras de construção para sempre serem executadas
.PHONY: all clean