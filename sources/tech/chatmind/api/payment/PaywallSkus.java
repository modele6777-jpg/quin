package tech.chatmind.api.payment;

import defpackage.m5a;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.v5a;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = v5a.class)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB'\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001a\u0010\n¨\u0006\u001d"}, d2 = {"Ltech/chatmind/api/payment/PaywallSkus;", "", "", "Ltech/chatmind/api/payment/SubscriptionSku;", "subscriptions", "Ltech/chatmind/api/payment/InAppSku;", "inApps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Ltech/chatmind/api/payment/PaywallSkus;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSubscriptions", "getInApps", "Companion", "m5a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PaywallSkus {
    public static final int $stable = 0;
    public static final m5a Companion = new m5a();
    private final List<InAppSku> inApps;
    private final List<SubscriptionSku> subscriptions;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PaywallSkus(List list, List list2, int i, rp3 rp3Var) {
        int i2 = i & 1;
        pu4 pu4Var = pu4.a;
        this(i2 != 0 ? pu4Var : list, (i & 2) != 0 ? pu4Var : list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaywallSkus copy$default(PaywallSkus paywallSkus, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = paywallSkus.subscriptions;
        }
        if ((i & 2) != 0) {
            list2 = paywallSkus.inApps;
        }
        return paywallSkus.copy(list, list2);
    }

    public final List<SubscriptionSku> component1() {
        return this.subscriptions;
    }

    public final List<InAppSku> component2() {
        return this.inApps;
    }

    public final PaywallSkus copy(List<SubscriptionSku> subscriptions, List<InAppSku> inApps) {
        subscriptions.getClass();
        inApps.getClass();
        return new PaywallSkus(subscriptions, inApps);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaywallSkus)) {
            return false;
        }
        PaywallSkus paywallSkus = (PaywallSkus) other;
        return pa7.t(this.subscriptions, paywallSkus.subscriptions) && pa7.t(this.inApps, paywallSkus.inApps);
    }

    public final List<InAppSku> getInApps() {
        return this.inApps;
    }

    public final List<SubscriptionSku> getSubscriptions() {
        return this.subscriptions;
    }

    public int hashCode() {
        return this.inApps.hashCode() + (this.subscriptions.hashCode() * 31);
    }

    public String toString() {
        return "PaywallSkus(subscriptions=" + this.subscriptions + ", inApps=" + this.inApps + ")";
    }

    public PaywallSkus(List<SubscriptionSku> list, List<InAppSku> list2) {
        list.getClass();
        list2.getClass();
        this.subscriptions = list;
        this.inApps = list2;
    }

    public PaywallSkus() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
