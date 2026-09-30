package androidx.compose.material.ripple;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.material3.a;
import androidx.compose.material3.b;
import defpackage.ald;
import defpackage.b5c;
import defpackage.c5c;
import defpackage.cva;
import defpackage.db6;
import defpackage.eb3;
import defpackage.f5c;
import defpackage.hl9;
import defpackage.i09;
import defpackage.i79;
import defpackage.im2;
import defpackage.k82;
import defpackage.ks0;
import defpackage.m77;
import defpackage.mp;
import defpackage.ota;
import defpackage.p;
import defpackage.pn4;
import defpackage.pta;
import defpackage.qn4;
import defpackage.qta;
import defpackage.rta;
import defpackage.sn4;
import defpackage.sw3;
import defpackage.t72;
import defpackage.ta0;
import defpackage.ug2;
import defpackage.uq;
import defpackage.vd0;
import defpackage.vd9;
import defpackage.vea;
import defpackage.vl1;
import defpackage.vu;
import defpackage.vv7;
import defpackage.x0e;
import defpackage.xl1;
import defpackage.y72;
import defpackage.ym8;
import defpackage.ynb;
import defpackage.z7c;
import defpackage.zu7;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Li09;", "Lug2;", "Lpn4;", "Lzu7;", "Lk82;", "color", "Lk82;", "material-ripple"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public abstract class RippleNode extends i09 implements ug2, pn4, zu7 {
    public final boolean E0;
    public final float F0;
    public final a G0;
    public x0e H0;
    public float I0;
    public boolean K0;
    public final m77 Z;
    private final k82 color;
    public long J0 = 0;
    public final i79 L0 = new i79();

    public RippleNode(m77 m77Var, boolean z, float f, b bVar, a aVar) {
        this.Z = m77Var;
        this.E0 = z;
        this.F0 = f;
        this.color = bVar;
        this.G0 = aVar;
    }

    @Override // defpackage.zu7, defpackage.co8
    public final void a(long j) {
        float fP0;
        this.K0 = true;
        sw3 sw3Var = vd0.s0(this).O0;
        this.J0 = db6.Y0(j);
        float f = this.F0;
        if (Float.isNaN(f)) {
            long j2 = this.J0;
            fP0 = hl9.d(ynb.p(ald.d(j2), ald.b(j2))) / 2.0f;
            if (this.E0) {
                fP0 += sw3Var.p0(10.0f);
            }
        } else {
            fP0 = sw3Var.p0(f);
        }
        this.I0 = fP0;
        i79 i79Var = this.L0;
        Object[] objArr = i79Var.a;
        int i = i79Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            l1((rta) objArr[i2]);
        }
        i79Var.k();
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        ynb.V(Z0(), null, null, new f5c(this, null), 3);
    }

    public final void l1(rta rtaVar) {
        c5c c5cVar;
        if (!(rtaVar instanceof pta)) {
            if (rtaVar instanceof qta) {
                c5c c5cVar2 = ((vu) this).N0;
                if (c5cVar2 != null) {
                    c5cVar2.d();
                    return;
                }
                return;
            }
            if (!(rtaVar instanceof ota) || (c5cVar = ((vu) this).N0) == null) {
                return;
            }
            c5cVar.d();
            return;
        }
        pta ptaVar = (pta) rtaVar;
        long j = this.J0;
        float f = this.I0;
        vu vuVar = (vu) this;
        b5c b5cVar = vuVar.M0;
        if (b5cVar == null) {
            Object obj = (View) eb3.H(vuVar, uq.f);
            while (!(obj instanceof ViewGroup)) {
                ViewParent parent = ((View) obj).getParent();
                if (!(parent instanceof View)) {
                    cva.u(obj, ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?", "Couldn't find a valid parent for ");
                    return;
                }
                obj = parent;
            }
            ViewGroup viewGroup = (ViewGroup) obj;
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    b5c b5cVar2 = new b5c(viewGroup.getContext());
                    viewGroup.addView(b5cVar2);
                    b5cVar = b5cVar2;
                    break;
                } else {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt instanceof b5c) {
                        b5cVar = (b5c) childAt;
                        break;
                    }
                    i++;
                }
            }
            vuVar.M0 = b5cVar;
        }
        ArrayList arrayList = b5cVar.b;
        vea veaVar = b5cVar.d;
        LinkedHashMap linkedHashMap = (LinkedHashMap) veaVar.b;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) veaVar.b;
        LinkedHashMap linkedHashMap3 = (LinkedHashMap) veaVar.c;
        c5c c5cVar3 = (c5c) linkedHashMap.get(vuVar);
        if (c5cVar3 == null) {
            ArrayList arrayList2 = b5cVar.c;
            arrayList2.getClass();
            c5cVar3 = (c5c) (arrayList2.isEmpty() ? null : arrayList2.remove(0));
            if (c5cVar3 == null) {
                if (b5cVar.e > t72.E(arrayList)) {
                    c5cVar3 = new c5c(b5cVar.getContext());
                    b5cVar.addView(c5cVar3);
                    arrayList.add(c5cVar3);
                } else {
                    c5cVar3 = (c5c) arrayList.get(b5cVar.e);
                    vu vuVar2 = (vu) linkedHashMap3.get(c5cVar3);
                    if (vuVar2 != null) {
                        vuVar2.N0 = null;
                        qn4.G(vuVar2);
                        c5c c5cVar4 = (c5c) linkedHashMap2.get(vuVar2);
                        if (c5cVar4 != null) {
                        }
                        linkedHashMap2.remove(vuVar2);
                        c5cVar3.c();
                    }
                }
                int i2 = b5cVar.e;
                if (i2 < b5cVar.a - 1) {
                    b5cVar.e = i2 + 1;
                } else {
                    b5cVar.e = 0;
                }
            }
            linkedHashMap2.put(vuVar, c5cVar3);
            linkedHashMap3.put(c5cVar3, vuVar);
        }
        c5c c5cVar5 = c5cVar3;
        int iL = ym8.L(f);
        long jA = vuVar.color.a();
        vuVar.G0.invoke();
        c5cVar5.b(ptaVar, vuVar.E0, j, iL, jA, new p(4, vuVar));
        vuVar.N0 = c5cVar5;
        qn4.G(vuVar);
    }

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) throws Throwable {
        ta0 ta0Var;
        long j;
        vv7 vv7Var = (vv7) im2Var;
        xl1 xl1Var = vv7Var.a;
        vv7Var.a();
        x0e x0eVar = this.H0;
        if (x0eVar != null) {
            float f = this.I0;
            long jA = this.color.a();
            float fFloatValue = ((Number) x0eVar.c.e()).floatValue();
            if (fFloatValue > 0.0f) {
                long jB = y72.b(jA, fFloatValue);
                if (x0eVar.a) {
                    float fD = ald.d(xl1Var.f());
                    float fB = ald.b(xl1Var.f());
                    ta0 ta0Var2 = xl1Var.b;
                    long jZ = ta0Var2.z();
                    ta0Var2.p().g();
                    try {
                        ((vd9) ta0Var2.c).l(0.0f, 0.0f, fD, fB, 1);
                        j = jZ;
                        ta0Var = ta0Var2;
                        try {
                            sn4.w0(vv7Var, jB, f, 0L, null, 124);
                            ks0.t(ta0Var, j);
                        } catch (Throwable th) {
                            th = th;
                            ks0.t(ta0Var, j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        ta0Var = ta0Var2;
                        j = jZ;
                    }
                } else {
                    sn4.w0(vv7Var, jB, f, 0L, null, 124);
                }
            }
        }
        vu vuVar = (vu) this;
        vl1 vl1VarP = xl1Var.b.p();
        c5c c5cVar = vuVar.N0;
        if (c5cVar != null) {
            long j2 = vuVar.J0;
            int iL = ym8.L(vuVar.I0);
            long jA2 = vuVar.color.a();
            vuVar.G0.invoke();
            c5cVar.e(j2, iL, jA2);
            c5cVar.draw(mp.b(vl1VarP));
        }
    }
}
