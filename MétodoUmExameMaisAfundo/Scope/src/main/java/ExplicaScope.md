# Scope


O programa MethodOverload demosnstra os problemas de escopo com campos e variáveis locais. A linha 7 declara e inicialliza o campo x para 1.
Esse campo permanece (sombreado) "oculto" em qualquer bloco (ou método) que declara uma variável local chamada x.
O método main (linhas 11 e 23) declara uma variável local x (linha 13) e a inicializa para 5. O valor dessa variável local é gerado
para mostrar que o campo x (cujo valor 1) permance sombreado no método main. O programa declara outros dois métodos ---
`useLocalVariable`(linhas 26 a 35) e `useField` (lnhas 38 a 45) --- que não recebem argumentos e não retornam resultados. O
método main chama cada método duas vezes (linhas 17 a 20). O método `useLocalVarieble` declara a váriavel local x(linha28).
Quando useLoclVariable é chamado pela primeira vez (linha17), ele cria a variável local x e inicializa como 25 (linha28),
gera a saída do valor de x (linhas 30 e 31), incrementa x (linha32) e gera a saída do valor de x novamente (linhas 33 e 34). Quando
useLocalVariable é  chmado uma segunda vez (linha 19), ele recria a varável local x e a reinicializa como 25, assim a saída
de cada chamada a useLocalVarieble é chamado é idẽntica.

O método useField não declara nenhuma variável local. Portanto, quando ele se refere a x, é o campo x (linha 7) da classe
que é utilizado. Ao ser chamado pela primeira vez (linha 18), o método useField gera saída do valor ( 1 ) do campo x (linhas 40 e
41), multiplica o campo x por 10 (linha 42) e gera a saída do valor (10) do campo `x` novamente (linhas 43 e 44) antes de retornar. A
próxima vez que o método useField é chamado (linha 20), o campo contém seu valor modificado ( 10 ), assim o método gera saída
de 10 e então 100 . Por fim, no método main , o programa gera saída do valor da variável local x novamente (linha 22) para mostrar
que nenhum método chama a variável local x do main modificado, pois todos os métodos se referiram às variáveis identificadas como
x nos outros escopos.