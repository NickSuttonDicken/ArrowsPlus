package froztigaming.arrowsplus.client.render.entity;

import froztigaming.arrowsplus.entities.FireArrowEntity;
import froztigaming.arrowsplus.entities.IceArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class IceArrowEntityRenderer extends ProjectileEntityRenderer<IceArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("arrowsplus:textures/entity/ice_arrow.png");

    public IceArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(IceArrowEntity entity) {
        return TEXTURE;
    }
}
