package com.minecraft.superior_diamond.init;

import com.minecraft.superior_diamond.ExampleMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MODID);

    public static final RegistryObject<Block> EXAMPLE_BLOCK = BLOCKS.register("example_block", () -> new Block(BlockBehaviour.Properties.of(Material.AMETHYST).friction(0.5f)));
    public static final RegistryObject<Block> EXAMPLE_BLOCK_2 = BLOCKS.register("example_block_2", () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)));


}
