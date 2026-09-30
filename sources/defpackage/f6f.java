package defpackage;

import tech.chatmind.api.PauseReadingAudioStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class f6f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PauseReadingAudioStatus.values().length];
        try {
            iArr[PauseReadingAudioStatus.PAUSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PauseReadingAudioStatus.COMPLETE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PauseReadingAudioStatus.NOT_GENERATING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PauseReadingAudioStatus.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
