# FormValidator
## Android表单校验器，支持对EditText,TextView文本框进行文本校验

build.gradle 引入

    compile 'com.yuhoon.validator:validator:v0.1'
#使用：

初始化

    Validator validator = new Validator();
    
注册view及校验规则

    validator.register(edittext, new RequiredRule("密码不能为空"));
    
