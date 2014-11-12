package tutorial.generic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler; // used in 1.6.2
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
//import cpw.mods.fml.common.network.NetworkMod; // not used in 1.7

@Mod(modid="GenericModID", name="assets", version="0.0.1")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Generic {

    // The instance of your mod that Forge uses.
    @Instance(value = "GenericModID")
    public static Generic instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="tutorial.generic.client.ClientProxy", serverSide="tutorial.generic.CommonProxy")
    public static CommonProxy proxy;

    @EventHandler // used in 1.6.2
    //@PreInit    // used in 1.5.2
    public void preInit(FMLPreInitializationEvent event) {
        // Stub Method
    }

    @EventHandler // used in 1.6.2
    //@Init       // used in 1.5.2
    public void load(FMLInitializationEvent event) {
        proxy.registerRenderers();
        Block genericDirt = new GenericBlock(Material.ground)
                .setHardness(0.5F)
                .setStepSound(Block.soundTypeGravel)
                .setBlockName("genericDirt")
                .setCreativeTab(CreativeTabs.tabBlock);
        GameRegistry.registerBlock(genericDirt, "genericDirt");


    }

    @EventHandler // used in 1.6.2
    //@PostInit   // used in 1.5.2
    public void postInit(FMLPostInitializationEvent event) {
        // Stub Method
    }
}