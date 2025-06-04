package com.cosmetic.cosmetic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // O IP do PC onde o Flutter está rodando (seu laptop, por exemplo)
                // Use o IP real do seu PC Flutter, ex: "192.168.1.101"
                // Descubra este IP no seu PC Flutter usando 'ipconfig' (Windows) ou 'ip a'/'ifconfig' (Linux/macOS)
                String realFlutterPcIp = "192.168.0.2";

                // A porta padrão para desenvolvimento de aplicativos web Flutter
                // Se você não especificar, o Flutter Web usa uma porta aleatória.
                // Se não estiver usando Flutter Web, esta porta não é relevante para o emulador/app nativo.
                String flutterWebDevPort = "57290"; // Mude se seu Flutter Web rodar em outra porta

                registry.addMapping("/**") // Permite CORS para todos os endpoints da sua API
                        .allowedOrigins(
                                // Para emuladores Android no seu PC (Flutter PC) acessando a API Java (no outro PC)
                                // As requisições do emulador Android vão para o PC onde ele está hospedado (realFlutterPcIp)
                                // e o CORS da API Java precisa permitir este IP de origem.
                                "http://" + realFlutterPcIp,

                                // Se você estiver rodando o Flutter como um aplicativo web no seu PC (Flutter PC),
                                // ele pode estar em uma porta específica.
                                "http://" + realFlutterPcIp + ":" + flutterWebDevPort,

                                // Para testes diretos no seu próprio PC (onde a API Java está rodando)
                                // Se você rodar o Flutter no MESMO PC da API Java (para testar), pode precisar de:
                                "http://localhost:8080", // Ou a porta que o Flutter Web está usando localmente
                                "http://127.0.0.1:8080", // Variação do localhost

                                // Se o emulador Android estiver rodando no MESMO PC QUE A API JAVA,
                                // o emulador usa 10.0.2.2 para acessar o localhost desse PC.
                                // Mas, como seu Flutter está em OUTRO PC, esta linha NÃO é o principal.
                                // Mantenha se você puder ter esse cenário de teste também.
                                "http://10.0.2.2"
                        )
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }
}