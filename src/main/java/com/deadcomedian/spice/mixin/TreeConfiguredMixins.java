//package com.deadcomedian.spice.mixin;
//
//
//import com.llamalad7.mixinextras.injector.ModifyReturnValue;
//import net.minecraft.block.Blocks;
//import net.minecraft.world.gen.feature.TreeFeatureConfig;
//import net.minecraft.world.gen.feature.size.FeatureSize;
//import net.minecraft.world.gen.foliage.FoliagePlacer;
//import net.minecraft.world.gen.root.RootPlacer;
//import net.minecraft.world.gen.stateprovider.BlockStateProvider;
//import net.minecraft.world.gen.treedecorator.TreeDecorator;
//import net.minecraft.world.gen.trunk.TrunkPlacer;
//import org.spongepowered.asm.mixin.Mixin;
//import org.spongepowered.asm.mixin.injection.At;
//
//import java.util.List;
//import java.util.Optional;
//
//@Mixin(TreeConfiguredMixins.class)
//public abstract class TreeConfiguredMixins extends TreeFeatureConfig {
//
//    protected TreeConfiguredMixins(BlockStateProvider trunkProvider, TrunkPlacer trunkPlacer, BlockStateProvider foliageProvider, FoliagePlacer foliagePlacer, Optional<RootPlacer> rootPlacer, BlockStateProvider dirtProvider, FeatureSize minimumSize, List<TreeDecorator> decorators, boolean ignoreVines, boolean forceDirt) {
//        super(trunkProvider, trunkPlacer, foliageProvider, foliagePlacer, rootPlacer, dirtProvider, minimumSize, decorators, ignoreVines, forceDirt);
//    }
//
//    @ModifyReturnValue(method = "oak", at = @At(value = "RETURN"))
//
//    private static TreeFeatureConfig.Builder oak() {
//        return builder(Blocks.OAK_LOG, Blocks.OAK_LEAVES, 4, 2, 0, 2).ignoreVines();
//    }
//}
