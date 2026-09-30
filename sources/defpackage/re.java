package defpackage;

import com.adjust.sdk.ActivityKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class re {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ActivityKind.values().length];
        a = iArr;
        try {
            iArr[ActivityKind.SESSION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[ActivityKind.EVENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[ActivityKind.CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[ActivityKind.ATTRIBUTION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            a[ActivityKind.INFO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            a[ActivityKind.GDPR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            a[ActivityKind.AD_REVENUE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            a[ActivityKind.SUBSCRIPTION.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            a[ActivityKind.THIRD_PARTY_SHARING.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            a[ActivityKind.MEASUREMENT_CONSENT.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            a[ActivityKind.PURCHASE_VERIFICATION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
    }
}
