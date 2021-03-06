package com.yj.ws.util.common;


/*
 * author:yanjun
 * 
 * 类型：全局变量
 */
public class CommonConstant {
	/**
	 * 验证码
	 */
	public static final String VERIFY_CODE = "yzm";
	/**
	 * 系统DES密钥相关常量
	 */
	public static final String DES_KEY_DEFAULT = "";

	/**
	 * 系统参数字典前缀
	 */
	public static final String SYS_DICTIONARY_PREFIX = "SYS_";

	/**
	 * 业务参数字典前缀
	 */
	public static final String BUS_DICTIONARY_PREFIX = "BUS_";

	/**
	 * 系统标志位
	 */
	// 表示不可编辑
	public static final Character FLAG_IMMUTABLE = '0';
	// 表示可编辑
	public static final Character FLAG_VARIABLE = '1';

	/**
	 * Session中保存的用户信息
	 */
	public static final String SESSION_USER = "user";
	
	public static final String SESSION_USER_TIMEOUT = "1800";
	
	/**
	 * 用户登录session验证码(前端存储缓存)
	 */
	public static final String SESSION_USER_VERIFYCODE ="loginVerifyCode";

	/**
	 * servletcontext中存储的在线用户列表
	 */
	public static final String SERVLETCONTEXT_ONLINE_USER = "onlineUserList";

	/**
	 * 字符编码
	 */
	public static final String UTF8 = "UTF-8";

	/*
	 * 日志常量
	 */
	// 系统日志文件中Dao层发生异常时描述信息
	public static final String SYSTEM_LOG_DAO_MESSAGE = "Dao错误";
	// 系统日志文件中Service层发生异常时描述信息
	public static final String SYSTEM_LOG_SERVICE_MESSAGE = "Service错误";
	// 系统日志文件中Controller层发生异常时描述信息
	public static final String SYSTEM_LOG_CONTROLLER_MESSAGE = "Controller错误";
	// 系统日志文件中其他地方发生异常时描述信息
	public static final String SYSTEM_LOG_OTHER_MESSAGE = "其他错误";
	// 系统日志文件定位类文件描述符
	public static final String SYSTEM_LOG_CLASS_POSITION = "className:";
	// 系统日志文件定位类方法描述符
	public static final String SYSTEM_LOG_METHOD_POSITION = "methodName:";
	// 系统日志文件定位类行号描述符
	public static final String SYSTEM_LOG_LINENUMBER_POSITION = "lineNumber:";
	// 系统日志文件定位具体异常信息描述符
	public static final String SYSTEM_LOG_ERRORTYPE_POSITION = "errorDescription:";
	// 显示给用户的解决应用错误的方式描述信息
	public static final String SYSTEM_LOG_CONTACT_DESCRIPTION = "应用程序内部错误,请与技术人员联系!";
	// 系统日志文件前缀名称
	public static final String SYSTEM_LOG_PREFIX = "cheyue<xntz>";
	// 系统日志文件只记录拦截包发生的异常信息
	public static final String SYSTEM_LOG_INTERCEPTOR_PACKAGE = "com.xntz";
	// 定位Dao层发生异常常量
	public static final String SYSTEM_LOG_USER_DAO = "Dao";
	// 定位Service层发生异常常量
	public static final String SYSTEM_LOG_USER_SERVICE = "Service";
	// 定位Controller层发生异常常量
	public static final String SYSTEM_LOG_USER_CONTROLLER = "Controller";
	// 定位其他地方发生异常常量
	public static final String SYSTEM_LOG_USER_OTHER = "Other";

