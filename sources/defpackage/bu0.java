package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bu0 implements au0 {
    public float a;
    public final Object b;
    public Object c;
    public Object d;

    public bu0(List list) {
        this.d = null;
        this.a = -1.0f;
        this.b = list;
        this.c = a(0.0f);
    }

    public bp7 a(float f) {
        List list = (List) this.b;
        bp7 bp7Var = (bp7) list.get(list.size() - 1);
        if (f >= bp7Var.b()) {
            return bp7Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            bp7 bp7Var2 = (bp7) list.get(size);
            if (((bp7) this.c) != bp7Var2 && f >= bp7Var2.b() && f < bp7Var2.a()) {
                return bp7Var2;
            }
        }
        return (bp7) list.get(0);
    }

    @Override // defpackage.au0
    public boolean isEmpty() {
        return false;
    }

    @Override // defpackage.au0
    public boolean o(float f) {
        bp7 bp7Var = (bp7) this.d;
        bp7 bp7Var2 = (bp7) this.c;
        if (bp7Var == bp7Var2 && this.a == f) {
            return true;
        }
        this.d = bp7Var2;
        this.a = f;
        return false;
    }

    @Override // defpackage.au0
    public bp7 p() {
        return (bp7) this.c;
    }

    @Override // defpackage.au0
    public boolean q(float f) {
        bp7 bp7Var = (bp7) this.c;
        if (f >= bp7Var.b() && f < bp7Var.a()) {
            return !((bp7) this.c).c();
        }
        this.c = a(f);
        return true;
    }

    @Override // defpackage.au0
    public float u() {
        List list = (List) this.b;
        return ((bp7) list.get(list.size() - 1)).a();
    }

    @Override // defpackage.au0
    public float v() {
        return ((bp7) ((List) this.b).get(0)).b();
    }

    public bu0(hkb hkbVar, pi1 pi1Var, hkb hkbVar2, float f) {
        this.b = hkbVar;
        this.c = pi1Var;
        this.d = hkbVar2;
        this.a = f;
    }
}
