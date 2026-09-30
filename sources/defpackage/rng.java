package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rng implements yng {
    public final qlg a;
    public final m8c b;

    public rng(m8c m8cVar, qlg qlgVar) {
        uzd uzdVar = img.a;
        this.b = m8cVar;
        this.a = qlgVar;
    }

    @Override // defpackage.yng
    public final omg b() {
        qlg qlgVar = this.a;
        if (qlgVar instanceof omg) {
            return ((omg) qlgVar).g();
        }
        mmg mmgVar = (mmg) ((omg) qlgVar).q(5);
        boolean zE = mmgVar.b.e();
        omg omgVar = mmgVar.b;
        if (!zE) {
            return omgVar;
        }
        omgVar.getClass();
        vng.c.a(omgVar.getClass()).c(omgVar);
        omgVar.f();
        return mmgVar.b;
    }

    @Override // defpackage.yng
    public final void c(Object obj) {
        this.b.getClass();
        gog gogVar = ((omg) obj).zzc;
        if (gogVar.e) {
            gogVar.e = false;
        }
        uzd uzdVar = img.a;
        throw ks0.e(obj);
    }

    @Override // defpackage.yng
    public final void d(Object obj, Object obj2) {
        zng.b(obj, obj2);
    }

    @Override // defpackage.yng
    public final int e(qlg qlgVar) {
        gog gogVar = ((omg) qlgVar).zzc;
        int i = gogVar.d;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < gogVar.a; i2++) {
            int i3 = gogVar.b[i2] >>> 3;
            xlg xlgVar = (xlg) gogVar.c[i2];
            int iA = gmg.a(8);
            int iA2 = gmg.a(i3) + gmg.a(16);
            int iA3 = gmg.a(24);
            int iC = xlgVar.c();
            iB += iA + iA + iA2 + xkg.b(iC, iC, iA3);
        }
        gogVar.d = iB;
        return iB;
    }

    @Override // defpackage.yng
    public final boolean f(Object obj) {
        throw ks0.e(obj);
    }

    @Override // defpackage.yng
    public final void g(Object obj, k01 k01Var, hmg hmgVar) {
        this.b.getClass();
        m8c.C(obj);
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.yng
    public final void h(Object obj, byte[] bArr, int i, int i2, tlg tlgVar) {
        omg omgVar = (omg) obj;
        if (omgVar.zzc == gog.f) {
            omgVar.zzc = gog.a();
        }
        throw ks0.e(obj);
    }

    @Override // defpackage.yng
    public final int i(omg omgVar) {
        return omgVar.zzc.hashCode();
    }

    @Override // defpackage.yng
    public final void j(Object obj, g5b g5bVar) {
        throw ks0.e(obj);
    }

    @Override // defpackage.yng
    public final boolean k(omg omgVar, omg omgVar2) {
        return omgVar.zzc.equals(omgVar2.zzc);
    }
}
