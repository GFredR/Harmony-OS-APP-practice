package com.example.firstjavaphone;

import com.example.firstjavaphone.slice.BannerAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;

public class BannerAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(BannerAbilitySlice.class.getName());
    }
}
