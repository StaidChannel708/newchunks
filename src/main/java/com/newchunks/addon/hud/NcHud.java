package com.newchunks.addon.hud;

import com.newchunks.addon.Addon;

import meteordevelopment.meteorclient.systems.hud.HudElement;
import meteordevelopment.meteorclient.systems.hud.HudElementInfo;
import meteordevelopment.meteorclient.systems.hud.HudRenderer;
import meteordevelopment.meteorclient.utils.render.color.Color;

public class NcHud extends HudElement {
    public static final HudElementInfo<NcHud> INFO = new HudElementInfo<>(Addon.HUD_GROUP, "New Chunks", "Here you can find new chunks module!", NcHud::new);

    public NcHud() {
        super(INFO);
    }

    @Override
    public void render(HudRenderer renderer) {
        setSize(renderer.textWidth("Example element", true), renderer.textHeight(true));

        renderer.text("Example element", x, y, Color.WHITE, true);
    }
}
