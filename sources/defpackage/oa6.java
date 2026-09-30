package defpackage;

import ai.askquin.ui.router.GiftCardPerspective;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class oa6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GiftCardPerspective.values().length];
        try {
            iArr[GiftCardPerspective.Sent.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftCardPerspective.Received.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
