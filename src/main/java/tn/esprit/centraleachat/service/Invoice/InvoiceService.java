package tn.esprit.centraleachat.service.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.centraleachat.entity.Invoice;
import tn.esprit.centraleachat.repository.InvoiceRepository;

@Service
public class InvoiceService implements IinvoiceService{
    @Autowired
    InvoiceRepository invoiceRepository;


    @Override
    public Invoice addInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);
    }

    @Override
    public Invoice updateInvoice(Invoice invoice) {

        return invoiceRepository.save(invoice);

    }

    @Override
    public void deleteInvoice(Invoice invoice) {

        invoiceRepository.delete(invoice);
    }

    @Override
    public Invoice findInvoiceById(int id) {
        return null;
    }

    @Override
    public Invoice findInvoiceByOrder(int id) {
        return null;
    }

    @Override
    public Invoice findInvoiceByProvider(int id) {
        return null;
    }

    @Override
    public Invoice findInvoiceByProduct(int id) {
        return null;
    }

    @Override
    public Invoice findInvoiceByTypeTVA(int id) {
        return null;
    }
}
