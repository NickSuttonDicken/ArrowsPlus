package froztigaming.arrowsplus.entities;

import froztigaming.arrowsplus.init.EntityInit;
import froztigaming.arrowsplus.init.ItemInit;
import net.minecraft.block.AbstractFireBlock;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GameRules;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

public class FireArrowEntity
        extends PersistentProjectileEntity {

    public FireArrowEntity(EntityType<? extends FireArrowEntity> entityType, World world) {
        super((EntityType<? extends PersistentProjectileEntity>)entityType, world);
    }

    public FireArrowEntity(World world, double x, double y, double z) {
        super(EntityInit.FIRE_ARROW, x, y, z, world);
    }

    public FireArrowEntity(World world, LivingEntity owner) {
        super( EntityInit.FIRE_ARROW, owner, world);
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
            this.world.addParticle(ParticleTypes.SMALL_FLAME, this.getParticleX(0.5), this.getRandomBodyY(), this.getParticleZ(0.5), d, e, f);
        }
    }


    @Override
    protected void onHit(LivingEntity target) {
        super.onHit(target);
        target.setFireTicks(200);
    }

    @Override
    protected void onCollision(HitResult hitResult) {
        HitResult.Type type = hitResult.getType();
        if (type == HitResult.Type.ENTITY) {
            this.onEntityHit((EntityHitResult)hitResult);
        } else if (type == HitResult.Type.BLOCK) {
            this.onBlockHit((BlockHitResult)hitResult);
            BlockHitResult blockHitResult = (BlockHitResult) hitResult;
            BlockPos blockPos;
            if (this.world.getGameRules().getBoolean(GameRules.DO_MOB_GRIEFING) && this.world.isAir(blockPos = blockHitResult.getBlockPos().offset(blockHitResult.getSide()))) {
                this.world.setBlockState(blockPos, AbstractFireBlock.getState(this.world, blockPos));
                this.discard();
            } else this.discard();
        }
        if (type != HitResult.Type.MISS) {
            this.emitGameEvent(GameEvent.PROJECTILE_LAND, this.getOwner());
        }
    }

    @Override
    protected ItemStack asItemStack() {
            return new ItemStack(ItemInit.FIRE_ARROW_ITEM);
    }
}
