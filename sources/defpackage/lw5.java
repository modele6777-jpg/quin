package defpackage;

import tech.chatmind.api.seasonal.model.SeasonalStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class lw5 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SeasonalStatus.values().length];
        try {
            iArr[SeasonalStatus.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SeasonalStatus.PROCESSING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SeasonalStatus.ERROR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
