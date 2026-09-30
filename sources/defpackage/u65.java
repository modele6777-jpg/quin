package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import tech.chatmind.api.ArcanaGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class u65 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TarotSkinIdentify.values().length];
        try {
            iArr[TarotSkinIdentify.Classic.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TarotSkinIdentify.NeoRiderWaite.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[TarotSkinIdentify.Cat.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[TarotSkinIdentify.Love.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[TarotSkinIdentify.Puppet.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[TarotSkinIdentify.Symbolism.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[TarotSkinIdentify.Minimalism.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[TarotSkinIdentify.Fable.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[TarotSkinIdentify.Woodcut.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[TarotSkinIdentify.Dream.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[TarotSkinIdentify.Prism.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[TarotSkinIdentify.Midnight.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr[TarotSkinIdentify.DarkGold.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr[TarotSkinIdentify.ZenithDay.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr[TarotSkinIdentify.EternalNight.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr[TarotSkinIdentify.Transformation.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr[TarotSkinIdentify.SecretManor.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr[TarotSkinIdentify.MagicAwakening.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        a = iArr;
        int[] iArr2 = new int[ArcanaGroup.values().length];
        try {
            iArr2[ArcanaGroup.Major.ordinal()] = 1;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[ArcanaGroup.Wands.ordinal()] = 2;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[ArcanaGroup.Cups.ordinal()] = 3;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[ArcanaGroup.Pentacles.ordinal()] = 4;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[ArcanaGroup.Swords.ordinal()] = 5;
        } catch (NoSuchFieldError unused23) {
        }
        b = iArr2;
    }
}
