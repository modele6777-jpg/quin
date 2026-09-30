package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jv3 implements ajf {
    public final h1b a;
    public final lkf b;
    public volatile pjf c;
    public final AtomicBoolean d;

    public jv3(h1b h1bVar, lkf lkfVar) {
        h1bVar.getClass();
        lkfVar.getClass();
        this.a = h1bVar;
        this.b = lkfVar;
        this.d = new AtomicBoolean(false);
    }

    @Override // defpackage.ajf
    public final nu3 a() {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.a() : ynb.y(this.b.f, null, new fv3(null, this), 3);
    }

    @Override // defpackage.ajf
    public final nu3 c(Collection collection, boolean z) {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.c(collection, z) : ynb.y(this.b.f, null, new iv3(this, null, z, collection), 3);
    }

    @Override // defpackage.ajf
    public final void close() {
        if (this.d.getAndSet(true)) {
            return;
        }
        ynb.V(this.b.f, null, null, new zu3(null, this), 3);
    }

    @Override // defpackage.ajf
    public final Object d(gbe gbeVar) {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.d(gbeVar) : ynb.p0(t72.z(this.b.e), new xu3(null, this), gbeVar);
    }

    @Override // defpackage.ajf
    public final nu3 e(int i) {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.e(i) : ynb.y(this.b.f, null, new ev3(this, null, i), 3);
    }

    @Override // defpackage.ajf
    public final nu3 f(List list, zif zifVar) {
        zif zifVar2 = zif.b;
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.f(list, zifVar2) : ynb.y(this.b.f, null, new bv3(this, null, list, zifVar2), 3);
    }

    @Override // defpackage.ajf
    public final nu3 g(Map map, zif zifVar, ph2 ph2Var) {
        zifVar.getClass();
        ph2Var.getClass();
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.g(map, zifVar, ph2Var) : ynb.y(this.b.f, null, new gv3(this, null, map, zifVar, ph2Var), 3);
    }

    @Override // defpackage.ajf
    public final List h(List list, int i, int i2, int i3) {
        list.getClass();
        int size = list.size();
        pjf pjfVar = this.c;
        if (pjfVar != null) {
            return pjfVar.h(list, i, i2, i3);
        }
        pu3 pu3VarY = ynb.y(this.b.f, null, new av3(this, null, list, i, i2, i3), 3);
        ArrayList arrayList = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(ynb.y(this.b.f, null, new cv3(pu3VarY, i4, null), 3));
        }
        return arrayList;
    }

    @Override // defpackage.ajf
    public final nu3 i(qh2 qh2Var, Map map) {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.i(qh2Var, map) : ynb.y(this.b.f, null, new hv3(this, null, qh2Var, map), 3);
    }

    @Override // defpackage.ajf
    public final nu3 j(Map map, zif zifVar, ph2 ph2Var) {
        zif zifVar2 = zif.b;
        ph2Var.getClass();
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.j(map, zifVar2, ph2Var) : ynb.y(this.b.f, null, new dv3(this, null, map, zifVar2, ph2Var), 3);
    }

    @Override // defpackage.ajf
    public final nu3 k() {
        pjf pjfVar = this.c;
        return pjfVar != null ? pjfVar.k() : ynb.y(this.b.f, null, new yu3(null, this), 3);
    }

    public final pjf l() {
        if (this.d.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        pjf pjfVar = this.c;
        if (pjfVar != null) {
            return pjfVar;
        }
        pjf pjfVar2 = (pjf) this.a.get();
        if (this.d.get()) {
            pjfVar2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.c = pjfVar2;
        pjfVar2.getClass();
        return pjfVar2;
    }
}
