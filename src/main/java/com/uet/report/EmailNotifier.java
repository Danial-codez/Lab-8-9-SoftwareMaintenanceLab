
package com.uet.report;

public class EmailNotifier implements Notifier {

    @Override
    public void send(String recipient, String message) {

        System.out.println("Sending Email to: " + recipient);
        System.out.println("Email Message: " + message);

    }
}