package defpackage;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z1e extends gbe implements l26 {
    final /* synthetic */ List<im1> $captureConfigs;
    final /* synthetic */ int $captureMode;
    final /* synthetic */ int $flashType;
    final /* synthetic */ ya2 $signal;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f2e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1e(List list, int i, int i2, ya2 ya2Var, f2e f2eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$captureConfigs = list;
        this.$captureMode = i;
        this.$flashType = i2;
        this.$signal = ya2Var;
        this.this$0 = f2eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z1e(this.$captureConfigs, this.$captureMode, this.$flashType, this.$signal, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9 A[PHI: r15
  0x00a9: PHI (r15v2 y1e) = (r15v1 y1e), (r15v3 y1e) binds: [B:13:0x005f, B:18:0x0074] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00cd, please report this as an issue */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        y1e y1eVar;
        ajf ajfVar;
        Object objD;
        f2e f2eVar;
        d99 d99Var;
        y1e y1eVar2;
        y1e y1eVar3;
        ajf ajfVar2;
        f2e f2eVar2;
        dg7 dg7Var;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            y1eVar = new y1e(this.$captureConfigs, this.$captureMode, this.$flashType, this.$signal);
            ajfVar = this.this$0.d;
            if (ajfVar != null) {
                this.L$0 = y1eVar;
                this.L$1 = ajfVar;
                this.label = 1;
                objD = ajfVar.d(this);
                if (objD != bw2Var) {
                }
            } else {
                f2eVar = this.this$0;
                d99Var = f2eVar.c;
                this.L$0 = y1eVar;
                this.L$1 = d99Var;
                this.L$2 = f2eVar;
                this.label = 3;
                if (d99Var.b(this) != bw2Var) {
                    y1eVar2 = y1eVar;
                    f2eVar.e.add(y1eVar2);
                    d99Var.h(null);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + y1eVar2 + " will be retried with a future UseCaseCamera");
                    }
                    return wef.a;
                }
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                f2e f2eVar3 = (f2e) this.L$2;
                ajf ajfVar3 = (ajf) this.L$1;
                y1e y1eVar4 = (y1e) this.L$0;
                jzb.q(obj);
                y1eVar3 = y1eVar4;
                f2eVar2 = f2eVar3;
                ajfVar2 = ajfVar3;
                dg7Var = (nu3) obj;
                if (ajfVar2 != null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                f2eVar2.getClass();
                ((rg7) dg7Var).E(new wca(f2eVar2, dg7Var, y1eVar3, ajfVar2, 3));
                return wef.a;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2eVar = (f2e) this.L$2;
            d99Var = (d99) this.L$1;
            y1eVar2 = (y1e) this.L$0;
            jzb.q(obj);
            try {
                f2eVar.e.add(y1eVar2);
                d99Var.h(null);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + y1eVar2 + " will be retried with a future UseCaseCamera");
                }
                return wef.a;
            } catch (Throwable th) {
                d99Var.h(null);
                throw th;
            }
        }
        ajfVar = (ajf) this.L$1;
        y1e y1eVar5 = (y1e) this.L$0;
        jzb.q(obj);
        objD = obj;
        y1eVar = y1eVar5;
        if (((Boolean) objD).booleanValue()) {
            f2e f2eVar4 = this.this$0;
            if (ajfVar == null) {
                qc0.j("Required value was null.");
                return null;
            }
            this.L$0 = y1eVar;
            this.L$1 = ajfVar;
            this.L$2 = f2eVar4;
            this.label = 2;
            Object objA = f2eVar4.a(y1eVar, ajfVar, this);
            if (objA != bw2Var) {
                y1eVar3 = y1eVar;
                ajfVar2 = ajfVar;
                f2eVar2 = f2eVar4;
                obj = objA;
                dg7Var = (nu3) obj;
                if (ajfVar2 != null) {
                    qc0.j("Required value was null.");
                    return null;
                }
                f2eVar2.getClass();
                ((rg7) dg7Var).E(new wca(f2eVar2, dg7Var, y1eVar3, ajfVar2, 3));
                return wef.a;
            }
        } else {
            f2eVar = this.this$0;
            d99Var = f2eVar.c;
            this.L$0 = y1eVar;
            this.L$1 = d99Var;
            this.L$2 = f2eVar;
            this.label = 3;
            if (d99Var.b(this) != bw2Var) {
                y1eVar2 = y1eVar;
                f2eVar.e.add(y1eVar2);
                d99Var.h(null);
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: useCaseCamera is null, " + y1eVar2 + " will be retried with a future UseCaseCamera");
                }
                return wef.a;
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z1e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