	/**
	 * 日期常量
	 */
	// 简单年月日日期格式
	public static final String DATE_SHORT_SIMPLE_FORMAT = "yyyyMMdd";
	// 年月日日期格式
	public static final String DATE_SHORT_FORMAT = "yyyy-MM-dd";
	// 中文年月日日期格式
	public static final String DATE_SHORT_CHN_FORMAT = "yyyy年MM月dd日";
	// 年月日时日期格式
	public static final String DATE_WITHHOUR_FORMAT = "yyyy-MM-dd HH";
	// 中文年月日时日期格式
	public static final String DATE_WITHHOUR_CHN_FORMAT = "yyyy年MM月dd日 HH";
	// 年月日时分日期格式
	public static final String DATE_WITHMINUTE_FORMAT = "yyyy-MM-dd HH:mm";
	// 中文年月日时分日期格式
	public static final String DATE_WITHMINUTE_CHN_FORMAT = "yyyy年MM月dd日 HH:mm";
	// 年月日时分秒日期格式
	public static final String DATE_WITHSECOND_FORMAT = "yyyy-MM-dd HH:mm:ss";
	// 中文年月日时分秒日期格式
	public static final String DATE_WITHSECOND_CHN_FORMAT = "yyyy年MM月dd日 HH:mm:ss";
	// 年月日时分秒毫秒日期格式
	public static final String DATE_WITHMILLISECOND_FORMAT = "yyyy-MM-dd HH:mm:ss.S";
	// 中文年月日时分秒毫秒日期格式
	public static final String DATE_WITHMILLISECOND_CHN_FORMAT = "yyyy年MM月dd日 HH:mm:ss.S";
	// 年月日时分秒日期格式
	public static final String DATE_WITH_FORMAT = "yyyyMMddHHmmss";
	/** 标的状态：已发布 */
	public static final int BORROW_STATUS_PUBLISHED = 0;
	/** 标的状态：已初审 */
	public static final int BORROW_STATUS_WAITING = 1;
	/** 标的状态：投标中 */
	public static final int BORROW_STATUS_TENDERING = 2;
	/** 标的状态：已满标 */
	public static final int BORROW_STATUS_FULL = 3;
	/** 标的状态：还款中 */
	public static final int BORROW_STATUS_REPAYING = 4;
	/** 标的状态：已还款 */
	public static final int BORROW_STATUS_REPAYED = 5;
	/** 标的状态：已流标 */
	public static final int BORROW_STATUS_FLOWED = 6;
	/** 标的状态：审核不通过 */
	public static final int BORROW_STATUS_NOPASST = 7;
	
	/** 还款记录状态:默认未偿还 */
	public static final int REPAYMENT_STATUS_DEFAULT = 1;
	/** 还款记录状态:已偿还 */
	public static final int REPAYMENT_STATUS_REPAYED = 2;
	/** 还款记录状态:已申请 */
	public static final int REPAYMENT_STATUS_APPLIED = 3;
	
	/** 按先息后本还款 */
	public static final int PAYMENTMODE_ONE_TIME_PAY_OFF = 2;
	/** 一次性还清 */
	public static final int PAYMENTMODE_INTEREST_FIRST = 3;

	
	public static final Integer USER_DISABLE = 2;//用户禁用状态
	
	public static final Integer USER_ACT = 1 ; //用户启用状态

	public static final String CHANNER_ROOT_NODE = "1";// 渠道根节点
	
	/**
	 * 渠道费用默认状态
	 */
	public static final String CHANNEL_COST_STATE_DEFAULT = "00";
	/**
	 * 渠道费用驳回
	 */
	public static final String CHANNEL_COST_STATE_REJECT = "01";
	/**
	 * 渠道费用初审状态
	 */
	public static final String CHANNEL_COST_STATE_FIRST = "03";
	/**
	 * 渠道费用复审状态
	 */
	public static final String CHANNEL_COST_STATE_SECOND = "06";
	
	/**
	 * 渠道费用结算对象类型
	 */
	public static final String CHANNEL_COST_TYPE_USER = "00";
	public static final String CHANNEL_COST_TYPE_THIRD = "02";
	
	/**
	 * 短信内容签名
	 */
	public static final String SMSSIGN = "【】";  
	public static final String RETURNSTATUS = "returnstatus";  
	public static final String SUCCESS = "Success";  
	public static final String FAILD = "Faild";  
	
	public static final String LOCALHOST = "http://www.huilc.cn/";
	
	public static final String BUILDINGADDRESS= "buildingAddress";
	
}




