package cn.jiiiiiin.module.common.mapper.mngauth;

import cn.jiiiiiin.module.common.entity.mngauth.Interface;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.Set;

/**
 * <p>
 * 系统接口表 Mapper 接口
 * </p>
 *
 * @author jiiiiiin
 * @since 2018-12-09
 */
public interface InterfaceMapper extends BaseMapper<Interface> {

    /**
     * 通过资源id查询关联的接口集合
     * @param resourceId
     * @return
     */
    Set<Interface> selectByResourceId(Long resourceId);
}
