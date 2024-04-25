package org.faktorzehn.dojo.battleshipsvalidator;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BattleShipsValidationController {

    @PostMapping("/validate")
    Boolean validate(Board board) {
        return BattleField.fieldValidator(board.getBoard());
    }

}
