package defpackage;

import ai.askquin.ui.settings.model.UsageType;
import tech.chatmind.api.credits.SubscriptionKind;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kc {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SubscriptionKind.values().length];
        try {
            iArr[SubscriptionKind.Count.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SubscriptionKind.Month.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SubscriptionKind.Quarter.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SubscriptionKind.Year.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[o7e.values().length];
        try {
            iArr2[3] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[0] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[1] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[2] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        int[] iArr3 = new int[UsageType.values().length];
        try {
            iArr3[UsageType.Free.ordinal()] = 1;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[UsageType.Vip.ordinal()] = 2;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[UsageType.AddOn.ordinal()] = 3;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr3[UsageType.Compensate.ordinal()] = 4;
        } catch (NoSuchFieldError unused12) {
        }
        b = iArr3;
        int[] iArr4 = new int[e4d.values().length];
        try {
            iArr4[1] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[0] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        c = iArr4;
    }
}
