package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uq7 {
    public static final /* synthetic */ wn7[] q = {new q79(uq7.class, "_hasSetter", "get_hasSetter()Z", 0), new q79(uq7.class, "_hasGetter", "get_hasGetter()Z", 0)};
    public int a;
    public final String b;
    public final vq7 c;
    public final vq7 d;
    public final ArrayList e;
    public wq7 f;
    public final ArrayList g;
    public final ArrayList h;
    public ar7 i;
    public wq7 j;
    public final ArrayList k;
    public final LinkedHashMap l;
    public final ArrayList m;
    public final ArrayList n;
    public final ArrayList o;
    public final ArrayList p;

    public uq7(String str, int i, int i2, int i3) {
        int i4;
        str.getClass();
        this.a = i;
        this.b = str;
        li5 li5Var = oi5.C;
        li5Var.getClass();
        ji5 ji5Var = new ji5(li5Var, 1);
        gi5 gi5Var = gi5.a;
        int i5 = ji5Var.b;
        if (i5 != 1 || (i4 = ji5Var.c) != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var, " was passed"));
            throw null;
        }
        li5 li5Var2 = oi5.B;
        li5Var2.getClass();
        ji5 ji5Var2 = new ji5(li5Var2, 1);
        if (ji5Var2.b != 1 || ji5Var2.c != 1) {
            qc0.o(kv2.l("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", ji5Var2, " was passed"));
            throw null;
        }
        int i6 = 1 << ji5Var2.a;
        vq7 vq7Var = new vq7(i2);
        wn7[] wn7VarArr = q;
        wn7VarArr[1].getClass();
        gi5Var.v(this, Integer.valueOf(i6 | this.a));
        this.c = vq7Var;
        wn7VarArr[0].getClass();
        this.d = ((((Number) gi5Var.get(this)).intValue() >>> ji5Var.a) & ((1 << i5) - 1)) == i4 ? new vq7(i3) : null;
        this.e = new ArrayList(0);
        this.g = new ArrayList(0);
        new ArrayList(0);
        this.h = new ArrayList();
        this.k = new ArrayList(0);
        this.l = new LinkedHashMap(0);
        this.m = new ArrayList(0);
        this.n = new ArrayList(0);
        this.o = new ArrayList(0);
        wu8.a.getClass();
        List listA = vu8.a();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((tk7) ((wu8) it.next())).getClass();
            arrayList.add(new bl7());
        }
        this.p = arrayList;
    }
}
