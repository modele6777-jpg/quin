package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a57 extends h72 implements Runnable, lm9, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public h8g e;
    public final w79 f;
    public final sz9 g;
    public final i79 v;
    public final jsd w;

    public a57() {
        super(1);
        w79 w79Var = new w79(9);
        p8g.a.getClass();
        w79Var.m(o8g.b, new j9g("caption bar"));
        w79Var.m(o8g.c, new j9g("display cutout"));
        w79Var.m(o8g.d, new j9g("ime"));
        w79Var.m(o8g.e, new j9g("mandatory system gestures"));
        w79Var.m(o8g.f, new j9g("navigation bars"));
        w79Var.m(o8g.g, new j9g("status bars"));
        w79Var.m(o8g.h, new j9g("system gestures"));
        w79Var.m(o8g.i, new j9g("tappable element"));
        w79Var.m(o8g.j, new j9g("waterfall"));
        this.f = w79Var;
        this.g = new sz9(0);
        this.v = new i79(4);
        this.w = new jsd();
    }

    public final void F(h8g h8gVar) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        boolean z5;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        Object[] objArr2;
        int i;
        q69 q69Var = r8g.a;
        int[] iArr2 = q69Var.b;
        Object[] objArr3 = q69Var.c;
        long[] jArr2 = q69Var.a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j2 = jArr2[i2];
                z = true;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j2 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr2[i6];
                            p8g p8gVar = (p8g) objArr3[i6];
                            x47 x47VarI = h8gVar.a.i(i7);
                            long j3 = (((long) x47VarI.a) << 48) | (((long) x47VarI.b) << 32) | (((long) x47VarI.c) << 16) | ((long) x47VarI.d);
                            Object objG = this.f.g(p8gVar);
                            objG.getClass();
                            j9g j9gVar = (j9g) objG;
                            if (!m7c.d(j3, j9gVar.h)) {
                                j9gVar.h = j3;
                                z2 = true;
                                if (!m7c.d(j3, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                x47 x47VarJ = h8gVar.a.j(i7);
                                objArr2 = objArr3;
                                long j4 = (((long) x47VarJ.b) << 32) | (((long) x47VarJ.a) << 48) | (((long) x47VarJ.c) << 16) | ((long) x47VarJ.d);
                                if (!m7c.d(j9gVar.i, j4)) {
                                    j9gVar.i = j4;
                                    z2 = true;
                                    if (!m7c.d(j4, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            j9gVar.a.setValue(Boolean.valueOf(h8gVar.a.u(i7)));
                            i = 8;
                        } else {
                            objArr2 = objArr3;
                            i = i3;
                        }
                        j2 >>= i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr2 = jArr2;
                        iArr2 = iArr2;
                    }
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr2;
                    iArr = iArr2;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr2 = jArr;
                iArr2 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        ha4 ha4VarH = h8gVar.a.h();
        if (ha4VarH == null) {
            j = 0;
        } else {
            x47 x47VarA = ha4VarH.a();
            j = (((long) x47VarA.a) << c3) | (((long) x47VarA.b) << c2) | (((long) x47VarA.c) << c) | ((long) x47VarA.d);
        }
        w79 w79Var = this.f;
        p8g.a.getClass();
        Object objG2 = w79Var.g(o8g.j);
        objG2.getClass();
        j9g j9gVar2 = (j9g) objG2;
        j9gVar2.a.setValue(Boolean.valueOf(!m7c.d(j, 0L)));
        if (!m7c.d(j9gVar2.h, j)) {
            j9gVar2.h = j;
            j9gVar2.i = j;
            z2 = z;
            if (!m7c.d(j, 0L)) {
                z3 = z2;
            }
        }
        if (ha4VarH == null) {
            i79 i79Var = this.v;
            if (i79Var.b > 0) {
                i79Var.k();
                this.w.clear();
                z2 = z;
            }
        } else {
            List listS = Build.VERSION.SDK_INT >= 28 ? s.s(ha4VarH.a) : Collections.EMPTY_LIST;
            int size = listS.size();
            i79 i79Var2 = this.v;
            if (size < i79Var2.b) {
                i79Var2.n(listS.size(), this.v.b);
                this.w.e(listS.size(), this.w.size());
                z2 = z;
            } else {
                int size2 = listS.size() - this.v.b;
                int i8 = 0;
                while (i8 < size2) {
                    i79 i79Var3 = this.v;
                    i79Var3.h(q1c.f(listS.get(i79Var3.b)));
                    this.w.add(new d47(tec.e(this.v.b, "display cutout rect ")));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listS.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listS.get(i9);
                e89 e89Var = (e89) this.v.b(i9);
                if (!pa7.t(e89Var.getValue(), rect)) {
                    e89Var.setValue(rect);
                    z2 = z;
                }
            }
            if (!listS.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || this.g.j() != 0) && z2) {
            sz9 sz9Var = this.g;
            sz9Var.k(sz9Var.j() + 1);
            synchronized (qrd.c) {
                x79 x79Var = qrd.j.h;
                z4 = (x79Var == null || x79Var.d() != (z5 = z)) ? false : z5;
            }
            if (z4) {
                qrd.c();
            }
        }
    }

    @Override // defpackage.h72
    public final void d(n7g n7gVar) {
        boolean z = false;
        this.c = false;
        int iD = n7gVar.a.d();
        this.d &= ~iD;
        this.e = null;
        p8g p8gVar = (p8g) r8g.a.b(iD);
        if (p8gVar != null) {
            Object objG = this.f.g(p8gVar);
            objG.getClass();
            j9g j9gVar = (j9g) objG;
            j9gVar.c.k(0.0f);
            j9gVar.e.k(1.0f);
            j9gVar.d.k(0L);
            j9gVar.c.k(0.0f);
            j9gVar.b.setValue(Boolean.FALSE);
            j9gVar.j = -1L;
            j9gVar.k = -1L;
            sz9 sz9Var = this.g;
            sz9Var.k(sz9Var.j() + 1);
            synchronized (qrd.c) {
                x79 x79Var = qrd.j.h;
                if (x79Var != null && x79Var.d()) {
                    z = true;
                }
            }
            if (z) {
                qrd.c();
            }
        }
    }

    @Override // defpackage.h72
    public final void e(n7g n7gVar) {
        this.c = true;
    }

    @Override // defpackage.h72
    public final h8g f(h8g h8gVar, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            n7g n7gVar = (n7g) list.get(i);
            p8g p8gVar = (p8g) r8g.a.b(n7gVar.a.d());
            if (p8gVar != null) {
                Object objG = this.f.g(p8gVar);
                objG.getClass();
                j9g j9gVar = (j9g) objG;
                if (((Boolean) j9gVar.b.getValue()).booleanValue()) {
                    m7g m7gVar = n7gVar.a;
                    j9gVar.c.k(m7gVar.c());
                    j9gVar.e.k(m7gVar.a());
                    j9gVar.d.k(m7gVar.b());
                }
            }
        }
        F(h8gVar);
        return h8gVar;
    }

    @Override // defpackage.h72
    public final lqb g(n7g n7gVar, lqb lqbVar) {
        h8g h8gVar = this.e;
        boolean z = false;
        this.c = false;
        this.e = null;
        if (n7gVar.a.b() > 0 && h8gVar != null) {
            int iD = n7gVar.a.d();
            this.d |= iD;
            p8g p8gVar = (p8g) r8g.a.b(iD);
            if (p8gVar != null) {
                Object objG = this.f.g(p8gVar);
                objG.getClass();
                j9g j9gVar = (j9g) objG;
                x47 x47VarI = h8gVar.a.i(iD);
                long j = (((long) x47VarI.a) << 48) | (((long) x47VarI.b) << 32) | (((long) x47VarI.c) << 16) | ((long) x47VarI.d);
                long j2 = j9gVar.h;
                if (!m7c.d(j, j2)) {
                    j9gVar.j = j2;
                    j9gVar.k = j;
                    j9gVar.b.setValue(Boolean.TRUE);
                    m7g m7gVar = n7gVar.a;
                    j9gVar.c.k(m7gVar.c());
                    j9gVar.e.k(m7gVar.a());
                    j9gVar.d.k(m7gVar.b());
                    sz9 sz9Var = this.g;
                    sz9Var.k(sz9Var.j() + 1);
                    synchronized (qrd.c) {
                        x79 x79Var = qrd.j.h;
                        if (x79Var != null && x79Var.d()) {
                            z = true;
                        }
                    }
                    if (z) {
                        qrd.c();
                        return lqbVar;
                    }
                }
            }
        }
        return lqbVar;
    }

    @Override // defpackage.lm9
    public final h8g i(View view, h8g h8gVar) {
        if (this.c) {
            this.e = h8gVar;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return h8gVar;
            }
        } else if (this.d == 0) {
            F(h8gVar);
        }
        return h8gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = nvf.a;
        fvf.c(view, this);
        n7g.a(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = nvf.a;
        fvf.c(view, null);
        n7g.a(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            h8g h8gVar = this.e;
            if (h8gVar != null) {
                F(h8gVar);
                this.e = null;
            }
        }
    }
}
