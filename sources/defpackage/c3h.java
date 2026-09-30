package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c3h implements s3h {
    public final dyg a;

    public c3h(mwg mwgVar, dyg dygVar) {
        this.a = dygVar;
    }

    @Override // defpackage.s3h
    public final l0h a() {
        dyg dygVar = this.a;
        if (dygVar instanceof l0h) {
            return ((l0h) dygVar).n();
        }
        e0h e0hVar = (e0h) ((l0h) dygVar).j(5);
        boolean zH = e0hVar.b.h();
        l0h l0hVar = e0hVar.b;
        if (!zH) {
            return l0hVar;
        }
        l0hVar.getClass();
        i3h.b.a(l0hVar.getClass()).b(l0hVar);
        l0hVar.e();
        return e0hVar.b;
    }

    @Override // defpackage.s3h
    public final void b(Object obj) {
        l4h l4hVar = ((l0h) obj).zzc;
        if (l4hVar.e) {
            l4hVar.e = false;
        }
        throw ks0.e(obj);
    }

    @Override // defpackage.s3h
    public final boolean c(Object obj) {
        throw ks0.e(obj);
    }

    @Override // defpackage.s3h
    public final void d(Object obj, g5b g5bVar) {
        throw ks0.e(obj);
    }

    @Override // defpackage.s3h
    public final void e(Object obj, byte[] bArr, int i, int i2, tlg tlgVar) {
        l0h l0hVar = (l0h) obj;
        if (l0hVar.zzc == l4h.f) {
            l0hVar.zzc = l4h.b();
        }
        throw ks0.e(obj);
    }

    @Override // defpackage.s3h
    public final int f(dyg dygVar) {
        l4h l4hVar = ((l0h) dygVar).zzc;
        int i = l4hVar.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < l4hVar.a; i2++) {
            int i3 = l4hVar.b[i2] >>> 3;
            vyg vygVar = (vyg) l4hVar.c[i2];
            int iG0 = p90.G0(8);
            int iG1 = p90.G0(i3) + p90.G0(16);
            int iG2 = p90.G0(24);
            int iD = vygVar.d();
            iF += iG0 + iG0 + iG1 + xkg.f(iD, iD, iG2);
        }
        l4hVar.d = iF;
        return iF;
    }

    @Override // defpackage.s3h
    public final boolean g(l0h l0hVar, l0h l0hVar2) {
        return l0hVar.zzc.equals(l0hVar2.zzc);
    }

    @Override // defpackage.s3h
    public final void h(Object obj, Object obj2) {
        v3h.o(obj, obj2);
    }

    @Override // defpackage.s3h
    public final int i(l0h l0hVar) {
        return l0hVar.zzc.hashCode();
    }
}
