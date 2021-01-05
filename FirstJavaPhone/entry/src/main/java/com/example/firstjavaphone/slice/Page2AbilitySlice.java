package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.aafwk.content.Operation;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.Button;
import ohos.agp.components.Component;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;

public class Page2AbilitySlice extends AbilitySlice {
    Button backBtn;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_page2);
        initView();
        if (intent != null) {

            System.out.println(intent.getStringParam("page2"));
        }
        //声明布局
//        DependentLayout myLayout = new DependentLayout(this);
//        //设置布局大小
//        myLayout.setWidth(MATCH_PARENT);
//        myLayout.setHeight(MATCH_PARENT);
//        //
//        ShapeElement element = new ShapeElement();
//        element.setRgbColor(new RgbColor(0, 0, 255));
//        myLayout.setBackground(element);
//        //
//        Text tt = new Text(this);
//        tt.setText("kakkakkkkakka");
//        tt.setTextSize(100);
//        tt.setTextColor(Color.GREEN);
//
//        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
//        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
//        tt.setLayoutConfig(textConfig);
//        myLayout.addComponent(tt);
//        super.setUIContent(myLayout);

    }

    private void initView() {
        backBtn = (Button) findComponentById(ResourceTable.Id_backValueBtn);
        //添加监听器
        backBtn.setClickedListener(new Component.ClickedListener() {
            @Override
            public void onClick(Component component) {
                //点击事件
//                new ToastDialog(getContext()).setText("这是个Toast").show();
                Intent intent1 = new Intent();
//                Operation operation = new Intent.OperationBuilder()
//                        .withDeviceId("")
//                        .withBundleName("com.example.firstjavaphone")
//                        .withAbilityName("com.example.firstjavaphone.MainAbility").build();
//                intent.setAction();
                intent1.setParam("backValue", "ssd");
                setResult(intent1);
//                intent.
//                intent.setOperation(operation);
                terminate();
            }

        });
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
