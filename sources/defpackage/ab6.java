package defpackage;

import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class ab6 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[GiftCardSku.values().length];
        try {
            iArr[GiftCardSku.OneMonth.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[GiftCardSku.OneYear.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[GiftCardSku.Unknown.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[GiftCardStatus.values().length];
        try {
            iArr2[GiftCardStatus.Unclaimed.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[GiftCardStatus.Claimed.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[GiftCardStatus.Invalidated.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[GiftCardStatus.Pending.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[GiftCardStatus.Active.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[GiftCardStatus.Expired.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[GiftCardStatus.UsedUp.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        b = iArr2;
        int[] iArr3 = new int[wa6.values().length];
        try {
            iArr3[0] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[1] = 2;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
