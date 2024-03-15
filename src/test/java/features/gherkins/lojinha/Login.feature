#language: pt

@login
Funcionalidade: Realizar login do usuário
  Como usuário da lojinha
  Quero me autenticar
  Para utilizar suas funcionalidades

  @validar_aceso_a_pagina_secreta_do_usuario
  Cenário: Validar acesso a página secreta do usuário
    Dado que acesso a pagina de login
    Quando submeto meus dados de autenticacao
    Então valido que acessei a minha pagina de usuario