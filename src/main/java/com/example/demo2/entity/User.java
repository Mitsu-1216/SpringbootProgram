package com.example.demo2.entity;

import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Data;

/**
 * ユーザー情報 Entity
 * データベースから取得したデータを格納するEntityクラス
 */
@Entity
@Data
@Table(name = "user")
public class User {

    /**
     * ID
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 名前
     */
    @Column(name = "name")
    private String name;

    /**
     * 住所
     */
    @Column(name = "address")
    private String address;

    /**
     * 電話番号
     */
    @Column(name = "phone")
    private String phone;

    /**
     * 更新日時
     */
    @Column(name = "update_date")
    private Date updateDate;

    /**
     * 登録日時
     */
    @Column(name = "create_date")
    private Date createDate;

    /**
     * 削除日時
     */
    @Column(name = "delete_date")
    private Date deleteDate;
}