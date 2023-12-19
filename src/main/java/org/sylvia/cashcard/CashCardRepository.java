package org.sylvia.cashcard;

import org.springframework.data.repository.CrudRepository;

// Inject the CashCardRepository
// specify that it manages the CashCard's data, and datatype of the Cash Card ID is Long.
public interface CashCardRepository extends CrudRepository<CashCard, Long> {
}
