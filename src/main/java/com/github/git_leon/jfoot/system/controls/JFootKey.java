package com.github.git_leon.jfoot.system.controls;

import greenfoot.Greenfoot;
import javafx.scene.input.KeyCode;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public enum JFootKey {
    /**
     * Constant for the {@code Enter} key.
     */
    ENTER(KeyCode.ENTER),

    /**
     * Constant for the {@code Backspace} key.
     */
    BACK_SPACE(KeyCode.BACK_SPACE),

    /**
     * Constant for the {@code Tab} key.
     */
    TAB(KeyCode.TAB),

    /**
     * Constant for the {@code Cancel} key.
     */
    CANCEL(KeyCode.CANCEL),

    /**
     * Constant for the {@code Clear} key.
     */
    CLEAR(KeyCode.CLEAR),

    /**
     * Constant for the {@code Shift} key.
     */
    SHIFT(KeyCode.SHIFT),

    /**
     * Constant for the {@code Ctrl} key.
     */
    CONTROL(KeyCode.CONTROL),

    /**
     * Constant for the {@code Alt} key.
     */
    ALT(KeyCode.ALT),

    /**
     * Constant for the {@code Pause} key.
     */
    PAUSE(KeyCode.PAUSE),

    /**
     * Constant for the {@code Caps Lock} key.
     */
    CAPS(KeyCode.CAPS),

    /**
     * Constant for the {@code Esc} key.
     */
    ESCAPE(KeyCode.ESCAPE),

    /**
     * Constant for the {@code Space} key.
     */
    SPACE(KeyCode.SPACE),

    /**
     * Constant for the {@code Page Up} key.
     */
    PAGE_UP(KeyCode.PAGE_UP),

    /**
     * Constant for the {@code Page Down} key.
     */
    PAGE_DOWN(KeyCode.PAGE_DOWN),

    /**
     * Constant for the {@code End} key.
     */
    END(KeyCode.END),

    /**
     * Constant for the {@code Home} key.
     */
    HOME(KeyCode.HOME),

    /**
     * Constant for the non-numpad <b>left</b> arrow key.
     */
    LEFT(KeyCode.LEFT),

    /**
     * Constant for the non-numpad <b>up</b> arrow key.
     */
    UP(KeyCode.UP),

    /**
     * Constant for the non-numpad <b>right</b> arrow key.
     */
    RIGHT(KeyCode.RIGHT),

    /**
     * Constant for the non-numpad <b>down</b> arrow key.
     */
    DOWN(KeyCode.DOWN),

    /**
     * Constant for the comma key, ","
     */
    COMMA(KeyCode.COMMA),

    /**
     * Constant for the minus key, "-"
     */
    MINUS(KeyCode.MINUS),

    /**
     * Constant for the period key, "."
     */
    PERIOD(KeyCode.PERIOD),

    /**
     * Constant for the forward slash key, "/"
     */
    SLASH(KeyCode.SLASH),

    /**
     * Constant for the {@code 0} key.
     */
    DIGIT0(KeyCode.DIGIT0),

    /**
     * Constant for the {@code 1} key.
     */
    DIGIT1(KeyCode.DIGIT1),

    /**
     * Constant for the {@code 2} key.
     */
    DIGIT2(KeyCode.DIGIT2),

    /**
     * Constant for the {@code 3} key.
     */
    DIGIT3(KeyCode.DIGIT3),

    /**
     * Constant for the {@code 4} key.
     */
    DIGIT4(KeyCode.DIGIT4),

    /**
     * Constant for the {@code 5} key.
     */
    DIGIT5(KeyCode.DIGIT5),

    /**
     * Constant for the {@code 6} key.
     */
    DIGIT6(KeyCode.DIGIT6),

    /**
     * Constant for the {@code 7} key.
     */
    DIGIT7(KeyCode.DIGIT7),

    /**
     * Constant for the {@code 8} key.
     */
    DIGIT8(KeyCode.DIGIT8),

    /**
     * Constant for the {@code 9} key.
     */
    DIGIT9(KeyCode.DIGIT9),

    /**
     * Constant for the semicolon key, ";"
     */
    SEMICOLON(KeyCode.SEMICOLON),

    /**
     * Constant for the equals key, "="
     */
    EQUALS(KeyCode.EQUALS),

    /**
     * Constant for the {@code A} key.
     */
    A(KeyCode.A),

    /**
     * Constant for the {@code B} key.
     */
    B(KeyCode.B),

    /**
     * Constant for the {@code C} key.
     */
    C(KeyCode.C),

    /**
     * Constant for the {@code D} key.
     */
    D(KeyCode.D),

    /**
     * Constant for the {@code E} key.
     */
    E(KeyCode.E),

    /**
     * Constant for the {@code F} key.
     */
    F(KeyCode.F),

    /**
     * Constant for the {@code G} key.
     */
    G(KeyCode.G),

    /**
     * Constant for the {@code H} key.
     */
    H(KeyCode.H),

    /**
     * Constant for the {@code I} key.
     */
    I(KeyCode.I),

    /**
     * Constant for the {@code J} key.
     */
    J(KeyCode.J),

    /**
     * Constant for the {@code K} key.
     */
    K(KeyCode.K),

    /**
     * Constant for the {@code L} key.
     */
    L(KeyCode.L),

    /**
     * Constant for the {@code M} key.
     */
    M(KeyCode.M),

    /**
     * Constant for the {@code N} key.
     */
    N(KeyCode.N),

    /**
     * Constant for the {@code O} key.
     */
    O(KeyCode.O),

    /**
     * Constant for the {@code P} key.
     */
    P(KeyCode.P),

    /**
     * Constant for the {@code Q} key.
     */
    Q(KeyCode.Q),

    /**
     * Constant for the {@code R} key.
     */
    R(KeyCode.R),

    /**
     * Constant for the {@code S} key.
     */
    S(KeyCode.S),

    /**
     * Constant for the {@code T} key.
     */
    T(KeyCode.T),

    /**
     * Constant for the {@code U} key.
     */
    U(KeyCode.U),

    /**
     * Constant for the {@code V} key.
     */
    V(KeyCode.V),

    /**
     * Constant for the {@code W} key.
     */
    W(KeyCode.W),

    /**
     * Constant for the {@code X} key.
     */
    X(KeyCode.X),

    /**
     * Constant for the {@code Y} key.
     */
    Y(KeyCode.Y),

    /**
     * Constant for the {@code Z} key.
     */
    Z(KeyCode.Z),

    /**
     * Constant for the open bracket key, "["
     */
    OPEN_BRACKET(KeyCode.OPEN_BRACKET),

    /**
     * Constant for the back slash key, "\"
     */
    BACK_SLASH(KeyCode.BACK_SLASH),

    /**
     * Constant for the close bracket key, "]"
     */
    CLOSE_BRACKET(KeyCode.CLOSE_BRACKET),

    /**
     * Constant for the {@code Numpad 0} key.
     */
    NUMPAD0(KeyCode.NUMPAD0),

    /**
     * Constant for the {@code Numpad 1} key.
     */
    NUMPAD1(KeyCode.NUMPAD1),

    /**
     * Constant for the {@code Numpad 2} key.
     */
    NUMPAD2(KeyCode.NUMPAD2),

    /**
     * Constant for the {@code Numpad 3} key.
     */
    NUMPAD3(KeyCode.NUMPAD3),

    /**
     * Constant for the {@code Numpad 4} key.
     */
    NUMPAD4(KeyCode.NUMPAD4),

    /**
     * Constant for the {@code Numpad 5} key.
     */
    NUMPAD5(KeyCode.NUMPAD5),

    /**
     * Constant for the {@code Numpad 6} key.
     */
    NUMPAD6(KeyCode.NUMPAD6),

    /**
     * Constant for the {@code Numpad 7} key.
     */
    NUMPAD7(KeyCode.NUMPAD7),

    /**
     * Constant for the {@code Numpad 8} key.
     */
    NUMPAD8(KeyCode.NUMPAD8),

    /**
     * Constant for the {@code Numpad 9} key.
     */
    NUMPAD9(KeyCode.NUMPAD9),

    /**
     * Constant for the {@code Multiply} key.
     */
    MULTIPLY(KeyCode.MULTIPLY),

    /**
     * Constant for the {@code Add} key.
     */
    ADD(KeyCode.ADD),

    /**
     * Constant for the Numpad Separator key.
     */
    SEPARATOR(KeyCode.SEPARATOR),

    /**
     * Constant for the {@code Subtract} key.
     */
    SUBTRACT(KeyCode.SUBTRACT),

    /**
     * Constant for the {@code Decimal} key.
     */
    DECIMAL(KeyCode.DECIMAL),

    /**
     * Constant for the {@code Divide} key.
     */
    DIVIDE(KeyCode.DIVIDE),

    /**
     * Constant for the {@code Delete} key.
     */
    DELETE(KeyCode.DELETE), /* ASCII:Integer   DEL */

    /**
     * Constant for the {@code Num Lock} key.
     */
    NUM_LOCK(KeyCode.NUM_LOCK),

    /**
     * Constant for the {@code Scroll Lock} key.
     */
    SCROLL_LOCK(KeyCode.SCROLL_LOCK),

    /**
     * Constant for the F1 function key.
     */
    F1(KeyCode.F1),

    /**
     * Constant for the F2 function key.
     */
    F2(KeyCode.F2),

    /**
     * Constant for the F3 function key.
     */
    F3(KeyCode.F3),

    /**
     * Constant for the F4 function key.
     */
    F4(KeyCode.F4),

    /**
     * Constant for the F5 function key.
     */
    F5(KeyCode.F5),

    /**
     * Constant for the F6 function key.
     */
    F6(KeyCode.F6),

    /**
     * Constant for the F7 function key.
     */
    F7(KeyCode.F7),

    /**
     * Constant for the F8 function key.
     */
    F8(KeyCode.F8),

    /**
     * Constant for the F9 function key.
     */
    F9(KeyCode.F9),

    /**
     * Constant for the F10 function key.
     */
    F10(KeyCode.F10),

    /**
     * Constant for the F11 function key.
     */
    F11(KeyCode.F11),

    /**
     * Constant for the F12 function key.
     */
    F12(KeyCode.F12),

    /**
     * Constant for the F13 function key.
     */
    F13(KeyCode.F13),

    /**
     * Constant for the F14 function key.
     */
    F14(KeyCode.F14),

    /**
     * Constant for the F15 function key.
     */
    F15(KeyCode.F15),

    /**
     * Constant for the F16 function key.
     */
    F16(KeyCode.F16),

    /**
     * Constant for the F17 function key.
     */
    F17(KeyCode.F17),

    /**
     * Constant for the F18 function key.
     */
    F18(KeyCode.F18),

    /**
     * Constant for the F19 function key.
     */
    F19(KeyCode.F19),

    /**
     * Constant for the F20 function key.
     */
    F20(KeyCode.F20),

    /**
     * Constant for the F21 function key.
     */
    F21(KeyCode.F21),

    /**
     * Constant for the F22 function key.
     */
    F22(KeyCode.F22),

    /**
     * Constant for the F23 function key.
     */
    F23(KeyCode.F23),

    /**
     * Constant for the F24 function key.
     */
    F24(KeyCode.F24),

    /**
     * Constant for the {@code Print Screen} key.
     */
    PRINTSCREEN(KeyCode.PRINTSCREEN),

    /**
     * Constant for the {@code Insert} key.
     */
    INSERT(KeyCode.INSERT),

    /**
     * Constant for the {@code Help} key.
     */
    HELP(KeyCode.HELP),

    /**
     * Constant for the {@code Meta} key.
     */
    META(KeyCode.META),

    /**
     * Constant for the {@code Back Quote} key.
     */
    BACK_QUOTE(KeyCode.BACK_QUOTE),

    /**
     * Constant for the {@code Quote} key.
     */
    QUOTE(KeyCode.QUOTE),

    /**
     * Constant for the numeric keypad <b>up</b> arrow key.
     */
    KP_UP(KeyCode.KP_UP),

    /**
     * Constant for the numeric keypad <b>down</b> arrow key.
     */
    KP_DOWN(KeyCode.KP_DOWN),

    /**
     * Constant for the numeric keypad <b>left</b> arrow key.
     */
    KP_LEFT(KeyCode.KP_LEFT),

    /**
     * Constant for the numeric keypad <b>right</b> arrow key.
     */
    KP_RIGHT(KeyCode.KP_RIGHT),

    /**
     * Constant for the {@code Dead Grave} key.
     */
    DEAD_GRAVE(KeyCode.DEAD_GRAVE),

    /**
     * Constant for the {@code Dead Acute} key.
     */
    DEAD_ACUTE(KeyCode.DEAD_ACUTE),

    /**
     * Constant for the {@code Dead Circumflex} key.
     */
    DEAD_CIRCUMFLEX(KeyCode.CIRCUMFLEX),

    /**
     * Constant for the {@code Dead Tilde} key.
     */
    DEAD_TILDE(KeyCode.DEAD_TILDE),

    /**
     * Constant for the {@code Dead Macron} key.
     */
    DEAD_MACRON(KeyCode.DEAD_MACRON),

    /**
     * Constant for the {@code Dead Breve} key.
     */
    DEAD_BREVE(KeyCode.DEAD_BREVE),

    /**
     * Constant for the {@code Dead Abovedot} key.
     */
    DEAD_ABOVEDOT(KeyCode.DEAD_ABOVEDOT),

    /**
     * Constant for the {@code Dead Diaeresis} key.
     */
    DEAD_DIAERESIS(KeyCode.DEAD_DIAERESIS),

    /**
     * Constant for the {@code Dead Abovering} key.
     */
    DEAD_ABOVERING(KeyCode.DEAD_ABOVERING),

    /**
     * Constant for the {@code Dead Doubleacute} key.
     */
    DEAD_DOUBLEACUTE(KeyCode.DEAD_DOUBLEACUTE),

    /**
     * Constant for the {@code Dead Caron} key.
     */
    DEAD_CARON(KeyCode.DEAD_CARON),

    /**
     * Constant for the {@code Dead Cedilla} key.
     */
    DEAD_CEDILLA(KeyCode.DEAD_CEDILLA),

    /**
     * Constant for the {@code Dead Ogonek} key.
     */
    DEAD_OGONEK(KeyCode.DEAD_OGONEK),

    /**
     * Constant for the {@code Dead Iota} key.
     */
    DEAD_IOTA(KeyCode.DEAD_IOTA),

    /**
     * Constant for the {@code Dead Voiced Sound} key.
     */
    DEAD_VOICED_SOUND(KeyCode.DEAD_VOICED_SOUND),

    /**
     * Constant for the {@code Dead Semivoiced Sound} key.
     */
    DEAD_SEMIVOICED_SOUND(KeyCode.DEAD_SEMIVOICED_SOUND),

    /**
     * Constant for the {@code Ampersand} key.
     */
    AMPERSAND(KeyCode.AMPERSAND),

    /**
     * Constant for the {@code Asterisk} key.
     */
    ASTERISK(KeyCode.ASTERISK),

    /**
     * Constant for the {@code Double Quote} key.
     */
    QUOTEDBL(KeyCode.QUOTEDBL),

    /**
     * Constant for the {@code Less} key.
     */
    LESS(KeyCode.LESS),

    /**
     * Constant for the {@code Greater} key.
     */
    GREATER(KeyCode.GREATER),

    /**
     * Constant for the {@code Left Brace} key.
     */
    BRACELEFT(KeyCode.BRACELEFT),

    /**
     * Constant for the {@code Right Brace} key.
     */
    BRACERIGHT(KeyCode.BRACERIGHT),

    /**
     * Constant for the "@" key.
     */
    AT(KeyCode.AT),

    /**
     * Constant for the ":" key.
     */
    COLON(KeyCode.COLON),

    /**
     * Constant for the "^" key.
     */
    CIRCUMFLEX(KeyCode.CIRCUMFLEX),

    /**
     * Constant for the "$" key.
     */
    DOLLAR(KeyCode.DOLLAR),

    /**
     * Constant for the Euro currency sign key.
     */
    EURO_SIGN(KeyCode.EURO_SIGN),

    /**
     * Constant for the "!" key.
     */
    EXCLAMATION_MARK(KeyCode.EXCLAMATION_MARK),

    /**
     * Constant for the inverted exclamation mark key.
     */
    INVERTED_EXCLAMATION_MARK(KeyCode.INVERTED_EXCLAMATION_MARK),

    /**
     * Constant for the "(" key.
     */
    LEFT_PARENTHESIS(KeyCode.LEFT_PARENTHESIS),

    /**
     * Constant for the "#" key.
     */
    NUMBER_SIGN(KeyCode.NUMBER_SIGN),

    /**
     * Constant for the "+" key.
     */
    PLUS(KeyCode.PLUS),

    /**
     * Constant for the ")" key.
     */
    RIGHT_PARENTHESIS(KeyCode.RIGHT_PARENTHESIS),

    /**
     * Constant for the "_" key.
     */
    UNDERSCORE(KeyCode.UNDERSCORE),

    /**
     * Constant for the Microsoft Windows "Windows" key.
     * It is used for both the left and right version of the key.
     */
    WINDOWS(KeyCode.WINDOWS),

    /**
     * Constant for the Microsoft Windows Context Menu key.
     */
    CONTEXT_MENU(KeyCode.CONTEXT_MENU),

    /**
     * Constant for input method support on Asian Keyboards.
     */
    FINAL(KeyCode.FINAL),

    /**
     * Constant for the Convert function key.
     */
    CONVERT(KeyCode.CONVERT),

    /**
     * Constant for the Don't Convert function key.
     */
    NONCONVERT(KeyCode.NONCONVERT),

    /**
     * Constant for the Accept or Commit function key.
     */
    ACCEPT(KeyCode.ACCEPT),

    /**
     * Constant for the {@code Mode Change} key.
     */
    MODECHANGE(KeyCode.MODECHANGE),
    /**
     * Constant for the {@code Kana} key.
     */
    KANA(KeyCode.KANA),
    /**
     * Constant for the {@code Kanji} key.
     */
    KANJI(KeyCode.KANJI),

    /**
     * Constant for the Alphanumeric function key.
     */
    ALPHANUMERIC(KeyCode.ALPHANUMERIC),

    /**
     * Constant for the Katakana function key.
     */
    KATAKANA(KeyCode.KATAKANA),

    /**
     * Constant for the Hiragana function key.
     */
    HIRAGANA(KeyCode.HIRAGANA),

    /**
     * Constant for the Full-Width Characters function key.
     */
    FULL_WIDTH(KeyCode.FULL_WIDTH),

    /**
     * Constant for the Half-Width Characters function key.
     */
    HALF_WIDTH(KeyCode.HALF_WIDTH),

    /**
     * Constant for the Roman Characters function key.
     */
    ROMAN_CHARACTERS(KeyCode.ROMAN_CHARACTERS),

    /**
     * Constant for the All Candidates function key.
     */
    ALL_CANDIDATES(KeyCode.ALL_CANDIDATES),

    /**
     * Constant for the Previous Candidate function key.
     */
    PREVIOUS_CANDIDATE(KeyCode.PREVIOUS_CANDIDATE),

    /**
     * Constant for the Code Input function key.
     */
    CODE_INPUT(KeyCode.CODE_INPUT),

    /**
     * Constant for the Japanese-Katakana function key.
     * This key switches to a Japanese input method and selects its Katakana input mode.
     */
    JAPANESE_KATAKANA(KeyCode.JAPANESE_KATAKANA),

    /**
     * Constant for the Japanese-Hiragana function key.
     * This key switches to a Japanese input method and selects its Hiragana input mode.
     */
    JAPANESE_HIRAGANA(KeyCode.JAPANESE_HIRAGANA),

    /**
     * Constant for the Japanese-Roman function key.
     * This key switches to a Japanese input method and selects its Roman-Direct input mode.
     */
    JAPANESE_ROMAN(KeyCode.JAPANESE_ROMAN),

    /**
     * Constant for the locking Kana function key.
     * This key locks the keyboard into a Kana layout.
     */
    KANA_LOCK(KeyCode.KANA_LOCK),

    /**
     * Constant for the input method on/off key.
     */
    INPUT_METHOD_ON_OFF(KeyCode.INPUT_METHOD_ON_OFF),

    /**
     * Constant for the {@code Cut} key.
     */
    CUT(KeyCode.CUT),

    /**
     * Constant for the {@code Copy} key.
     */
    COPY(KeyCode.COPY),

    /**
     * Constant for the {@code Paste} key.
     */
    PASTE(KeyCode.PASTE),

    /**
     * Constant for the {@code Undo} key.
     */
    UNDO(KeyCode.UNDO),

    /**
     * Constant for the {@code Again} key.
     */
    AGAIN(KeyCode.AGAIN),

    /**
     * Constant for the {@code Find} key.
     */
    FIND(KeyCode.FIND),

    /**
     * Constant for the {@code Properties} key.
     */
    PROPS(KeyCode.PROPS),

    /**
     * Constant for the {@code Stop} key.
     */
    STOP(KeyCode.STOP),

    /**
     * Constant for the input method on/off key.
     */
    COMPOSE(KeyCode.COMPOSE),

    /**
     * Constant for the AltGraph function key.
     */
    ALT_GRAPH(KeyCode.ALT_GRAPH),

    /**
     * Constant for the Begin key.
     */
    BEGIN(KeyCode.BEGIN),

    /**
     * This value is used to indicate that the keyCode is unknown.
     * Key typed events do not have a keyCode value; this value
     * is used instead.
     */
    UNDEFINED(KeyCode.UNDEFINED),


    //--------------------------------------------------------------
    //
    // Mobile and Embedded Specific Key Codes
    //
    //--------------------------------------------------------------

    /**
     * Constant for the {@code Softkey 0} key.
     */
    SOFTKEY_0(KeyCode.SOFTKEY_0),

    /**
     * Constant for the {@code Softkey 1} key.
     */
    SOFTKEY_1(KeyCode.SOFTKEY_1),

    /**
     * Constant for the {@code Softkey 2} key.
     */
    SOFTKEY_2(KeyCode.SOFTKEY_2),

    /**
     * Constant for the {@code Softkey 3} key.
     */
    SOFTKEY_3(KeyCode.SOFTKEY_3),

    /**
     * Constant for the {@code Softkey 4} key.
     */
    SOFTKEY_4(KeyCode.SOFTKEY_4),

    /**
     * Constant for the {@code Softkey 5} key.
     */
    SOFTKEY_5(KeyCode.SOFTKEY_5),

    /**
     * Constant for the {@code Softkey 6} key.
     */
    SOFTKEY_6(KeyCode.SOFTKEY_6),

    /**
     * Constant for the {@code Softkey 7} key.
     */
    SOFTKEY_7(KeyCode.SOFTKEY_7),

    /**
     * Constant for the {@code Softkey 8} key.
     */
    SOFTKEY_8(KeyCode.SOFTKEY_8),

    /**
     * Constant for the {@code Softkey 9} key.
     */
    SOFTKEY_9(KeyCode.SOFTKEY_9),

    /**
     * Constant for the {@code Game A} key.
     */
    GAME_A(KeyCode.GAME_A),

    /**
     * Constant for the {@code Game B} key.
     */
    GAME_B(KeyCode.GAME_B),

    /**
     * Constant for the {@code Game C} key.
     */
    GAME_C(KeyCode.GAME_C),

    /**
     * Constant for the {@code Game D} key.
     */
    GAME_D(KeyCode.GAME_D),

    /**
     * Constant for the {@code Star} key.
     */
    STAR(KeyCode.STAR),

    /**
     * Constant for the {@code Pound} key.
     */
    POUND(KeyCode.POUND),

    /**
     * Constant for the {@code Power} key.
     */
    POWER(KeyCode.POWER),

    /**
     * Constant for the {@code Info} key.
     */
    INFO(KeyCode.INFO),

    /**
     * Constant for the {@code Colored Key 0} key.
     */
    COLORED_KEY_0(KeyCode.COLORED_KEY_0),

    /**
     * Constant for the {@code Colored Key 1} key.
     */
    COLORED_KEY_1(KeyCode.COLORED_KEY_1),

    /**
     * Constant for the {@code Colored Key 2} key.
     */
    COLORED_KEY_2(KeyCode.COLORED_KEY_2),

    /**
     * Constant for the {@code Colored Key 3} key.
     */
    COLORED_KEY_3(KeyCode.COLORED_KEY_3),

    /**
     * Constant for the {@code Eject} key.
     */
    EJECT_TOGGLE(KeyCode.EJECT_TOGGLE),

    /**
     * Constant for the {@code Play} key.
     */
    PLAY(KeyCode.PLAY),

    /**
     * Constant for the {@code Record} key.
     */
    RECORD(KeyCode.RECORD),

    /**
     * Constant for the {@code Fast Forward} key.
     */
    FAST_FWD(KeyCode.FAST_FWD),

    /**
     * Constant for the {@code Rewind} key.
     */
    REWIND(KeyCode.REWIND),

    /**
     * Constant for the {@code Previous Track} key.
     */
    TRACK_PREV(KeyCode.TRACK_PREV),

    /**
     * Constant for the {@code Next Track} key.
     */
    TRACK_NEXT(KeyCode.TRACK_NEXT),

    /**
     * Constant for the {@code Channel Up} key.
     */
    CHANNEL_UP(KeyCode.CHANNEL_UP),

    /**
     * Constant for the {@code Channel Down} key.
     */
    CHANNEL_DOWN(KeyCode.CHANNEL_DOWN),

    /**
     * Constant for the {@code Volume Up} key.
     */
    VOLUME_UP(KeyCode.VOLUME_UP),

    /**
     * Constant for the {@code Volume Down} key.
     */
    VOLUME_DOWN(KeyCode.VOLUME_DOWN),

    /**
     * Constant for the {@code Mute} key.
     */
    MUTE(KeyCode.MUTE),

    /**
     * Constant for the Apple {@code Command} key.
     *
     * @since JavaFX 2.1
     */
    COMMAND(KeyCode.COMMAND),

    /**
     * Constant for the {@code Shortcut} key.
     */
    SHORTCUT(KeyCode.SHORTCUT);

    private final KeyCode keyCode;

    JFootKey(KeyCode keyCode) {
        this.keyCode = keyCode;
        System.out.println("\n--------------------");
        System.out.println("Name = " + getName());
        System.out.println("Key Code = " + keyCode);
    }

    public static boolean isAnyKeyDown(JFootKey... keys) {
        for(JFootKey key : keys) {
            if(key.isKeyDown()) {
                return true;
            }
        }
        return false;
    }

    /**
     * Gets name of this key code.
     *
     * @return Name of this key code
     */
    public final String getName() {
        return keyCode.getName();
    }

    public boolean isKeyDown() {
        return Greenfoot.isKeyDown(getName());
    }

    public <ArgType1, ArgType2> void onKeyPress(
            BiConsumer<ArgType1, ArgType2> func,
            ArgType1 argType1,
            ArgType2 argType2) {
        onKeyPress(() -> func.accept(argType1, argType2));
    }

    public <ArgType1> void onKeyPress(
            Consumer<ArgType1> func,
            ArgType1 arg1) {
        onKeyPress(() -> func.accept(arg1));
    }

    public void onKeyPress(Runnable runnable) {
        if (isKeyDown())
            runnable.run();
    }


    public KeyCode toKeyCode() {
        return keyCode;
    }

    public int toKeyCodeInt() {
        return keyCode.impl_getCode();
    }

    public static List<String> getCurrentlyPressedKeys() {
        throw new UnsupportedOperationException("This method has yet to be implemented");
    }

    public static JFootKey toJFootKey(Integer keyCode) {
        for (JFootKey jfk : JFootKey.values()) {
            if (jfk.toKeyCodeInt() == keyCode) {
                return jfk;
            }
        }
        String errorMessage = "Unable to find keycode with value [ %s ]";
        throw new IllegalArgumentException(String.format(errorMessage, keyCode));
    }

    public static JFootKey toJFootKey(KeyCode keyCode) {
        for (JFootKey jFootKey : values()) {
            if (jFootKey.toKeyCode().equals(keyCode)) {
                return jFootKey;
            }
        }
        String errorMessage = "Unable to find keycode with value [ %s ]";
        throw new IllegalArgumentException(String.format(errorMessage, keyCode));
    }

}
