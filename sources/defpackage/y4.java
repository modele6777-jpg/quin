package defpackage;

import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y4 extends yk4 implements wwc {
    public final sc9 Y0;
    public i1 Z0;
    public x4 a1;
    public boolean b1;
    public boolean c1;
    public d49 d1;
    public d2f e1;

    public y4(boolean z, t69 t69Var, ks9 ks9Var) {
        super(kj0.b, z, t69Var, ks9Var);
        this.Y0 = new sc9();
    }

    @Override // defpackage.yk4
    public final boolean D1() {
        gic gicVar = ((yhc) this).g1;
        if (gicVar.a.a()) {
            return true;
        }
        lu9 lu9Var = gicVar.b;
        return lu9Var != null ? lu9Var.d() : false;
    }

    @Override // defpackage.yk4, defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        int i;
        List list = hiaVar.a;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Boolean) this.G0.d(new xia(((oia) list.get(i2)).i))).booleanValue()) {
                super.E(hiaVar, iiaVar, j);
                break;
            }
        }
        if (this.H0) {
            if (this.P0 == null) {
                u66 u66Var = new u66(this);
                l1(u66Var);
                this.P0 = u66Var;
            }
            iia iiaVar2 = iia.a;
            if (iiaVar == iiaVar2 && hiaVar.f == 6) {
                if (!this.b1) {
                    yhc yhcVar = (yhc) this;
                    this.d1 = new d49(yhcVar.g1, new vd9(3, ViewConfiguration.get(kj0.x0(yhcVar).getContext())), new q12(2, yhcVar, yhc.class, "onMouseWheelScrollStopped", "onMouseWheelScrollStopped-TH1AsA0(J)V", 4, 2), vd0.s0(yhcVar).O0);
                    this.b1 = true;
                }
                d49 d49Var = this.d1;
                if (d49Var != null) {
                    aw2 aw2VarZ0 = Z0();
                    if (d49Var.h == null) {
                        d49Var.h = ynb.V(aw2VarZ0, null, null, new c49(d49Var, null), 3);
                    }
                }
            }
            d49 d49Var2 = this.d1;
            iia iiaVar3 = iia.b;
            if (d49Var2 != null && hiaVar.f == 6) {
                List list2 = hiaVar.a;
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    if (i3 >= size2) {
                        if (iiaVar == iiaVar2 && d49Var2.d) {
                            d49Var2.f(hiaVar);
                            lg9.a(hiaVar);
                        }
                        if (iiaVar != iiaVar3 || d49Var2.d || !d49Var2.f(hiaVar)) {
                            break;
                            break;
                            break;
                        } else {
                            lg9.a(hiaVar);
                            break;
                        }
                    }
                    if (((oia) list2.get(i3)).c()) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            if (iiaVar == iiaVar2 && ((i = hiaVar.f) == 10 || i == 11 || i == 12)) {
                if (!this.c1) {
                    yhc yhcVar2 = (yhc) this;
                    this.e1 = new d2f(yhcVar2.g1, new q12(2, yhcVar2, yhc.class, "onTrackpadScrollStopped", "onTrackpadScrollStopped-TH1AsA0(J)V", 4, 3), vd0.s0(yhcVar2).O0);
                    this.c1 = true;
                }
                d2f d2fVar = this.e1;
                if (d2fVar != null) {
                    aw2 aw2VarZ1 = Z0();
                    if (d2fVar.g == null) {
                        d2fVar.g = ynb.V(aw2VarZ1, null, null, new c2f(d2fVar, null), 3);
                    }
                }
            }
            d2f d2fVar2 = this.e1;
            if (d2fVar2 != null) {
                int i4 = hiaVar.f;
                if (i4 == 10 || i4 == 11 || i4 == 12) {
                    List list3 = hiaVar.a;
                    int size3 = list3.size();
                    for (int i5 = 0; i5 < size3; i5++) {
                        if (((oia) list3.get(i5)).c()) {
                            return;
                        }
                    }
                    if (iiaVar == iiaVar2 && d2fVar2.d) {
                        d2fVar2.d(hiaVar);
                        lg9.a(hiaVar);
                    }
                    if (iiaVar == iiaVar3 && !d2fVar2.d && d2fVar2.d(hiaVar)) {
                        lg9.a(hiaVar);
                    }
                }
            }
        }
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        if (this.H0 && (this.Z0 == null || this.a1 == null)) {
            this.Z0 = new i1(2, this);
            this.a1 = new x4(this, null);
        }
        i1 i1Var = this.Z0;
        if (i1Var != null) {
            wn7[] wn7VarArr = exc.a;
            hxcVar.c(swc.d, new f6(null, i1Var));
        }
        x4 x4Var = this.a1;
        if (x4Var != null) {
            wn7[] wn7VarArr2 = exc.a;
            hxcVar.c(swc.e, x4Var);
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        d49 d49Var = this.d1;
        if (d49Var != null) {
            d49Var.c = vd0.s0(this).O0;
        }
        d2f d2fVar = this.e1;
        if (d2fVar != null) {
            d2fVar.c = vd0.s0(this).O0;
        }
        if (this.Y) {
            sw3 sw3Var = vd0.s0(this).O0;
            uq3 uq3Var = ((yhc) this).f1;
            uq3Var.getClass();
            uq3Var.a = new qh3(new g5b(sw3Var));
        }
    }

    @Override // defpackage.rv3
    public final void e() {
        N();
        d49 d49Var = this.d1;
        if (d49Var != null) {
            d49Var.c = vd0.s0(this).O0;
        }
        d2f d2fVar = this.e1;
        if (d2fVar != null) {
            d2fVar.c = vd0.s0(this).O0;
        }
        N();
        if (this.Y) {
            sw3 sw3Var = vd0.s0(this).O0;
            uq3 uq3Var = ((yhc) this).f1;
            uq3Var.getClass();
            uq3Var.a = new qh3(new g5b(sw3Var));
        }
    }

    @Override // defpackage.yk4
    public final void u1(long j) {
    }
}
