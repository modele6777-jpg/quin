package defpackage;

import ai.askquin.ui.router.GiftCardFixtureScenario;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class k96 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[wa6.values().length];
        try {
            iArr[0] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        int[] iArr2 = new int[GiftCardFixtureScenario.values().length];
        try {
            iArr2[GiftCardFixtureScenario.PurchaseSuccess.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[GiftCardFixtureScenario.SentUnclaimed.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[GiftCardFixtureScenario.SentClaimed.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[GiftCardFixtureScenario.SentInvalidated.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedActive.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedPending.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedUsedUp.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedExpired.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedInvalidated.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[GiftCardFixtureScenario.PurchaseDelayedIssuance.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[GiftCardFixtureScenario.SentList.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[GiftCardFixtureScenario.ReceivedList.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        a = iArr2;
    }
}
