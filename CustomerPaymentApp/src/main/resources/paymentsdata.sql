DROP TABLE IF EXISTS CustomersData

CREATE TABLE CustomersData(

                    REFERENCEID  INT PRIMARY KEY,
                    LASTNAME     VARCHAR(20) NOT NULL,
                    LAST4SSN     VARCHAR(20) NOT NULL,
                    CARDNUMBER   VARCHAR(20) NOT NULL,
                    CHEQUENUMBER VARCHAR(20)  NOT NULL,
                    AMOUNT       VARCHAR(20)  NOT NULL

);