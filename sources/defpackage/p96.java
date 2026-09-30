package defpackage;

import ai.askquin.ui.router.GiftCardFixtureScenario;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p96 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GiftCardFixtureScenario.values().length];
        try {
            iArr[GiftCardFixtureScenario.PurchaseDelayedIssuance.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftCardFixtureScenario.SentList.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GiftCardFixtureScenario.ReceivedList.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
