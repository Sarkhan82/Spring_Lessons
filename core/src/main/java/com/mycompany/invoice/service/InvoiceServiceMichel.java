package com.mycompany.invoice.service;

import com.mycompany.invoice.entity.Invoice;
import com.mycompany.invoice.repository.InvoiceRepositoryInterface;

public class InvoiceServiceMichel implements InvoiceServiceInterface {

    private static long lastNumber=112L;

    private InvoiceRepositoryInterface invoiceRepository;

    public InvoiceRepositoryInterface getInvoiceRepository() {
        return invoiceRepository;
    }

    public void setInvoiceRepository(InvoiceRepositoryInterface invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public void createInvoice(Invoice invoice) {
        invoice.setNumber(String.valueOf("INV_" + (++lastNumber)));
        invoiceRepository.create(invoice);

    }
}
