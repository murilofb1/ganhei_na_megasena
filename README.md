# App Ganhei na Mega-Sena
Aplicativo simples para gerar numeros para a Mega-Sena de acordo com o input do usuário desenvolvido durante o curso Android Express do Professor Tiago Aguiar

## O que foi aprendido?
* Construção de layouts utilizando componentes como Buttons, EditText e TextViews.
* Edição dos componentes básicos destes componentes como `android:textColor`, `android:textAlignment`, `android:layout_width`, `android:layout_height`, dentre outros.
* Funcionamento de uma activity.
* Referenciar os componentes do layout e acessar suas propriedades.
  * Adicionar eventos de clique em botões.
* Aplicada a lógica do botão para gerar os números da Mega-Sena adicionando validações para ver se foi digitado um número entre 6 e 15, ou se o campo está vazio.
* Persistencia de dados com `SharedPreferences`

### Um pouco de como está ficou o layout após a primeira aula
<p align ="center">
  <img src="https://github.com/murilofb1/ganhei_na_megasena/assets/74936314/e8db9e50-6a0d-4512-ada3-b1a91aef7a82" width="200"/>
</p>

# Alterações feitas por mim
* Adicionado ViewBinding ao projeto, ao invés de usar o findViewById
* Adicionado a lógica para o usuário não inserir numero maior que 15
* Separado a parte lógica da activity de layout