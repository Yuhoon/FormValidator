package com.wcong.formvalidator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wcong.validator.ValidateResultCall;
import com.wcong.validator.Validator;
import com.wcong.validator.rules.ExactLengthRule;
import com.wcong.validator.rules.MaxLengthRule;
import com.wcong.validator.rules.MinLengthRule;
import com.wcong.validator.rules.RequiredRule;
import com.wcong.validator.rules.UniformityRule;
import com.wcong.validator.rules.regex.EmailRule;
import com.wcong.validator.rules.regex.IdCardRule;
import com.wcong.validator.rules.regex.PhoneNumberRule;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        Validator validator = new Validator();
        validator.register((EditText) findViewById(R.id.edt_password), new RequiredRule("密码不能为空"), new UniformityRule((EditText) findViewById(R.id.edt_rePassword), "两次密码输入不一致"));
        validator.register((EditText) findViewById(R.id.edt_rePassword), new RequiredRule("密码不能为空"));
        validator.register((EditText) findViewById(R.id.edt_phone), new PhoneNumberRule("请输入正确手机号"));
        validator.register((EditText) findViewById(R.id.edt_email), new EmailRule("请输入正确的邮箱"));
        validator.register((EditText) findViewById(R.id.edt_idCard), new IdCardRule("请输入正确的身份证号"));
        validator.register((EditText) findViewById(R.id.edt_exact), new ExactLengthRule(6, "请输入6位"));
        validator.register((EditText) findViewById(R.id.edt_max), new MaxLengthRule(6, "超过最大长度 6位"));
        validator.register((EditText) findViewById(R.id.edt_min), new MinLengthRule(4, "最少输入4位"));

        if (validator.validate((EditText) findViewById(R.id.edt_password))) {
            //TODO 成功
        } else {
            //TODO 失败
        }

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
    }
}
