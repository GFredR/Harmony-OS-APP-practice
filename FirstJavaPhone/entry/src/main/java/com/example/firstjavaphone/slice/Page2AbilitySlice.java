package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_CONTENT;
import static ohos.agp.components.ComponentContainer.LayoutConfig.MATCH_PARENT;

public class Page2AbilitySlice extends AbilitySlice {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_page2);
        //声明布局
        DependentLayout myLayout = new DependentLayout(this);
        //设置布局大小
        myLayout.setWidth(MATCH_PARENT);
        myLayout.setHeight(MATCH_PARENT);
        //
        ShapeElement element = new ShapeElement();
        element.setRgbColor(new RgbColor(0, 0, 255));
        myLayout.setBackground(element);
        //
        Text tt = new Text(this);
        tt.setText("kakkakkkkakka");
        tt.setTextSize(100);
        tt.setTextColor(Color.GREEN);

        DependentLayout.LayoutConfig textConfig = new DependentLayout.LayoutConfig(MATCH_CONTENT, MATCH_CONTENT);
        textConfig.addRule(DependentLayout.LayoutConfig.CENTER_IN_PARENT);
        tt.setLayoutConfig(textConfig);
        myLayout.addComponent(tt);
        super.setUIContent(myLayout);
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
