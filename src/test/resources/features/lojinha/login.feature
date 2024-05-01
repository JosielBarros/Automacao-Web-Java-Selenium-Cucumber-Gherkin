#language: pt

@login
Funcionalidade: Realizar login do usuário
  Como usuário da lojinha
  Quero me autenticar
  Para utilizar suas funcionalidades

  Contexto: acessar página de login
    Dado que acesso a pagina de login

  @validar_acesso_a_pagina_secreta_do_usuario
  Cenario: Validar acesso a página secreta do usuário
    Quando submeto meus dados de usuario "jhon" e senha "123"
    Então valido que acessei a minha pagina de usuario

  @validar_tentativa_login_com_dados_invalidos
  Esquema do Cenario: Validar tentativa de realizar login com dados inválidos
    Quando submeto meus dados de usuario "<usuario>" e senha "<senha>"
    Então valido que exibicao da mensagem de erro

    Exemplos:
      | usuario          | senha          |
      | usuario_invalido | senha_invalida |
      | jhon             | 321            |
      |                  | 123            |
      | jhon             |                |
