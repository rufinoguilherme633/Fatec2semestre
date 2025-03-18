class Carro:
    def __init__(self,marca,modelo):
        self.marca = marca
        self.modelo = modelo

    def exibirInfo(self):
        return f"{self.marca} {self.modelo}"
    
carro = Carro("HB20","Hyundai")

print(carro.exibirInfo())



class Pessoa:
    def __init__(self,nome,idade):
        self.nome = nome
        self.idade = idade
    
    def apresentar(self):
        return f"{self.nome} {self.idade}"
    

pessoa1 = Pessoa("Guilherme","Rufino");
print(pessoa1.apresentar())



class Estudante(Pessoa):
    def __init__(self,nome,idade,matricula):
        super().__init__(nome,idade)
        self.matricula = matricula
    def apresentar(self):
        mensagem_pai = super().apresentar();
        return f"{mensagem_pai} matricula: {self.matricula}"
    

estudante = Estudante("Guilherme", "Campos",22222)
print(estudante.apresentar())



