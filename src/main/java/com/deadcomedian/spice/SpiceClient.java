package com.deadcomedian.spice;

import com.deadcomedian.spice.entity.client.SpiceModelLayers;
import com.deadcomedian.spice.entity.client.model.*;
import com.deadcomedian.spice.entity.client.renderer.*;
import com.deadcomedian.spice.registries.SpiceEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SpiceClient  implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.KEEPER, KeeperModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.KEEPER, KeeperRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.WEEPER, WeeperModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.WEEPER, WeeperRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.BEAST, BeastModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.BEAST, BeastRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.BRIAN, BrianModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.BRIAN, BrianRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.GRIEVER, GrieverModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.GRIEVER, GrieverRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.DEPTH_SPIDER, DepthSpiderModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.DEPTH_SPIDER, DepthSpiderRenderer::new);

        EntityModelLayerRegistry.registerModelLayer(SpiceModelLayers.ENTOMBED, EntombedModel::getTexturedModelData);
        EntityRendererRegistry.register(SpiceEntities.ENTOMBED, EntombedRenderer::new);
    }
}

