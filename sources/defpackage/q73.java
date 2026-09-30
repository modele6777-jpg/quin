package defpackage;

import ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class q73 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DailyFortuneGuideTrigger.values().length];
        try {
            iArr[DailyFortuneGuideTrigger.FirstReadingCompleted.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DailyFortuneGuideTrigger.PaywallInterceptClose.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
