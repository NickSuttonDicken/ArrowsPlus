package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.FireArrowEntity;
import froztigaming.arrowsplus.init.EntityInit;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.*;
import net.minecraft.world.World;

public class FireArrowItem extends ArrowItem {

    public FireArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new FireArrowEntity(world, shooter);
    }
}
