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

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;

public class MainAbilitySlice extends AbilitySlice {
    private static HiLogLabel hilabel = new HiLogLabel(HiLog.LOG_APP, 0x00101, "test");
    @Override

    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_main);
        HiLog.info(hilabel, "ahhha");
        Button button = new Button(this);
        //声明布局
        DependentLayout myLayout = new DependentLayout(this);
        //设置布局大小
        myLayout.setWidth(50);
        myLayout.setHeight(50);

        button.setTextColor(Color.CYAN);


        ShapeElement element = new ShapeElement();
        element.setRgbColor(new RgbColor(0, 0, 255));
        myLayout.setBackground(element);
//        button.setLayoutConfig();
        if (button != null) {
            // 为按钮设置点击回调
            button.setClickedListener(new Component.ClickedListener() {
                @Override
                public void onClick(Component component) {
                    Intent secondIntent = new Intent();
                    // 指定待启动FA的bundleName和abilityName
                    Operation operation = new Intent.OperationBuilder()
                            .withDeviceId("")
                            .withBundleName("com.example.myapplication")
                            .withAbilityName("com.example.myapplication.SecondAbility")
                            .build();
                    secondIntent.setOperation(operation);
                    // 通过AbilitySlice的startAbility接口实现启动另一个页面
                    startAbility(secondIntent);
                }
            });
        }
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
