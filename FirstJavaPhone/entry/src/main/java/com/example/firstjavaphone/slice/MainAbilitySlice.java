package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.MainAbility;
import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.ability.ViewListener;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.agp.window.dialog.ToastDialog;
import ohos.hiviewdfx.Debug;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;
import ohos.javax.xml.transform.Result;
//import org.json.JSONObject;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;

public class MainAbilitySlice extends AbilitySlice {
    Button newBtn;
    private static HiLogLabel hilabel = new HiLogLabel(HiLog.LOG_APP, 0x00101, "test");
    @Override

    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
//        HiLog.info(hilabel, "ahhha");
//        Button button = new Button(this);
//        button.setText("这是个按钮");
//        button.setTextSize(20);
//        Button newBtn = (Button) findComponentById(ResourceTable.Id_ckbtn);
//        //声明布局
//        DependentLayout myLayout = new DependentLayout(this);
//        //设置布局大小
//        myLayout.setWidth(MATCH_PARENT);
//        myLayout.setHeight(MATCH_PARENT);
//        //
//        ShapeElement element = new ShapeElement();
//        element.setRgbColor(new RgbColor(0, 233, 0));
//        myLayout.setBackground(element);

        initView();
//        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
//        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
//        button.setLayoutConfig(textConfig);
//        myLayout.addComponent(button);
//        super.setUIContent(myLayout);


//        ShapeElement element = new ShapeElement();
//        element.setRgbColor(new RgbColor(0, 0, 255));
//        myLayout.setBackground(element);
//        button.setLayoutConfig();
//        if (button != null) {
//            // 为按钮设置点击回调
//            button.setClickedListener(new Component.ClickedListener() {
//                @Override
//                public void onClick(Component component) {
//                    Intent secondIntent = new Intent();
//                    // 指定待启动FA的bundleName和abilityName
//                    Operation operation = new Intent.OperationBuilder()
//                            .withDeviceId("")
//                            .withBundleName("com.example.firstjavaphone")
//                            .withAbilityName("com.example.firstjavaphone.Page2Ability")
//                            .build();
//                    secondIntent.setOperation(operation);
//                    // 通过AbilitySlice的startAbility接口实现启动另一个页面
//                    startAbility(secondIntent);
//                }
//            });
//        }
    }
    public void initView() {
        newBtn = (Button) findComponentById(ResourceTable.Id_newbtn);
        //添加监听器
        newBtn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //点击事件
//                new ToastDialog(getContext()).setText("这是个Toast").show();
                Intent intent1 = new Intent();
                intent1.setParam("page2", "abc");
//                present(new Page2AbilitySlice(), intent1);
                presentForResult(new Page2AbilitySlice(), intent1, 123);
//                Operation operation = new Intent.OperationBuilder()
//                        .withDeviceId("")
//                        .withBundleName("com.example.firstjavaphone")
//                        .withAbilityName("com.example.firstjavaphone.Page2Ability").build();
////                intent.setAction()
//
////                setResult(intent);
//                intent.setOperation(operation);
//                startAbility(intent);
            }

        });
    }

    @Override
    protected void onResult(int requestCode, Intent resultIntent) {
        super.onResult(requestCode, resultIntent);
        if (requestCode == 123) {
            System.out.println(resultIntent.getStringParam("backValue"));
        }
    }

    //    @Override
//    protected void onAbilityResult(int requestCode, int resultCode, Intent resultData) {
//        super.onAbilityResult(requestCode, resultCode, resultData);
//
//        if (requestCode == 123) {
//            System.out.println(resultData.getStringParam("backValue"));
//        }
//    }

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
