package defpackage;

import ai.askquin.data.QuotaBlockReason;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class c4a {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[QuotaBlockReason.values().length];
        try {
            iArr[QuotaBlockReason.CountInsufficient.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[QuotaBlockReason.InsufficientBalance.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[QuotaBlockReason.NoFollowUpPermission.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[QuotaBlockReason.DailyLimit.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
    }
}
