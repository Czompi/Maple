package com.skniro.maple.block;

import com.skniro.maple.Maple;
import com.skniro.maple.block.entity.MapleSignTypes;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static com.skniro.maple.block.Maple_block.BAMBOO_PLANKS;

public class MapleSignBlocks {
    public static final Block CHERRY_SIGN = registerBlockWithoutItem("cherry_sign", new SignBlock(AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F), MapleSignTypes.CHERRY),Maple.Maple_Group);
    public static final Block CHERRY_WALL_SIGN = registerBlockWithoutItem("cherry_wall_sign", new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD, Maple_block.CHERRY_LOG.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(CHERRY_SIGN), MapleSignTypes.CHERRY),Maple.Maple_Group);
    public static final Block Maple_SIGN = registerBlockWithoutItem("maple_sign",new SignBlock(AbstractBlock.Settings.of(Material.WOOD,Maple_block.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block Maple_WALL_SIGN = registerBlockWithoutItem("maple_wall_sign",new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD,Maple_block.MAPLE_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(Maple_SIGN),MapleSignTypes.MAPLE),Maple.Maple_Group);
    public static final Block BAMBOO_SIGN = registerBlockWithoutItem("bamboo_sign", new SignBlock(AbstractBlock.Settings.of(Material.WOOD,Maple_block.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0f), MapleSignTypes.BAMBOO),Maple.Maple_Group);
    public static final Block BAMBOO_WALL_SIGN = registerBlockWithoutItem("bamboo_wall_sign",new WallSignBlock(AbstractBlock.Settings.of(Material.WOOD,Maple_block.BAMBOO_PLANKS.getDefaultMapColor()).noCollision().strength(1.0F).dropsLike(BAMBOO_SIGN),MapleSignTypes.BAMBOO),Maple.Maple_Group);

    private static Block registerBlockWithoutItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(Maple.MOD_ID, name), block);
    }

    public static void registerMapleSignBlocks() {
        Maple.LOGGER.debug("Registering MapleSignBlocks for " + Maple.MOD_ID);
    }
}
