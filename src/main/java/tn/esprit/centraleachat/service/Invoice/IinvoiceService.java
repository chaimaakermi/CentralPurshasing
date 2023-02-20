package tn.esprit.centraleachat.service.Invoice;

import tn.esprit.centraleachat.entity.Invoice;

public interface IinvoiceService {

    public Invoice addInvoice(Invoice invoice);

    public Invoice updateInvoice(Invoice invoice);

    public void deleteInvoice(Invoice invoice);

    public Invoice findInvoiceById(int id);

    public Invoice findInvoiceByOrder(int id);

    public Invoice findInvoiceByProvider(int id);

    public Invoice findInvoiceByProduct(int id);

    public Invoice findInvoiceByTypeTVA(int id);

}
