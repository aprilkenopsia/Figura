package org.moon.figura.mixin.sound;

import com.mojang.blaze3d.audio.Channel;
import net.minecraft.client.sounds.ChannelAccess;
import org.moon.figura.ducks.ChannelHandleAccessor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

import java.util.UUID;

@Mixin(ChannelAccess.ChannelHandle.class)
public class ChannelHandleMixin implements ChannelHandleAccessor {

    @Shadow Channel channel;
    @Unique private UUID owner;
    @Unique private String name;

    @Override
    public Channel getChannel() {
        return this.channel;
    }

    @Override
    public UUID getOwner() {
        return this.owner;
    }

    @Override
    public void setOwner(UUID uuid) {
        this.owner = uuid;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
