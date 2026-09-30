package defpackage;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nn1 extends gbe implements l26 {
    final /* synthetic */ List $deferredList$inlined;
    final /* synthetic */ List $requests$inlined;
    Object L$0;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nn1(xn2 xn2Var, xn1 xn1Var, List list, List list2) {
        super(2, xn2Var);
        this.this$0 = xn1Var;
        this.$deferredList$inlined = list;
        this.$requests$inlined = list2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nn1(xn2Var, this.this$0, this.$deferredList$inlined, this.$requests$inlined);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        imb imbVar;
        AutoCloseable autoCloseable;
        Object objA;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i == 0) {
                    jzb.q(obj);
                    if (b21.F(3, "CXCP")) {
                        Log.d("CXCP", "CapturePipeline#submitRequestInternal: Acquiring session for submitting requests");
                    }
                    imbVar = new imb();
                    yf1 yf1VarA = this.this$0.i.a();
                    this.L$0 = imbVar;
                    this.label = 1;
                    obj = ((dg1) yf1VarA).h(this);
                    if (obj == bw2Var) {
                    }
                }
                if (i == 1) {
                    imbVar = (imb) this.L$0;
                    jzb.q(obj);
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            jzb.q(obj);
                            return wefVar;
                        }
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    jzb.q(obj);
                }
                ujf ujfVar = (ujf) this.this$0.k.getValue();
                this.label = 3;
                objA = ujfVar.a(this);
                if (objA != bw2Var) {
                    objA = wefVar;
                }
                return objA == bw2Var ? bw2Var : wefVar;
                gg1 gg1Var = (gg1) autoCloseable;
                boolean zM = scc.m(this.$requests$inlined);
                imbVar.element = zM;
                if (zM) {
                    gg1Var.u();
                }
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "CapturePipeline#submitRequestInternal: Submitting " + this.$requests$inlined);
                }
                gg1Var.x(this.$requests$inlined);
                cgg.t(autoCloseable, null);
                if (imbVar.element) {
                    List list = this.$deferredList$inlined;
                    this.L$0 = null;
                    this.label = 2;
                    if (pa7.X(list, this) != bw2Var) {
                        ujf ujfVar2 = (ujf) this.this$0.k.getValue();
                        this.label = 3;
                        objA = ujfVar2.a(this);
                        if (objA != bw2Var) {
                            objA = wefVar;
                        }
                        if (objA == bw2Var) {
                        }
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(autoCloseable, th);
                    throw th2;
                }
            }
            autoCloseable = (AutoCloseable) obj;
        } catch (CancellationException unused) {
            if (b21.F(4, "CXCP")) {
                Log.i("CXCP", "CapturePipeline#submitRequestInternal: CameraGraph.Session could not be acquired, requests may need re-submission");
            }
            Iterator it = this.$deferredList$inlined.iterator();
            while (it.hasNext()) {
                ((za2) ((ya2) it.next())).i0(new jv6(3, "Capture request is cancelled because camera is closed", null));
            }
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nn1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
