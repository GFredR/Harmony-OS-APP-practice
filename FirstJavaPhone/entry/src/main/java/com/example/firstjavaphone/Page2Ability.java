package com.example.firstjavaphone;

import com.example.firstjavaphone.slice.Page2AbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.agp.colors.RgbColor;
import ohos.agp.components.DependentLayout;
import ohos.agp.components.Text;
import ohos.agp.components.element.ShapeElement;
import ohos.agp.utils.Color;

import static ohos.agp.components.DependentLayout.LayoutConfig.MATCH_PARENT;
import static ohos.agp.components.DependentLayout.LayoutConfig.MATCH_CONTENT;

public class Page2Ability extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(Page2AbilitySlice.class.getName());

    }
}
