package io.sentry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u6 extends defpackage.j6 {
    public static final List u = Collections.unmodifiableList(Arrays.asList("Content-Type", "Content-Length", "Accept"));
    public volatile boolean c;
    public Double d;
    public Double e;
    public t6 f;
    public int g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public io.sentry.protocol.u l;
    public boolean m;
    public l4 n;
    public boolean o;
    public List p;
    public List q;
    public boolean r;
    public List s;
    public List t;

    public final void A(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.s = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void B(ArrayList arrayList) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(u);
        linkedHashSet.addAll(arrayList);
        this.t = Collections.unmodifiableList(new ArrayList(linkedHashSet));
    }

    public final void C(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.e = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public final void D(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.d = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    @Override // defpackage.j6
    public final void u(boolean z) {
        if (!z) {
            x();
        }
        super.u(z);
    }

    @Override // defpackage.j6
    public final void v(boolean z) {
        if (!z) {
            x();
        }
        super.v(z);
    }

    @Override // defpackage.j6
    public final void x() {
        if (this.c) {
            return;
        }
        this.c = true;
        io.sentry.util.b.a("ReplayCustomMasking");
    }

    public final void y(ArrayList arrayList) {
        this.p = Collections.unmodifiableList(new ArrayList(arrayList));
    }

    public final void z(ArrayList arrayList) {
        this.q = Collections.unmodifiableList(new ArrayList(arrayList));
    }
}
