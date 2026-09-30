package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rr7 extends gbe implements l26 {
    final /* synthetic */ e89 $drawArea;
    final /* synthetic */ e89 $frameTime;
    final /* synthetic */ bx6 $imageStore;
    final /* synthetic */ e89 $particles;
    final /* synthetic */ List<s0a> $parties;
    final /* synthetic */ mmb $partySystems;
    final /* synthetic */ fn9 $updateListener;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr7(mmb mmbVar, List list, bx6 bx6Var, e89 e89Var, e89 e89Var2, e89 e89Var3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$partySystems = mmbVar;
        this.$parties = list;
        this.$imageStore = bx6Var;
        this.$frameTime = e89Var;
        this.$particles = e89Var2;
        this.$drawArea = e89Var3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rr7(this.$partySystems, this.$parties, this.$imageStore, this.$frameTime, this.$particles, this.$drawArea, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objW;
        bw2 bw2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mmb mmbVar = this.$partySystems;
            List<s0a> list = this.$parties;
            bx6 bx6Var = this.$imageStore;
            int i2 = 10;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                s0a s0aVar = (s0a) it.next();
                s0aVar.getClass();
                bx6Var.getClass();
                List<w4d> list2 = s0aVar.h;
                ArrayList arrayList2 = new ArrayList(t72.u(list2, i2));
                for (w4d v4dVar : list2) {
                    if (v4dVar instanceof v4d) {
                        v4d v4dVar2 = (v4d) v4dVar;
                        zn4 zn4Var = (zn4) v4dVar2.a;
                        Drawable drawable = zn4Var.a;
                        int iHashCode = drawable.hashCode();
                        bx6Var.a.put(Integer.valueOf(iHashCode), drawable);
                        v4dVar = new v4d(new qmb(iHashCode, zn4Var.b, zn4Var.c), v4dVar2.b, v4dVar2.c);
                    }
                    arrayList2.add(v4dVar);
                }
                int i3 = s0aVar.a;
                int i4 = s0aVar.b;
                float f = s0aVar.c;
                float f2 = s0aVar.d;
                float f3 = s0aVar.e;
                List list3 = s0aVar.f;
                List list4 = s0aVar.g;
                Iterator it2 = it;
                long j = s0aVar.i;
                boolean z = s0aVar.j;
                dj6 dj6Var = s0aVar.k;
                int i5 = s0aVar.l;
                r6c r6cVar = s0aVar.m;
                et4 et4Var = s0aVar.n;
                list3.getClass();
                list4.getClass();
                dj6Var.getClass();
                r6cVar.getClass();
                et4Var.getClass();
                arrayList.add(new u0a(new s0a(i3, i4, f, f2, f3, list3, list4, arrayList2, j, z, dj6Var, i5, r6cVar, et4Var), Resources.getSystem().getDisplayMetrics().density));
                it = it2;
                i2 = 10;
            }
            mmbVar.element = arrayList;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        do {
            qr7 qr7Var = new qr7(this.$frameTime, this.$particles, this.$partySystems, this.$drawArea);
            this.label = 1;
            objW = y41.W(qr7Var, this);
            bw2Var = bw2.a;
        } while (objW != bw2Var);
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((rr7) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
