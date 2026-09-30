package defpackage;

import android.util.Log;
import java.util.LinkedList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f2e implements sif {
    public final xi5 a;
    public final lkf b;
    public final f99 c;
    public ajf d;
    public final LinkedList e;

    public f2e(xi5 xi5Var, lkf lkfVar) {
        xi5Var.getClass();
        lkfVar.getClass();
        this.a = xi5Var;
        this.b = lkfVar;
        this.c = new f99();
        this.e = new LinkedList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(y1e y1eVar, ajf ajfVar, zn2 zn2Var) {
        c2e c2eVar;
        if (zn2Var instanceof c2e) {
            c2eVar = (c2e) zn2Var;
            int i = c2eVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2eVar.label = i - Integer.MIN_VALUE;
            } else {
                c2eVar = new c2e(this, zn2Var);
            }
        } else {
            c2eVar = new c2e(this, zn2Var);
        }
        Object objC = c2eVar.result;
        int i2 = c2eVar.label;
        if (i2 == 0) {
            jzb.q(objC);
            if (b21.F(3, "CXCP")) {
                Log.d("CXCP", "StillCaptureRequestControl: submitting " + y1eVar + " at " + ajfVar);
            }
            c2eVar.L$0 = y1eVar;
            c2eVar.L$1 = ajfVar;
            c2eVar.label = 1;
            objC = this.a.c(c2eVar);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ajfVar = (ajf) c2eVar.L$1;
            y1eVar = (y1e) c2eVar.L$0;
            jzb.q(objC);
        }
        int iIntValue = ((Number) objC).intValue();
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "StillCaptureRequestControl: Issuing single capture");
        }
        return ynb.y(this.b.f, null, new d2e(ajfVar.h(y1eVar.a, y1eVar.b, y1eVar.c, iIntValue), y1eVar, null), 3);
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        this.d = ajfVar;
        ynb.V(this.b.f, null, null, new e2e(this, null), 3);
    }

    @Override // defpackage.sif
    public final void reset() {
        ynb.V(this.b.f, null, null, new b2e(this, null), 3);
    }
}
