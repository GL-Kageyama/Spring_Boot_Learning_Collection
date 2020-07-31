package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * DBへのCRUDを自動で作成するインターフェース
 * CRUD : 「Create（新規作成）」「Read（データ取得）」「Update（更新）」「Delete（削除）」
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {}