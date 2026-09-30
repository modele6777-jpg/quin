package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dd2 implements l26, n26, o26, p26, q26, r26, s26, t26, y16, z16, b26, c26, d26, e26, f26, g26, h26, j26, k26 {
    public final int a;
    public final boolean b;
    public Object c;
    public ojb d;
    public ArrayList e;

    public dd2(Object obj, boolean z, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.p26
    public final /* bridge */ /* synthetic */ Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return h(obj, obj2, obj3, (l46) obj4, ((Number) obj5).intValue());
    }

    public final Object a(int i, l46 l46Var) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = i | (l46Var.g(this) ? af1.y(2, 0) : af1.y(1, 0));
        Object obj = this.c;
        obj.getClass();
        z7f.t(2, obj);
        Object objZ = ((l26) obj).z(l46Var, Integer.valueOf(iY));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q12(2, this, dd2.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8, 1);
        }
        return objZ;
    }

    public final Object e(Object obj, l46 l46Var, int i) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = l46Var.g(this) ? af1.y(2, 1) : af1.y(1, 1);
        Object obj2 = this.c;
        obj2.getClass();
        z7f.t(3, obj2);
        Object objM = ((n26) obj2).m(obj, l46Var, Integer.valueOf(iY | i));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(this, obj, i, 10);
        }
        return objM;
    }

    public final Object f(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, l46 l46Var, int i) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = l46Var.g(this) ? af1.y(2, 6) : af1.y(1, 6);
        Object obj5 = this.c;
        obj5.getClass();
        z7f.t(8, obj5);
        Object objU = ((s26) obj5).u(obj, bool, obj2, obj3, obj4, l46Var, Integer.valueOf(i | iY));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r20(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objU;
    }

    public final Object g(Object obj, Object obj2, l46 l46Var, int i) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = l46Var.g(this) ? af1.y(2, 2) : af1.y(1, 2);
        Object obj3 = this.c;
        obj3.getClass();
        z7f.t(4, obj3);
        Object objT = ((o26) obj3).t(obj, obj2, l46Var, Integer.valueOf(iY | i));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, this, obj, obj2, 9);
        }
        return objT;
    }

    public final Object h(Object obj, Object obj2, Object obj3, l46 l46Var, int i) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = l46Var.g(this) ? af1.y(2, 3) : af1.y(1, 3);
        Object obj4 = this.c;
        obj4.getClass();
        z7f.t(5, obj4);
        Object objC = ((p26) obj4).C(obj, obj2, obj3, l46Var, Integer.valueOf(iY | i));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb(i, 8, this, obj, obj2, obj3);
        }
        return objC;
    }

    public final Object i(Object obj, Object obj2, Object obj3, Object obj4, l46 l46Var, int i) {
        l46Var.h0(this.a);
        j(l46Var);
        int iY = l46Var.g(this) ? af1.y(2, 4) : af1.y(1, 4);
        Object obj5 = this.c;
        obj5.getClass();
        z7f.t(6, obj5);
        Object objW = ((q26) obj5).w(obj, obj2, obj3, obj4, l46Var, Integer.valueOf(i | iY));
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb(this, obj, obj2, obj3, obj4, i, 3);
        }
        return objW;
    }

    public final void j(l46 l46Var) {
        ojb ojbVarB;
        if (!this.b || (ojbVarB = l46Var.B()) == null) {
            return;
        }
        ojbVarB.b |= 1;
        ojb ojbVar = this.d;
        if (ojbVar == null || !ojbVar.a() || ojbVar == ojbVarB || pa7.t(ojbVar.c, ojbVarB.c)) {
            this.d = ojbVarB;
            return;
        }
        ArrayList arrayList = this.e;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.e = arrayList2;
            arrayList2.add(ojbVarB);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ojb ojbVar2 = (ojb) arrayList.get(i);
            if (ojbVar2 == null || !ojbVar2.a() || ojbVar2 == ojbVarB || pa7.t(ojbVar2.c, ojbVarB.c)) {
                arrayList.set(i, ojbVarB);
                return;
            }
        }
        arrayList.add(ojbVarB);
    }

    @Override // defpackage.n26
    public final /* bridge */ /* synthetic */ Object m(Object obj, Object obj2, Object obj3) {
        return e(obj, (l46) obj2, ((Number) obj3).intValue());
    }

    @Override // defpackage.o26
    public final /* bridge */ /* synthetic */ Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        return g(obj, obj2, (l46) obj3, ((Number) obj4).intValue());
    }

    @Override // defpackage.s26
    public final /* bridge */ /* synthetic */ Object u(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, l46 l46Var, Integer num) {
        return f(obj, bool, obj2, obj3, obj4, l46Var, num.intValue());
    }

    @Override // defpackage.q26
    public final /* bridge */ /* synthetic */ Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return i(obj, obj2, obj3, obj4, (l46) obj5, ((Number) obj6).intValue());
    }

    @Override // defpackage.l26
    public final /* bridge */ /* synthetic */ Object z(Object obj, Object obj2) {
        return a(((Number) obj2).intValue(), (l46) obj);
    }
}
