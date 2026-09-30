package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class al1 extends gbe implements l26 {
    final /* synthetic */ xva $$this$produceState;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al1(xva xvaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$produceState = xvaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        al1 al1Var = new al1(this.$$this$produceState, xn2Var);
        al1Var.L$0 = obj;
        return al1Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                iy9 iy9Var = (iy9) this.L$0;
                wae waeVar = (wae) iy9Var.a();
                wy6 wy6Var = (wy6) iy9Var.b();
                xae xaeVar = (xae) ((yva) this.$$this$produceState).a.getValue();
                if (xaeVar != null) {
                    pxf pxfVar = xaeVar.a;
                    if (pxfVar.a != waeVar.b.getWidth() || pxfVar.b != waeVar.b.getHeight() || pxfVar.c != wy6Var) {
                        ((yva) this.$$this$produceState).setValue(new xae(new pxf(waeVar.b.getWidth(), waeVar.b.getHeight(), wy6Var, "CXSurfaceRequest-".concat(String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(waeVar.hashCode())}, 1))))));
                    }
                } else {
                    ((yva) this.$$this$produceState).setValue(new xae(new pxf(waeVar.b.getWidth(), waeVar.b.getHeight(), wy6Var, "CXSurfaceRequest-".concat(String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(waeVar.hashCode())}, 1))))));
                }
                xae xaeVar2 = (xae) ((yva) this.$$this$produceState).a.getValue();
                r41 r41Var = xaeVar2 != null ? xaeVar2.b : null;
                if (r41Var == null) {
                    throw new IllegalStateException("Surface request channel should not be null");
                }
                this.label = 1;
                Object objA = r41Var.a(this, waeVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
        } catch (g62 unused) {
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((al1) k((xn2) obj2, (iy9) obj)).r(wef.a);
    }
}
