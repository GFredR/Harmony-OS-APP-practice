package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.TextField;
import ohos.ai.cv.text.Text;

public class RegAbilitySlice extends AbilitySlice {
    Text nameText;
    TextField nameField;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_reg);
    }

    void initRegView() {
        nameField = (TextField) findComponentById(ResourceTable.Id_nameField);

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
