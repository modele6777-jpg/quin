package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j6g extends gbe implements l26 {
    final /* synthetic */ qhe $card;
    final /* synthetic */ Context $context;
    final /* synthetic */ aw6 $imageLoader;
    final /* synthetic */ Object $model;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6g(aw6 aw6Var, Context context, Object obj, qhe qheVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$imageLoader = aw6Var;
        this.$context = context;
        this.$model = obj;
        this.$card = qheVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j6g j6gVar = new j6g(this.$imageLoader, this.$context, this.$model, this.$card, xn2Var);
        j6gVar.L$0 = obj;
        return j6gVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        qhe qheVar;
        Bitmap bitmapJ;
        Float fA;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                aw6 aw6Var = this.$imageLoader;
                Context context = this.$context;
                Object obj2 = this.$model;
                qhe qheVar2 = this.$card;
                pw6 pw6Var = new pw6(context);
                pw6Var.c = obj2;
                pw6Var.j = new tib(l6g.a);
                q95 q95Var = yw6.a;
                pw6Var.b().a.put(yw6.f, Boolean.FALSE);
                sw6 sw6VarA = pw6Var.a();
                this.L$0 = null;
                this.L$1 = qheVar2;
                this.L$2 = null;
                this.label = 1;
                obj = ((mib) aw6Var).b(sw6VarA, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                qheVar = qheVar2;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qheVar = (qhe) this.L$1;
                jzb.q(obj);
            }
            zw6 zw6Var = (zw6) obj;
            k8e k8eVar = zw6Var instanceof k8e ? (k8e) zw6Var : null;
            bv6 bv6Var = k8eVar != null ? k8eVar.a : null;
            gz0 gz0Var = bv6Var instanceof gz0 ? (gz0) bv6Var : null;
            if (gz0Var == null || (bitmapJ = gz0Var.a) == null || (fA = l6g.a(bitmapJ)) == null) {
                dzbVar = null;
            } else {
                float fFloatValue = fA.floatValue();
                if (qheVar.b == 0) {
                    bitmapJ = xo1.J(bitmapJ, 180.0f);
                }
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapJ, 48, 84, true);
                bitmapCreateScaledBitmap.getClass();
                dzbVar = new z3g(new ks(bitmapJ), new ks(bitmapCreateScaledBitmap), fFloatValue);
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            return null;
        }
        return dzbVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j6g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
