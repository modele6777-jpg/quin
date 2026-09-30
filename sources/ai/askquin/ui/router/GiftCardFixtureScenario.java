package ai.askquin.ui.router;

import defpackage.eb3;
import defpackage.f86;
import defpackage.lw7;
import defpackage.lx4;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.w66;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.z18;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lai/askquin/ui/router/GiftCardFixtureScenario;", "", "", "wireValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getWireValue", "()Ljava/lang/String;", "Companion", "f86", "PurchaseSuccess", "PurchaseDelayedIssuance", "SentList", "ReceivedList", "SentUnclaimed", "SentClaimed", "SentInvalidated", "ReceivedActive", "ReceivedPending", "ReceivedUsedUp", "ReceivedExpired", "ReceivedInvalidated", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public enum GiftCardFixtureScenario {
    PurchaseSuccess("purchase-success"),
    PurchaseDelayedIssuance("purchase-delayed-issuance"),
    SentList("sent-list"),
    ReceivedList("received-list"),
    SentUnclaimed("sent-unclaimed"),
    SentClaimed("sent-claimed"),
    SentInvalidated("sent-invalidated"),
    ReceivedActive("received-active"),
    ReceivedPending("received-pending"),
    ReceivedUsedUp("received-used-up"),
    ReceivedExpired("received-expired"),
    ReceivedInvalidated("received-invalidated");

    private final String wireValue;
    private static final /* synthetic */ lx4 $ENTRIES = pa7.Q(values());
    public static final f86 Companion = new f86();
    private static final lw7 $cachedSerializer$delegate = eb3.N(z18.b, new w66(1));

    GiftCardFixtureScenario(String str) {
        this.wireValue = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _init_$_anonymous_() {
        GiftCardFixtureScenario[] giftCardFixtureScenarioArrValues = values();
        giftCardFixtureScenarioArrValues.getClass();
        return new wn2("ai.askquin.ui.router.GiftCardFixtureScenario", giftCardFixtureScenarioArrValues);
    }

    public static lx4 getEntries() {
        return $ENTRIES;
    }

    public final String getWireValue() {
        return this.wireValue;
    }
}
