package ai.askquin.data;

import defpackage.ap;
import defpackage.eb3;
import defpackage.i7b;
import defpackage.iif;
import defpackage.l9b;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.m9b;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lai/askquin/data/QuotaBlockReason;", "", "<init>", "(Ljava/lang/String;I)V", "", "getAnalyticsValue", "()Ljava/lang/String;", "analyticsValue", "Companion", "l9b", "CountInsufficient", "InsufficientBalance", "DailyLimit", "NoFollowUpPermission", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum QuotaBlockReason {
    CountInsufficient,
    InsufficientBalance,
    DailyLimit,
    NoFollowUpPermission;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final l9b Companion = new l9b();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new i7b(6));

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        QuotaBlockReason[] quotaBlockReasonArrValues = values();
        quotaBlockReasonArrValues.getClass();
        return new wn2("ai.askquin.data.QuotaBlockReason", quotaBlockReasonArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsValue() {
        iif iifVar;
        int i = m9b.a[ordinal()];
        if (i == 1 || i == 2) {
            iifVar = iif.InsufficientBalance;
        } else if (i == 3) {
            iifVar = iif.DailyLimit;
        } else {
            if (i != 4) {
                ap.c();
                return null;
            }
            iifVar = iif.NoSubscription;
        }
        return iifVar.a();
    }
}
