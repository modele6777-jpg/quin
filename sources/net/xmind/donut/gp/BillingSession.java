package net.xmind.donut.gp;

import defpackage.ox0;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnet/xmind/donut/gp/BillingSession;", "", "Client", "Quin:gp_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class BillingSession<Client> {
    public final ox0 a;
    public final long b;

    public BillingSession(ox0 ox0Var, long j) {
        this.a = ox0Var;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillingSession)) {
            return false;
        }
        BillingSession billingSession = (BillingSession) obj;
        return this.a.equals(billingSession.a) && this.b == billingSession.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BillingSession(client=" + this.a + ", generation=" + this.b + ")";
    }
}
