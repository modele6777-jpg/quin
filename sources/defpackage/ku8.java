package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ku8 implements gfc {
    public final vt8 a;
    public final aff b;
    public final s85 c;

    public ku8(aff affVar, s85 s85Var, vt8 vt8Var) {
        this.b = affVar;
        s85Var.getClass();
        this.c = s85Var;
        this.a = vt8Var;
    }

    @Override // defpackage.gfc
    public final void a(Object obj, Object obj2) {
        lfc.k(this.b, obj, obj2);
    }

    @Override // defpackage.gfc
    public final void b(Object obj) {
        ((eff) this.b).getClass();
        cff cffVar = ((v56) obj).unknownFields;
        if (cffVar.e) {
            cffVar.e = false;
        }
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }

    @Override // defpackage.gfc
    public final boolean c(Object obj) {
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }

    @Override // defpackage.gfc
    public final v56 d() {
        vt8 vt8Var = this.a;
        return vt8Var instanceof v56 ? ((v56) vt8Var).h() : ((m56) ((v56) vt8Var).b(5)).b();
    }

    @Override // defpackage.gfc
    public final boolean e(v56 v56Var, v56 v56Var2) {
        eff effVar = (eff) this.b;
        effVar.getClass();
        cff cffVar = v56Var.unknownFields;
        effVar.getClass();
        return cffVar.equals(v56Var2.unknownFields);
    }

    @Override // defpackage.gfc
    public final void f(Object obj, i72 i72Var, p85 p85Var) {
        this.b.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.gfc
    public final int g(v56 v56Var) {
        ((eff) this.b).getClass();
        return v56Var.unknownFields.hashCode();
    }

    @Override // defpackage.gfc
    public final int h(v56 v56Var) {
        ((eff) this.b).getClass();
        cff cffVar = v56Var.unknownFields;
        int i = cffVar.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < cffVar.a; i2++) {
            int i3 = cffVar.b[i2] >>> 3;
            iF += m72.f(3, (b71) cffVar.c[i2]) + m72.i(i3) + m72.h(2) + (m72.h(1) * 2);
        }
        cffVar.d = iF;
        return iF;
    }

    @Override // defpackage.gfc
    public final void i(Object obj, kd9 kd9Var) {
        this.c.getClass();
        kv2.z(obj);
        throw null;
    }
}
