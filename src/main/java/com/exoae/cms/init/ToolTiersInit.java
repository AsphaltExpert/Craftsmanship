package com.exoae.cms.init;

import com.exoae.cms.CMS;
import com.exoae.cms.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ToolTiersInit {
    public static final Tier TESSAT = TierSortingRegistry.registerTier(
            new ForgeTier(2, 500, 6.5F, 2.0F, 14,
                    ModTags.Blocks.NEEDS_TESSAT_TOOL, () -> Ingredient.of(ItemInit.TESSAT_INGOT.get())),
            new ResourceLocation(CMS.MOD_ID,"tessat"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));
}
