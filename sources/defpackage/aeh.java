package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aeh extends qpg {
    public final boolean c;
    public final boolean d;
    public final /* synthetic */ l6h e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeh(l6h l6hVar, boolean z, boolean z2) {
        super("log");
        this.e = l6hVar;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0081  */
    /* JADX WARN: Code duplicated, block: B:22:0x0092  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a1 A[LOOP:0: B:23:0x0097->B:25:0x00a1, LOOP_END] */
    @Override // defpackage.qpg
    public final vqg b(kxa kxaVar, List list) {
        int i;
        int i2;
        String strD;
        ArrayList arrayList;
        jcc.n("log", 1, list);
        int size = list.size();
        grg grgVar = vqg.v0;
        l6h l6hVar = this.e;
        if (size == 1) {
            ((oid) l6hVar.d).h(3, ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(0)).d(), Collections.EMPTY_LIST, this.c, this.d);
            return grgVar;
        }
        vqg vqgVar = (vqg) list.get(0);
        vea veaVar = (vea) kxaVar.b;
        vea veaVar2 = (vea) kxaVar.b;
        int iS = jcc.s(veaVar.G(kxaVar, vqgVar).j().doubleValue());
        if (iS != 2) {
            i = 3;
            if (iS == 3) {
                i2 = 1;
            } else if (iS == 5) {
                i2 = 5;
            } else if (iS == 6) {
                i2 = 2;
            }
            strD = veaVar2.G(kxaVar, (vqg) list.get(1)).d();
            if (list.size() == 2) {
                ((oid) l6hVar.d).h(i2, strD, Collections.EMPTY_LIST, this.c, this.d);
                return grgVar;
            }
            arrayList = new ArrayList();
            for (int i3 = 2; i3 < Math.min(list.size(), 5); i3++) {
                arrayList.add(veaVar2.G(kxaVar, (vqg) list.get(i3)).d());
            }
            ((oid) l6hVar.d).h(i2, strD, arrayList, this.c, this.d);
            return grgVar;
        }
        i = 4;
        i2 = i;
        strD = veaVar2.G(kxaVar, (vqg) list.get(1)).d();
        if (list.size() == 2) {
            ((oid) l6hVar.d).h(i2, strD, Collections.EMPTY_LIST, this.c, this.d);
            return grgVar;
        }
        arrayList = new ArrayList();
        while (i3 < Math.min(list.size(), 5)) {
            arrayList.add(veaVar2.G(kxaVar, (vqg) list.get(i3)).d());
        }
        ((oid) l6hVar.d).h(i2, strD, arrayList, this.c, this.d);
        return grgVar;
    }
}
