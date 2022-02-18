package android.content.pm;

/**
 * mock for test
 */
public interface ActivityInfo {
    int CONFIG_MCC = 0x0001;

    int CONFIG_MNC = 0x0002;

    int CONFIG_LOCALE = 0x0004;

    int CONFIG_TOUCHSCREEN = 0x0008;

    int CONFIG_KEYBOARD = 0x0010;

    int CONFIG_KEYBOARD_HIDDEN = 0x0020;

    int CONFIG_NAVIGATION = 0x0040;

    int CONFIG_ORIENTATION = 0x0080;

    int CONFIG_SCREEN_LAYOUT = 0x0100;

    int CONFIG_UI_MODE = 0x0200;

    int CONFIG_SCREEN_SIZE = 0x0400;

    int CONFIG_SMALLEST_SCREEN_SIZE = 0x0800;

    int CONFIG_DENSITY = 0x1000;

    int CONFIG_LAYOUT_DIRECTION = 0x2000;

    int CONFIG_COLOR_MODE = 0x4000;

    int CONFIG_ASSETS_PATHS = 0x80000000;

    int CONFIG_FONT_SCALE = 0x40000000;

    int CONFIG_WINDOW_CONFIGURATION = 0x20000000;
}