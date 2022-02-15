package froztigaming.arrowsplus.client.render.entity;

import froztigaming.arrowsplus.entities.LightningArrowEntity;
import froztigaming.arrowsplus.entities.NetherArrowEntity;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.ProjectileEntityRenderer;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class NetherArrowEntityRenderer extends ProjectileEntityRenderer<NetherArrowEntity> {
    public static final Identifier TEXTURE = new Identifier("arrowsplus:textures/entity/nether_arrow.png");

    public NetherArrowEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(NetherArrowEntity entity) {
        return TEXTURE;
    }
}