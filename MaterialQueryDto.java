package cn.iqis.aftersale.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaterialQueryDto {

    //修改起始时间
    private Date updateStarTime;
    //修改结束时间
    private Date updateEndTime;
    //搜索类型
    private String searchType;
    //搜索类型
    private String searchValue;
}
