package com.example.firstjavaphone;

import com.example.firstjavaphone.slice.MainAbilitySlice;
import ohos.aafwk.ability.Ability;
import ohos.aafwk.content.Intent;
import ohos.hiviewdfx.HiLog;

public class MainAbility extends Ability {
    @Override
    public void onStart(Intent intent) {
        super.onStart(intent);
        super.setMainRoute(MainAbilitySlice.class.getName());
//        HiLog("hadhhdhhdhhdhdhdhdhdh");
    }
}
