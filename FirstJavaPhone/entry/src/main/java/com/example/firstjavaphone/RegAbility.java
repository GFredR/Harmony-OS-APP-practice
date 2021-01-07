package com.example.firstjavaphone;

import com.example.firstjavaphone.slice.RegAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class RegAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(RegAbilitySlice.class.getName());
    }
}
