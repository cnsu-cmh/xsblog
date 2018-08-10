package com.xqx.comadmin.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import javax.persistence.Id;
import java.io.Serializable;

public class BaseEntity<T extends Model> extends Model<T> {

    @Id
    protected String id;

    public BaseEntity() {
    }

    @Override
    protected Serializable pkVal() {
        return null;
    }

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj.getClass())) {
            return false;
        }
        BaseEntity<?> that = (BaseEntity<?>) obj;
        return null != this.getId() && this.getId().equals(that.getId());
    }
}
