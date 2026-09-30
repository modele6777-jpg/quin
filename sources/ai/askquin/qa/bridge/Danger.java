package ai.askquin.qa.bridge;

import defpackage.ab3;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.os2;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lai/askquin/qa/bridge/Danger;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "ab3", "BENIGN", "STAGING_ONLY", "BLOCKED_IN_PRODUCTION", "Quin:qa-bridge"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum Danger {
    BENIGN,
    STAGING_ONLY,
    BLOCKED_IN_PRODUCTION;

    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final ab3 Companion = new ab3();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new os2(24));

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        Danger[] dangerArrValues = values();
        dangerArrValues.getClass();
        return new wn2("ai.askquin.qa.bridge.Danger", dangerArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }
}
