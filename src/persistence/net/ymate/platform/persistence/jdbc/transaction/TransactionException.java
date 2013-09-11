/**
 * <p>文件名:	TransactionException.java</p>
 * <p>版权:		详见产品版权说明书</p>
 * <p>公司:		YMateSoft Co., Ltd.</p>
 * <p>项目名：	yMatePlatform-Persistence</p>
 * <p>作者：		刘镇(suninformation@163.com)</p>
 */
package net.ymate.platform.persistence.jdbc.transaction;


/**
 * <p>
 * TransactionException
 * </p>
 * <p>
 * 数据库JDBC事务异常；
 * </p>
 * 
 * @author 刘镇(suninformation@163.com)
 * @version 0.0.0
 *          <table style="border:1px solid gray;">
 *          <tr>
 *          <th width="100px">版本号</th><th width="100px">动作</th><th
 *          width="100px">修改人</th><th width="100px">修改时间</th>
 *          </tr>
 *          <!-- 以 Table 方式书写修改历史 -->
 *          <tr>
 *          <td>0.0.0</td>
 *          <td>创建类</td>
 *          <td>刘镇</td>
 *          <td>2011-9-6下午04:06:44</td>
 *          </tr>
 *          </table>
 */
public class TransactionException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6608678834616157678L;

	/**
	 * 构造器
	 */
	public TransactionException() {
		super();
	}

	/**
	 * 构造器
	 * @param message
	 */
	public TransactionException(String message) {
		super(message);
	}

	/**
	 * 构造器
	 * @param cause
	 */
	public TransactionException(Throwable cause) {
		super(cause);
	}

	/**
	 * 构造器
	 * @param message
	 * @param cause
	 */
	public TransactionException(String message, Throwable cause) {
		super(message, cause);
	}

}