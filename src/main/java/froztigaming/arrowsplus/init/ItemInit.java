package froztigaming.arrowsplus.init;

import froztigaming.arrowsplus.entities.*;
import froztigaming.arrowsplus.items.*;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.DispenserBehavior;
import net.minecraft.block.dispenser.ProjectileDispenserBehavior;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Position;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;

import java.util.Objects;

import static froztigaming.arrowsplus.ArrowsPlus.MODID;

public class ItemInit {

    public static final EndArrowItem END_ARROW_ITEM = new EndArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final EnderArrowItem ENDER_ARROW_ITEM = new EnderArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final ExplosiveArrowItem EXPLOSIVE_ARROW_ITEM = new ExplosiveArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final FireArrowItem FIRE_ARROW_ITEM = new FireArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final IceArrowItem ICE_ARROW_ITEM = new IceArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final LightningArrowItem LIGHTNING_ARROW_ITEM = new LightningArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final NetherArrowItem NETHER_ARROW_ITEM = new NetherArrowItem(new Item.Settings().group(ItemGroup.COMBAT));
    public static final UndeadArrowItem UNDEAD_ARROW_ITEM = new UndeadArrowItem(new Item.Settings().group(ItemGroup.COMBAT));

    public static void registerDispenserBlockBehavior(Item item){
        DispenserBlock.registerBehavior(item, new ProjectileDispenserBehavior() {
            @Override
            protected ProjectileEntity createProjectile(World world, Position position, ItemStack stack) {

                if (item instanceof EndArrowItem)
                {
                    EnderArrowEntity arrowEntity = new EnderArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof EnderArrowItem) {
                    EnderArrowEntity arrowEntity = new EnderArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof ExplosiveArrowItem)
                {
                   ExplosiveArrowEntity arrowEntity = new ExplosiveArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof FireArrowItem)
                {
                    FireArrowEntity arrowEntity = new FireArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof IceArrowItem)
                {
                    IceArrowEntity arrowEntity = new IceArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof LightningArrowItem)
                {
                    LightningArrowEntity arrowEntity = new LightningArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof NetherArrowItem)
                {
                    NetherArrowEntity arrowEntity = new NetherArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else if (item instanceof UndeadArrowItem)
                {
                    UndeadArrowEntity arrowEntity = new UndeadArrowEntity(world, position.getX(), position.getY(), position.getZ());
                    arrowEntity.pickupType = PersistentProjectileEntity.PickupPermission.ALLOWED;
                    return arrowEntity;
                } else return null;
            }
        });
    }


    public static void registerItems()
    {
        Registry.register(Registry.ITEM, new Identifier(MODID, "end_arrow"), END_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ender_arrow"), ENDER_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "explosive_arrow"), EXPLOSIVE_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "fire_arrow"), FIRE_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "ice_arrow"), ICE_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "lightning_arrow"), LIGHTNING_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "nether_arrow"), NETHER_ARROW_ITEM);
        Registry.register(Registry.ITEM, new Identifier(MODID, "undead_arrow"), UNDEAD_ARROW_ITEM);

        registerDispenserBlockBehavior(END_ARROW_ITEM);
        registerDispenserBlockBehavior(ENDER_ARROW_ITEM);
        registerDispenserBlockBehavior(EXPLOSIVE_ARROW_ITEM);
        registerDispenserBlockBehavior(FIRE_ARROW_ITEM);
        registerDispenserBlockBehavior(ICE_ARROW_ITEM);
        registerDispenserBlockBehavior(LIGHTNING_ARROW_ITEM);
        registerDispenserBlockBehavior(NETHER_ARROW_ITEM);
        registerDispenserBlockBehavior(UNDEAD_ARROW_ITEM);
    }
}
