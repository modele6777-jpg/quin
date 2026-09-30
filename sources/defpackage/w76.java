package defpackage;

import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w76 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[GiftCardStatus.values().length];
        try {
            iArr[GiftCardStatus.Unclaimed.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftCardStatus.Pending.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GiftCardStatus.Claimed.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[GiftCardStatus.Expired.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[GiftCardStatus.UsedUp.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[GiftCardStatus.Active.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[GiftCardStatus.Invalidated.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[GiftCardStatus.Unknown.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        a = iArr;
        int[] iArr2 = new int[wa6.values().length];
        try {
            iArr2[0] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[1] = 2;
        } catch (NoSuchFieldError unused10) {
        }
    }
}
