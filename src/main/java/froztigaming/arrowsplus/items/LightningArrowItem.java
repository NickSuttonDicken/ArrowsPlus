package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.IceArrowEntity;
import froztigaming.arrowsplus.entities.LightningArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class LightningArrowItem extends ArrowItem {

    public LightningArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new LightningArrowEntity(world, shooter);
    }
}