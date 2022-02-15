package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.EndArrowEntity;
import froztigaming.arrowsplus.entities.EnderArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnderArrowItem extends ArrowItem {

    public EnderArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new EnderArrowEntity(world, shooter);
    }
}
