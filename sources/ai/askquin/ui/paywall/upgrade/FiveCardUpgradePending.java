package ai.askquin.ui.paywall.upgrade;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.jh5;
import defpackage.kh5;
import defpackage.lw7;
import defpackage.mz4;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002/0B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ>\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0019J\u0010\u0010\"\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\"\u0010\u001eJ\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u001e¨\u00061"}, d2 = {"Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;", "", "", "accountId", "readingId", "", "orderIds", "", "remainingReadings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;ILxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;I)Lai/askquin/ui/paywall/upgrade/FiveCardUpgradePending;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccountId", "getReadingId", "Ljava/util/List;", "getOrderIds", "I", "getRemainingReadings", "Companion", "jh5", "kh5", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class FiveCardUpgradePending {
    public static final int $stable = 8;
    private final String accountId;
    private final List<String> orderIds;
    private final String readingId;
    private final int remainingReadings;
    public static final kh5 Companion = new kh5();
    private static final lw7[] $childSerializers = {null, null, eb3.N(z18.b, new mz4(19)), null};

    public /* synthetic */ FiveCardUpgradePending(int i, String str, String str2, List list, int i2, xyc xycVar) {
        if (15 != (i & 15)) {
            an1.R(i, 15, jh5.a.e());
            throw null;
        }
        this.accountId = str;
        this.readingId = str2;
        this.orderIds = list;
        this.remainingReadings = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FiveCardUpgradePending copy$default(FiveCardUpgradePending fiveCardUpgradePending, String str, String str2, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = fiveCardUpgradePending.accountId;
        }
        if ((i2 & 2) != 0) {
            str2 = fiveCardUpgradePending.readingId;
        }
        if ((i2 & 4) != 0) {
            list = fiveCardUpgradePending.orderIds;
        }
        if ((i2 & 8) != 0) {
            i = fiveCardUpgradePending.remainingReadings;
        }
        return fiveCardUpgradePending.copy(str, str2, list, i);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(FiveCardUpgradePending self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.accountId);
        output.w(serialDesc, 1, self.readingId);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.orderIds);
        output.v(3, self.remainingReadings, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAccountId() {
        return this.accountId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReadingId() {
        return this.readingId;
    }

    public final List<String> component3() {
        return this.orderIds;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getRemainingReadings() {
        return this.remainingReadings;
    }

    public final FiveCardUpgradePending copy(String accountId, String readingId, List<String> orderIds, int remainingReadings) {
        accountId.getClass();
        readingId.getClass();
        orderIds.getClass();
        return new FiveCardUpgradePending(accountId, readingId, orderIds, remainingReadings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FiveCardUpgradePending)) {
            return false;
        }
        FiveCardUpgradePending fiveCardUpgradePending = (FiveCardUpgradePending) other;
        return pa7.t(this.accountId, fiveCardUpgradePending.accountId) && pa7.t(this.readingId, fiveCardUpgradePending.readingId) && pa7.t(this.orderIds, fiveCardUpgradePending.orderIds) && this.remainingReadings == fiveCardUpgradePending.remainingReadings;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final List<String> getOrderIds() {
        return this.orderIds;
    }

    public final String getReadingId() {
        return this.readingId;
    }

    public final int getRemainingReadings() {
        return this.remainingReadings;
    }

    public int hashCode() {
        return Integer.hashCode(this.remainingReadings) + tec.a(ub3.c(this.accountId.hashCode() * 31, 31, this.readingId), 31, this.orderIds);
    }

    public String toString() {
        String str = this.accountId;
        String str2 = this.readingId;
        List<String> list = this.orderIds;
        int i = this.remainingReadings;
        StringBuilder sbO = ib8.o("FiveCardUpgradePending(accountId=", str, ", readingId=", str2, ", orderIds=");
        sbO.append(list);
        sbO.append(", remainingReadings=");
        sbO.append(i);
        sbO.append(")");
        return sbO.toString();
    }

    public FiveCardUpgradePending(String str, String str2, List<String> list, int i) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.accountId = str;
        this.readingId = str2;
        this.orderIds = list;
        this.remainingReadings = i;
    }
}
