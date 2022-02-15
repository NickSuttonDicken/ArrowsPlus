package froztigaming.arrowsplus.items;

import froztigaming.arrowsplus.entities.NetherArrowEntity;
import froztigaming.arrowsplus.entities.UndeadArrowEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class UndeadArrowItem extends ArrowItem {

    public UndeadArrowItem(Settings settings) {
        super(settings);
    }

    @Override
    public PersistentProjectileEntity createArrow(World world, ItemStack stack, LivingEntity shooter) {
        return new UndeadArrowEntity(world, shooter);
    }
}

