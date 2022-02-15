package froztigaming.arrowsplus.client;

import froztigaming.arrowsplus.client.render.entity.*;
import froztigaming.arrowsplus.init.EntityInit;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

@Environment(EnvType.CLIENT)
public class ArrowsPlusClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        EntityRendererRegistry.register(EntityInit.END_ARROW, EndArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.ENDER_ARROW, EnderArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.EXPLOSIVE_ARROW, ExplosiveArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.FIRE_ARROW, FireArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.ICE_ARROW, IceArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.LIGHTNING_ARROW, LightningArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.NETHER_ARROW, NetherArrowEntityRenderer::new);
        EntityRendererRegistry.register(EntityInit.UNDEAD_ARROW, UndeadArrowEntityRenderer::new);
    }
}
