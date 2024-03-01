package com.example.app1

data class Pessoa(var Id:Int?, var nome: String, var idade: Int) {
    fun getDadosPessoa(): String{
        var ret: String = "$nome tem $idade anos. Viveu aproximadamente "+
                (idade*365) +"dias."

        return ret
    }
}