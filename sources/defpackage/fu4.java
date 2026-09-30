package defpackage;

import tech.chatmind.api.EmotionTheme;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class fu4 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EmotionTheme.values().length];
        try {
            iArr[EmotionTheme.CALM.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[EmotionTheme.JOY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[EmotionTheme.WORRY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[EmotionTheme.TENSION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[EmotionTheme.UNKNOWN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
