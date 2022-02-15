package froztigaming.arrowsplus.client.render.entity;

import froztigaming.arrowsplus.entities.EndArrowEntity;
import froztigaming.arrowsplus.entities.NetherArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class EndArrowEntityRenderer extends ProjectileEntityRenderer<EndArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("arrowsplus:textures/entity/end_arrow.png");

    public EndArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(EndArrowEntity entity) {
        return TEXTURE;
    }
}
