package froztigaming.arrowsplus.entities;

import froztigaming.arrowsplus.init.EntityInit;
import froztigaming.arrowsplus.init.ItemInit;
import froztigaming.arrowsplus.utils.DimensionTravelUtil;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.world.World;

public class EndArrowEntity
        extends PersistentProjectileEntity {

    public EndArrowEntity(EntityType<? extends EndArrowEntity> entityType, World world) {
        super((EntityType<? extends PersistentProjectileEntity>)entityType, world);
    }

    public EndArrowEntity(World world, double x, double y, double z) {
        super(EntityInit.END_ARROW, x, y, z, world);
    }

    public EndArrowEntity(World world, LivingEntity owner) {
        super(EntityInit.END_ARROW, owner, world);
    }


    @Override
    protected void initDataTracker() {
        super.initDataTracker();
    }

    @Override
    public void tick() {
        super.tick();
        if (this.world.isClient) {
            if (this.inGround) {
                if (this.inGroundTime % 5 == 0) {
                    this.spawnParticles(1);
                }
            } else {
                this.spawnParticles(2);
            }
        } else if (this.inGround && this.inGroundTime != 0 && this.inGroundTime >= 600) {
            this.world.sendEntityStatus(this, (byte)0);
        }
    }

    private void spawnParticles(int amount) {
        double d = (double)(16 & 0xFF) / 255.0;
        double e = (double)(8 & 0xFF) / 255.0;
        double f = (double)(0) / 255.0;
        for (int j = 0; j < amount; ++j) {
            this.world.addParticle(ParticleTypes.REVERSE_PORTAL, this.getParticleX(0.5), this.getRandomBodyY(), this.getParticleZ(0.5), d, e, f);
        }
    }

    @Override
    protected void onHit(LivingEntity target) {
        super.onHit(target);
        DimensionTravelUtil.travel(target, 2);
        this.discard();
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(ItemInit.END_ARROW_ITEM);
    }
}