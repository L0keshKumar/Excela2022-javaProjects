package com.example.demo.iface;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.TransactionLog;

public interface TransactionLogRepo extends JpaRepository<TransactionLog, Integer> {

}
