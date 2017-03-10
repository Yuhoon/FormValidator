# FormValidator
## Android表单校验器，支持对EditText,TextView文本框进行文本校验

build.gradle 引入

    compile 'com.yuhoon.validator:validator:v0.1'
#使用：

    Validator validator = new Validator();//初始化
    validator.register((EditText) findViewById(R.id.edt_password), new RequiredRule("密码不能为空"), new UniformityRule((EditText) findViewById(R.id.edt_rePassword), "两次密码输入不一致"));
    
