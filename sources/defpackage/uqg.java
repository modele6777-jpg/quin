package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uqg extends qpg {
    public final ArrayList c;
    public final ArrayList d;
    public final kxa e;

    public uqg(String str, ArrayList arrayList, List list, kxa kxaVar) {
        super(str);
        this.c = new ArrayList();
        this.e = kxaVar;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.c.add(((vqg) it.next()).d());
            }
        }
        this.d = new ArrayList(list);
    }

    @Override // defpackage.qpg
    public final vqg b(kxa kxaVar, List list) {
        grg grgVar;
        kxa kxaVarV = this.e.v();
        vea veaVar = (vea) kxaVarV.b;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            grgVar = vqg.v0;
            if (i >= size) {
                break;
            }
            if (i < list.size()) {
                kxaVarV.y((String) arrayList.get(i), ((vea) kxaVar.b).G(kxaVar, (vqg) list.get(i)));
            } else {
                kxaVarV.y((String) arrayList.get(i), grgVar);
            }
            i++;
        }
        for (vqg vqgVar : this.d) {
            vqg vqgVarG = veaVar.G(kxaVarV, vqgVar);
            if (vqgVarG instanceof yqg) {
                vqgVarG = veaVar.G(kxaVarV, vqgVar);
            }
            if (vqgVarG instanceof fog) {
                return ((fog) vqgVarG).a;
            }
        }
        return grgVar;
    }

    @Override // defpackage.qpg, defpackage.vqg
    public final vqg m() {
        return new uqg(this);
    }

    public uqg(uqg uqgVar) {
        super(uqgVar.a);
        ArrayList arrayList = new ArrayList(uqgVar.c.size());
        this.c = arrayList;
        arrayList.addAll(uqgVar.c);
        ArrayList arrayList2 = new ArrayList(uqgVar.d.size());
        this.d = arrayList2;
        arrayList2.addAll(uqgVar.d);
        this.e = uqgVar.e;
    }
}
