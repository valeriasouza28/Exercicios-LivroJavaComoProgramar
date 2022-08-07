# Method Overload


  ## Declarando métodos sobrecarregados


   A classe MethodOverload inclui duas versões sobrecarregadas do método square --- uma que calcula o quadrado
de um int (retorna um int) e uma que calcula o quadrado de double(e retorna um double). Embora esses métodos tenham
o mesmo nome e listas e corpos semelhantes de parâmetros, vocẽ pode pensar que neles simplesmente como diferentes métodos. Talvez
ajude a pensar nos nomes dos métodos como "`square` de `int`" e " `square` de `double`", respectivamente.
   A linha 9 invoca o método `square` com o argumento 7. Valores literais inteiros ssão tratados como o tipo int, assim chama-
   da de método na linha 9 invoca a versão de square nas linhas 14 a 19, que especifica um parâmetro int . De maneira semelhante, a
   linha 10 invoca o método square com o argumento 7.5 . Valores de ponto flutuante literais são tratados como um tipo double , dessa
   forma a chamada de método na linha 10 invoca a versão de square nas linhas 22 a 27, que especifica um parâmetro double . Cada
   método primeiro gera a saída de uma linha de texto para provar que o método adequado foi chamado em cada caso. Os valores nas
   linhas 10 e 24 são exibidos com o especificador de formato %f. Não especificamos uma precisão em nenhum dos casos. Por padrão,
   valores de ponto flutuante são exibidos com seis dígitos de precisão se a precisão não for especificada no especificador de formato.  