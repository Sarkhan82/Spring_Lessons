package com.mycompany.invoice;

import com.mycompany.invoice.controller.InvoiceController;
import com.mycompany.invoice.controller.InvoiceControllerChamboulleToutMagasin2;
import com.mycompany.invoice.controller.InvoiceControllerMichel;
import com.mycompany.invoice.repository.InvoiceRepository;
import com.mycompany.invoice.repository.InvoiceRepositoryMichel;
import com.mycompany.invoice.service.InvoiceService;
import com.mycompany.invoice.service.InvoiceServiceMichel;

import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        System.out.println("Dans qu'elle configuration êtes-vous ?");
        Scanner scanner = new Scanner(System.in);
        int conf = scanner.nextInt();
        if (conf == 1) {
            InvoiceController invoiceController = new InvoiceController();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepository invoiceRepository = new InvoiceRepository();
            invoiceService.setInvoiceRepository(invoiceRepository);
            invoiceController.createInvoice();
        } else if (conf == 2) {
            InvoiceControllerMichel invoiceController = new InvoiceControllerMichel();
            InvoiceServiceMichel invoiceServiceMichel = new InvoiceServiceMichel();
            invoiceController.setInvoiceService(invoiceServiceMichel);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceServiceMichel.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceController.createInvoice();
        } else if (conf == 3) {
            InvoiceControllerMichel invoiceController = new InvoiceControllerMichel();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceService(invoiceService);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceController.createInvoice();
        } else if (conf == 4) {
            InvoiceControllerChamboulleToutMagasin2 invoiceController = new InvoiceControllerChamboulleToutMagasin2();
            InvoiceService invoiceService = new InvoiceService();
            invoiceController.setInvoiceServiceInterface(invoiceService);
            InvoiceRepositoryMichel invoiceRepositoryMichel = new InvoiceRepositoryMichel();
            invoiceService.setInvoiceRepository(invoiceRepositoryMichel);
            invoiceController.createInvoice();
        }
    }
}
