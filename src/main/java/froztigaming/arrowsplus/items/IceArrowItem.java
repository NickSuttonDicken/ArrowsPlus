package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.FireArrowEntity;
import froztigaming.arrowsplus.entities.IceArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IceArrowItem extends ArrowItem {

    public IceArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new IceArrowEntity(world, shooter);
    }
}
