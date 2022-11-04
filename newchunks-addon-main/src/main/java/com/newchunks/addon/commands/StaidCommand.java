package com.newchunks.addon.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import meteordevelopment.meteorclient.systems.commands.Command;
import net.minecraft.command.CommandSource;

import static com.mojang.brigadier.Command.SINGLE_SUCCESS;

public class StaidCommand extends Command {
    public StaidCommand() {
        super("staid", "does something");
    }

    @Override
    public void build(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(context -> {
            info("infinte shulker dupe activated");
            return SINGLE_SUCCESS;
        });
    }
}
