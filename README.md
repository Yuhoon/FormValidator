# FormValidator
## Android表单校验器，支持EditText,TextView文本框进行文本校验

build.gradle 引入
```
compile 'com.yuhoon.validator:validator:v0.1'
```    
##使用：
初始化：
``` Validator validator = new Validator();
```    
注册view及校验规则：
```
validator.register(edittext, new RequiredRule("密码不能为空"));
```    
单控件校验：
```
     if (validator.validate((EditText) findViewById(R.id.edt_password))) {
               //TODO 成功
           } else {
               //TODO 失败
           }
 ```          
多控件校验：
```
        validator.validateAll(new ValidateResultCall() {
            @Override
            public void onSuccess() {
                //TODO 成功
                Toast.makeText(MainActivity.this, "检验成功", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(String message) {
                //TODO 失败
                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
 ```
##校验规则：
###正则校验

*EmailRule   邮箱校验

*IdCardRule  身份证校验（15或18位）

*PhoneNumberRule 电话校验

*UrlRule URL校验

###普通校验

*ExactLengthRule 标准长度校验

*MaxLengthRule   最大长度校验

*MinLengthRule   最小长度校验

*RequiredRule    非空校验

*UniformityRule 与指定edittext进行文本校验

###非校验

*ConfirmationRule    确认提示信息
