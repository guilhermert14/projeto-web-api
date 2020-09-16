package br.com.enums;

import br.com.interfaces.Usuarios;

public enum OpcoesUsuarios implements Usuarios {


    ZE_DELIVERY("ZE_DELIVERY") {
        @Override
        public String email() {
            return "zedelivery.teste@gmail.com";
        }

        @Override
        public String senha() {
            return "teste@delivery123";
        }
    }

    ;

    OpcoesUsuarios(String usuario) {
    }
}
