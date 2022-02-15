package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.ExplosiveArrowEntity;
import froztigaming.arrowsplus.entities.FireArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ExplosiveArrowItem extends ArrowItem {

    public ExplosiveArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new ExplosiveArrowEntity(world, shooter);
    }
}
