package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.EndArrowEntity;
import froztigaming.arrowsplus.entities.ExplosiveArrowEntity;
import net.minecraft.datafixer.fix.EntityTippedArrowFix;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EndArrowItem extends ArrowItem {

    public EndArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new EndArrowEntity(world, shooter);
    }

}
