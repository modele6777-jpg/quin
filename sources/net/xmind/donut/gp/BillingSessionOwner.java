package net.xmind.donut.gp;

import defpackage.ox0;
import defpackage.z7c;
import defpackage.za6;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lnet/xmind/donut/gp/BillingSessionOwner;", "", "Client", "Quin:gp_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class BillingSessionOwner<Client> {
    public final za6 a;
    public final Object b;
    public long c;
    public BillingSession d;

    public BillingSessionOwner(za6 za6Var) {
        BillingSessionOwnerKt$createBillingSessionOwner$1 billingSessionOwnerKt$createBillingSessionOwner$1 = BillingSessionOwnerKt$createBillingSessionOwner$1.a;
        this.a = za6Var;
        this.b = new Object();
    }

    public final void a(ox0 ox0Var) {
        try {
            BillingSessionOwnerKt$createBillingSessionOwner$1.a.d(ox0Var);
        } catch (Exception e) {
            this.a.d(e);
        }
    }

    public final boolean b(BillingSession billingSession) {
        boolean z;
        billingSession.getClass();
        synchronized (this.b) {
            try {
                BillingSession billingSession2 = this.d;
                z = (billingSession2 != null ? billingSession2.a : null) == billingSession.a && billingSession2 != null && billingSession2.b == billingSession.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
