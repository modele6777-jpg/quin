package tech.chatmind.api.payment;

import defpackage.ag2;
import defpackage.nyc;
import defpackage.o5a;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.v5a;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u0015¨\u0006&"}, d2 = {"Ltech/chatmind/api/payment/PaywallSkusEnvelope;", "", "Ltech/chatmind/api/payment/PaywallSkus;", "paywallSkus", "<init>", "(Ltech/chatmind/api/payment/PaywallSkus;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILtech/chatmind/api/payment/PaywallSkus;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/payment/PaywallSkusEnvelope;Lag2;Lnyc;)V", "write$Self", "component1", "()Ltech/chatmind/api/payment/PaywallSkus;", "copy", "(Ltech/chatmind/api/payment/PaywallSkus;)Ltech/chatmind/api/payment/PaywallSkusEnvelope;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ltech/chatmind/api/payment/PaywallSkus;", "getPaywallSkus", "Companion", "n5a", "o5a", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class PaywallSkusEnvelope {
    public static final int $stable = 0;
    public static final o5a Companion = new o5a();
    private final PaywallSkus paywallSkus;

    public /* synthetic */ PaywallSkusEnvelope(int i, PaywallSkus paywallSkus, xyc xycVar) {
        if ((i & 1) == 0) {
            this.paywallSkus = null;
        } else {
            this.paywallSkus = paywallSkus;
        }
    }

    public static /* synthetic */ PaywallSkusEnvelope copy$default(PaywallSkusEnvelope paywallSkusEnvelope, PaywallSkus paywallSkus, int i, Object obj) {
        if ((i & 1) != 0) {
            paywallSkus = paywallSkusEnvelope.paywallSkus;
        }
        return paywallSkusEnvelope.copy(paywallSkus);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(PaywallSkusEnvelope self, ag2 output, nyc serialDesc) {
        if (!output.g(serialDesc) && self.paywallSkus == null) {
            return;
        }
        output.A(serialDesc, 0, v5a.a, self.paywallSkus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PaywallSkus getPaywallSkus() {
        return this.paywallSkus;
    }

    public final PaywallSkusEnvelope copy(PaywallSkus paywallSkus) {
        return new PaywallSkusEnvelope(paywallSkus);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PaywallSkusEnvelope) && pa7.t(this.paywallSkus, ((PaywallSkusEnvelope) other).paywallSkus);
    }

    public final PaywallSkus getPaywallSkus() {
        return this.paywallSkus;
    }

    public int hashCode() {
        PaywallSkus paywallSkus = this.paywallSkus;
        if (paywallSkus == null) {
            return 0;
        }
        return paywallSkus.hashCode();
    }

    public String toString() {
        return "PaywallSkusEnvelope(paywallSkus=" + this.paywallSkus + ")";
    }

    public PaywallSkusEnvelope() {
        this((PaywallSkus) null, 1, (rp3) (0 == true ? 1 : 0));
    }

    public PaywallSkusEnvelope(PaywallSkus paywallSkus) {
        this.paywallSkus = paywallSkus;
    }

    public /* synthetic */ PaywallSkusEnvelope(PaywallSkus paywallSkus, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : paywallSkus);
    }
}
