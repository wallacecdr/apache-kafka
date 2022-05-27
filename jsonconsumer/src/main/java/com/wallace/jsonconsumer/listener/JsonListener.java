package com.wallace.jsonconsumer.listener;

import com.wallace.jsonconsumer.custom.Listener;
import com.wallace.jsonconsumer.model.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import static java.lang.Thread.*;

@Log4j2
@Component
public class JsonListener {

    @SneakyThrows
    @Listener(groupId = "create-group")
    public void antiFraud(@Payload Payment payment) {
        log.info("Recebi o pagamento {}", payment.toString());
        sleep(2000);
        log.info("Validando fraude...");
        sleep(2000);

        log.info("Compra aprovada...");
        sleep(2000);
    }

    @SneakyThrows
    @Listener(groupId = "pdf-group")
    public void pdfGenerator(@Payload Payment payment) {
        sleep(3000);
        log.info("Gerando pdf do produto de id {}...", payment.getId());
        sleep(3000);
    }

    @SneakyThrows
    @Listener(groupId = "email-group")
    public void sendEmail() {
        sleep(3000);
        log.info("Enviando e-mail de confirmação...");
    }

}
