package tech.chatmind.api.credits;

import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.n7e;
import defpackage.ond;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ltech/chatmind/api/credits/SubscriptionKind;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "n7e", "Count", "Month", "Quarter", "Year", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum SubscriptionKind {
    Count,
    Month,
    Quarter,
    Year;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final n7e Companion = new n7e();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new ond(14));

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        SubscriptionKind[] subscriptionKindArrValues = values();
        subscriptionKindArrValues.getClass();
        return new wn2("tech.chatmind.api.credits.SubscriptionKind", subscriptionKindArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }
}
