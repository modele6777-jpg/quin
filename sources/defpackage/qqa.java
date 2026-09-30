package defpackage;

import tech.chatmind.api.credits.GuestPassGrantReason;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class qqa {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GuestPassGrantReason.values().length];
        try {
            iArr[GuestPassGrantReason.Purchase.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GuestPassGrantReason.Backfill.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GuestPassGrantReason.Renew.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GuestPassGrantReason.Unknown.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
