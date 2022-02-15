package froztigaming.arrowsplus.client.render.entity;

import froztigaming.arrowsplus.entities.IceArrowEntity;
import froztigaming.arrowsplus.entities.LightningArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class LightningArrowEntityRenderer extends ProjectileEntityRenderer<LightningArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("arrowsplus:textures/entity/lightning_arrow.png");

    public LightningArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(LightningArrowEntity entity) {
        return TEXTURE;
    }
}
