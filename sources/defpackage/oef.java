package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oef extends gbe implements l26 {
    final /* synthetic */ g8d $image;
    final /* synthetic */ n26 $loadImage;
    final /* synthetic */ int $viewportWidth;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oef(g8d g8dVar, n26 n26Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.$image = g8dVar;
        this.$loadImage = n26Var;
        this.$viewportWidth = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oef oefVar = new oef(this.$image, this.$loadImage, this.$viewportWidth, xn2Var);
        oefVar.L$0 = obj;
        return oefVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007a A[Catch: all -> 0x003b, Exception -> 0x0040, CancellationException -> 0x0044, TryCatch #5 {CancellationException -> 0x0044, Exception -> 0x0040, all -> 0x003b, blocks: (B:18:0x0037, B:31:0x0074, B:33:0x007a, B:35:0x008f, B:36:0x0096), top: B:60:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x008f A[Catch: all -> 0x003b, Exception -> 0x0040, CancellationException -> 0x0044, TryCatch #5 {CancellationException -> 0x0044, Exception -> 0x0040, all -> 0x003b, blocks: (B:18:0x0037, B:31:0x0074, B:33:0x007a, B:35:0x008f, B:36:0x0096), top: B:60:0x0037 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        Bitmap bitmap;
        Exception exc;
        mmb mmbVar;
        mmb mmbVar2;
        Object obj2;
        xva xvaVar = (xva) this.L$0;
        int i = this.label;
        mmb mmbVar3 = 2;
        bw2 bw2Var = bw2.a;
        try {
            if (i != 0) {
                if (i == 1) {
                    mmbVar2 = (mmb) this.L$1;
                    try {
                        jzb.q(obj);
                        obj2 = mmbVar2.element;
                        if (obj2 != null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        obd obdVar = new obd((Bitmap) obj2);
                        yva yvaVar = (yva) xvaVar;
                        yvaVar.setValue(obdVar);
                        this.L$0 = yvaVar;
                        this.L$1 = mmbVar2;
                        this.label = 2;
                        vfh.o(this);
                        return bw2Var;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        exc = e2;
                        mmbVar = mmbVar2;
                    } catch (Throwable th2) {
                        th = th2;
                        mmbVar3 = mmbVar2;
                        bitmap = (Bitmap) mmbVar3.element;
                        if (bitmap != null) {
                            jzb.m(bitmap);
                        }
                        this.$image.a();
                        throw th;
                    }
                } else {
                    if (i != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mmbVar = (mmb) this.L$1;
                    try {
                        jzb.q(obj);
                        throw new nt7();
                    } catch (CancellationException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        exc = e4;
                    }
                }
                hf8.Q.getClass();
                ef8.a("ShareFilePreview").c("Failed to decode whole preview", exc);
                ((yva) xvaVar).setValue(mbd.a);
                Bitmap bitmap2 = (Bitmap) mmbVar.element;
                if (bitmap2 != null) {
                    jzb.m(bitmap2);
                }
                this.$image.a();
                return wef.a;
            }
            jzb.q(obj);
            this.$image.b();
            mmb mmbVar4 = new mmb();
            try {
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                nef nefVar = new nef(mmbVar4, this.$loadImage, this.$image, this.$viewportWidth, null);
                this.L$0 = xvaVar;
                this.L$1 = mmbVar4;
                this.label = 1;
                if (ynb.p0(hr3Var, nefVar, this) == bw2Var) {
                    return bw2Var;
                }
                mmbVar2 = mmbVar4;
                obj2 = mmbVar2.element;
                if (obj2 != null) {
                    throw new IllegalStateException("Required value was null.");
                }
                obd obdVar2 = new obd((Bitmap) obj2);
                yva yvaVar2 = (yva) xvaVar;
                yvaVar2.setValue(obdVar2);
                this.L$0 = yvaVar2;
                this.L$1 = mmbVar2;
                this.label = 2;
                vfh.o(this);
                return bw2Var;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                exc = e6;
                mmbVar = mmbVar4;
            } catch (Throwable th3) {
                th = th3;
                mmbVar3 = mmbVar4;
                bitmap = (Bitmap) mmbVar3.element;
                if (bitmap != null) {
                    jzb.m(bitmap);
                }
                this.$image.a();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oef) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
