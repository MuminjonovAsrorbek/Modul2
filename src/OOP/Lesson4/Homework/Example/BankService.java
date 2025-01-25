package OOP.Lesson4.Homework.Example;

import java.math.BigDecimal;

public interface BankService {

    void transfer(String fromCustomerId , String toCustomerId, BigDecimal amount);

}
