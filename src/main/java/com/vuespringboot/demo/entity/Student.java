package com.vuespringboot.demo.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Cody
 * @date 2020/7/17 - 13:19
 */
@Entity
@Data
public class Student {

    /**
     * stuId :
     * stuName :
     * stuAge :
     */
    @Id
    private Integer stuId;
    private String stuName;
    private String stuAge;
    private String stuSex;
    private String stuGrade;

}
