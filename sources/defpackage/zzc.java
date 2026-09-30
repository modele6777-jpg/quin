package defpackage;

import android.hardware.camera2.params.InputConfiguration;
import android.util.ArrayMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static final List j = Arrays.asList(1, 5, 3);
    public final ArrayList a;
    public final eq0 b;
    public final List c;
    public final List d;
    public final List e;
    public final xzc f;
    public final im1 g;
    public final int h;
    public final InputConfiguration i;

    public zzc(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, im1 im1Var, xzc xzcVar, InputConfiguration inputConfiguration, int i, eq0 eq0Var) {
        this.a = arrayList;
        this.c = Collections.unmodifiableList(arrayList2);
        this.d = Collections.unmodifiableList(arrayList3);
        this.e = Collections.unmodifiableList(arrayList4);
        this.f = xzcVar;
        this.g = im1Var;
        this.i = inputConfiguration;
        this.h = i;
        this.b = eq0Var;
    }

    public static zzc a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(0);
        ArrayList arrayList3 = new ArrayList(0);
        ArrayList arrayList4 = new ArrayList(0);
        HashSet hashSet = new HashSet();
        k79 k79VarJ = k79.j();
        ArrayList arrayList5 = new ArrayList();
        m89 m89VarA = m89.a();
        ArrayList arrayList6 = new ArrayList(hashSet);
        bs9 bs9VarD = bs9.d(k79VarJ);
        ArrayList arrayList7 = new ArrayList(arrayList5);
        wde wdeVar = wde.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = m89VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        return new zzc(arrayList, arrayList2, arrayList3, arrayList4, new im1(arrayList6, bs9VarD, -1, arrayList7, new wde(arrayMap)), null, null, 0, null);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList();
        for (eq0 eq0Var : this.a) {
            arrayList.add(eq0Var.a);
            Iterator it = eq0Var.b.iterator();
            while (it.hasNext()) {
                arrayList.add((lu3) it.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }
}
