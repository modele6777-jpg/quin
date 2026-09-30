package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mb9 extends gbe implements l26 {
    final /* synthetic */ da9 $backStackEntry;
    final /* synthetic */ se2 $composeNavigator;
    final /* synthetic */ cb9 $navController;
    final /* synthetic */ n3f $transition;
    final /* synthetic */ h0e $visibleEntries$delegate;
    final /* synthetic */ d79 $zIndices;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb9(n3f n3fVar, cb9 cb9Var, da9 da9Var, d79 d79Var, h0e h0eVar, se2 se2Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$transition = n3fVar;
        this.$navController = cb9Var;
        this.$backStackEntry = da9Var;
        this.$zIndices = d79Var;
        this.$visibleEntries$delegate = h0eVar;
        this.$composeNavigator = se2Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mb9(this.$transition, this.$navController, this.$backStackEntry, this.$zIndices, this.$visibleEntries$delegate, this.$composeNavigator, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (pa7.t(this.$transition.a.a(), this.$transition.d.getValue()) && (this.$navController.b.h() == null || pa7.t(this.$transition.d.getValue(), this.$backStackEntry))) {
            List list = (List) this.$visibleEntries$delegate.getValue();
            se2 se2Var = this.$composeNavigator;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                se2Var.b().c((da9) it.next());
            }
            d79 d79Var = this.$zIndices;
            n3f n3fVar = this.$transition;
            long[] jArr = d79Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((j & 255) < 128) {
                                int i4 = (i << 3) + i3;
                                Object obj2 = d79Var.b[i4];
                                float f = d79Var.c[i4];
                                if (!pa7.t((String) obj2, ((da9) n3fVar.d.getValue()).f)) {
                                    d79Var.e--;
                                    long[] jArr2 = d79Var.a;
                                    int i5 = d79Var.d;
                                    int i6 = i4 >> 3;
                                    int i7 = (i4 & 7) << 3;
                                    long j2 = (jArr2[i6] & (~(255 << i7))) | (254 << i7);
                                    jArr2[i6] = j2;
                                    jArr2[(((i4 - 7) & i5) + (i5 & 7)) >> 3] = j2;
                                    d79Var.b[i4] = null;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        mb9 mb9Var = (mb9) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        mb9Var.r(wefVar);
        return wefVar;
    }
}
