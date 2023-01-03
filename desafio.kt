enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario (val nome: String, val id: Int){
    }
    
data class ConteudoEducacional(var nome: String, val duracao: Int = 60){
    }    
data class Formacao(val nome: String, var conteudos: String ) {
	}
   fun main () {
       
       val usuario = Usuario(" Alexandre ", 1)
     
       val conteudo = ConteudoEducacional (" POO ", )
       
       val formacao = Formacao (" Java ", " POO ") 
       
       val nivel = Nivel.BASICO                         
       
       val n = when (nivel) {                      
           Nivel.BASICO -> "Nível Básico "
           Nivel.INTERMEDIARIO -> "Nível Intermediário "
           Nivel.DIFICIL -> "Nível Difícil "
       }
       println(usuario)
       println(conteudo)
       println(formacao)
       println(n)
       
   }
