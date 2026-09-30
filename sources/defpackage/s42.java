package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class s42 extends b1 {
    public oia Z0;
    public z17 a1;

    @Override // defpackage.h27
    public final void C(os osVar, iia iiaVar) {
        ArrayList arrayList = (ArrayList) osVar.c;
        w1();
        if (this.K0 && this.O0 == null) {
            u66 u66Var = new u66(this);
            l1(u66Var);
            this.O0 = u66Var;
        }
        if (iiaVar != iia.b) {
            if (iiaVar == iia.c) {
                if (this.a1 != null) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        z17 z17Var = (z17) arrayList.get(i);
                        if (z17Var.i && z17Var != this.a1) {
                            C1(true);
                            break;
                        }
                    }
                }
                if (pa7.t(this.P0, "recognized")) {
                    this.P0 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.a1 == null) {
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (g21.z((z17) arrayList.get(i2))) {
                    z17 z17Var2 = (z17) arrayList.get(0);
                    z17Var2.i = true;
                    this.a1 = z17Var2;
                    if (this.K0) {
                        this.P0 = "waiting";
                        u1(z17Var2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i3 = 0; i3 < size3; i3++) {
            z17 z17Var3 = (z17) arrayList.get(i3);
            if (z17Var3.i || !z17Var3.h || z17Var3.d) {
                float f = ((rvf) eb3.H(this, zg2.t)).f();
                int size4 = arrayList.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    z17 z17Var4 = (z17) arrayList.get(i4);
                    long j = z17Var4.c;
                    z17 z17Var5 = this.a1;
                    z17Var5.getClass();
                    boolean z = Math.abs(hl9.d(hl9.f(j, z17Var5.c))) > f;
                    if (z17Var4.i || z) {
                        C1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((z17) arrayList.get(0)).i = true;
        if (this.K0) {
            this.P0 = "recognized";
            z17 z17Var6 = this.a1;
            z17Var6.getClass();
            t1(z17Var6.c, true);
            A1();
        }
        this.a1 = null;
    }

    public final void C1(boolean z) {
        if (z) {
            this.a1 = null;
        } else {
            this.Z0 = null;
        }
        s1(z);
        this.P0 = "idle";
    }

    @Override // defpackage.b1, defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        super.E(hiaVar, iiaVar, j);
        if (iiaVar != iia.b) {
            if (iiaVar == iia.c) {
                if (this.Z0 != null) {
                    List list = hiaVar.a;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        oia oiaVar = (oia) list.get(i);
                        if (oiaVar.c() && oiaVar != this.Z0) {
                            C1(false);
                            break;
                        }
                    }
                }
                if (pa7.t(this.P0, "recognized")) {
                    this.P0 = "idle";
                    return;
                }
                return;
            }
            return;
        }
        if (this.Z0 == null) {
            if (ffe.f(hiaVar, true, false)) {
                oia oiaVar2 = (oia) hiaVar.a.get(0);
                oiaVar2.a();
                this.Z0 = oiaVar2;
                if (this.K0) {
                    this.P0 = "waiting";
                    v1(oiaVar2);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = hiaVar.a;
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (!xo1.m((oia) list2.get(i2))) {
                long jR1 = r1(j);
                int size3 = list2.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    oia oiaVar3 = (oia) list2.get(i3);
                    if (oiaVar3.c() || xo1.E(oiaVar3, j, jR1)) {
                        C1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((oia) list2.get(0)).a();
        if (this.K0) {
            this.P0 = "recognized";
            oia oiaVar4 = this.Z0;
            oiaVar4.getClass();
            t1(oiaVar4.c, false);
            A1();
        }
        this.Z0 = null;
    }

    @Override // defpackage.ria
    public final void N() {
        yq6 yq6Var;
        t69 t69Var = this.F0;
        if (t69Var != null && (yq6Var = this.S0) != null) {
            ((u69) t69Var).b(new zq6(yq6Var));
        }
        this.S0 = null;
        C1(false);
    }

    @Override // defpackage.h27
    public final void t0() {
        C1(true);
    }

    @Override // defpackage.b1
    public final boolean y1(KeyEvent keyEvent) {
        return false;
    }

    @Override // defpackage.b1
    public final void z1(KeyEvent keyEvent) {
        A1();
    }
}
