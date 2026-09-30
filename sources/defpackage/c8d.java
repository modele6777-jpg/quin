package defpackage;

import android.content.Context;
import android.graphics.Picture;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c8d extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ h0e $currentOnFileCaptured$delegate;
    final /* synthetic */ Picture $picture;
    final /* synthetic */ h0e $reportStatus$delegate;
    final /* synthetic */ s69 $retryVersion$delegate;
    final /* synthetic */ long $sourceSize;
    final /* synthetic */ long $targetSize;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8d(Context context, Picture picture, long j, long j2, h0e h0eVar, h0e h0eVar2, s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$picture = picture;
        this.$sourceSize = j;
        this.$targetSize = j2;
        this.$currentOnFileCaptured$delegate = h0eVar;
        this.$reportStatus$delegate = h0eVar2;
        this.$retryVersion$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c8d(this.$context, this.$picture, this.$sourceSize, this.$targetSize, this.$currentOnFileCaptured$delegate, this.$reportStatus$delegate, this.$retryVersion$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005b A[Catch: all -> 0x0011, Exception -> 0x0015, CancellationException -> 0x0018, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:22:0x0046, B:24:0x005b, B:25:0x0061, B:26:0x0068, B:33:0x0075, B:39:0x00ac), top: B:44:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0061 A[Catch: all -> 0x0011, Exception -> 0x0015, CancellationException -> 0x0018, TryCatch #0 {all -> 0x0011, blocks: (B:6:0x000d, B:22:0x0046, B:24:0x005b, B:25:0x0061, B:26:0x0068, B:33:0x0075, B:39:0x00ac), top: B:44:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        Exception exc;
        mmb mmbVar;
        g8d g8dVar;
        a26 a26Var;
        Object obj2;
        int i = this.label;
        mmb mmbVar2 = 1;
        try {
            if (i == 0) {
                mmb mmbVarD = ks0.d(obj);
                try {
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    b8d b8dVar = new b8d(mmbVarD, this.$context, this.$picture, this.$sourceSize, this.$targetSize, null);
                    this.L$0 = mmbVarD;
                    this.label = 1;
                    Object objP0 = ynb.p0(hr3Var, b8dVar, this);
                    bw2 bw2Var = bw2.a;
                    if (objP0 == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar = mmbVarD;
                    tq.v(getContext());
                    h0e h0eVar = this.$currentOnFileCaptured$delegate;
                    pr4 pr4Var = d8d.a;
                    a26Var = (a26) h0eVar.getValue();
                    obj2 = mmbVar.element;
                    if (obj2 != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a26Var.d(obj2);
                    mmbVar.element = null;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    exc = e2;
                    mmbVar = mmbVarD;
                    hf8.Q.getClass();
                    ef8.a("ShareFileCapture").c("Failed to export share image", exc);
                    h0e h0eVar2 = this.$reportStatus$delegate;
                    pr4 pr4Var2 = d8d.a;
                    ((a26) h0eVar2.getValue()).d(new lad(new q50(this.$retryVersion$delegate, 11)));
                    g8dVar = (g8d) mmbVar.element;
                    if (g8dVar != null) {
                        g8dVar.a();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mmbVar2 = mmbVarD;
                    g8d g8dVar2 = (g8d) mmbVar2.element;
                    if (g8dVar2 == null) {
                        throw th;
                    }
                    g8dVar2.a();
                    throw th;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mmbVar = (mmb) this.L$0;
                try {
                    jzb.q(obj);
                    tq.v(getContext());
                    h0e h0eVar3 = this.$currentOnFileCaptured$delegate;
                    pr4 pr4Var3 = d8d.a;
                    a26Var = (a26) h0eVar3.getValue();
                    obj2 = mmbVar.element;
                    if (obj2 != null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    a26Var.d(obj2);
                    mmbVar.element = null;
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    exc = e4;
                    hf8.Q.getClass();
                    ef8.a("ShareFileCapture").c("Failed to export share image", exc);
                    h0e h0eVar4 = this.$reportStatus$delegate;
                    pr4 pr4Var4 = d8d.a;
                    ((a26) h0eVar4.getValue()).d(new lad(new q50(this.$retryVersion$delegate, 11)));
                    g8dVar = (g8d) mmbVar.element;
                    if (g8dVar != null) {
                        g8dVar.a();
                    }
                }
            }
            return wef.a;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c8d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
