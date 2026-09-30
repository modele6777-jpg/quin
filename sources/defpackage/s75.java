package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s75 implements xj5 {
    public final /* synthetic */ xj5 a;

    public s75(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        r75 r75Var;
        if (xn2Var instanceof r75) {
            r75Var = (r75) xn2Var;
            int i = r75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                r75Var.label = i - Integer.MIN_VALUE;
            } else {
                r75Var = new r75(this, xn2Var);
            }
        } else {
            r75Var = new r75(this, xn2Var);
        }
        Object obj2 = r75Var.result;
        int i2 = r75Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ArrayList arrayList = new ArrayList();
            for (yb4 yb4Var : (List) obj) {
                String str = yb4Var.d;
                Iterable iterable = yb4Var.e;
                if (iterable == null) {
                    iterable = pu4.a;
                }
                ArrayList arrayList2 = new ArrayList(t72.u(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(new nn4(((TarotCardChoice) it.next()).getCard().getCardKey(), str));
                }
                x72.g0(arrayList, arrayList2);
            }
            r75Var.L$0 = null;
            r75Var.L$1 = null;
            r75Var.L$2 = null;
            r75Var.L$3 = null;
            r75Var.label = 1;
            Object objA = this.a.a(arrayList, r75Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
