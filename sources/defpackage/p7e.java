package defpackage;

import tech.chatmind.api.PeriodUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class p7e {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PeriodUnit.values().length];
        try {
            iArr[PeriodUnit.QUARTER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PeriodUnit.YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
