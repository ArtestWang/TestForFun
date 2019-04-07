/**
 * @api {POST} http://localhost:9080/datamanager/register 注册用户
 * @apiGroup Users
 * @apiVersion 0.0.1
 * @apiDescription 用于注册用户
 * @apiParam {String} login_name 用户账户名
 * @apiParam {String} real_name 真实姓名
 * @apiParam {String} password 密码
 * @apiParam {String} department_id  部门id
 * @apiParam {String} mobile 手机号
 * @apiParam {int} is_pki = 0  是否pki用户 0 普通用户 1 pki用户
 * @apiParamExample {json} 请求样例：
 *                ?login_name=zhangsan&real_name=张三&password=11223344&department_id=21&mobile=13739554137&is_pki=0
 * @apiSuccess (200) {String} msg 信息
 * @apiSuccess (200) {int} code 0 代表无错误 1代表有错误
 * @apiSuccessExample {json} 返回样例:
 *                {"code":"0","msg":"注册成功"}
 */
