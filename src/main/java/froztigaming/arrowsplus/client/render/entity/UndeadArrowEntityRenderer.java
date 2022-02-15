package froztigaming.arrowsplus.client.render.entity;

import froztigaming.arrowsplus.entities.NetherArrowEntity;
import froztigaming.arrowsplus.entities.UndeadArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class UndeadArrowEntityRenderer extends ProjectileEntityRenderer<UndeadArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("arrowsplus:textures/entity/undead_arrow.png");

    public UndeadArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(UndeadArrowEntity entity) {
        return TEXTURE;
    }
}