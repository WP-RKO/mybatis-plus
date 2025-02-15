package com.baomidou.mybatisplus.extension.check;

import lombok.Data;

@Data
public class SqlCheckConfig {
    // 是否开启 SQL 检查
    private Boolean interrupt = false;

}
