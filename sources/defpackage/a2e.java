package defpackage;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a2e extends gbe implements l26 {
    final /* synthetic */ ajf $currentRequestControl;
    final /* synthetic */ y1e $submittedRequest;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ f2e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2e(f2e f2eVar, ajf ajfVar, y1e y1eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = f2eVar;
        this.$currentRequestControl = ajfVar;
        this.$submittedRequest = y1eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a2e(this.this$0, this.$currentRequestControl, this.$submittedRequest, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0083 A[PHI: r6
  0x0083: PHI (r6v2 imb) = (r6v0 imb), (r6v0 imb), (r6v4 imb) binds: [B:11:0x004b, B:13:0x0055, B:18:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:24:0x009e  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b2  */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x00b2, please report this as an issue */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        imb imbVar;
        f2e f2eVar;
        imb imbVar2;
        ajf ajfVar;
        y1e y1eVar;
        f2e f2eVar2;
        d99 d99Var;
        y1e y1eVar2;
        f2e f2eVar3;
        y1e y1eVar3;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i != 0) {
            if (i == 1) {
                f2e f2eVar4 = (f2e) this.L$3;
                ajf ajfVar2 = (ajf) this.L$2;
                y1e y1eVar4 = (y1e) this.L$1;
                imb imbVar3 = (imb) this.L$0;
                jzb.q(obj);
                f2eVar = f2eVar4;
                imbVar2 = imbVar3;
                ajfVar = ajfVar2;
                y1eVar = y1eVar4;
            } else {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y1eVar2 = (y1e) this.L$2;
                f2eVar3 = (f2e) this.L$1;
                d99Var = (d99) this.L$0;
                jzb.q(obj);
            }
            try {
                f2eVar3.e.add(y1eVar2);
                d99Var.h(null);
                y1eVar3 = this.$submittedRequest;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + y1eVar3 + ", will be retried with a future UseCaseCamera");
                }
                return wef.a;
            } catch (Throwable th) {
                d99Var.h(null);
                throw th;
            }
        }
        jzb.q(obj);
        imbVar = new imb();
        imbVar.element = true;
        f2e f2eVar5 = this.this$0;
        ajf ajfVar3 = f2eVar5.d;
        if (ajfVar3 != null) {
            ajf ajfVar4 = this.$currentRequestControl;
            y1e y1eVar5 = this.$submittedRequest;
            if (!pa7.t(ajfVar4, ajfVar3)) {
                this.L$0 = imbVar;
                this.L$1 = y1eVar5;
                this.L$2 = ajfVar3;
                this.L$3 = f2eVar5;
                this.label = 1;
                Object objA = f2eVar5.a(y1eVar5, ajfVar3, this);
                if (objA != bw2Var) {
                    f2eVar = f2eVar5;
                    imbVar2 = imbVar;
                    ajfVar = ajfVar3;
                    obj = objA;
                    y1eVar = y1eVar5;
                }
            } else if (imbVar.element) {
                f2eVar2 = this.this$0;
                d99Var = f2eVar2.c;
                y1eVar2 = this.$submittedRequest;
                this.L$0 = d99Var;
                this.L$1 = f2eVar2;
                this.L$2 = y1eVar2;
                this.L$3 = null;
                this.label = 2;
                if (d99Var.b(this) != bw2Var) {
                    f2eVar3 = f2eVar2;
                    f2eVar3.e.add(y1eVar2);
                    d99Var.h(null);
                    y1eVar3 = this.$submittedRequest;
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + y1eVar3 + ", will be retried with a future UseCaseCamera");
                    }
                }
            }
            return bw2Var;
        }
        if (imbVar.element) {
            f2eVar2 = this.this$0;
            d99Var = f2eVar2.c;
            y1eVar2 = this.$submittedRequest;
            this.L$0 = d99Var;
            this.L$1 = f2eVar2;
            this.L$2 = y1eVar2;
            this.L$3 = null;
            this.label = 2;
            if (d99Var.b(this) != bw2Var) {
                f2eVar3 = f2eVar2;
                f2eVar3.e.add(y1eVar2);
                d99Var.h(null);
                y1eVar3 = this.$submittedRequest;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + y1eVar3 + ", will be retried with a future UseCaseCamera");
                }
            }
            return bw2Var;
        }
        return wef.a;
        dg7 dg7Var = (nu3) obj;
        f2eVar.getClass();
        ((rg7) dg7Var).E(new wca(f2eVar, dg7Var, y1eVar, ajfVar, 3));
        imbVar2.element = false;
        imbVar = imbVar2;
        if (imbVar.element) {
            f2eVar2 = this.this$0;
            d99Var = f2eVar2.c;
            y1eVar2 = this.$submittedRequest;
            this.L$0 = d99Var;
            this.L$1 = f2eVar2;
            this.L$2 = y1eVar2;
            this.L$3 = null;
            this.label = 2;
            if (d99Var.b(this) != bw2Var) {
                f2eVar3 = f2eVar2;
                f2eVar3.e.add(y1eVar2);
                d99Var.h(null);
                y1eVar3 = this.$submittedRequest;
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "StillCaptureRequestControl: failed to submit " + y1eVar3 + ", will be retried with a future UseCaseCamera");
                }
            }
            return bw2Var;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a2e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
