package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;
import ohos.hiviewdfx.HiLog;
import ohos.hiviewdfx.HiLogLabel;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;

public class MainAbilitySlice extends AbilitySlice {
    private static HiLogLabel hilabel = new HiLogLabel(HiLog.LOG_APP, 0x00101, "test");
    @Override

    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        HiLog.info(hilabel, "ahhha");
        Button button = new Button(this);
        button.setText("这是个按钮");
        button.setTextSize(20);
        Button newBtn = (Button) findComponentById(ResourceTable.Id_ckbtn);
        //声明布局
        DependentLayout myLayout = new DependentLayout(this);
        //设置布局大小
        myLayout.setWidth(MATCH_PARENT);
        myLayout.setHeight(MATCH_PARENT);
        //
        ShapeElement element = new ShapeElement();
        element.setRgbColor(new RgbColor(0, 233, 0));
        myLayout.setBackground(element);

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

    @Override
    public void onActive() {
        super.onActive();
    }

    @Override
    public void onForeground(Intent intent) {
        super.onForeground(intent);
    }
}
