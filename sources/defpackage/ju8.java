package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ju8 implements ffc {
    public final tt8 a;
    public final zef b;
    public final r85 c;

    public ju8(zef zefVar, r85 r85Var, tt8 tt8Var) {
        this.b = zefVar;
        r85Var.getClass();
        this.c = r85Var;
        this.a = tt8Var;
    }

    @Override // defpackage.ffc
    public final void a(Object obj, Object obj2) {
        kfc.j(this.b, obj, obj2);
    }

    @Override // defpackage.ffc
    public final void b(Object obj) {
        ((dff) this.b).getClass();
        bff bffVar = ((t56) obj).unknownFields;
        if (bffVar.e) {
            bffVar.e = false;
        }
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }

    @Override // defpackage.ffc
    public final boolean c(Object obj) {
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }

    @Override // defpackage.ffc
    public final t56 d() {
        tt8 tt8Var = this.a;
        if (tt8Var instanceof t56) {
            return (t56) ((t56) tt8Var).i(4);
        }
        k56 k56Var = (k56) ((t56) tt8Var).i(5);
        boolean zL = k56Var.b.l();
        t56 t56Var = k56Var.b;
        if (!zL) {
            return t56Var;
        }
        t56Var.getClass();
        u0b u0bVar = u0b.c;
        u0bVar.getClass();
        u0bVar.a(t56Var.getClass()).b(t56Var);
        t56Var.m();
        return k56Var.b;
    }

    @Override // defpackage.ffc
    public final int e(t56 t56Var) {
        ((dff) this.b).getClass();
        bff bffVar = t56Var.unknownFields;
        int i = bffVar.d;
        if (i != -1) {
            return i;
        }
        int iD = 0;
        for (int i2 = 0; i2 < bffVar.a; i2++) {
            int i3 = bffVar.b[i2] >>> 3;
            y61 y61Var = (y61) bffVar.c[i2];
            int iD2 = j72.d(i3) + j72.c(2) + (j72.c(1) * 2);
            int iC = j72.c(3);
            int size = y61Var.size();
            iD += j72.d(size) + size + iC + iD2;
        }
        bffVar.d = iD;
        return iD;
    }

    @Override // defpackage.ffc
    public final int f(t56 t56Var) {
        ((dff) this.b).getClass();
        return t56Var.unknownFields.hashCode();
    }

    @Override // defpackage.ffc
    public final void g(Object obj, kb6 kb6Var) {
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }

    @Override // defpackage.ffc
    public final boolean h(t56 t56Var, t56 t56Var2) {
        dff dffVar = (dff) this.b;
        dffVar.getClass();
        bff bffVar = t56Var.unknownFields;
        dffVar.getClass();
        return bffVar.equals(t56Var2.unknownFields);
    }
}
