package org.sylvia.cashcard;

import org.springframework.data.annotation.Id;

// tell Spring Data which field is the ID.
record CashCard(@Id Long id, Double amount) {

}
