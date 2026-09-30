package ai.askquin.ui.popup.dailyfortune;

import defpackage.c83;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.nk8;
import defpackage.os2;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import java.lang.annotation.Annotation;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lai/askquin/ui/popup/dailyfortune/DailyFortuneGuideTrigger;", "", "", "analyticsValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getAnalyticsValue", "()Ljava/lang/String;", "Companion", "c83", "FirstReadingCompleted", "PaywallInterceptClose", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum DailyFortuneGuideTrigger {
    FirstReadingCompleted("first_reading_completed"),
    PaywallInterceptClose("paywall_intercept_close");

    private final String analyticsValue;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final c83 Companion = new c83();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new os2(17));

    DailyFortuneGuideTrigger(String str) {
        this.analyticsValue = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _init_$_anonymous_() {
        return nk8.p("ai.askquin.ui.popup.dailyfortune.DailyFortuneGuideTrigger", values(), new String[]{"first_reading_completed", "paywall_intercept_close"}, new Annotation[][]{null, null});
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }
}
