package defpackage;

import android.graphics.Bitmap;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ddf extends gbe implements l26 {
    final /* synthetic */ e89 $failed$delegate;
    final /* synthetic */ g8d $image;
    final /* synthetic */ o26 $loadRegion;
    final /* synthetic */ qad $metrics;
    final /* synthetic */ lsd $resolvedStrips;
    final /* synthetic */ d6d $strip;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddf(g8d g8dVar, lsd lsdVar, d6d d6dVar, e89 e89Var, o26 o26Var, qad qadVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$image = g8dVar;
        this.$resolvedStrips = lsdVar;
        this.$strip = d6dVar;
        this.$failed$delegate = e89Var;
        this.$loadRegion = o26Var;
        this.$metrics = qadVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ddf ddfVar = new ddf(this.$image, this.$resolvedStrips, this.$strip, this.$failed$delegate, this.$loadRegion, this.$metrics, xn2Var);
        ddfVar.L$0 = obj;
        return ddfVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0108  */
    /* JADX WARN: Code duplicated, block: B:51:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x013b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        Bitmap bitmap;
        Exception exc;
        mmb mmbVar;
        mmb mmbVar2;
        Bitmap bitmap2;
        xva xvaVar = (xva) this.L$0;
        int i = this.label;
        mmb mmbVar3 = 2;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.$image.b();
                this.$failed$delegate.setValue(Boolean.FALSE);
                this.$resolvedStrips.remove(new Integer(this.$strip.a));
                mmb mmbVar4 = new mmb();
                try {
                    js3 js3Var = ga4.a;
                    hr3 hr3Var = hr3.c;
                    cdf cdfVar = new cdf(mmbVar4, this.$loadRegion, this.$image, this.$strip, this.$metrics, null);
                    this.L$0 = xvaVar;
                    this.L$1 = mmbVar4;
                    this.label = 1;
                    if (ynb.p0(hr3Var, cdfVar, this) == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar2 = mmbVar4;
                    yva yvaVar = (yva) xvaVar;
                    yvaVar.setValue(mmbVar2.element);
                    this.$resolvedStrips.put(new Integer(this.$strip.a), Boolean.TRUE);
                    this.L$0 = yvaVar;
                    this.L$1 = mmbVar2;
                    this.label = 2;
                    vfh.o(this);
                    return bw2Var;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    exc = e2;
                    mmbVar = mmbVar4;
                    hf8.Q.getClass();
                    ef8.a("ShareFilePreview").c("Failed to decode preview strip", exc);
                    this.$failed$delegate.setValue(Boolean.TRUE);
                    this.$resolvedStrips.put(new Integer(this.$strip.a), Boolean.FALSE);
                    ((yva) xvaVar).setValue(null);
                    if (!((Boolean) this.$failed$delegate.getValue()).booleanValue()) {
                        this.$resolvedStrips.remove(new Integer(this.$strip.a));
                    }
                    bitmap2 = (Bitmap) mmbVar.element;
                    if (bitmap2 != null) {
                        jzb.m(bitmap2);
                    }
                    this.$image.a();
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    mmbVar3 = mmbVar4;
                    ((yva) xvaVar).setValue(null);
                    if (!((Boolean) this.$failed$delegate.getValue()).booleanValue()) {
                        this.$resolvedStrips.remove(new Integer(this.$strip.a));
                    }
                    bitmap = (Bitmap) mmbVar3.element;
                    if (bitmap != null) {
                        jzb.m(bitmap);
                    }
                    this.$image.a();
                    throw th;
                }
            }
            if (i != 1) {
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
                    hf8.Q.getClass();
                    ef8.a("ShareFilePreview").c("Failed to decode preview strip", exc);
                    this.$failed$delegate.setValue(Boolean.TRUE);
                    this.$resolvedStrips.put(new Integer(this.$strip.a), Boolean.FALSE);
                    ((yva) xvaVar).setValue(null);
                    if (!((Boolean) this.$failed$delegate.getValue()).booleanValue()) {
                        this.$resolvedStrips.remove(new Integer(this.$strip.a));
                    }
                    bitmap2 = (Bitmap) mmbVar.element;
                    if (bitmap2 != null) {
                        jzb.m(bitmap2);
                    }
                    this.$image.a();
                    return wef.a;
                }
            }
            mmbVar2 = (mmb) this.L$1;
            try {
                jzb.q(obj);
                yva yvaVar2 = (yva) xvaVar;
                yvaVar2.setValue(mmbVar2.element);
                this.$resolvedStrips.put(new Integer(this.$strip.a), Boolean.TRUE);
                this.L$0 = yvaVar2;
                this.L$1 = mmbVar2;
                this.label = 2;
                vfh.o(this);
                return bw2Var;
            } catch (CancellationException e5) {
                throw e5;
            } catch (Exception e6) {
                exc = e6;
                mmbVar = mmbVar2;
                hf8.Q.getClass();
                ef8.a("ShareFilePreview").c("Failed to decode preview strip", exc);
                this.$failed$delegate.setValue(Boolean.TRUE);
                this.$resolvedStrips.put(new Integer(this.$strip.a), Boolean.FALSE);
                ((yva) xvaVar).setValue(null);
                if (!((Boolean) this.$failed$delegate.getValue()).booleanValue()) {
                    this.$resolvedStrips.remove(new Integer(this.$strip.a));
                }
                bitmap2 = (Bitmap) mmbVar.element;
                if (bitmap2 != null) {
                    jzb.m(bitmap2);
                }
                this.$image.a();
                return wef.a;
            } catch (Throwable th3) {
                th = th3;
                mmbVar3 = mmbVar2;
                ((yva) xvaVar).setValue(null);
                if (!((Boolean) this.$failed$delegate.getValue()).booleanValue()) {
                    this.$resolvedStrips.remove(new Integer(this.$strip.a));
                }
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
        return ((ddf) k((xn2) obj2, (xva) obj)).r(wef.a);
    }
}
