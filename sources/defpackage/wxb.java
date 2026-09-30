package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wxb extends gbe implements l26 {
    final /* synthetic */ int $resourceId;
    final /* synthetic */ Resources $resources;
    final /* synthetic */ int $sampleSize;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wxb(Resources resources, int i, int i2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$resources = resources;
        this.$resourceId = i;
        this.$sampleSize = i2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wxb wxbVar = new wxb(this.$resources, this.$resourceId, this.$sampleSize, xn2Var);
        wxbVar.L$0 = obj;
        return wxbVar;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:? A[SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        mmb mmbVar;
        mmb mmbVar2;
        Bitmap bitmap;
        xva xvaVar = (xva) this.L$0;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            mmb mmbVarD = ks0.d(obj);
            try {
                js3 js3Var = ga4.a;
                hr3 hr3Var = hr3.c;
                try {
                    vxb vxbVar = new vxb(mmbVarD, this.$resources, this.$resourceId, this.$sampleSize, null);
                    this.L$0 = xvaVar;
                    this.L$1 = mmbVarD;
                    this.label = 1;
                    if (ynb.p0(hr3Var, vxbVar, this) == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar2 = mmbVarD;
                    ((yva) xvaVar).setValue(new uxb((Bitmap) mmbVar2.element, true));
                    this.L$0 = null;
                    this.L$1 = mmbVar2;
                    this.label = 2;
                    vfh.o(this);
                    return bw2Var;
                } catch (Throwable th2) {
                    th = th2;
                    mmbVar = mmbVarD;
                    bitmap = (Bitmap) mmbVar.element;
                    if (bitmap != null) {
                        throw th;
                    }
                    jzb.m(bitmap);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (i == 1) {
            mmbVar2 = (mmb) this.L$1;
            try {
                jzb.q(obj);
                try {
                    ((yva) xvaVar).setValue(new uxb((Bitmap) mmbVar2.element, true));
                    this.L$0 = null;
                    this.L$1 = mmbVar2;
                    this.label = 2;
                    vfh.o(this);
                    return bw2Var;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
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
            } catch (Throwable th6) {
                th = th6;
            }
        }
        mmbVar = mmbVar2;
        bitmap = (Bitmap) mmbVar.element;
        if (bitmap != null) {
            throw th;
        }
        jzb.m(bitmap);
        throw th;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        ((wxb) k((xn2) obj2, (xva) obj)).r(wef.a);
        return bw2.a;
    }
}
