package cn.hanfei.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author HanFei
 * @since 2017-08-04
 */
@TableName("sys_user")
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * id主键
     */
	@TableId(value="id", type= IdType.AUTO)
	private Integer id;
    /**
     * 邮箱也是登录帐号
     */
	private String email;
    /**
     * 登录密码
     */
	private String pwd;
    /**
     * 昵称
     */
	private String nickName;
    /**
     * 手机
     */
	@TableField("mobile_phone")
	private String mobilePhone;
    /**
     * 状态 0=可用,1=禁用
     */
	private Integer state;
    /**
     * 登录总次数
     */
	private Integer loginCount;
    /**
     * 最后登录时间
     */
	private Date loginTime;
    /**
     * 删除状态 0=未删除,1=已删除
     */
	private Integer deleted;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 修改时间
     */
	private Date updateTime;
    /**
     * 创建人
     */
	private Integer createBy;
    /**
     * 修改人
     */
	private Integer updateBy;
    /**
     * 是否超级管理员 0= 不是，1=是
     */
	private Integer superAdmin;
	@TableField("dept_id")
	private Integer deptId;
	@TableField("wx_uuid")
	private String wxUuid;
	@TableField("group_id")
	private Integer groupId;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getLoginCount() {
		return loginCount;
	}

	public void setLoginCount(Integer loginCount) {
		this.loginCount = loginCount;
	}

	public Date getLoginTime() {
		return loginTime;
	}

	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}

	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getCreateBy() {
		return createBy;
	}

	public void setCreateBy(Integer createBy) {
		this.createBy = createBy;
	}

	public Integer getUpdateBy() {
		return updateBy;
	}

	public void setUpdateBy(Integer updateBy) {
		this.updateBy = updateBy;
	}

	public Integer getSuperAdmin() {
		return superAdmin;
	}

	public void setSuperAdmin(Integer superAdmin) {
		this.superAdmin = superAdmin;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getWxUuid() {
		return wxUuid;
	}

	public void setWxUuid(String wxUuid) {
		this.wxUuid = wxUuid;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "SysUser{" +
			"id=" + id +
			", email=" + email +
			", pwd=" + pwd +
			", nickName=" + nickName +
			", mobilePhone=" + mobilePhone +
			", state=" + state +
			", loginCount=" + loginCount +
			", loginTime=" + loginTime +
			", deleted=" + deleted +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			", createBy=" + createBy +
			", updateBy=" + updateBy +
			", superAdmin=" + superAdmin +
			", deptId=" + deptId +
			", wxUuid=" + wxUuid +
			", groupId=" + groupId +
			"}";
	}
}
