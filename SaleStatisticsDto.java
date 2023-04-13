package cn.iqis.aftersale.dto;

import cn.iqis.common.dto.DtoBase;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * <p>
 * 销售统计表
 * </p>
 *
 * @author hw
 * @since 2021-11-23
 */
@Data
public class SaleStatisticsDto extends DtoBase {


    /**
     * 主键id
     */
    private Long id;

    /**
     * 车型
     */
    private String model;

    /**
     * 销售月份
     */
    private Date marketMonth;

    /**
     * 销售台次
     */
    private String marketWere;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;


}
