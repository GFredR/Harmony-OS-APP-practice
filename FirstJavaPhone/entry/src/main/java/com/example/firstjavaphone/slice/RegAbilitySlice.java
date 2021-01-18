package com.example.firstjavaphone.slice;

import com.example.firstjavaphone.ResourceTable;
import ohos.aafwk.ability.AbilitySlice;
import ohos.aafwk.content.Intent;
import ohos.agp.components.Button;
import ohos.agp.components.Checkbox;
import ohos.agp.components.RadioContainer;
import ohos.agp.components.TextField;
import ohos.ai.cv.text.Text;

public class RegAbilitySlice extends AbilitySlice {
    Text nameText;
    TextField nameField, ageField, phoneField, addressField;
    Button submitBtn, cancelBtn;
    RadioContainer radioContainer;
    Checkbox hobby1, hobby2, hobby3, hobby4;
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setUIContent(ResourceTable.Layout_ability_reg);
    }

    void initRegView() {
        nameField = (TextField) findComponentById(ResourceTable.Id_nameField);
        ageField = (TextField) findComponentById(ResourceTable.Id_ageField);
        phoneField = (TextField) findComponentById(ResourceTable.Id_nameField);
        addressField = (TextField) findComponentById(ResourceTable.Id_nameField);

        submitBtn = (Button) findComponentById(ResourceTable.Id_submit);
        cancelBtn = (Button) findComponentById(ResourceTable.Id_cancel);

        radioContainer = (RadioContainer) findComponentById(ResourceTable.Id_sexRadio);

        hobby1 = (Checkbox) findComponentById(ResourceTable.Id_hobby1);
        hobby2 = (Checkbox) findComponentById(ResourceTable.Id_hobby2);
        hobby3 = (Checkbox) findComponentById(ResourceTable.Id_hobby3);
        hobby4 = (Checkbox) findComponentById(ResourceTable.Id_hobby4);


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
