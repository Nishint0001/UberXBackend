package com.nishintgoyal.UberXBackend.Entities;

import com.nishintgoyal.UberXBackend.Entities.Enums.TransactionMethodEnum;
import com.nishintgoyal.UberXBackend.Entities.Enums.TransactionTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WalletTransactionEntity
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionTypeEnum transactionType;

    private TransactionMethodEnum transactionMethod;

    @OneToOne
    private RideEntity ride;

    private String transactionId;

    @ManyToOne
    private WalletEntity wallet;

    @CreationTimestamp
    private LocalDateTime timeStamp;
}
