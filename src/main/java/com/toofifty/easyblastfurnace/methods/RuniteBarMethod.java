package com.toofifty.easyblastfurnace.methods;

import com.toofifty.easyblastfurnace.steps.MethodStep;
import net.runelite.api.ItemID;

public class RuniteBarMethod extends MetalBarMethod
{
    @Override
    MethodStep withdrawOre()
    {
        return withdrawRuniteOre;
    }

    @Override
    int oreItem()
    {
        return ItemID.RUNITE_ORE;
    }

    @Override
    int barItem()
    {
        return ItemID.RUNITE_BAR;
    }

    @Override
    int coalPer()
    {
        return 4;
    }

    @Override
    public String getName()
    {
        return "Runite bars";
    }
}