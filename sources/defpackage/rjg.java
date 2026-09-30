package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rjg extends atg {
    public final w3h a;
    public final c8h b;

    public rjg(w3h w3hVar) {
        oa7.A(w3hVar);
        this.a = w3hVar;
        c8h c8hVar = w3hVar.X;
        w3h.g(c8hVar);
        this.b = c8hVar;
    }

    @Override // defpackage.e8h
    public final void c(String str, String str2, Bundle bundle) {
        this.b.E0(str, str2, bundle);
    }

    @Override // defpackage.e8h
    public final String d() {
        b9h b9hVar = ((w3h) this.b.b).z;
        w3h.g(b9hVar);
        t8h t8hVar = b9hVar.d;
        if (t8hVar != null) {
            return t8hVar.a;
        }
        return null;
    }

    @Override // defpackage.e8h
    public final String e() {
        b9h b9hVar = ((w3h) this.b.b).z;
        w3h.g(b9hVar);
        t8h t8hVar = b9hVar.d;
        if (t8hVar != null) {
            return t8hVar.b;
        }
        return null;
    }

    @Override // defpackage.e8h
    public final void f(Bundle bundle) {
        c8h c8hVar = this.b;
        ((w3h) c8hVar.b).y.getClass();
        c8hVar.N0(bundle, System.currentTimeMillis());
    }

    @Override // defpackage.e8h
    public final void g(String str) {
        w3h w3hVar = this.a;
        bwg bwgVar = w3hVar.Y;
        w3h.e(bwgVar);
        w3hVar.y.getClass();
        bwgVar.C0(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.e8h
    public final void h(String str) {
        w3h w3hVar = this.a;
        bwg bwgVar = w3hVar.Y;
        w3h.e(bwgVar);
        w3hVar.y.getClass();
        bwgVar.B0(SystemClock.elapsedRealtime(), str);
    }

    @Override // defpackage.e8h
    public final long i() {
        qch qchVar = this.a.w;
        w3h.f(qchVar);
        return qchVar.z1();
    }

    @Override // defpackage.e8h
    public final void j(String str, String str2, Bundle bundle) {
        c8h c8hVar = this.a.X;
        w3h.g(c8hVar);
        c8hVar.O0(str, str2, bundle);
    }

    @Override // defpackage.e8h
    public final List k(String str, String str2) {
        c8h c8hVar = this.b;
        w3h w3hVar = (w3h) c8hVar.b;
        m3h m3hVar = w3hVar.g;
        w0h w0hVar = w3hVar.f;
        w3h.h(m3hVar);
        if (m3hVar.G0()) {
            w3h.h(w0hVar);
            w0hVar.g.a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        if (w1e.m()) {
            w3h.h(w0hVar);
            w0hVar.g.a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        m3hVar2.K0(atomicReference, 5000L, "get conditional user properties", new qu1(c8hVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return qch.v1(list);
        }
        w3h.h(w0hVar);
        w0hVar.g.b(null, "Timed out waiting for get conditional user properties");
        return new ArrayList();
    }

    @Override // defpackage.e8h
    public final int l(String str) {
        c8h c8hVar = this.b;
        c8hVar.getClass();
        oa7.x(str);
        qqg qqgVar = ((w3h) c8hVar.b).d;
        return 25;
    }

    @Override // defpackage.e8h
    public final String m() {
        return (String) this.b.v.get();
    }

    @Override // defpackage.e8h
    public final String n() {
        return this.b.P0();
    }

    @Override // defpackage.e8h
    public final Map o(String str, String str2, boolean z) {
        c8h c8hVar = this.b;
        w3h w3hVar = (w3h) c8hVar.b;
        m3h m3hVar = w3hVar.g;
        w0h w0hVar = w3hVar.f;
        w3h.h(m3hVar);
        if (m3hVar.G0()) {
            w3h.h(w0hVar);
            w0hVar.g.a("Cannot get user properties from analytics worker thread");
            return Collections.EMPTY_MAP;
        }
        if (w1e.m()) {
            w3h.h(w0hVar);
            w0hVar.g.a("Cannot get user properties from main thread");
            return Collections.EMPTY_MAP;
        }
        AtomicReference atomicReference = new AtomicReference();
        m3h m3hVar2 = w3hVar.g;
        w3h.h(m3hVar2);
        m3hVar2.K0(atomicReference, 5000L, "get user properties", new m6h(c8hVar, atomicReference, str, str2, z));
        List<mch> list = (List) atomicReference.get();
        if (list == null) {
            w3h.h(w0hVar);
            w0hVar.g.b(Boolean.valueOf(z), "Timed out waiting for handle get user properties, includeInternal");
            return Collections.EMPTY_MAP;
        }
        kd0 kd0Var = new kd0(list.size());
        for (mch mchVar : list) {
            Object objC = mchVar.c();
            if (objC != null) {
                kd0Var.put(mchVar.b, objC);
            }
        }
        return kd0Var;
    }
}
