package defpackage;

import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w86 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GiftCardSku.values().length];
        try {
            iArr[GiftCardSku.OneYear.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftCardSku.OneMonth.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GiftCardSku.Unknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
