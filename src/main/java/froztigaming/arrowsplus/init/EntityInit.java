package froztigaming.arrowsplus.init;

import froztigaming.arrowsplus.entities.*;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static froztigaming.arrowsplus.ArrowsPlus.MODID;

public class EntityInit {

    public static EntityType<EndArrowEntity> END_ARROW;
    public static EntityType<EnderArrowEntity> ENDER_ARROW;
    public static EntityType<ExplosiveArrowEntity> EXPLOSIVE_ARROW;
    public static EntityType<FireArrowEntity> FIRE_ARROW;
    public static EntityType<IceArrowEntity> ICE_ARROW;
    public static EntityType<LightningArrowEntity> LIGHTNING_ARROW;
    public static EntityType<NetherArrowEntity> NETHER_ARROW;
    public static EntityType<UndeadArrowEntity> UNDEAD_ARROW;

    private static <T extends Entity> EntityType<T> register(String s, EntityType<T> entityType) {
        return Registry.register(Registry.ENTITY_TYPE, MODID + ":" + s, entityType);
    }

    private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
        return FabricEntityTypeBuilder.create(SpawnGroup.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(4).trackedUpdateRate(20).build();
    }

    public static void init() {
        END_ARROW = register("end_arrow", createArrowEntityType(EndArrowEntity::new));
        ENDER_ARROW = register("ender_arrow", createArrowEntityType(EnderArrowEntity::new));
        EXPLOSIVE_ARROW = register("explosive_arrow", createArrowEntityType(ExplosiveArrowEntity::new));
        FIRE_ARROW = register("fire_arrow", createArrowEntityType(FireArrowEntity::new));
        ICE_ARROW = register("ice_arrow", createArrowEntityType(IceArrowEntity::new));
        LIGHTNING_ARROW = register("lightning_arrow", createArrowEntityType(LightningArrowEntity::new));
        NETHER_ARROW = register("nether_arrow", createArrowEntityType(NetherArrowEntity::new));
        UNDEAD_ARROW = register("undead_arrow", createArrowEntityType(UndeadArrowEntity::new));
    }
}
