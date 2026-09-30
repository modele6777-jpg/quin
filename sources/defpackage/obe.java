package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class obe extends i09 implements tia, sw3, ria {
    public Object E0;
    public Object[] F0;
    public PointerInputEventHandler G0;
    public lyd H0;
    public hia I0 = ibe.a;
    public final p89 J0;
    public final p89 K0;
    public final p89 L0;
    public hia M0;
    public long N0;
    public Object Z;

    public obe(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.Z = obj;
        this.E0 = obj2;
        this.F0 = objArr;
        this.G0 = pointerInputEventHandler;
        p89 p89Var = new p89(0, new mbe[16]);
        this.J0 = p89Var;
        this.K0 = p89Var;
        this.L0 = new p89(0, new mbe[16]);
        this.N0 = 0L;
    }

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        this.N0 = j;
        if (iiaVar == iia.a) {
            this.I0 = hiaVar;
        }
        if (this.H0 == null) {
            this.H0 = ynb.V(Z0(), null, dw2.d, new nbe(this, null), 1);
        }
        m1(hiaVar, iiaVar);
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!xo1.n((oia) list.get(i))) {
                this.M0 = hiaVar;
            }
        }
        hiaVar = null;
        this.M0 = hiaVar;
    }

    @Override // defpackage.ria
    public final void N() {
        hia hiaVar = this.M0;
        if (hiaVar == null) {
            return;
        }
        List list = hiaVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((oia) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    oia oiaVar = (oia) list.get(i2);
                    long j = oiaVar.a;
                    long j2 = oiaVar.c;
                    long j3 = oiaVar.b;
                    float f = oiaVar.e;
                    boolean z = oiaVar.d;
                    arrayList.add(new oia(j, j3, j2, false, f, j3, j2, z, z, oiaVar.i, 0L, 1.0f, 0L));
                }
                hia hiaVar2 = new hia(arrayList, null);
                this.I0 = hiaVar2;
                m1(hiaVar2, iia.a);
                m1(hiaVar2, iia.b);
                m1(hiaVar2, iia.c);
                this.M0 = null;
                return;
            }
        }
    }

    @Override // defpackage.ria
    public final void P0() {
        n1();
    }

    @Override // defpackage.rv3
    public final void e() {
        n1();
    }

    @Override // defpackage.i09
    public final void e1() {
        n1();
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return vd0.s0(this).O0.getDensity();
    }

    @Override // defpackage.sw3
    public final float h0() {
        return vd0.s0(this).O0.h0();
    }

    public final Object l1(l26 l26Var, xn2 xn2Var) {
        pl1 pl1Var = new pl1(1, k99.D(xn2Var));
        pl1Var.v();
        mbe mbeVar = new mbe(this, pl1Var);
        synchronized (this.K0) {
            this.J0.b(mbeVar);
            new xbc(k99.D(k99.x(mbeVar, mbeVar, l26Var))).g(wef.a);
        }
        pl1Var.x(new ymb(6, mbeVar));
        return pl1Var.t();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    public final void m1(hia hiaVar, iia iiaVar) {
        Object[] objArr;
        int i;
        int i2;
        mbe mbeVar;
        pl1 pl1Var;
        pl1 pl1Var2;
        synchronized (this.K0) {
            p89 p89Var = this.L0;
            p89Var.c(p89Var.c, this.J0);
        }
        try {
            int iOrdinal = iiaVar.ordinal();
            if (iOrdinal == 0) {
                p89 p89Var2 = this.L0;
                objArr = p89Var2.a;
                i = p89Var2.c;
                for (i2 = 0; i2 < i; i2++) {
                    mbeVar = (mbe) objArr[i2];
                    if (iiaVar != mbeVar.d && (pl1Var = mbeVar.c) != null) {
                        mbeVar.c = null;
                        pl1Var.g(hiaVar);
                    }
                }
            } else if (iOrdinal == 1) {
                p89 p89Var3 = this.L0;
                int i3 = p89Var3.c - 1;
                Object[] objArr2 = p89Var3.a;
                if (i3 < objArr2.length) {
                    while (i3 >= 0) {
                        mbe mbeVar2 = (mbe) objArr2[i3];
                        if (iiaVar == mbeVar2.d && (pl1Var2 = mbeVar2.c) != null) {
                            mbeVar2.c = null;
                            pl1Var2.g(hiaVar);
                        }
                        i3--;
                    }
                }
            } else {
                if (iOrdinal != 2) {
                    throw new rf9();
                }
                p89 p89Var4 = this.L0;
                objArr = p89Var4.a;
                i = p89Var4.c;
                while (i2 < i) {
                    mbeVar = (mbe) objArr[i2];
                    if (iiaVar != mbeVar.d) {
                    }
                }
            }
            this.L0.g();
        } catch (Throwable th) {
            this.L0.g();
            throw th;
        }
    }

    public final void n1() {
        lyd lydVar = this.H0;
        if (lydVar != null) {
            lydVar.v(new sia("Pointer input was reset"));
            this.H0 = null;
        }
    }
}
