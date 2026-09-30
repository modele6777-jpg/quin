package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ds5 extends zd5 {
    public final zd5 c;

    public ds5(zd5 zd5Var) {
        zd5Var.getClass();
        this.c = zd5Var;
    }

    @Override // defpackage.zd5
    public final List N(e1a e1aVar) {
        List<e1a> listN = this.c.N(e1aVar);
        ArrayList arrayList = new ArrayList();
        for (e1a e1aVar2 : listN) {
            e1aVar2.getClass();
            arrayList.add(e1aVar2);
        }
        w72.e0(arrayList);
        return arrayList;
    }

    @Override // defpackage.zd5
    public final ld5 U(e1a e1aVar) {
        e1aVar.getClass();
        ld5 ld5VarU = this.c.U(e1aVar);
        if (ld5VarU == null) {
            return null;
        }
        e1a e1aVar2 = (e1a) ld5VarU.d;
        if (e1aVar2 == null) {
            return ld5VarU;
        }
        boolean z = ld5VarU.b;
        boolean z2 = ld5VarU.c;
        Long l = (Long) ld5VarU.e;
        Long l2 = (Long) ld5VarU.f;
        Long l3 = (Long) ld5VarU.g;
        Long l4 = (Long) ld5VarU.h;
        Map map = (Map) ld5VarU.i;
        map.getClass();
        return new ld5(z, z2, e1aVar2, l, l2, l3, l4, map);
    }

    @Override // defpackage.zd5
    public final jk7 W(e1a e1aVar) {
        return this.c.W(e1aVar);
    }

    @Override // defpackage.zd5
    public final wkd b(e1a e1aVar) {
        e1aVar.getClass();
        return this.c.b(e1aVar);
    }

    @Override // defpackage.zd5, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.close();
    }

    @Override // defpackage.zd5
    public final void h(e1a e1aVar, e1a e1aVar2) {
        e1aVar.getClass();
        e1aVar2.getClass();
        this.c.h(e1aVar, e1aVar2);
    }

    @Override // defpackage.zd5
    public final mtd h0(e1a e1aVar) {
        e1aVar.getClass();
        return this.c.h0(e1aVar);
    }

    public final String toString() {
        return job.a.b(getClass()).r() + '(' + this.c + ')';
    }

    @Override // defpackage.zd5
    public final void u(e1a e1aVar) {
        e1aVar.getClass();
        this.c.u(e1aVar);
    }

    @Override // defpackage.zd5
    public final void x(e1a e1aVar) {
        e1aVar.getClass();
        this.c.x(e1aVar);
    }
}
