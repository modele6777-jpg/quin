package defpackage;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bwg extends cyg {
    public final kd0 c;
    public final kd0 d;
    public long e;

    public bwg(w3h w3hVar) {
        super(w3hVar);
        this.d = new kd0(0);
        this.c = new kd0(0);
    }

    public final void B0(long j, String str) {
        w3h w3hVar = (w3h) this.b;
        if (str == null || str.length() == 0) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Ad unit id must be a non-empty string");
        } else {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new sjg(this, str, j, 0));
        }
    }

    public final void C0(long j, String str) {
        w3h w3hVar = (w3h) this.b;
        if (str == null || str.length() == 0) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.a("Ad unit id must be a non-empty string");
        } else {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new sjg(this, str, j, 1));
        }
    }

    public final void D0(long j) {
        b9h b9hVar = ((w3h) this.b).z;
        w3h.g(b9hVar);
        t8h t8hVarE0 = b9hVar.E0(false);
        kd0 kd0Var = this.c;
        for (String str : (gd0) kd0Var.keySet()) {
            F0(str, j - ((Long) kd0Var.get(str)).longValue(), t8hVarE0);
        }
        if (!kd0Var.isEmpty()) {
            E0(j - this.e, t8hVarE0);
        }
        G0(j);
    }

    public final void E0(long j, t8h t8hVar) {
        w3h w3hVar = (w3h) this.b;
        if (t8hVar == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.Z.b(Long.valueOf(j), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            qch.x1(t8hVar, bundle, true);
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.H0("am", "_xa", bundle);
        }
    }

    public final void F0(String str, long j, t8h t8hVar) {
        w3h w3hVar = (w3h) this.b;
        if (t8hVar == null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.a("Not logging ad unit exposure. No active activity");
        } else {
            if (j < 1000) {
                w0h w0hVar2 = w3hVar.f;
                w3h.h(w0hVar2);
                w0hVar2.Z.b(Long.valueOf(j), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            qch.x1(t8hVar, bundle, true);
            c8h c8hVar = w3hVar.X;
            w3h.g(c8hVar);
            c8hVar.H0("am", "_xu", bundle);
        }
    }

    public final void G0(long j) {
        kd0 kd0Var = this.c;
        Iterator it = ((gd0) kd0Var.keySet()).iterator();
        while (it.hasNext()) {
            kd0Var.put((String) it.next(), Long.valueOf(j));
        }
        if (kd0Var.isEmpty()) {
            return;
        }
        this.e = j;
    }
}
